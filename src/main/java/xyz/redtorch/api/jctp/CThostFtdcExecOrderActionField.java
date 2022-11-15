/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcExecOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExecOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderActionField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcExecOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setExecOrderActionRef(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_set(swigCPtr, this, value);
  }

  public int getExecOrderActionRef() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_ActionType_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_reserve1_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcExecOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderActionField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcExecOrderActionField(), true);
  }

}
