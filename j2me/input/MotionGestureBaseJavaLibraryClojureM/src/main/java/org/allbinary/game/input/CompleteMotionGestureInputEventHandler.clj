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
;; package org.allbinary.game.input

(ns CompleteMotionGestureInputEventHandler)

(JR/register 'CompleteMotionGestureInputEventHandler 'BasicEventHandler '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (CompleteMotionGestureInputEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CompleteMotionGestureInputEventHandler/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CompleteMotionGestureInputEventHandler)] (jinit_0 o) o))

    
(defn jm_addListener_1 [this p_completeMotionGestureInputEventListener]
  (let [ l_completeMotionGestureInputEventListener (volatile! p_completeMotionGestureInputEventListener)]
        (if (not (JR/invoke (JR/fget this :list) :jm_contains_1 @l_completeMotionGestureInputEventListener))
            (do
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_completeMotionGestureInputEventListener)))))

    
(defn jm_removeAllListeners_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)
        (JR/invoke-super 'BasicEventHandler this :jm_removeAllListeners_0)))

    
(defn jm_removeListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :list) :jm_remove_1 @l_eventListenerInterface)
        (JR/invoke-super 'BasicEventHandler this :jm_removeListener_1 @l_eventListenerInterface)))

    
(defn jm_fireEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject) l_completeMotionGestureInputEventListener (volatile! nil) l_e (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :list) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (try (do
                (vreset! l_completeMotionGestureInputEventListener (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
                (JR/invoke @l_completeMotionGestureInputEventListener :jm_onCompleteMotionGestureInputEvent_1 @l_eventObject))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))))
        (JR/invoke-super 'BasicEventHandler this :jm_fireEvent_1 @l_eventObject)))

    
(defn jm_process_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface) l_completeMotionGestureInputEventListenerInterface (volatile! nil)]
        (vreset! l_completeMotionGestureInputEventListenerInterface @l_eventListenerInterface)
        (JR/invoke @l_completeMotionGestureInputEventListenerInterface :jm_onCompleteMotionGestureInputEvent_1 @l_eventObject)))



