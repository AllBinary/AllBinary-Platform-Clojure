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

(ns OrientationToGameKeyEvent)

(JR/register 'OrientationToGameKeyEvent nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :allBinaryGyroSensor nil)
  (JR/fset this :MIN 0)
    (JR/fset this :MIN 15)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'SensorFeatureFactory :jm_getInstance_0) :NO_ORIENTATION))
            (do
            (JR/fset this :allBinaryGyroSensor (NoGyroSensor/jnew_0)))
            (do
            (JR/jthrow (new java.lang.Exception "Not Such Feature")))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OrientationToGameKeyEvent)] (jinit_0 o) o))

    
(defn jm_setAllBinaryGyroSensor_1 [this p_allBinaryGyroSensor]
  (let [ l_allBinaryGyroSensor (volatile! p_allBinaryGyroSensor)]
        (JR/fset this :allBinaryGyroSensor @l_allBinaryGyroSensor)))

    
(defn jm_getAllBinaryGyroSensor_0 [this]
  (let []
        (JR/fget this :allBinaryGyroSensor)))

    
(defn jm_process_0 [this]
  (let []
        nil))

    
(defn jm_updateGameKeyEvents_4 [this p_orientation p_yaw p_pitch p_roll]
  (let [ l_orientation (volatile! p_orientation) l_yaw (volatile! p_yaw) l_pitch (volatile! p_pitch) l_roll (volatile! p_roll)]
        nil))



