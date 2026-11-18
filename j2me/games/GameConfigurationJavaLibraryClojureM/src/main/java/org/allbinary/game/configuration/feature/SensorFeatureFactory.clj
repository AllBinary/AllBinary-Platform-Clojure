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
;; package org.allbinary.game.configuration.feature

(ns SensorFeatureFactory)

(JR/register 'SensorFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SensorFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NO_ORIENTATION nil)
  (JR/fset this :ORIENTATION_SENSORS nil)
  (JR/fset this :SIMULATED_ORIENTATION_SENSORS nil)
  (JR/fset this :YAW nil)
  (JR/fset this :YAW_MINUS_RIGHT_PLUS_LEFT nil)
  (JR/fset this :YAW_MINUS_LEFT_PLUS_RIGHT nil)
  (JR/fset this :PITCH nil)
  (JR/fset this :ROLL nil)
    (JR/fset this :NO_ORIENTATION (SensorFeature/jnew_1 "No Orientation"))
    (JR/fset this :ORIENTATION_SENSORS (SensorFeature/jnew_1 "Orientation Sensors"))
    (JR/fset this :SIMULATED_ORIENTATION_SENSORS (SensorFeature/jnew_1 "Simulated Orientation Sensors"))
    (JR/fset this :YAW (SensorFeature/jnew_1 "Yaw"))
    (JR/fset this :YAW_MINUS_RIGHT_PLUS_LEFT (SensorFeature/jnew_1 "Yaw -Right +Left"))
    (JR/fset this :YAW_MINUS_LEFT_PLUS_RIGHT (SensorFeature/jnew_1 "Yaw -Left +Right "))
    (JR/fset this :PITCH (SensorFeature/jnew_1 "Pitch"))
    (JR/fset this :ROLL (SensorFeature/jnew_1 "Roll"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SensorFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SensorFeatureFactory)] (jinit_0 o) o))



