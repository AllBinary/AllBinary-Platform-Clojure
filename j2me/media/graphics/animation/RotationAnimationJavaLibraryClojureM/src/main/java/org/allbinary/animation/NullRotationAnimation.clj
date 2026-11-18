;; Generated Code Do Not Modify
;; package org.allbinary.animation

(ns NullRotationAnimation)

(JR/register 'NullRotationAnimation 'RotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_createTotalAngle_3 [p_angleInfo p_totalAngle p_animationBehavior]
  (let [this nil l_angleInfo (volatile! p_angleInfo) l_totalAngle (volatile! p_totalAngle) l_animationBehavior (volatile! p_animationBehavior)]
        (NullRotationAnimation/jnew_3 @l_angleInfo (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/idiv @l_totalAngle (JR/invoke (JR/invoke @l_angleInfo :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0))) @l_animationBehavior)))

    
(defn jm_createQuarter_1 [p_animationBehavior]
  (let [this nil l_animationBehavior (volatile! p_animationBehavior)]
        (NullRotationAnimation/jnew_3 (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :QUARTER_TOTAL_ANGLE)) (JR/scall 'CircularIndexUtil :jm_createInstance_1 4) @l_animationBehavior)))

    
(defn jinit_3 [this p_angleInfo p_circularIndexUtil p_animationBehavior]
  (let [ l_angleInfo (volatile! p_angleInfo) l_circularIndexUtil (volatile! p_circularIndexUtil) l_animationBehavior (volatile! p_animationBehavior)]
        (RotationAnimation/jinit_3 this @l_angleInfo @l_circularIndexUtil @l_animationBehavior) (jinitfields this))
  this)

(defn jnew_3 [p_angleInfo p_circularIndexUtil p_animationBehavior ]
  (let [o (JR/alloc 'NullRotationAnimation)] (jinit_3 o p_angleInfo p_circularIndexUtil p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        0))



