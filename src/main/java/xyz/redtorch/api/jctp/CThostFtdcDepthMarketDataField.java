/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcDepthMarketDataField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDepthMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepthMarketDataField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcDepthMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_reserve1_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_reserve2_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setBidPrice1(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume1_get(swigCPtr, this);
  }

  public void setBidPrice2(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice2_set(swigCPtr, this, value);
  }

  public double getBidPrice2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice2_get(swigCPtr, this);
  }

  public void setBidVolume2(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume2_set(swigCPtr, this, value);
  }

  public int getBidVolume2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume2_get(swigCPtr, this);
  }

  public void setAskPrice2(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice2_set(swigCPtr, this, value);
  }

  public double getAskPrice2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice2_get(swigCPtr, this);
  }

  public void setAskVolume2(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume2_set(swigCPtr, this, value);
  }

  public int getAskVolume2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume2_get(swigCPtr, this);
  }

  public void setBidPrice3(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice3_set(swigCPtr, this, value);
  }

  public double getBidPrice3() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice3_get(swigCPtr, this);
  }

  public void setBidVolume3(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume3_set(swigCPtr, this, value);
  }

  public int getBidVolume3() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume3_get(swigCPtr, this);
  }

  public void setAskPrice3(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice3_set(swigCPtr, this, value);
  }

  public double getAskPrice3() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice3_get(swigCPtr, this);
  }

  public void setAskVolume3(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume3_set(swigCPtr, this, value);
  }

  public int getAskVolume3() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume3_get(swigCPtr, this);
  }

  public void setBidPrice4(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume4_get(swigCPtr, this);
  }

  public void setAskPrice4(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_BidVolume5_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AskVolume5_get(swigCPtr, this);
  }

  public void setAveragePrice(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AveragePrice_set(swigCPtr, this, value);
  }

  public double getAveragePrice() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_AveragePrice_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ActionDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcDepthMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcDepthMarketDataField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcDepthMarketDataField(), true);
  }

}
