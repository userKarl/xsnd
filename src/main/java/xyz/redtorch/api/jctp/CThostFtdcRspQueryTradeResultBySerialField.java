/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcRspQueryTradeResultBySerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspQueryTradeResultBySerialField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcRspQueryTradeResultBySerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg_get(swigCPtr, this);
  }

  public void setReference(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
  }

  public int getReference() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
  }

  public void setRefrenceIssureType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this, value);
  }

  public char getRefrenceIssureType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr, this);
  }

  public void setRefrenceIssure(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
  }

  public String getRefrenceIssure() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
  }

  public void setOriginReturnCode(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode_set(swigCPtr, this, value);
  }

  public String getOriginReturnCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode_get(swigCPtr, this);
  }

  public void setOriginDescrInfoForReturnCode(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getOriginDescrInfoForReturnCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcRspQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcRspQueryTradeResultBySerialField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcRspQueryTradeResultBySerialField(), true);
  }

}
