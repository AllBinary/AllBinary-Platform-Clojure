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
;; package org.allbinary.input.motion.gesture

(ns MotionGestureToMotionGestureActionAssociation)

(JR/register 'MotionGestureToMotionGestureActionAssociation nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
  (JR/fset this :motionGestureAction nil)
  this)

    
(defn jinit_2 [this p_list p_commandAction]
  (let [ l_list (volatile! p_list) l_commandAction (volatile! p_commandAction)]
    nil (jinitfields this)
        (JR/fset this :list @l_list)
        (JR/fset this :motionGestureAction @l_commandAction))
  this)

(defn jnew_2 [p_list p_commandAction ]
  (let [o (JR/alloc 'MotionGestureToMotionGestureActionAssociation)] (jinit_2 o p_list p_commandAction) o))

    
(defn jm_getMotionGesture_0 [this]
  (let []
        (JR/fget this :list)))

    
(defn jm_setMotionGestures_1 [this p_list]
  (let [ l_list (volatile! p_list)]
        (JR/fset this :list @l_list)))

    
(defn jm_getCommandAction_0 [this]
  (let []
        (JR/fget this :motionGestureAction)))

    
(defn jm_setMotionGestureAction_1 [this p_commandAction]
  (let [ l_commandAction (volatile! p_commandAction)]
        (JR/fset this :motionGestureAction @l_commandAction)))

    
(defn jm_isMotionGestureArrayEquals_1 [this p_aList]
  (let [ l_aList (volatile! p_aList) l_size (volatile! nil) l_i (volatile! nil)](JR/method
        (vreset! l_size (JR/invoke @l_aList :jm_size_0))
        (if (not (== (JR/invoke (JR/fget this :list) :jm_size_0) @l_size))
            (do
            (JR/jreturn false)))
        (do (vreset! l_i (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_i 0) (do (JR/vinc l_i -1 :int false))
            (if (not (JR/eq (JR/aget* (JR/fget @l_aList :objectArray) @l_i) (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_i)))
                (do
                (JR/jreturn false)))))
        true)))



