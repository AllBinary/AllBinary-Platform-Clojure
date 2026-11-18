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
;; package org.allbinary.input

(ns AllBinarySensorManager)

(JR/register 'AllBinarySensorManager nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :ORIENTATION_SENSOR_INPUT nil)
  (JR/fset this :ORIENTATION_TYPE nil)
  (JR/fset this :list nil)
    (JR/fset this :ORIENTATION_SENSOR_INPUT "Orientation Sensor Input")
    (JR/fset this :ORIENTATION_TYPE "Orientation Type")
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (AllBinarySensorManager/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (AllBinarySensorManager/jstatic_set_instance (AllBinarySensorManager/jnew_0))))
        (AllBinarySensorManager/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinarySensorManager)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_getSensorNamesList_0 [this]
  (let []
        (JR/fget this :list)))

    
(defn jm_shutdown_0 [this]
  (let []
        nil))



