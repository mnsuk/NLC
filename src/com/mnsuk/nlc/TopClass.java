

/* First created by JCasGen Fri Apr 07 11:05:14 BST 2017 */
package com.mnsuk.nlc;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Apr 07 11:05:14 BST 2017
 * XML source: /Users/martin/Documents/Development/Java/Annotators/NLC/desc/NLC-ae.xml
 * @generated */
public class TopClass extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopClass.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TopClass() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopClass(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopClass(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TopClass(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: topClass

  /** getter for topClass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTopClass() {
    if (TopClass_Type.featOkTst && ((TopClass_Type)jcasType).casFeat_topClass == null)
      jcasType.jcas.throwFeatMissing("topClass", "com.mnsuk.nlc.TopClass");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TopClass_Type)jcasType).casFeatCode_topClass);}
    
  /** setter for topClass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopClass(String v) {
    if (TopClass_Type.featOkTst && ((TopClass_Type)jcasType).casFeat_topClass == null)
      jcasType.jcas.throwFeatMissing("topClass", "com.mnsuk.nlc.TopClass");
    jcasType.ll_cas.ll_setStringValue(addr, ((TopClass_Type)jcasType).casFeatCode_topClass, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConfidence() {
    if (TopClass_Type.featOkTst && ((TopClass_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "com.mnsuk.nlc.TopClass");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TopClass_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(String v) {
    if (TopClass_Type.featOkTst && ((TopClass_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "com.mnsuk.nlc.TopClass");
    jcasType.ll_cas.ll_setStringValue(addr, ((TopClass_Type)jcasType).casFeatCode_confidence, v);}    
  }

    