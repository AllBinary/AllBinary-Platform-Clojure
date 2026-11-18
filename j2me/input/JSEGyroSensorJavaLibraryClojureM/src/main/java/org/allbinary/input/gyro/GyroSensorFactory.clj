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

(ns GyroSensorFactory)

(JR/register 'GyroSensorFactory nil '[])

(def jsv_allBinaryGyroSensor (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_allBinaryGyroSensor [] (JR/ensure-init jclinit-state jclinit) @jsv_allBinaryGyroSensor)
(defn jstatic_set_allBinaryGyroSensor [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_allBinaryGyroSensor v))

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GyroSensorFactory)] (jinit_0 o) o))

    
(defn jm_init_0 []
  (let [this nil]
        (GyroSensorFactory/jstatic_set_allBinaryGyroSensor (NoGyroSensor/jnew_0))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GyroSensorFactory/jstatic_allBinaryGyroSensor)))



