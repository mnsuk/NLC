

/* First created by JCasGen Fri Apr 07 11:04:43 BST 2017 */
package com.mnsuk.nlc;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Apr 07 11:05:14 BST 2017
 * XML source: /Users/martin/Documents/Development/Java/Annotators/NLC/desc/NLC-ae.xml
 * @generated */
public class Classes extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Classes.class);
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
  protected Classes() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Classes(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Classes(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Classes(JCas jcas, int begin, int end) {
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
  //* Feature: class0

  /** getter for class0 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClass0() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class0 == null)
      jcasType.jcas.throwFeatMissing("class0", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class0);}
    
  /** setter for class0 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass0(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class0 == null)
      jcasType.jcas.throwFeatMissing("class0", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class0, v);}    
   
    
  //*--------------*
  //* Feature: confidence0

  /** getter for confidence0 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConfidence0() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence0 == null)
      jcasType.jcas.throwFeatMissing("confidence0", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence0);}
    
  /** setter for confidence0 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence0(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence0 == null)
      jcasType.jcas.throwFeatMissing("confidence0", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence0, v);}    
   
    
  //*--------------*
  //* Feature: class1

  /** getter for class1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClass1() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class1 == null)
      jcasType.jcas.throwFeatMissing("class1", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class1);}
    
  /** setter for class1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass1(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class1 == null)
      jcasType.jcas.throwFeatMissing("class1", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class1, v);}    
   
    
  //*--------------*
  //* Feature: confidence1

  /** getter for confidence1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConfidence1() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence1 == null)
      jcasType.jcas.throwFeatMissing("confidence1", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence1);}
    
  /** setter for confidence1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence1(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence1 == null)
      jcasType.jcas.throwFeatMissing("confidence1", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence1, v);}    
   
    
  //*--------------*
  //* Feature: class2

  /** getter for class2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClass2() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class2 == null)
      jcasType.jcas.throwFeatMissing("class2", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class2);}
    
  /** setter for class2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass2(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class2 == null)
      jcasType.jcas.throwFeatMissing("class2", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class2, v);}    
   
    
  //*--------------*
  //* Feature: confidence2

  /** getter for confidence2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConfidence2() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence2 == null)
      jcasType.jcas.throwFeatMissing("confidence2", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence2);}
    
  /** setter for confidence2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence2(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence2 == null)
      jcasType.jcas.throwFeatMissing("confidence2", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence2, v);}    
   
    
  //*--------------*
  //* Feature: class3

  /** getter for class3 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClass3() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class3 == null)
      jcasType.jcas.throwFeatMissing("class3", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class3);}
    
  /** setter for class3 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass3(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class3 == null)
      jcasType.jcas.throwFeatMissing("class3", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class3, v);}    
   
    
  //*--------------*
  //* Feature: confidence3

  /** getter for confidence3 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConfidence3() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence3 == null)
      jcasType.jcas.throwFeatMissing("confidence3", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence3);}
    
  /** setter for confidence3 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence3(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence3 == null)
      jcasType.jcas.throwFeatMissing("confidence3", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence3, v);}    
   
    
  //*--------------*
  //* Feature: class4

  /** getter for class4 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClass4() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class4 == null)
      jcasType.jcas.throwFeatMissing("class4", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class4);}
    
  /** setter for class4 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass4(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_class4 == null)
      jcasType.jcas.throwFeatMissing("class4", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_class4, v);}    
   
    
  //*--------------*
  //* Feature: confidence4

  /** getter for confidence4 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConfidence4() {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence4 == null)
      jcasType.jcas.throwFeatMissing("confidence4", "com.mnsuk.nlc.Classes");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence4);}
    
  /** setter for confidence4 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence4(String v) {
    if (Classes_Type.featOkTst && ((Classes_Type)jcasType).casFeat_confidence4 == null)
      jcasType.jcas.throwFeatMissing("confidence4", "com.mnsuk.nlc.Classes");
    jcasType.ll_cas.ll_setStringValue(addr, ((Classes_Type)jcasType).casFeatCode_confidence4, v);}    
  }

    