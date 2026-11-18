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

(ns RotationAnimation)

(JR/register 'RotationAnimation 'IndexedAnimation '[RotationAnimationInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :frameUtil nil)
  (JR/fset this :directionUtil nil)
  (JR/fset this :angleInfo nil)
  (JR/fset this :circularIndexUtil nil)
    (JR/fset this :frameUtil (JR/scall 'FrameUtil :jm_getInstance_0))
    (JR/fset this :directionUtil (JR/scall 'DirectionUtil :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_angleInfo p_circularIndexUtil p_animationBehavior]
  (let [ l_angleInfo (volatile! p_angleInfo) l_circularIndexUtil (volatile! p_circularIndexUtil) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :angleInfo @l_angleInfo)
        (JR/fset this :circularIndexUtil @l_circularIndexUtil))
  this)

(defn jnew_3 [p_angleInfo p_circularIndexUtil p_animationBehavior ]
  (let [o (JR/alloc 'RotationAnimation)] (jinit_3 o p_angleInfo p_circularIndexUtil p_animationBehavior) o))

    
(defn jm_nextRotationX_0 [this]
  (let []
        nil))

    
(defn jm_previousRotationX_0 [this]
  (let []
        nil))

    
(defn jm_nextRotation_0 [this]
  (let []
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0))))

    
(defn jm_previousRotation_0 [this]
  (let []
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 (JR/invoke (JR/fget this :circularIndexUtil) :jm_previous_0))))

    
(defn jm_nextRotationZ_0 [this]
  (let []
        nil))

    
(defn jm_previousRotationZ_0 [this]
  (let []
        nil))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index) l_newFrame (volatile! nil)]
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setIndex_1 @l_index)
        (vreset! l_newFrame (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 @l_newFrame)))

    
(defn jm_setFrameByDirection_1 [this p_direction]
  (let [ l_direction (volatile! p_direction) l_angle (volatile! nil)]
        (vreset! l_angle (JR/invoke (JR/fget this :directionUtil) :jm_getFrameAngle_1 @l_direction))
        (JR/invoke this :jm_adjustFrameToAngle_1 @l_angle)))

    
(defn jm_setFrameToAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/invoke this :jm_adjustFrameToAngle_1 @l_angle)))

    
(defn jm_adjustFrameToAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/invoke this :jm_adjustFrame_1 (JR/invoke @l_angle :jm_getValue_0))))

    
(defn jm_adjustFrame_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/invoke this :jm_setFrame_1 (JR/invoke (JR/fget this :frameUtil) :jm_getFrameForAngle_2 @l_angle (JR/invoke (JR/invoke (JR/fget this :angleInfo) :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0)))))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_getSize_0)))

    
(defn jm_getAngleInfoP_0 [this]
  (let []
        (JR/fget this :angleInfo)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of this)) :jm_append_1 "circularIndexUtil: ") :jm_append_1 (JR/to-string-of (JR/fget this :circularIndexUtil))) :jm_append_1 "angleInfo: ") :jm_append_1 (JR/to-string-of (JR/fget this :angleInfo))))))



