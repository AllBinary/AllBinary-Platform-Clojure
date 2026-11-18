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

(ns NullCompleteMotionGestureReceiver)

(JR/register 'NullCompleteMotionGestureReceiver nil '[CompleteMotionGestureListenerInterface])

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
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Null Gesture Reciever" this (JR/fget @l_commonStrings :CONSTRUCTOR)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NullCompleteMotionGestureReceiver)] (jinit_0 o) o))

    
(defn jm_onMotionGestureCompleted_1 [this p_list]
  (let [ l_list (volatile! p_list)]
        nil))



