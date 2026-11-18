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
;; package org.allbinary.input.motion.gesture.configuration

(ns MotionGestureConfigurationFactory)

(JR/register 'MotionGestureConfigurationFactory nil '[])

(def jsv_config (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_config [] (JR/ensure-init jclinit-state jclinit) @jsv_config)
(defn jstatic_set_config [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_config v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_config (MotionGestureConfiguration/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MotionGestureConfigurationFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MotionGestureConfigurationFactory/jstatic_config)))



