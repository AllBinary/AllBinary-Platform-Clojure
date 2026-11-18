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

(ns GameKeyFromMotionGestureEventListener)

(JR/register 'GameKeyFromMotionGestureEventListener 'CompleteMotionGestureInputEventListener '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :previousGameKeyEvent nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :previousGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
  this)

(defn jinit_0 [this]
  (CompleteMotionGestureInputEventListener/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameKeyFromMotionGestureEventListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onCompleteMotionGestureInputEvent_1 [this p_completeMotionGestureInputEvent]
  (let [ l_completeMotionGestureInputEvent (volatile! p_completeMotionGestureInputEvent) l_gameKeyCompleteMotionGestureInputEvent (volatile! nil) l_gameKeyEvent (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKeyCompleteMotionGestureInputEvent @l_completeMotionGestureInputEvent)
            (vreset! l_gameKeyEvent (JR/invoke @l_gameKeyCompleteMotionGestureInputEvent :jm_getGameKeyEvent_0))
            (if (not (JR/eq @l_gameKeyEvent (JR/fget this :previousGameKeyEvent)))
                (do
                (if (not (JR/eq (JR/fget this :previousGameKeyEvent) (JR/sget 'GameKeyEvent "NONE")))
                    (do
                    (JR/invoke (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :previousGameKeyEvent))))
                (JR/fset this :previousGameKeyEvent @l_gameKeyEvent)
                (if (and (some? @l_gameKeyEvent) (not (JR/eq @l_gameKeyEvent (JR/sget 'GameKeyEvent "NONE"))))
                    (do
                    (JR/invoke (JR/scall 'DownGameKeyEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_gameKeyEvent))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "onCompleteMotionGestureInputEvent" @l_e)) :else (throw jt)))))))



