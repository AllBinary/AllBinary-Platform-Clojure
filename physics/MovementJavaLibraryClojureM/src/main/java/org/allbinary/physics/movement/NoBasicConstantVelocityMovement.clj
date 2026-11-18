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
;; package org.allbinary.physics.movement

(ns NoBasicConstantVelocityMovement)

(JR/register 'NoBasicConstantVelocityMovement 'BasicConstantVelocityMovement '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (BasicConstantVelocityMovement/jinit_2 this (JR/sget 'BasicDecimal "ZERO_BIGDECIMAL") (BasicVelocityProperties/jnew_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoBasicConstantVelocityMovement)] (jinit_0 o) o))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        nil))



