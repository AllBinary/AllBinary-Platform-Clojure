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
;; package org.allbinary.debug

(ns NoDebug)

(JR/register 'NoDebug nil '[DebugInterface])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (NoDebug/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NoDebug)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoDebug/jstatic_SINGLETON)))

    
(defn jm_start_0 [this]
  (let []
        nil))

    
(defn jm_stop_0 [this]
  (let []
        nil))

    
(defn jm_getMaxTime_0 [this]
  (let []
        10000))

    
(defn jm_getStartTime_0 [this]
  (let []
        0))

    
(defn jm_isRunning_0 [this]
  (let []
        false))



