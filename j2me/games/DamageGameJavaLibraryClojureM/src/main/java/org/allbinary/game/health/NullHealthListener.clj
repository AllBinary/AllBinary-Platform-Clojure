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
;; package org.allbinary.game.health

(ns NullHealthListener)

(JR/register 'NullHealthListener nil '[HealthListenerInterface])

(def jsv_NULL_HEALTH_LISTENER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_HEALTH_LISTENER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_HEALTH_LISTENER)
(defn jstatic_set_NULL_HEALTH_LISTENER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_HEALTH_LISTENER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_HEALTH_LISTENER (NullHealthListener/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullHealthListener)] (jinit_0 o) o))

    
(defn jm_onHealthChange_0 [this]
  (let []
        nil))



