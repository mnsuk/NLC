
/* First created by JCasGen Fri Apr 07 11:42:41 BST 2017 */
package com.mnsuk.nlc;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Apr 07 11:42:41 BST 2017
 * @generated */
public class Result_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Result.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.mnsuk.nlc.Result");
 
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
      jcas.throwFeatMissing("topClass", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopClass(int addr, String v) {
        if (featOkTst && casFeat_topClass == null)
      jcas.throwFeatMissing("topClass", "com.mnsuk.nlc.Result");
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
      jcas.throwFeatMissing("confidence", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, String v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_class1;
  /** @generated */
  final int     casFeatCode_class1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClass1(int addr) {
        if (featOkTst && casFeat_class1 == null)
      jcas.throwFeatMissing("class1", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_class1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClass1(int addr, String v) {
        if (featOkTst && casFeat_class1 == null)
      jcas.throwFeatMissing("class1", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_class1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence1;
  /** @generated */
  final int     casFeatCode_confidence1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConfidence1(int addr) {
        if (featOkTst && casFeat_confidence1 == null)
      jcas.throwFeatMissing("confidence1", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_confidence1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence1(int addr, String v) {
        if (featOkTst && casFeat_confidence1 == null)
      jcas.throwFeatMissing("confidence1", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_confidence1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_class2;
  /** @generated */
  final int     casFeatCode_class2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClass2(int addr) {
        if (featOkTst && casFeat_class2 == null)
      jcas.throwFeatMissing("class2", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_class2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClass2(int addr, String v) {
        if (featOkTst && casFeat_class2 == null)
      jcas.throwFeatMissing("class2", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_class2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence2;
  /** @generated */
  final int     casFeatCode_confidence2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConfidence2(int addr) {
        if (featOkTst && casFeat_confidence2 == null)
      jcas.throwFeatMissing("confidence2", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_confidence2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence2(int addr, String v) {
        if (featOkTst && casFeat_confidence2 == null)
      jcas.throwFeatMissing("confidence2", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_confidence2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_class3;
  /** @generated */
  final int     casFeatCode_class3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClass3(int addr) {
        if (featOkTst && casFeat_class3 == null)
      jcas.throwFeatMissing("class3", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_class3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClass3(int addr, String v) {
        if (featOkTst && casFeat_class3 == null)
      jcas.throwFeatMissing("class3", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_class3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence3;
  /** @generated */
  final int     casFeatCode_confidence3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConfidence3(int addr) {
        if (featOkTst && casFeat_confidence3 == null)
      jcas.throwFeatMissing("confidence3", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_confidence3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence3(int addr, String v) {
        if (featOkTst && casFeat_confidence3 == null)
      jcas.throwFeatMissing("confidence3", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_confidence3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_class4;
  /** @generated */
  final int     casFeatCode_class4;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClass4(int addr) {
        if (featOkTst && casFeat_class4 == null)
      jcas.throwFeatMissing("class4", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_class4);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClass4(int addr, String v) {
        if (featOkTst && casFeat_class4 == null)
      jcas.throwFeatMissing("class4", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_class4, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence4;
  /** @generated */
  final int     casFeatCode_confidence4;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConfidence4(int addr) {
        if (featOkTst && casFeat_confidence4 == null)
      jcas.throwFeatMissing("confidence4", "com.mnsuk.nlc.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_confidence4);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence4(int addr, String v) {
        if (featOkTst && casFeat_confidence4 == null)
      jcas.throwFeatMissing("confidence4", "com.mnsuk.nlc.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_confidence4, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Result_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_topClass = jcas.getRequiredFeatureDE(casType, "topClass", "uima.cas.String", featOkTst);
    casFeatCode_topClass  = (null == casFeat_topClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topClass).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.String", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_class1 = jcas.getRequiredFeatureDE(casType, "class1", "uima.cas.String", featOkTst);
    casFeatCode_class1  = (null == casFeat_class1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_class1).getCode();

 
    casFeat_confidence1 = jcas.getRequiredFeatureDE(casType, "confidence1", "uima.cas.String", featOkTst);
    casFeatCode_confidence1  = (null == casFeat_confidence1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence1).getCode();

 
    casFeat_class2 = jcas.getRequiredFeatureDE(casType, "class2", "uima.cas.String", featOkTst);
    casFeatCode_class2  = (null == casFeat_class2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_class2).getCode();

 
    casFeat_confidence2 = jcas.getRequiredFeatureDE(casType, "confidence2", "uima.cas.String", featOkTst);
    casFeatCode_confidence2  = (null == casFeat_confidence2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence2).getCode();

 
    casFeat_class3 = jcas.getRequiredFeatureDE(casType, "class3", "uima.cas.String", featOkTst);
    casFeatCode_class3  = (null == casFeat_class3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_class3).getCode();

 
    casFeat_confidence3 = jcas.getRequiredFeatureDE(casType, "confidence3", "uima.cas.String", featOkTst);
    casFeatCode_confidence3  = (null == casFeat_confidence3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence3).getCode();

 
    casFeat_class4 = jcas.getRequiredFeatureDE(casType, "class4", "uima.cas.String", featOkTst);
    casFeatCode_class4  = (null == casFeat_class4) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_class4).getCode();

 
    casFeat_confidence4 = jcas.getRequiredFeatureDE(casType, "confidence4", "uima.cas.String", featOkTst);
    casFeatCode_confidence4  = (null == casFeat_confidence4) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence4).getCode();

  }
}



    