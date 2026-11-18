;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.logic.system.hardware.components.interfaces

(ns NoHardwareComponent)

(JR/register 'NoHardwareComponent nil '[HardwareComponentInterface])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (NoHardwareComponent/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NoHardwareComponent)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoHardwareComponent/jstatic_instance)))

    
(defn jm_compareTo_1 [this p_componentInterface]
  (let [ l_componentInterface (volatile! p_componentInterface)](JR/method
        (if (JR/eq this @l_componentInterface)
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))



