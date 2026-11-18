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

(ns MotionGestureReceiveInterfaceFactory)

(JR/register 'MotionGestureReceiveInterfaceFactory nil '[])

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
  (let [o (JR/alloc 'MotionGestureReceiveInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil l_configuration (volatile! nil)]
        (vreset! l_configuration (JR/scall 'MotionGestureConfigurationFactory :jm_getInstance_0))
        (if (not (JR/invoke @l_configuration :jm_isExecutingActionsAllowed_0))
            (do
            (NullCompleteMotionGestureReceiver/jnew_0))
            (do
            (ResolveCompleteMotionGestureListener/jnew_0)))))



