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
;; package org.allbinary.animation.compound

(ns SimultaneousCompoundRotationAnimation)

(JR/register 'SimultaneousCompoundRotationAnimation 'RotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterfaceArray nil)
  this)

    
(defn jinit_2 [this p_animationInterfaceArray p_animationBehavior]
  (let [ l_animationInterfaceArray (volatile! p_animationInterfaceArray) l_animationBehavior (volatile! p_animationBehavior)]
        (RotationAnimation/jinit_3 this (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :QUARTER_TOTAL_ANGLE)) (JR/scall 'CircularIndexUtil :jm_createInstance_1 4) @l_animationBehavior) (jinitfields this)
        (JR/fset this :animationInterfaceArray @l_animationInterfaceArray))
  this)

(defn jnew_2 [p_animationInterfaceArray p_animationBehavior ]
  (let [o (JR/alloc 'SimultaneousCompoundRotationAnimation)] (jinit_2 o p_animationInterfaceArray p_animationBehavior) o))

    
(defn jm_setFrame_1 [this p_frameIndex]
  (let [ l_frameIndex (volatile! p_frameIndex) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_setFrame_1 @l_frameIndex)))))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getFrame_0)))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getAnimationSize_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getSize_0)))

    
(defn jm_previousFrame_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_previousFrame_0)))))

    
(defn jm_nextFrame_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_nextFrame_0)))))

    
(defn jm_previousRotation_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_previousRotation_0)))))

    
(defn jm_nextRotation_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_nextRotation_0)))))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_paintXY_3 @l_graphics @l_x @l_y)))))

    
(defn jm_paintThreedXYZ_4 [this p_graphics p_x p_y p_z]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_paintThreedXYZ_4 @l_graphics @l_x @l_y @l_z)))))

    
(defn jm_setFrameByDirection_1 [this p_direction]
  (let [ l_direction (volatile! p_direction) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_setFrameByDirection_1 @l_direction)))))

    
(defn jm_setFrameToAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_setFrameToAngle_1 @l_angle)))))

    
(defn jm_adjustFrameToAngle_1 [this p_newAngle]
  (let [ l_newAngle (volatile! p_newAngle)]
        (JR/invoke this :jm_adjustFrame_1 (JR/invoke @l_newAngle :jm_getValue_0))))

    
(defn jm_adjustFrame_1 [this p_angle]
  (let [ l_angle (volatile! p_angle) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_adjustFrame_1 @l_angle)))))

    
(defn jm_getAngleInfoP_0 [this]
  (let []
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getAngleInfoP_0)))

    
(defn jm_getAnimationInterfaceArray_0 [this]
  (let []
        (JR/fget this :animationInterfaceArray)))

    
(defn jm_setAnimationInterfaceArray_1 [this p_animationInterfaceArray]
  (let [ l_animationInterfaceArray (volatile! p_animationInterfaceArray)]
        (JR/fset this :animationInterfaceArray @l_animationInterfaceArray)))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_set_1 @l_gl)))))



