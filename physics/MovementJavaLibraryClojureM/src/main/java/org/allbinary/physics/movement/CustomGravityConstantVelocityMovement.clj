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

(ns CustomGravityConstantVelocityMovement)

(JR/register 'CustomGravityConstantVelocityMovement 'BasicConstantVelocityMovement '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :customGravity 0)
  (JR/fset this :gravityUtil nil)
    (JR/fset this :gravityUtil (JR/scall 'GravityUtil :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_speedBasicDecimal p_customGravity]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal) l_customGravity (volatile! p_customGravity)]
        (BasicConstantVelocityMovement/jinit_2 this @l_speedBasicDecimal (VelocityProperties/jnew_2 (JR/i32 (JR/invoke @l_speedBasicDecimal :jm_getUnscaled_0)) (JR/i32 (JR/invoke @l_speedBasicDecimal :jm_getUnscaled_0)))) (jinitfields this)
        (JR/fset this :customGravity @l_customGravity))
  this)

(defn jnew_2 [p_speedBasicDecimal p_customGravity ]
  (let [o (JR/alloc 'CustomGravityConstantVelocityMovement)] (jinit_2 o p_speedBasicDecimal p_customGravity) o))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer) l_velocityProperties (volatile! nil)]
        (JR/invoke-super 'BasicConstantVelocityMovement this :jm_process_1 @l_layer)
        (JR/invoke (JR/fget this :gravityUtil) :jm_process_2 (JR/invoke this :jm_getVelocityProperties_0) (JR/fget this :customGravity))
        (vreset! l_velocityProperties (JR/invoke this :jm_getVelocityProperties_0))
        (JR/invoke @l_velocityProperties :jm_limitMaxYForwardVelocity_0)))



