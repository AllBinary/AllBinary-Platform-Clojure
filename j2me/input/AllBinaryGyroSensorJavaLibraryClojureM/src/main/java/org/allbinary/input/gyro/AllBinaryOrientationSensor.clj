;;
;; AllBinary Open License Version 1
;; Copyright (c) 2011 AllBinary
;; 
;; By agreeing to this license you and any business entity you represent are
;; legally bound to the AllBinary Open License Version 1 legal agreement.
;; 
;; You may obtain the AllBinary Open License Version 1 legal agreement from
;; AllBinary or the root directory of AllBinary's AllBinary Platform repository.
;; 
;; Created By: Travis Berthelot
;;  
;; Generated Code Do Not Modify
;; package org.allbinary.input.gyro

(ns AllBinaryOrientationSensor)

(JR/register 'AllBinaryOrientationSensor 'AllBinarySensor '[])

(def jsv_NULL_ALLBINARY_ORIENTATION_SENSOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ALLBINARY_ORIENTATION_SENSOR [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ALLBINARY_ORIENTATION_SENSOR)
(defn jstatic_set_NULL_ALLBINARY_ORIENTATION_SENSOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ALLBINARY_ORIENTATION_SENSOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ALLBINARY_ORIENTATION_SENSOR (AllBinaryOrientationSensor/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :sensorDataFloatArray nil)
  (JR/fset this :listener nil)
    (JR/fset this :sensorDataFloatArray (JR/scall 'PrimitiveFloatUtil :jm_getArrayInstance_0))
    (JR/fset this :listener (JR/scall 'NoCompleteMotionGestureInputEventListener :jm_getInstance_0))
  this)

    
(defn jm_setCompleteMotionGestureInputEventListener_1 [this p_completeMotionGestureInputEventListenerInterface]
  (let [ l_completeMotionGestureInputEventListenerInterface (volatile! p_completeMotionGestureInputEventListenerInterface)]
        (JR/fset this :listener @l_completeMotionGestureInputEventListenerInterface)))

    
(defn jinit_0 [this]
  (let []
    (AllBinarySensor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryOrientationSensor)] (jinit_0 o) o))

    
(defn jm_getOrientation_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))



