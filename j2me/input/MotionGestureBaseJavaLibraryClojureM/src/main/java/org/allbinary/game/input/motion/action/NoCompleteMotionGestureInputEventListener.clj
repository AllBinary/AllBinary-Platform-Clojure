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
;; package org.allbinary.game.input.motion.action

(ns NoCompleteMotionGestureInputEventListener)

(JR/register 'NoCompleteMotionGestureInputEventListener 'CompleteMotionGestureInputEventListener '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (NoCompleteMotionGestureInputEventListener/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (CompleteMotionGestureInputEventListener/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoCompleteMotionGestureInputEventListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onCompleteMotionGestureInputEvent_1 [this p_completeMotionGestureInputEvent]
  (let [ l_completeMotionGestureInputEvent (volatile! p_completeMotionGestureInputEvent)]
        nil))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoCompleteMotionGestureInputEventListener/jstatic_instance)))



