/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcExchangeOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOrderActionField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcExchangeOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_reserve1_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v5v1x64apiJNI.CThostFtdcExchangeOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderActionField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcExchangeOrderActionField(), true);
  }

}
