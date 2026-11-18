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

(ns CompleteMotionGestureInputEvent)

(JR/register 'CompleteMotionGestureInputEvent 'AllBinaryEventObject '[CompleteMotionGestureInputInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :name nil)
  (JR/fset this :motionGestureInput nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :motionGestureInput (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION))
  this)

    
(defn jinit_2 [this p_name p_motionGestureInput]
  (let [ l_name (volatile! p_name) l_motionGestureInput (volatile! p_motionGestureInput) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (AllBinaryEventObject/jinit_1 this @l_motionGestureInput) (jinitfields this)
        (JR/invoke this :jm_setName_1 @l_name)
        (try (do
            (JR/invoke this :jm_setMotionGestureInput_1 @l_motionGestureInput))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "InputToGameKeyEventAction" @l_e)) :else (throw jt))))))
  this)

(defn jnew_2 [p_name p_motionGestureInput ]
  (let [o (JR/alloc 'CompleteMotionGestureInputEvent)] (jinit_2 o p_name p_motionGestureInput) o))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fset this :name @l_name)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_setMotionGestureInput_1 [this p_motionGestureInput]
  (let [ l_motionGestureInput (volatile! p_motionGestureInput)]
        (JR/fset this :motionGestureInput @l_motionGestureInput)))

    
(defn jm_getMotionGestureInput_0 [this]
  (let []
        (JR/fget this :motionGestureInput)))



