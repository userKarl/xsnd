/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcLinkManField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcLinkManField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcLinkManField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v5v1x64apiJNI.delete_CThostFtdcLinkManField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_InvestorID_get(swigCPtr, this);
  }

  public void setPersonType(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_PersonType_set(swigCPtr, this, value);
  }

  public char getPersonType() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_PersonType_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setPersonName(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_PersonName_set(swigCPtr, this, value);
  }

  public String getPersonName() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_PersonName_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_ZipCode_get(swigCPtr, this);
  }

  public void setPriority(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_Priority_set(swigCPtr, this, value);
  }

  public int getPriority() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_Priority_get(swigCPtr, this);
  }

  public void setUOAZipCode(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_UOAZipCode_set(swigCPtr, this, value);
  }

  public String getUOAZipCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_UOAZipCode_get(swigCPtr, this);
  }

  public void setPersonFullName(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_PersonFullName_set(swigCPtr, this, value);
  }

  public String getPersonFullName() {
    return jctpv6v5v1x64apiJNI.CThostFtdcLinkManField_PersonFullName_get(swigCPtr, this);
  }

  public CThostFtdcLinkManField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcLinkManField(), true);
  }

}
