/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcUserRightsAssignField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserRightsAssignField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserRightsAssignField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcUserRightsAssignField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcUserRightsAssignField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcUserRightsAssignField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcUserRightsAssignField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcUserRightsAssignField_UserID_get(swigCPtr, this);
  }

  public void setDRIdentityID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcUserRightsAssignField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcUserRightsAssignField_DRIdentityID_get(swigCPtr, this);
  }

  public CThostFtdcUserRightsAssignField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcUserRightsAssignField(), true);
  }

}
