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
;; package org.allbinary.input.motion.gesture

(ns MirrorMotionGestureEventUtil)

(JR/register 'MirrorMotionGestureEventUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MirrorMotionGestureEventUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :motionEventCircularPool nil)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :motionEventCircularPool (JR/scall 'MotionEventCircularPool :jm_createPool_1 java.lang.Integer/MAX_VALUE)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MirrorMotionGestureEventUtil)] (jinit_0 o) o))

    
(defn jm_mirrorVerticle_2 [this p_motionGestureEvent p_halfWidth]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent) l_halfWidth (volatile! p_halfWidth) l_event (volatile! nil) l_previousNewX (volatile! nil) l_currentNewX (volatile! nil) l_pointFactory (volatile! nil) l_mirroredPreviousPoint (volatile! nil) l_mirroredCurrentPoint (volatile! nil)]
        (vreset! l_event (JR/invoke (JR/fget this :motionEventCircularPool) :jm_getInstance_1 (JR/invoke @l_motionGestureEvent :jm_getMotionGesture_0)))
        (vreset! l_previousNewX (JR/invoke this :jm_getNewX_2 (JR/invoke (JR/invoke @l_motionGestureEvent :jm_getPreviousPoint_0) :jm_getX_0) @l_halfWidth))
        (vreset! l_currentNewX (JR/invoke this :jm_getNewX_2 (JR/invoke (JR/invoke @l_motionGestureEvent :jm_getCurrentPoint_0) :jm_getX_0) @l_halfWidth))
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_mirroredPreviousPoint (JR/invoke @l_pointFactory :jm_createXY_2 @l_previousNewX (JR/invoke (JR/invoke @l_motionGestureEvent :jm_getPreviousPoint_0) :jm_getY_0)))
        (vreset! l_mirroredCurrentPoint (JR/invoke @l_pointFactory :jm_createXY_2 @l_currentNewX (JR/invoke (JR/invoke @l_motionGestureEvent :jm_getCurrentPoint_0) :jm_getY_0)))
        (JR/invoke @l_event :jm_setPreviousPoint_1 @l_mirroredPreviousPoint)
        (JR/invoke @l_event :jm_setCurrentPoint_1 @l_mirroredCurrentPoint)
        @l_event))

    
(defn jm_getNewX_2 [this p_x p_halfWidth]
  (let [ l_x (volatile! p_x) l_halfWidth (volatile! p_halfWidth) l_newX (volatile! nil)]
        (vreset! l_newX 0)
        (if (> @l_x @l_halfWidth)
            (do
            (vreset! l_newX (unchecked-int (unchecked-subtract @l_halfWidth (unchecked-int (unchecked-subtract @l_x @l_halfWidth))))))
            (do
            (vreset! l_newX (unchecked-int (unchecked-add @l_halfWidth (unchecked-int (unchecked-subtract @l_halfWidth @l_x)))))))
        @l_newX))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MirrorMotionGestureEventUtil/jstatic_instance)))



