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

(ns SensorGameUpdateProcessor)

(JR/register 'SensorGameUpdateProcessor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :inputSensor nil)
    (JR/fset this :inputSensor (JR/scall 'NoAllBinarySensor :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SensorGameUpdateProcessor)] (jinit_0 o) o))

    
(defn jm_setInputSensor_1 [this p_inputSensor]
  (let [ l_inputSensor (volatile! p_inputSensor)]
        (JR/fset this :inputSensor @l_inputSensor)))

    
(defn jm_getInputSensor_0 [this]
  (let []
        (JR/fget this :inputSensor)))

    
(defn jm_process_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        nil))

    
(defn jm_sendNotifications_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        nil))

    
(defn jm_isAnySensor_0 [this]
  (let []
        (if (JR/eq (JR/fget this :inputSensor) (JR/scall 'NoAllBinarySensor :jm_getInstance_0))
            (do
            false)
            (do
            true))))

    
(defn jm_setNoSensors_0 [this]
  (let []
        (JR/invoke this :jm_setInputSensor_1 (JR/scall 'NoAllBinarySensor :jm_getInstance_0))))



