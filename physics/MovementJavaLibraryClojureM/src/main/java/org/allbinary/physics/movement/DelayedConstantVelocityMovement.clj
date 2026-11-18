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

(ns DelayedConstantVelocityMovement)

(JR/register 'DelayedConstantVelocityMovement 'BasicConstantVelocityMovement '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeDelayHelper nil)
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 60))
  this)

    
(defn jinit_2 [this p_basicDecimal p_velocityProperties]
  (let [ l_basicDecimal (volatile! p_basicDecimal) l_velocityProperties (volatile! p_velocityProperties)]
        (BasicConstantVelocityMovement/jinit_2 this @l_basicDecimal @l_velocityProperties) (jinitfields this))
  this)

(defn jnew_2 [p_basicDecimal p_velocityProperties ]
  (let [o (JR/alloc 'DelayedConstantVelocityMovement)] (jinit_2 o p_basicDecimal p_velocityProperties) o))

    
(defn jm_init_3 [this p_speedBasicDecimal p_angle p_otherAngle]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        nil))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
            (do
            (JR/invoke-super 'BasicConstantVelocityMovement this :jm_process_1 @l_layer)))))



