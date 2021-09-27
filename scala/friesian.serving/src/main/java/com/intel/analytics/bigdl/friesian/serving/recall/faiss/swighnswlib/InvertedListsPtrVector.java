/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.intel.analytics.bigdl.friesian.serving.recall.faiss.swighnswlib;

public class InvertedListsPtrVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InvertedListsPtrVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InvertedListsPtrVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_InvertedListsPtrVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InvertedListsPtrVector() {
    this(swigfaissJNI.new_InvertedListsPtrVector(), true);
  }

  public void push_back(InvertedLists arg0) {
    swigfaissJNI.InvertedListsPtrVector_push_back(swigCPtr, this, InvertedLists.getCPtr(arg0), arg0);
  }

  public void clear() {
    swigfaissJNI.InvertedListsPtrVector_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_p_faiss__InvertedLists data() {
    long cPtr = swigfaissJNI.InvertedListsPtrVector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_faiss__InvertedLists(cPtr, false);
  }

  public long size() {
    return swigfaissJNI.InvertedListsPtrVector_size(swigCPtr, this);
  }

  public InvertedLists at(long n) {
    long cPtr = swigfaissJNI.InvertedListsPtrVector_at(swigCPtr, this, n);
    return (cPtr == 0) ? null : new InvertedLists(cPtr, false);
  }

  public void resize(long n) {
    swigfaissJNI.InvertedListsPtrVector_resize(swigCPtr, this, n);
  }

  public void swap(InvertedListsPtrVector other) {
    swigfaissJNI.InvertedListsPtrVector_swap(swigCPtr, this, InvertedListsPtrVector.getCPtr(other), other);
  }

}
