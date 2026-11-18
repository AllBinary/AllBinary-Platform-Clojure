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

(ns AccelerometerSensorUpdateProcessor)

(JR/register 'AccelerometerSensorUpdateProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (Processor/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AccelerometerSensorUpdateProcessor)] (jinit_0 o) o))

    
(defn jm_process_0 [this]
  (let [ l_sensorFeatureFactory (volatile! nil)]
        (vreset! l_sensorFeatureFactory (JR/scall 'SensorFeatureFactory :jm_getInstance_0))
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget @l_sensorFeatureFactory :ORIENTATION_SENSORS))
            (do
            (JR/invoke (JR/scall 'AccelerometerSensorFactory :jm_getInstance_0) :jm_setCompleteMotionGestureInputEventListener_1 (SingleKeyPressGameKeyFromMotionGestureEventListener/jnew_0)))
            (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget @l_sensorFeatureFactory :SIMULATED_ORIENTATION_SENSORS))
            (do
            (JR/invoke (JR/scall 'AccelerometerSensorFactory :jm_getInstance_0) :jm_setCompleteMotionGestureInputEventListener_1 (SingleKeyPressGameKeyFromMotionGestureEventListener/jnew_0)))
            (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget @l_sensorFeatureFactory :NO_ORIENTATION))
            (do
            (JR/invoke (JR/scall 'AccelerometerSensorFactory :jm_getInstance_0) :jm_setCompleteMotionGestureInputEventListener_1 (JR/scall 'NoCompleteMotionGestureInputEventListener :jm_getInstance_0)))
            (do
            (JR/jthrow (new java.lang.Exception "Sensor Feature Not Set"))))))))



