/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQrySecAgentACIDMapField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySecAgentACIDMapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySecAgentACIDMapField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcQrySecAgentACIDMapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_UserID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcQrySecAgentACIDMapField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQrySecAgentACIDMapField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcQrySecAgentACIDMapField(), true);
  }

}
