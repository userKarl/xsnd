/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcProductField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcProductField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_reserve1_get(swigCPtr, this);
  }

  public void setProductName(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ProductName_set(swigCPtr, this, value);
  }

  public String getProductName() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ProductName_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ProductClass_get(swigCPtr, this);
  }

  public void setVolumeMultiple(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_VolumeMultiple_set(swigCPtr, this, value);
  }

  public int getVolumeMultiple() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_VolumeMultiple_get(swigCPtr, this);
  }

  public void setPriceTick(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_PriceTick_set(swigCPtr, this, value);
  }

  public double getPriceTick() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_PriceTick_get(swigCPtr, this);
  }

  public void setMaxMarketOrderVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MaxMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxMarketOrderVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MaxMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMinMarketOrderVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MinMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinMarketOrderVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MinMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMaxLimitOrderVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MaxLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxLimitOrderVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MaxLimitOrderVolume_get(swigCPtr, this);
  }

  public void setMinLimitOrderVolume(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MinLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinLimitOrderVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MinLimitOrderVolume_get(swigCPtr, this);
  }

  public void setPositionType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_PositionType_set(swigCPtr, this, value);
  }

  public char getPositionType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_PositionType_get(swigCPtr, this);
  }

  public void setPositionDateType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_PositionDateType_set(swigCPtr, this, value);
  }

  public char getPositionDateType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_PositionDateType_get(swigCPtr, this);
  }

  public void setCloseDealType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_CloseDealType_set(swigCPtr, this, value);
  }

  public char getCloseDealType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_CloseDealType_get(swigCPtr, this);
  }

  public void setTradeCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_TradeCurrencyID_set(swigCPtr, this, value);
  }

  public String getTradeCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_TradeCurrencyID_get(swigCPtr, this);
  }

  public void setMortgageFundUseRange(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MortgageFundUseRange_set(swigCPtr, this, value);
  }

  public char getMortgageFundUseRange() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_MortgageFundUseRange_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_reserve2_get(swigCPtr, this);
  }

  public void setUnderlyingMultiple(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_UnderlyingMultiple_set(swigCPtr, this, value);
  }

  public double getUnderlyingMultiple() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_UnderlyingMultiple_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ProductID_get(swigCPtr, this);
  }

  public void setExchangeProductID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ExchangeProductID_set(swigCPtr, this, value);
  }

  public String getExchangeProductID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcProductField_ExchangeProductID_get(swigCPtr, this);
  }

  public CThostFtdcProductField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcProductField(), true);
  }

}
