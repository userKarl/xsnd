/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQryBulletinField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBulletinField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBulletinField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcQryBulletinField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_ExchangeID_get(swigCPtr, this);
  }

  public void setBulletinID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_BulletinID_set(swigCPtr, this, value);
  }

  public int getBulletinID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_BulletinID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_SequenceNo_get(swigCPtr, this);
  }

  public void setNewsType(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_NewsType_set(swigCPtr, this, value);
  }

  public String getNewsType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_NewsType_get(swigCPtr, this);
  }

  public void setNewsUrgency(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_NewsUrgency_set(swigCPtr, this, value);
  }

  public char getNewsUrgency() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryBulletinField_NewsUrgency_get(swigCPtr, this);
  }

  public CThostFtdcQryBulletinField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcQryBulletinField(), true);
  }

}
