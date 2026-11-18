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

(ns OrientationData)

(JR/register 'OrientationData nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (OrientationData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ORIENTATION_SENSOR_INPUT nil)
  (JR/fset this :ORIENTATION_TYPE nil)
    (JR/fset this :ORIENTATION_SENSOR_INPUT "Orientation Sensor Input")
    (JR/fset this :ORIENTATION_TYPE "Orientation Type")
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OrientationData)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OrientationData/jstatic_SINGLETON)))



