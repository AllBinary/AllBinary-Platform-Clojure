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

(ns ResolveCompleteMotionGestureListener)

(JR/register 'ResolveCompleteMotionGestureListener nil '[CompleteMotionGestureListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let [ l_commonStrings (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "MotionGesture to CompleteMotionGesture Reciever" this (JR/fget @l_commonStrings :CONSTRUCTOR))
        (JR/invoke (JR/scall 'CompleteMotionGestureInputEventHandler :jm_getInstance_0) :jm_addListener_1 (GameKeyFromMotionGestureEventListener/jnew_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ResolveCompleteMotionGestureListener)] (jinit_0 o) o))

    
(defn jm_onMotionGestureCompleted_1 [this p_list]
  (let [ l_list (volatile! p_list) l_configuration (volatile! nil) l_commandActionsList (volatile! nil) l_size (volatile! nil) l_association (volatile! nil) l_completeMotionGestureInputEvent (volatile! nil) l_index (volatile! nil)]
        (vreset! l_configuration (JR/scall 'MotionGestureConfigurationFactory :jm_getInstance_0))
        (vreset! l_commandActionsList (JR/invoke @l_configuration :jm_getAssociateCommandActionsList_0))
        (vreset! l_size (JR/invoke @l_commandActionsList :jm_size_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor true false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_association (JR/aget* (JR/fget @l_commandActionsList :objectArray) @l_index))
            (if (= (JR/invoke @l_association :jm_isMotionGestureArrayEquals_1 @l_list) true)
                (do
                (vreset! l_completeMotionGestureInputEvent (JR/invoke @l_association :jm_getCommandAction_0))
                (JR/invoke (JR/scall 'CompleteMotionGestureInputEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_completeMotionGestureInputEvent)
                (JR/jbreak)))))))



