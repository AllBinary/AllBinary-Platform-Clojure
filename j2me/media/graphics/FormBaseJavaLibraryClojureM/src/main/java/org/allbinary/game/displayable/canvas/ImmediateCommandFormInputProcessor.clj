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
;; package org.allbinary.game.displayable.canvas

(ns ImmediateCommandFormInputProcessor)

(JR/register 'ImmediateCommandFormInputProcessor 'CommandFormInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeHelper nil)
  (JR/fset this :gameCommandCanvas nil)
    (JR/fset this :timeHelper (TimeDelayHelper/jnew_1 25))
  this)

    
(defn jinit_4 [this p_gameKeyEventList p_playerInputId p_gameCommandCanvas p_form]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_playerInputId (volatile! p_playerInputId) l_gameCommandCanvas (volatile! p_gameCommandCanvas) l_form (volatile! p_form)]
        (CommandFormInputProcessor/jinit_4 this @l_gameKeyEventList @l_playerInputId @l_gameCommandCanvas @l_form) (jinitfields this)
        (JR/fset this :gameCommandCanvas @l_gameCommandCanvas))
  this)

(defn jnew_4 [p_gameKeyEventList p_playerInputId p_gameCommandCanvas p_form ]
  (let [o (JR/alloc 'ImmediateCommandFormInputProcessor)] (jinit_4 o p_gameKeyEventList p_playerInputId p_gameCommandCanvas p_form) o))

    
(defn jm_onPressGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent) l_e (volatile! nil)]
        (try (do
            (JR/invoke-super 'CommandFormInputProcessor this :jm_onPressGameKeyEvent_1 @l_gameKeyEvent)
            (if (JR/invoke (JR/fget this :timeHelper) :jm_isTimeTNT_0)
                (do
                (JR/invoke this :jm_processInputList_0)
                (JR/invoke (JR/fget (JR/fget this :gameCommandCanvas) :repaintBehavior) :jm_onChangeRepaint_1 (JR/invoke this :jm_getCanvas_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :ON_PRESS_GAME_KEY) @l_e)) :else (throw jt)))))))

    
(defn jm_onDownGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent) l_e (volatile! nil)]
        (try (do
            (JR/invoke-super 'CommandFormInputProcessor this :jm_onDownGameKeyEvent_1 @l_gameKeyEvent)
            (if (JR/invoke (JR/fget this :timeHelper) :jm_isTimeTNT_0)
                (do
                (JR/invoke this :jm_processInputList_0)
                (JR/invoke (JR/fget (JR/fget this :gameCommandCanvas) :repaintBehavior) :jm_onChangeRepaint_1 (JR/invoke this :jm_getCanvas_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :ON_DOWN_GAME_KEY) @l_e)) :else (throw jt)))))))

    
(defn jm_onUpGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent) l_e (volatile! nil)]
        (try (do
            (JR/invoke-super 'CommandFormInputProcessor this :jm_onUpGameKeyEvent_1 @l_gameKeyEvent)
            (if (JR/invoke (JR/fget this :timeHelper) :jm_isTimeTNT_0)
                (do
                (JR/invoke this :jm_processInputList_0)
                (JR/invoke (JR/fget (JR/fget this :gameCommandCanvas) :repaintBehavior) :jm_onChangeRepaint_1 (JR/invoke this :jm_getCanvas_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :ON_UP_GAME_KEY) @l_e)) :else (throw jt)))))))

    
(defn jm_onMotionGestureEvent_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent) l_e (volatile! nil)]
        (try (do
            (JR/invoke-super 'CommandFormInputProcessor this :jm_onMotionGestureEvent_1 @l_motionGestureEvent)
            (if (JR/invoke (JR/fget this :timeHelper) :jm_isTimeTNT_0)
                (do
                (JR/invoke this :jm_processInputList_0)
                (JR/invoke (JR/fget (JR/fget this :gameCommandCanvas) :repaintBehavior) :jm_onChangeRepaint_1 (JR/invoke this :jm_getCanvas_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "onMotionGestureEvent" @l_e)) :else (throw jt)))))))



