package com.mnsuk.uima;

import java.io.FileInputStream;
import java.util.List;

import org.apache.uima.UIMAFramework;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
// import org.apache.uima.cas.CASException;
import org.apache.uima.cas.impl.XmiCasDeserializer;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.apache.uima.util.CasCreationUtils;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;
import org.apache.uima.util.XMLInputSource;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.ClassifiedClass;
import com.mns.uima.utils.CASUtils;
import com.mns.uima.utils.DocumentDetails;
import com.mnsuk.nlc.Result;

/**
 * Annotator for Watson Natural Language Understanding
 * <p>
 * @author      martin.saunders@uk.ibm.com
 * @version     1.0.0             
 */
public class NLC extends JCasAnnotator_ImplBase {

	// AE parameters
	private static final String PARAM_USERNAME = "username";
	private static final String PARAM_PASSWORD = "password";
	private static final String PARAM_CLASSIFIER = "classifier";
	private static final String PARAM_TOP_ONLY = "top_only";
	private static final String PARAM_THRESHOLD = "threshold";

	// Global Variables
	private Logger logger = null;
	private JCas jcas = null;
	private String text;

	// Global parameters
	private static String pUsername;   
	private static String pPassword;   
	private static String pClassifier; 
	private static Boolean pTopOnly;
	private static double pThreshold;

	// nlc service retunrs up to 10 classes, set limit to use here. If this is increased  
	// then the output uima type definitions will need updating with further features.
	private static final int CLASSES_TO_RETURN = 5;

	/**
	 * Read configuration and initialise annotator with configuration.
	 * <p>
	 *
	 * @param  aContext 
	 * @throws ResourceInitializationException
	 */
	public void initialize(UimaContext aContext) throws ResourceInitializationException {
		super.initialize(aContext);
		logger = aContext.getLogger();	
		logger.log(Level.FINE, "NLC: initializing:");
		pUsername = CASUtils.getConfigurationStringValue(aContext, null, PARAM_USERNAME);
		pPassword = CASUtils.getConfigurationStringValue(aContext, null, PARAM_PASSWORD);
		pClassifier = CASUtils.getConfigurationStringValue(aContext, null, PARAM_CLASSIFIER);
		pTopOnly = CASUtils.getConfigurationBooleanValue(aContext, null, PARAM_TOP_ONLY);
		String pTmp = CASUtils.getConfigurationStringValue(aContext, null, PARAM_THRESHOLD);
		try {
			pThreshold = Double.parseDouble(pTmp);
			if (pThreshold < 0.0 || pThreshold >= 1.0) {
				throw new ResourceInitializationException (
						"Attempting to set invalid threshold value (0.0 <= threshold < 1.0)", new Object[] {});
			}
		} catch (NumberFormatException e) {
			throw new ResourceInitializationException (
					"Cannot parse threshold value.", new Object[] {e});
		}
	}

	/** 
	 * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
	 */

	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		logger.log(Level.FINE, "NLC: processing:");
		this.jcas=aJCas;
		this.text=jcas.getDocumentText();
		String textToAnalyse = text.length() > 1024 ? text.substring(0, 1023) : text;

		DocumentDetails.extractDocumentDetails(jcas);
		String language = DocumentDetails.language;
		if (language == null || language.isEmpty())
			language = "en";
		//try {
		NaturalLanguageClassifier service = new NaturalLanguageClassifier();
		service.setUsernameAndPassword(pUsername, pPassword);

		Classification classification = service.classify(pClassifier, textToAnalyse).execute();
		int end = text.length() > 1024 ? 1023 : text.length();

		List<ClassifiedClass> classList = classification.getClasses();
		Result res = new Result(jcas, 0, end);
		for (int i = 0; i < (pTopOnly ? 1 : CLASSES_TO_RETURN) && i < classList.size(); i ++) {
			String className = classList.get(i).getName();
			Double conf = classList.get(i).getConfidence();
			if (conf < pThreshold)
				break;
			String confidence = conf.toString();
			switch (i) {
			case 0:
				res.setTopClass(className);
				res.setConfidence(confidence);
				break;
			case 1:
				res.setClass1(className);
				res.setConfidence1(confidence);
				break;
			case 2:
				res.setClass2(className);
				res.setConfidence2(confidence);
				break;
			case 3:
				res.setClass3(className);
				res.setConfidence3(confidence);
				break;
			case 4:
				res.setClass4(className);
				res.setConfidence4(confidence);
				break;
			default:
				break;
			}
		}
		jcas.addFsToIndexes(res);
		logger.log(Level.INFO, "NLC: addedt: " + res.toString());
		/*} catch (Exception e) {
			throw new AnalysisEngineProcessException (
					AnalysisEngineProcessException.ANNOTATOR_EXCEPTION, new Object[] {e});
		} finally {
			logger.log(Level.INFO, "NLC: processed document: " + DocumentDetails.title + " in " + DocumentDetails.language);
	
		}*/
	}

	/**
	 * Test annotators process method outside of a UIMA pipeline. 
	 * Primary usage is debugging with eclipse.
	 * <p>
	 * Necessary xml and xmi files may be generated in ICA Studio using
	 * the "Save as XMI" feature after annotating a document.
	 *
	 * @param  typeFile xml typesytem file
	 * @param  casFile xmi of exported cas
	 */
	public void TestAnnotator(String typeFile, String casFile) {

		try {
			logger = UIMAFramework.getLogger(NLC.class);

			XMLInputSource xmlIn = new XMLInputSource(typeFile);
			TypeSystemDescription tsDesc = UIMAFramework.getXMLParser().parseTypeSystemDescription(xmlIn);
			CAS cas = CasCreationUtils.createCas( tsDesc, null, null ); 
			XmiCasDeserializer.deserialize(new FileInputStream(casFile), cas, false);
			// and process
			jcas = cas.getJCas();

			process(jcas);
		}
		catch(Exception e) {
			logger.log(Level.SEVERE, "Error initialising the JCas: " + e.toString(),e);
		}
	}

	/**
	 * Setter for AE parameters used in debugging.
	 * <p>
	 * @param pUsername
	 */
	public static void setPUsername(String pUsername) {
		NLC.pUsername = pUsername;
	}

	/**
	 * Setter for AE parameters used in debugging.
	 * <p>
	 * @param pUsername
	 */
	public static void setPPassword(String pPassword) {
		NLC.pPassword = pPassword;
	}

	/**
	 * Setter for AE parameters used in debugging.
	 * <p>
	 * @param pClassifier
	 */
	public static void setPClassifier(String pClassifier) {
		NLC.pClassifier = pClassifier;
	}

	/**
	 * Setter for AE parameters used in debugging.
	 * <p>
	 * @param pThreshold
	 * @throws ResourceInitializationException 
	 */
	public static void setPThreshold(double threshold)  {
		if (threshold < 0.0 || threshold >= 1.0) {
			System.out.println("Attempting to set invalid threshold value (0.0 <= threshold < 1.0)");
		}
		NLC.pThreshold = threshold;
	}

	/**
	 * Setter for AE parameters used in debugging.
	 * <p>
	 * @param pTopOnly
	 */
	public static void setPTopOnly(boolean pTopOnly) {
		NLC.pTopOnly = pTopOnly;
	}
}
