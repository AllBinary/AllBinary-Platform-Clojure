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

(ns BasicGravityConstantVelocityMovement)

(JR/register 'BasicGravityConstantVelocityMovement 'BasicConstantVelocityMovement '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gravityUtil nil)
    (JR/fset this :gravityUtil (JR/scall 'GravityUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_speedBasicDecimal]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal)]
        (BasicConstantVelocityMovement/jinit_2 this @l_speedBasicDecimal (VelocityProperties/jnew_2 (JR/i32 (JR/invoke @l_speedBasicDecimal :jm_getUnscaled_0)) (JR/i32 (JR/invoke @l_speedBasicDecimal :jm_getUnscaled_0)))) (jinitfields this))
  this)

(defn jnew_1 [p_speedBasicDecimal ]
  (let [o (JR/alloc 'BasicGravityConstantVelocityMovement)] (jinit_1 o p_speedBasicDecimal) o))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        (JR/invoke-super 'BasicConstantVelocityMovement this :jm_process_1 @l_layer)
        (JR/invoke (JR/fget this :gravityUtil) :jm_process_2 (JR/invoke this :jm_getVelocityProperties_0) (JR/fget (JR/fget this :gravityUtil) :GAME_GRAVITY_VELOCITY))))



