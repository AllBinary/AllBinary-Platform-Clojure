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
;; package org.allbinary.android.input.motion

(ns AnalogControllerConfigurationFactory)

(JR/register 'AnalogControllerConfigurationFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AnalogControllerConfigurationFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SCALE_FACTOR 0)
  (JR/fset this :SCALE_VALUE 0)
  (JR/fset this :available false)
  (JR/fset this :analogControllerConfigurationEvent nil)
    (JR/fset this :SCALE_FACTOR (JR/fget (JR/scall 'ScaleFactorFactory :jm_getInstance_0) :DEFAULT_SCALE_FACTOR))
    (JR/fset this :SCALE_VALUE (JR/fget (JR/scall 'ScaleFactorFactory :jm_getInstance_0) :DEFAULT_SCALE_VALUE))
    (JR/fset this :analogControllerConfigurationEvent (AnalogControllerConfigurationEvent/jnew_1 this))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnalogControllerConfigurationFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AnalogControllerConfigurationFactory)] (jinit_0 o) o))

    
(defn jm_isAvailable_0 [this]
  (let []
        (JR/fget this :available)))

    
(defn jm_setAvailable_1 [this p_available]
  (let [ l_available (volatile! p_available)]
        (JR/fset this :available @l_available)
        (JR/invoke (JR/scall 'AnalogControllerConfigurationEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :analogControllerConfigurationEvent))))



