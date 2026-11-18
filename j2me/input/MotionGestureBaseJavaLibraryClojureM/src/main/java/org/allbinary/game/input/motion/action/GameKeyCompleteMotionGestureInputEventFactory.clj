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

(ns GameKeyCompleteMotionGestureInputEventFactory)

(JR/register 'GameKeyCompleteMotionGestureInputEventFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (GameKeyCompleteMotionGestureInputEventFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :eventList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :eventList (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameKeyCompleteMotionGestureInputEventFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameKeyCompleteMotionGestureInputEventFactory/jstatic_SINGLETON)))

    
(defn jm_add_1 [this p_gameKeyCompleteMotionGestureInputEvent]
  (let [ l_gameKeyCompleteMotionGestureInputEvent (volatile! p_gameKeyCompleteMotionGestureInputEvent)]
        (JR/invoke (JR/fget this :eventList) :jm_add_1 @l_gameKeyCompleteMotionGestureInputEvent)))

    
(defn jm_updateAll_0 [this]
  (let [ l_gameKeyCompleteMotionGestureInputEvent (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_appendint_1 (JR/invoke (JR/fget this :eventList) :jm_size_0))) this "updateAll")
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :eventList) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_gameKeyCompleteMotionGestureInputEvent (JR/aget* (JR/fget (JR/fget this :eventList) :objectArray) @l_index))
            (JR/invoke @l_gameKeyCompleteMotionGestureInputEvent :jm_update_0)))))



