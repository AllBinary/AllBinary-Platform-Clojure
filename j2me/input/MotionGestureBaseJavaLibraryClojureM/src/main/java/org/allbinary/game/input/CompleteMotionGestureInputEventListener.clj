;; Generated Code Do Not Modify
;; package org.allbinary.game.input

(ns CompleteMotionGestureInputEventListener)

(JR/register 'CompleteMotionGestureInputEventListener nil '[CompleteMotionGestureInputEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CompleteMotionGestureInputEventListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        nil))

    
(defn jm_onCompleteMotionGestureInputEvent_1 [this p_completeMotionGestureInputEvent]
  (let [ l_completeMotionGestureInputEvent (volatile! p_completeMotionGestureInputEvent)]
        nil))



