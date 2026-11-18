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

(ns NoGyroSensor)

(JR/register 'NoGyroSensor 'AllBinaryOrientationSensor '[AllBinarySensorListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (AllBinaryOrientationSensor/jinit_0 this) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoGyroSensor)] (jinit_0 o) o))

    
(defn jm_getOrientation_0 [this]
  (let []
        (JR/sget 'Orientation "NONE")))

    
(defn jm_onSensorChange_0 [this]
  (let []
        nil))



