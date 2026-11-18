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
;; package org.allbinary.game.physics.velocity

(ns DragVelocityBehavior)

(JR/register 'DragVelocityBehavior 'VelocityBehaviorBase '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DragVelocityBehavior/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (VelocityBehaviorBase/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DragVelocityBehavior)] (jinit_0 o) o))

    
(defn jm_reduce_3 [this p_velocityProperties p_nominator p_denominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator) l_denominator (volatile! p_denominator) l_basicDecimal (volatile! nil)]
        (if (not (== (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityXBasicDecimalP_0) :jm_getUnscaled_0) 0))
            (do
            (vreset! l_basicDecimal (JR/invoke @l_velocityProperties :jm_getVelocityXBasicDecimalP_0))
            (JR/invoke @l_basicDecimal :jm_multiplyint_1 @l_nominator)
            (JR/invoke @l_basicDecimal :jm_divideint_1 @l_denominator)))
        (if (not (== (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityYBasicDecimalP_0) :jm_getUnscaled_0) 0))
            (do
            (vreset! l_basicDecimal (JR/invoke @l_velocityProperties :jm_getVelocityYBasicDecimalP_0))
            (JR/invoke @l_basicDecimal :jm_multiplyint_1 @l_nominator)
            (JR/invoke @l_basicDecimal :jm_divideint_1 @l_denominator)))))

    
(defn jm_reduceX_3 [this p_velocityProperties p_nominator p_denominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator) l_denominator (volatile! p_denominator) l_basicDecimal (volatile! nil)]
        (vreset! l_basicDecimal (JR/invoke @l_velocityProperties :jm_getVelocityXBasicDecimalP_0))
        (if (not (== (JR/invoke @l_basicDecimal :jm_getUnscaled_0) 0))
            (do
            (JR/invoke @l_basicDecimal :jm_multiplyint_1 @l_nominator)
            (JR/invoke @l_basicDecimal :jm_divideint_1 @l_denominator)))))

    
(defn jm_reduceY_3 [this p_velocityProperties p_nominator p_denominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator) l_denominator (volatile! p_denominator) l_basicDecimal (volatile! nil)]
        (if (not (== (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityYBasicDecimalP_0) :jm_getUnscaled_0) 0))
            (do
            (vreset! l_basicDecimal (JR/invoke @l_velocityProperties :jm_getVelocityYBasicDecimalP_0))
            (JR/invoke @l_basicDecimal :jm_multiplyint_1 @l_nominator)
            (JR/invoke @l_basicDecimal :jm_divideint_1 @l_denominator)))))



