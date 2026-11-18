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
;; package org.allbinary.input.motion

(ns AllMotionRecognizer)

(JR/register 'AllMotionRecognizer 'MotionRecognizer '[])

(def jsv_index (atom 0))
(def jsv_pointCircularPool (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_index [] (JR/ensure-init jclinit-state jclinit) @jsv_index)
(defn jstatic_set_index [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_index v))
(defn jstatic_pointCircularPool [] (JR/ensure-init jclinit-state jclinit) @jsv_pointCircularPool)
(defn jstatic_set_pointCircularPool [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_pointCircularPool v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_index 0)
    (reset! jsv_pointCircularPool (GPointCircularPool/jnew_1 40))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :motionGestureRecognizer nil)
  (JR/fset this :touchButtonProcessing false)
  (JR/fset this :touchButtonRecognizer nil)
  (JR/fset this :id 0)
  (JR/fset this :lastX 0)
  (JR/fset this :lastY 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :touchButtonProcessing false)
  this)

    
(defn jinit_0 [this]
  (let []
    (MotionRecognizer/jinit_0 this) (jinitfields this)
        (JR/fset this :id (JR/ginc (fn [] (AllMotionRecognizer/jstatic_index)) (fn [v] (AllMotionRecognizer/jstatic_set_index v)) 1 :int true))
        (JR/fset this :motionGestureRecognizer (MotionGestureRecognizer/jnew_1 (JR/fget this :id)))
        (JR/fset this :touchButtonRecognizer (TouchButtonRecognizer/jnew_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllMotionRecognizer)] (jinit_0 o) o))

    
(defn jm_processStartMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (if (JR/invoke (JR/fget this :touchButtonRecognizer) :jm_pressTouchButtonInput_3 @l_x @l_y @l_deviceId)
            (do
            (JR/fset this :touchButtonProcessing true)))
        (if (not (JR/fget this :touchButtonProcessing))
            (do
            (vreset! l_point (JR/invoke (AllMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
            (JR/invoke @l_point :jm_setX_1 @l_x)
            (JR/invoke @l_point :jm_setY_1 @l_y)
            (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processPressedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))))

    
(defn jm_processEndMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (if (JR/invoke (JR/fget this :touchButtonRecognizer) :jm_releaseTouchButtonInput_3 @l_x @l_y @l_deviceId)
            (do
            nil))
        (if (not (JR/fget this :touchButtonProcessing))
            (do
            (vreset! l_point (JR/invoke (AllMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
            (JR/invoke @l_point :jm_setX_1 @l_x)
            (JR/invoke @l_point :jm_setY_1 @l_y)
            (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processReleasedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))
        (if (JR/fget this :touchButtonProcessing)
            (do
            (JR/fset this :touchButtonProcessing false)))))

    
(defn jm_processDraggedMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (if (JR/fget this :touchButtonProcessing)
            (do
            (JR/invoke (JR/fget this :touchButtonRecognizer) :jm_pressTouchButtonInput_3 @l_x @l_y @l_deviceId)))
        (if (not (JR/fget this :touchButtonProcessing))
            (do
            (vreset! l_point (JR/invoke (AllMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
            (JR/invoke @l_point :jm_setX_1 @l_x)
            (JR/invoke @l_point :jm_setY_1 @l_y)
            (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processDraggedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))))

    
(defn jm_processMovedMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (if (or (not (== @l_x (JR/fget this :lastX))) (not (== @l_y (JR/fget this :lastY))))
            (do
            (JR/fset this :lastX @l_x)
            (JR/fset this :lastY @l_y)
            (vreset! l_point (JR/invoke (AllMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
            (JR/invoke @l_point :jm_setX_1 @l_x)
            (JR/invoke @l_point :jm_setY_1 @l_y)
            (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processMovedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))))

    
(defn jm_processScrolledMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (vreset! l_point (JR/invoke (AllMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
        (JR/invoke @l_point :jm_setX_1 @l_x)
        (JR/invoke @l_point :jm_setY_1 @l_y)
        (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processScrolledMotionEvent_3 @l_point @l_deviceId @l_modifiers)))

    
(defn jm_getMotionGestureRecognizer_0 [this]
  (let []
        (JR/fget this :motionGestureRecognizer)))



