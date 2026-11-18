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

(ns GameConfigurationGauge)

(JR/register 'GameConfigurationGauge 'Gauge '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_gameConfiguration]
  (let [ l_gameConfiguration (volatile! p_gameConfiguration)]
        (Gauge/jinit_4 this (JR/invoke @l_gameConfiguration :jm_getName_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_isModifiable_0) :jm_booleanValue_0) (- (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMaxValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0)) (- (JR/invoke (JR/invoke @l_gameConfiguration :jm_getValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0))) (jinitfields this))
  this)

(defn jnew_1 [p_gameConfiguration ]
  (let [o (JR/alloc 'GameConfigurationGauge)] (jinit_1 o p_gameConfiguration) o))



