/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcFutureLimitPosiParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcFutureLimitPosiParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFutureLimitPosiParamField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcFutureLimitPosiParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorRange(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_reserve1_get(swigCPtr, this);
  }

  public void setSpecOpenVolume(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_SpecOpenVolume_set(swigCPtr, this, value);
  }

  public int getSpecOpenVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_SpecOpenVolume_get(swigCPtr, this);
  }

  public void setArbiOpenVolume(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_ArbiOpenVolume_set(swigCPtr, this, value);
  }

  public int getArbiOpenVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_ArbiOpenVolume_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_OpenVolume_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcFutureLimitPosiParamField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcFutureLimitPosiParamField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcFutureLimitPosiParamField(), true);
  }

}
