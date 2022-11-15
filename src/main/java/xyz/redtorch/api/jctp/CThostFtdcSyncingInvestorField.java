/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcSyncingInvestorField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcSyncingInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncingInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcSyncingInvestorField(), true);
  }

}
