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

(ns GameKeyCompleteMotionGestureInputEvent)

(JR/register 'GameKeyCompleteMotionGestureInputEvent 'CompleteMotionGestureInputEvent '[GameKeyEventSourceInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gameKeyEventFactory nil)
  (JR/fset this :SOURCE_ID 0)
  (JR/fset this :gameKey nil)
  (JR/fset this :gameKeyEvent nil)
  (JR/fset this :inputToGameKeyMapping nil)
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
    (JR/fset this :SOURCE_ID (JR/fget (JR/fget this :gameKeyEventFactory) :MOTION_GESTURE_SOURCE_ID))
    (JR/fset this :gameKey (JR/sget 'GameKey "NULL_GAME_KEY"))
    (JR/fset this :gameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
  this)

    
(defn jinit_3 [this p_name p_motionGestureInput p_inputToGameKeyMapping]
  (let [ l_name (volatile! p_name) l_motionGestureInput (volatile! p_motionGestureInput) l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping)]
        (CompleteMotionGestureInputEvent/jinit_2 this @l_name @l_motionGestureInput) (jinitfields this)
        (JR/fset this :inputToGameKeyMapping @l_inputToGameKeyMapping)
        (JR/invoke (JR/scall 'GameKeyCompleteMotionGestureInputEventFactory :jm_getInstance_0) :jm_add_1 this)
        (JR/invoke this :jm_update_0))
  this)

(defn jnew_3 [p_name p_motionGestureInput p_inputToGameKeyMapping ]
  (let [o (JR/alloc 'GameKeyCompleteMotionGestureInputEvent)] (jinit_3 o p_name p_motionGestureInput p_inputToGameKeyMapping) o))

    
(defn jm_getSourceId_0 [this]
  (let []
        (JR/fget this :SOURCE_ID)))

    
(defn jm_update_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke this :jm_setGameKey_1 (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstance_1 (JR/invoke (JR/invoke this :jm_getMotionGestureInput_0) :jm_getId_0)))
            (JR/invoke this :jm_setGameKeyEvent_1 (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 this (JR/invoke this :jm_getGameKey_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_setGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/fset this :gameKeyEvent @l_gameKeyEvent)))

    
(defn jm_getGameKeyEvent_0 [this]
  (let []
        (JR/fget this :gameKeyEvent)))

    
(defn jm_setGameKey_1 [this p_gameKey]
  (let [ l_gameKey (volatile! p_gameKey)]
        (JR/fset this :gameKey @l_gameKey)))

    
(defn jm_getGameKey_0 [this]
  (let []
        (JR/fget this :gameKey)))



