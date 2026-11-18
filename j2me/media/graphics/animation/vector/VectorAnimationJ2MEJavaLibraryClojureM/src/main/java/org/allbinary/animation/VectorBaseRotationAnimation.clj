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

(ns VectorBaseRotationAnimation)

(JR/register 'VectorBaseRotationAnimation 'RotationAnimation '[VectorAnimationInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :currentPoints nil)
    (JR/fset this :currentPoints (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY_ARRAY))
  this)

    
(defn jinit_4 [this p_angleInfo p_currentPoints p_basicColor p_animationBehavior]
  (let [ l_angleInfo (volatile! p_angleInfo) l_currentPoints (volatile! p_currentPoints) l_basicColor (volatile! p_basicColor) l_animationBehavior (volatile! p_animationBehavior)]
        (RotationAnimation/jinit_3 this @l_angleInfo (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/idiv 360 (JR/invoke (JR/invoke @l_angleInfo :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0))) @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_setPoints_1 @l_currentPoints)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor))
  this)

(defn jnew_4 [p_angleInfo p_currentPoints p_basicColor p_animationBehavior ]
  (let [o (JR/alloc 'VectorBaseRotationAnimation)] (jinit_4 o p_angleInfo p_currentPoints p_basicColor p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setIndex_1 @l_index)))

    
(defn jm_nextFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))

    
(defn jm_previousFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_previous_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/alen (JR/fget this :currentPoints))))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_nextPointX (volatile! nil) l_nextPointY (volatile! nil) l_nextPoint (volatile! nil) l_point (volatile! nil) l_currentPointsFrame (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/fget this :basicColor))
        (try (do
            (vreset! l_nextPointX 0)
            (vreset! l_nextPointY 0)
            (vreset! l_nextPoint nil)
            (vreset! l_point nil)
            (vreset! l_currentPointsFrame (JR/aget* (JR/fget this :currentPoints) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))
            (vreset! l_size (JR/alen @l_currentPointsFrame))
            (vreset! l_index (unchecked-int (unchecked-subtract @l_size 2)))
            (JR/jwhile false false (>= (JR/vinc l_index -1 :int false) 0)
                (vreset! l_nextPoint (JR/aget* @l_currentPointsFrame @l_index))
                (vreset! l_point (JR/aget* @l_currentPointsFrame (unchecked-int (unchecked-add @l_index 1))))
                (vreset! l_nextPointX (JR/aget* @l_nextPoint 0))
                (vreset! l_nextPointY (JR/aget* @l_nextPoint 1))
                (if (not (== @l_nextPointX 1000))
                    (do
                    (JR/invoke @l_graphics :jm_drawLine_4 (unchecked-int (unchecked-add (JR/aget* @l_point 0) @l_x)) (unchecked-int (unchecked-add (JR/aget* @l_point 1) @l_y)) (unchecked-int (unchecked-add @l_nextPointX @l_x)) (unchecked-int (unchecked-add @l_nextPointY @l_y))))
                    (do
                    (JR/vinc l_index -1 :int false)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "paintVectors" @l_e)) :else (throw jt)))))))

    
(defn jm_getPoints_1 [this p_frame]
  (let [ l_frame (volatile! p_frame)]
        (JR/aget* (JR/fget this :currentPoints) @l_frame)))

    
(defn jm_setPoints_1 [this p_currentPoints]
  (let [ l_currentPoints (volatile! p_currentPoints)]
        (JR/fset this :currentPoints @l_currentPoints)
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/alen (JR/fget this :currentPoints))))))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/invoke-super 'RotationAnimation this :jm_getBasicColorP_0)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke-super 'RotationAnimation this :jm_setBasicColorP_1 @l_basicColor)))



