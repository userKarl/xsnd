/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcInputQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputQuoteField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcInputQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_reserve1_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_QuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_UserID_get(swigCPtr, this);
  }

  public void setAskPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskPrice_set(swigCPtr, this, value);
  }

  public double getAskPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskPrice_get(swigCPtr, this);
  }

  public void setBidPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidPrice_set(swigCPtr, this, value);
  }

  public double getBidPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidPrice_get(swigCPtr, this);
  }

  public void setAskVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskVolume_set(swigCPtr, this, value);
  }

  public int getAskVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskVolume_get(swigCPtr, this);
  }

  public void setBidVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidVolume_set(swigCPtr, this, value);
  }

  public int getBidVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidVolume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BusinessUnit_get(swigCPtr, this);
  }

  public void setAskOffsetFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskOffsetFlag_set(swigCPtr, this, value);
  }

  public char getAskOffsetFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskOffsetFlag_get(swigCPtr, this);
  }

  public void setBidOffsetFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidOffsetFlag_set(swigCPtr, this, value);
  }

  public char getBidOffsetFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidOffsetFlag_get(swigCPtr, this);
  }

  public void setAskHedgeFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskHedgeFlag_set(swigCPtr, this, value);
  }

  public char getAskHedgeFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskHedgeFlag_get(swigCPtr, this);
  }

  public void setBidHedgeFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidHedgeFlag_set(swigCPtr, this, value);
  }

  public char getBidHedgeFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidHedgeFlag_get(swigCPtr, this);
  }

  public void setAskOrderRef(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskOrderRef_set(swigCPtr, this, value);
  }

  public String getAskOrderRef() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_AskOrderRef_get(swigCPtr, this);
  }

  public void setBidOrderRef(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidOrderRef_set(swigCPtr, this, value);
  }

  public String getBidOrderRef() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_BidOrderRef_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputQuoteField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputQuoteField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcInputQuoteField(), true);
  }

}
