/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.cmu.pocketsphinx;

public class Config {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Config obj) {
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
        SphinxBaseJNI.delete_Config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBoolean(String key, boolean val) {
    SphinxBaseJNI.Config_setBoolean(swigCPtr, this, key, val);
  }

  public void setInt(String key, int val) {
    SphinxBaseJNI.Config_setInt(swigCPtr, this, key, val);
  }

  public void setFloat(String key, double val) {
    SphinxBaseJNI.Config_setFloat(swigCPtr, this, key, val);
  }

  public void setString(String key, String val) {
    SphinxBaseJNI.Config_setString(swigCPtr, this, key, val);
  }

  public void setStringExtra(String key, String val) {
    SphinxBaseJNI.Config_setStringExtra(swigCPtr, this, key, val);
  }

  public boolean exists(String key) {
    return SphinxBaseJNI.Config_exists(swigCPtr, this, key);
  }

  public boolean getBoolean(String key) {
    return SphinxBaseJNI.Config_getBoolean(swigCPtr, this, key);
  }

  public int getInt(String key) {
    return SphinxBaseJNI.Config_getInt(swigCPtr, this, key);
  }

  public double getFloat(String key) {
    return SphinxBaseJNI.Config_getFloat(swigCPtr, this, key);
  }

  public String getString(String key) {
    return SphinxBaseJNI.Config_getString(swigCPtr, this, key);
  }

}
