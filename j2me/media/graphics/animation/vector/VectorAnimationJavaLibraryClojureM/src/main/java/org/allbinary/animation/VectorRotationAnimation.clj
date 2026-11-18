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
;; package org.allbinary.animation

(ns VectorRotationAnimation)

(JR/register 'VectorRotationAnimation 'VectorBaseRotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_3 [this p_currentPoints p_basicColor p_animationBehavior]
  (let [ l_currentPoints (volatile! p_currentPoints) l_basicColor (volatile! p_basicColor) l_animationBehavior (volatile! p_animationBehavior)]
        (VectorBaseRotationAnimation/jinit_4 this (JR/scall 'AngleInfo :jm_getInstance_1 (JR/i16 (JR/idiv (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/alen @l_currentPoints)))) @l_currentPoints @l_basicColor @l_animationBehavior) (jinitfields this)
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 (JR/invoke this :jm_getFrame_0)))
  this)

(defn jnew_3 [p_currentPoints p_basicColor p_animationBehavior ]
  (let [o (JR/alloc 'VectorRotationAnimation)] (jinit_3 o p_currentPoints p_basicColor p_animationBehavior) o))

    
(defn jm_setFrameByDirection_1 [this p_direction]
  (let [ l_direction (volatile! p_direction) l_angle (volatile! nil)]
        (vreset! l_angle (JR/invoke (JR/fget this :directionUtil) :jm_getFrameAngle_1 @l_direction))
        (JR/invoke this :jm_adjustFrameToAngle_1 @l_angle)))

    
(defn jm_setFrameToAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/invoke this :jm_adjustFrameToAngle_1 @l_angle)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke-super 'VectorBaseRotationAnimation this :jm_setFrame_1 @l_index)
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 (JR/invoke this :jm_getFrame_0))))

    
(defn jm_adjustFrame_1 [this p_newAngle]
  (let [ l_newAngle (volatile! p_newAngle)]
        (JR/invoke this :jm_setFrame_1 (JR/invoke (JR/fget this :frameUtil) :jm_getFrameForAngle_2 @l_newAngle (JR/invoke (JR/invoke (JR/fget this :angleInfo) :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0)))))

    
(defn jm_adjustFrameToAngle_1 [this p_newAngle]
  (let [ l_newAngle (volatile! p_newAngle)]
        (JR/invoke this :jm_adjustFrame_1 (JR/invoke @l_newAngle :jm_getValue_0))))



