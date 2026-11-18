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
;; package org.allbinary.time

(ns NoTimeDelayHelper)

(JR/register 'NoTimeDelayHelper 'TimeDelayHelper '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (NoTimeDelayHelper/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (TimeDelayHelper/jinit_1 this 0) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoTimeDelayHelper)] (jinit_0 o) o))

    
(defn jm_isTimeTNT_0 [this]
  (let []
        true))

    
(defn jm_isTimeSinceTNT_1 [this p_delay]
  (let [ l_delay (volatile! p_delay)]
        true))

    
(defn jm_isTime_1 [this p_currentTime]
  (let [ l_currentTime (volatile! p_currentTime)]
        true))

    
(defn jm_isTimeSince_2 [this p_delay p_currentTime]
  (let [ l_delay (volatile! p_delay) l_currentTime (volatile! p_currentTime)]
        true))



