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
;; package org.allbinary.game.configuration

(ns GameSpeed)

(JR/register 'GameSpeed nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameSpeed/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameSpeed)] (jinit_0 o) o))

    
(defn jm_getSpeed_0 [this]
  (let [ l_speedGameConfiguration (volatile! nil)]
        (vreset! l_speedGameConfiguration (JR/fget (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :SPEED))
        (+ (- (JR/invoke (JR/invoke @l_speedGameConfiguration :jm_getMaxValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_speedGameConfiguration :jm_getValue_0) :jm_intValue_0)) 1)))

    
(defn jm_getDelay_0 [this]
  (let [ l_speedGameConfiguration (volatile! nil)]
        (vreset! l_speedGameConfiguration (JR/fget (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :SPEED))
        (* 19 (- (JR/invoke (JR/invoke @l_speedGameConfiguration :jm_getMaxValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_speedGameConfiguration :jm_getValue_0) :jm_intValue_0)))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameSpeed/jstatic_instance)))



