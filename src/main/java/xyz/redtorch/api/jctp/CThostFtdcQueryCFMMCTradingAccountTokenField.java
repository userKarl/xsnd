/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQueryCFMMCTradingAccountTokenField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQueryCFMMCTradingAccountTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQueryCFMMCTradingAccountTokenField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcQueryCFMMCTradingAccountTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQueryCFMMCTradingAccountTokenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQueryCFMMCTradingAccountTokenField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestorID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQueryCFMMCTradingAccountTokenField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcQueryCFMMCTradingAccountTokenField(), true);
  }

}
