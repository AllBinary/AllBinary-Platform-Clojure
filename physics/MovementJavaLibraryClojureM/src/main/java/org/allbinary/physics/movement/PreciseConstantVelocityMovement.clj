;; Generated Code Do Not Modify
;; package org.allbinary.physics.movement

(ns PreciseConstantVelocityMovement)

(JR/register 'PreciseConstantVelocityMovement 'BasicConstantVelocityMovement '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :accumulatedX 0)
  (JR/fset this :accumulatedY 0)
  (JR/fset this :accumulatedZ 0)
  (JR/fset this :factorValue 0)
    (JR/fset this :factorValue (JR/fget (JR/scall 'ScaleFactorFactory :jm_getInstance_0) :DEFAULT_SCALE_VALUE))
  this)

    
(defn jinit_2 [this p_basicDecimal p_velocityProperties]
  (let [ l_basicDecimal (volatile! p_basicDecimal) l_velocityProperties (volatile! p_velocityProperties)]
        (BasicConstantVelocityMovement/jinit_2 this @l_basicDecimal @l_velocityProperties) (jinitfields this))
  this)

(defn jnew_2 [p_basicDecimal p_velocityProperties ]
  (let [o (JR/alloc 'PreciseConstantVelocityMovement)] (jinit_2 o p_basicDecimal p_velocityProperties) o))

    
(defn jm_init_3 [this p_speedBasicDecimal p_angle p_otherAngle]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        nil))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer) l_mathUtil (volatile! nil) l_velocityProperties (volatile! nil)]
        (vreset! l_mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
        (vreset! l_velocityProperties (JR/invoke this :jm_getVelocityProperties_0))
        (JR/fset this :accumulatedX (JR/i32 (unchecked-add (JR/fget this :accumulatedX) (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityXBasicDecimalP_0) :jm_getUnscaled_0))))
        (JR/fset this :accumulatedY (JR/i32 (unchecked-add (JR/fget this :accumulatedY) (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityYBasicDecimalP_0) :jm_getUnscaled_0))))
        (JR/fset this :accumulatedZ (JR/i32 (unchecked-add (JR/fget this :accumulatedZ) (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityZBasicDecimalP_0) :jm_getUnscaled_0))))
        (JR/invoke @l_layer :jm_moveDXYZ_3 (JR/idiv (JR/fget this :accumulatedX) (JR/fget this :factorValue)) (JR/idiv (JR/fget this :accumulatedY) (JR/fget this :factorValue)) (JR/idiv (JR/fget this :accumulatedZ) (JR/fget this :factorValue)))
        (if (> (JR/invoke @l_mathUtil :jm_abs_1 (JR/fget this :accumulatedX)) (JR/fget this :factorValue))
            (do
            (JR/fset this :accumulatedX 0)))
        (if (> (JR/invoke @l_mathUtil :jm_abs_1 (JR/fget this :accumulatedY)) (JR/fget this :factorValue))
            (do
            (JR/fset this :accumulatedY 0)))
        (if (> (JR/invoke @l_mathUtil :jm_abs_1 (JR/fget this :accumulatedZ)) (JR/fget this :factorValue))
            (do
            (JR/fset this :accumulatedZ 0)))))



