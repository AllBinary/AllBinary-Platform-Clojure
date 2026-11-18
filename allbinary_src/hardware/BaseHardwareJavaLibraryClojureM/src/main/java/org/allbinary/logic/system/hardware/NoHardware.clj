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
;; package org.allbinary.logic.system.hardware

(ns NoHardware)

(JR/register 'NoHardware nil '[HardwareInterface])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (NoHardware/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NoHardware)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoHardware/jstatic_instance)))

    
(defn jm_getComponent_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/scall 'NoHardwareComponent :jm_getInstance_0)))

    
(defn jm_toString_0 [this]
  (let []
        "No Hardware"))

    
(defn jm_compareTo_1 [this p_hardwareInterface]
  (let [ l_hardwareInterface (volatile! p_hardwareInterface)]
        true))

    
(defn jm_difference_1 [this p_hardwareInterface]
  (let [ l_hardwareInterface (volatile! p_hardwareInterface)]
        (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE)))



