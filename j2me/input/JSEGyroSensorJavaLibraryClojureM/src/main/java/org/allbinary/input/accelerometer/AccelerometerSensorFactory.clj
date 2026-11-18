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
;; package org.allbinary.input.accelerometer

(ns AccelerometerSensorFactory)

(JR/register 'AccelerometerSensorFactory nil '[])

(def jsv_allBinaryAccelerometerSensor (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_allBinaryAccelerometerSensor [] (JR/ensure-init jclinit-state jclinit) @jsv_allBinaryAccelerometerSensor)
(defn jstatic_set_allBinaryAccelerometerSensor [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_allBinaryAccelerometerSensor v))

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AccelerometerSensorFactory)] (jinit_0 o) o))

    
(defn jm_init_0 []
  (let [this nil l_features (volatile! nil) l_sensorFeatureFactory (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_sensorFeatureFactory (JR/scall 'SensorFeatureFactory :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_sensorFeatureFactory :ORIENTATION_SENSORS))
            (do
            (JR/jthrow (new java.lang.Exception "No Orientation Sensors")))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_sensorFeatureFactory :SIMULATED_ORIENTATION_SENSORS))
            (do
            (JR/jthrow (new java.lang.Exception "No Simulation Sensors")))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_sensorFeatureFactory :NO_ORIENTATION))
            (do
            (AccelerometerSensorFactory/jstatic_set_allBinaryAccelerometerSensor (NoAccelerometerSensor/jnew_0)))
            (do
            (JR/jthrow (new java.lang.Exception "Not Such SensorFeature"))))))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AccelerometerSensorFactory/jstatic_allBinaryAccelerometerSensor)))



