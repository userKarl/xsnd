/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcBrokerWithdrawAlgorithmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerWithdrawAlgorithmField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcBrokerWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setWithdrawAlgorithm(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_set(swigCPtr, this, value);
  }

  public char getWithdrawAlgorithm() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setIncludeCloseProfit(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getIncludeCloseProfit() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_get(swigCPtr, this);
  }

  public void setAllWithoutTrade(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_set(swigCPtr, this, value);
  }

  public char getAllWithoutTrade() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setIsBrokerUserEvent(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_set(swigCPtr, this, value);
  }

  public int getIsBrokerUserEvent() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public void setBalanceAlgorithm(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_set(swigCPtr, this, value);
  }

  public char getBalanceAlgorithm() {
    return jctpv6v5v1x64apiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_get(swigCPtr, this);
  }

  public CThostFtdcBrokerWithdrawAlgorithmField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcBrokerWithdrawAlgorithmField(), true);
  }

}
