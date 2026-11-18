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
;; package org.allbinary.game.input.mapping

(ns MotionInputMappingEventListener)

(JR/register 'MotionInputMappingEventListener nil '[InputMappingEventListenerInterface])

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
  (let [o (JR/alloc 'MotionInputMappingEventListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onInputMappingEvent_1 [this p_inputMappingEvent]
  (let [ l_inputMappingEvent (volatile! p_inputMappingEvent)]
        (JR/invoke (JR/scall 'GameKeyCompleteMotionGestureInputEventFactory :jm_getInstance_0) :jm_updateAll_0)
        (JR/invoke (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :jm_updateAll_1 (JR/invoke @l_inputMappingEvent :jm_getInputToGameKeyMapping_0))))



