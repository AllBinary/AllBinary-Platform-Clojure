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
;; package org.allbinary.input.motion.gesture.observer

(ns MotionGestureEvent)

(JR/register 'MotionGestureEvent 'AllBinaryEventObject '[])

(def jsv_PREVIOUS (atom nil))
(def jsv_HASHCODE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_PREVIOUS [] (JR/ensure-init jclinit-state jclinit) @jsv_PREVIOUS)
(defn jstatic_set_PREVIOUS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_PREVIOUS v))
(defn jstatic_HASHCODE [] (JR/ensure-init jclinit-state jclinit) @jsv_HASHCODE)
(defn jstatic_set_HASHCODE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_HASHCODE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_PREVIOUS " Previous: ")
    (reset! jsv_HASHCODE " hashcode: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :motionGesture nil)
  (JR/fset this :id 0)
  (JR/fset this :previousPoint nil)
  (JR/fset this :currentPoint nil)
  (JR/fset this :commonLabels nil)
    (JR/fset this :motionGesture (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION))
    (JR/fset this :previousPoint (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO))
    (JR/fset this :currentPoint (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO))
    (JR/fset this :commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_source p_id p_motionGesture]
  (let [ l_source (volatile! p_source) l_id (volatile! p_id) l_motionGesture (volatile! p_motionGesture)]
        (AllBinaryEventObject/jinit_1 this @l_source) (jinitfields this)
        (JR/fset this :id @l_id)
        (JR/invoke this :jm_setMotionGesture_1 @l_motionGesture))
  this)

(defn jnew_3 [p_source p_id p_motionGesture ]
  (let [o (JR/alloc 'MotionGestureEvent)] (jinit_3 o p_source p_id p_motionGesture) o))

    
(defn jm_getMotionGesture_0 [this]
  (let []
        (JR/fget this :motionGesture)))

    
(defn jm_setMotionGesture_1 [this p_motionGesture]
  (let [ l_motionGesture (volatile! p_motionGesture)]
        (JR/fset this :motionGesture @l_motionGesture)))

    
(defn jm_getPreviousPoint_0 [this]
  (let []
        (JR/fget this :previousPoint)))

    
(defn jm_setPreviousPoint_1 [this p_previousPoint]
  (let [ l_previousPoint (volatile! p_previousPoint)]
        (JR/fset this :previousPoint @l_previousPoint)))

    
(defn jm_getCurrentPoint_0 [this]
  (let []
        (JR/fget this :currentPoint)))

    
(defn jm_setCurrentPoint_1 [this p_currentPoint]
  (let [ l_currentPoint (volatile! p_currentPoint)]
        (JR/fset this :currentPoint @l_currentPoint)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_stringUtil (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :motionGesture)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :CURRENT))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :currentPoint)))
        (JR/invoke @l_stringBuffer :jm_append_1 (MotionGestureEvent/jstatic_PREVIOUS))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :previousPoint)))
        (JR/invoke @l_stringBuffer :jm_append_1 (MotionGestureEvent/jstatic_HASHCODE))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getId_0 [this]
  (let []
        (JR/fget this :id)))



