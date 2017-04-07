
/* First created by JCasGen Fri Apr 07 11:05:14 BST 2017 */
package com.mnsuk.nlc;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Apr 07 11:05:14 BST 2017
 * @generated */
public class TopClass_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TopClass.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.mnsuk.nlc.TopClass");
 
  /** @generated */
  final Feature casFeat_topClass;
  /** @generated */
  final int     casFeatCode_topClass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTopClass(int addr) {
        if (featOkTst && casFeat_topClass == null)
      jcas.throwFeatMissing("topClass", "com.mnsuk.nlc.TopClass");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopClass(int addr, String v) {
        if (featOkTst && casFeat_topClass == null)
      jcas.throwFeatMissing("topClass", "com.mnsuk.nlc.TopClass");
    ll_cas.ll_setStringValue(addr, casFeatCode_topClass, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "com.mnsuk.nlc.TopClass");
    return ll_cas.ll_getStringValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, String v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "com.mnsuk.nlc.TopClass");
    ll_cas.ll_setStringValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TopClass_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_topClass = jcas.getRequiredFeatureDE(casType, "topClass", "uima.cas.String", featOkTst);
    casFeatCode_topClass  = (null == casFeat_topClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topClass).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.String", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    