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

(ns GestureOnlyMotionRecognizer)

(JR/register 'GestureOnlyMotionRecognizer 'MotionRecognizer '[])

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
  (JR/fset this :motionGestureRecognizer nil)
  (JR/fset this :id 0)
  this)

    
(defn jinit_0 [this]
  (let []
    (MotionRecognizer/jinit_0 this) (jinitfields this)
        (JR/fset this :id (JR/ginc (fn [] (GestureOnlyMotionRecognizer/jstatic_index)) (fn [v] (GestureOnlyMotionRecognizer/jstatic_set_index v)) 1 :int true))
        (JR/fset this :motionGestureRecognizer (MotionGestureRecognizer/jnew_1 (JR/fget this :id))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GestureOnlyMotionRecognizer)] (jinit_0 o) o))

    
(defn jm_processStartMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (vreset! l_point (JR/invoke (GestureOnlyMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
        (JR/invoke @l_point :jm_setX_1 @l_x)
        (JR/invoke @l_point :jm_setY_1 @l_y)
        (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processPressedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))

    
(defn jm_processEndMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (vreset! l_point (JR/invoke (GestureOnlyMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
        (JR/invoke @l_point :jm_setX_1 @l_x)
        (JR/invoke @l_point :jm_setY_1 @l_y)
        (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processReleasedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))

    
(defn jm_processDraggedMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers) l_point (volatile! nil)]
        (vreset! l_point (JR/invoke (GestureOnlyMotionRecognizer/jstatic_pointCircularPool) :jm_getNextInstance_0))
        (JR/invoke @l_point :jm_setX_1 @l_x)
        (JR/invoke @l_point :jm_setY_1 @l_y)
        (JR/invoke (JR/fget this :motionGestureRecognizer) :jm_processDraggedMotionEvent_3 @l_point @l_deviceId @l_modifiers)))



