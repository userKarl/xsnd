/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQryOptionSelfCloseField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOptionSelfCloseField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcQryOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_reserve1_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setInsertTimeStart(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InsertTimeStart_set(swigCPtr, this, value);
  }

  public String getInsertTimeStart() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InsertTimeStart_get(swigCPtr, this);
  }

  public void setInsertTimeEnd(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InsertTimeEnd_set(swigCPtr, this, value);
  }

  public String getInsertTimeEnd() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InsertTimeEnd_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryOptionSelfCloseField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryOptionSelfCloseField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcQryOptionSelfCloseField(), true);
  }

}
