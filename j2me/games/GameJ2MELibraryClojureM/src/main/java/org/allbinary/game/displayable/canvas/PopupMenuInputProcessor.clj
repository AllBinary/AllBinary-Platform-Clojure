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

(ns PopupMenuInputProcessor)

(JR/register 'PopupMenuInputProcessor 'BasicMenuInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :rectangleCollisionUtil nil)
  (JR/fset this :CLICK_DELAY 0)
  (JR/fset this :clickTimeHelper nil)
  (JR/fset this :rectangle nil)
    (JR/fset this :rectangleCollisionUtil (JR/scall 'RectangleCollisionUtil :jm_getInstance_0))
    (JR/fset this :CLICK_DELAY 120)
    (JR/fset this :clickTimeHelper (TimeDelayHelper/jnew_1 (JR/fget this :CLICK_DELAY)))
  this)

    
(defn jinit_4 [this p_gameKeyEventList p_playerInputId p_gameCanvas p_rectangle]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_playerInputId (volatile! p_playerInputId) l_gameCanvas (volatile! p_gameCanvas) l_rectangle (volatile! p_rectangle)]
        (BasicMenuInputProcessor/jinit_3 this @l_gameKeyEventList @l_playerInputId @l_gameCanvas) (jinitfields this)
        (JR/fset this :rectangle @l_rectangle))
  this)

(defn jnew_4 [p_gameKeyEventList p_playerInputId p_gameCanvas p_rectangle ]
  (let [o (JR/alloc 'PopupMenuInputProcessor)] (jinit_4 o p_gameKeyEventList p_playerInputId p_gameCanvas p_rectangle) o))

    
(defn jm_init_1 [this p_rectangle]
  (let [ l_rectangle (volatile! p_rectangle)]
        (JR/fset this :rectangle @l_rectangle)))

    
(defn jm_processInput_1 [this p_key]
  (let [ l_key (volatile! p_key) l_gameCanvas (volatile! nil)](JR/method
        (if (JR/eq @l_key (JR/sget 'Canvas "KEY_STAR"))
            (do
            (vreset! l_gameCanvas (JR/invoke this :jm_getCanvas_0))
            (JR/invoke @l_gameCanvas :jm_toggleMenu_0)
            (JR/jreturn 1)))
        0)))

    
(defn jm_processInputList_0 [this]
  (let [ l_motionInputsIndex (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_key (volatile! nil) l_gameKeyEvent (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_motionInputsIndex (JR/invoke this :jm_processMotionInputs_0))
            (vreset! l_list (JR/invoke this :jm_getGameKeyEventList_0))
            (vreset! l_size (JR/invoke @l_list :jm_size_0))
            (vreset! l_key 0)
            (vreset! l_gameKeyEvent nil)
            (do (vreset! l_index 0)
                (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_gameKeyEvent (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                (if (some? @l_gameKeyEvent)
                    (do
                    (vreset! l_key (JR/invoke @l_gameKeyEvent :jm_getKey_0))
                    (if (== (JR/invoke this :jm_processInput_1 @l_key) 1)
                        (do
                        (JR/jbreak)))))))
            (JR/invoke this :jm_clear_0)
            (if (or (> @l_size 0) (>= @l_motionInputsIndex 0))
                (do
                (JR/jreturn 1))
                (do
                (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1)))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'GameInputStrings :jm_getInstance_0) :PROCESS_INPUT) @l_e)
            (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1))))) :else (throw jt))))))))

    
(defn jm_processMotionInputs_0 [this]
  (let [ l_lastIndex (volatile! nil) l_motionGestureEvent (volatile! nil)]
        (vreset! l_lastIndex (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :motionGestureEventList) :jm_size_0) 1)))
        (if (>= @l_lastIndex 0)
            (do
            (vreset! l_motionGestureEvent (JR/aget* (JR/fget (JR/fget this :motionGestureEventList) :objectArray) @l_lastIndex))
            (JR/invoke this :jm_processMotionInput_1 @l_motionGestureEvent)))
        (JR/invoke (JR/fget this :motionGestureEventList) :jm_clear_0)
        @l_lastIndex))

    
(defn jm_processMotionInput_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent) l_touchMotionGestureFactory (volatile! nil) l_motionGestureInput (volatile! nil) l_point (volatile! nil) l_rectPoint (volatile! nil) l_gameCanvas (volatile! nil)](JR/method
        (if (nil? @l_motionGestureEvent)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Exception: Bug" this (JR/fget (JR/fget this :gameInputStrings) :PROCESS_MOTION_INPUT))
            (JR/jreturn)))
        (vreset! l_touchMotionGestureFactory (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0))
        (vreset! l_motionGestureInput (JR/invoke @l_motionGestureEvent :jm_getMotionGesture_0))
        (if (JR/eq @l_motionGestureInput (JR/fget @l_touchMotionGestureFactory :RELEASED))
            (do
            (vreset! l_point (JR/invoke @l_motionGestureEvent :jm_getCurrentPoint_0))
            (vreset! l_rectPoint (JR/invoke (JR/fget this :rectangle) :jm_getPoint_0))
            (if (JR/invoke (JR/fget this :rectangleCollisionUtil) :jm_isInside_6 (JR/invoke @l_rectPoint :jm_getX_0) (JR/invoke @l_rectPoint :jm_getY_0) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :rectangle) :jm_getMaxX_0) 20)) (JR/invoke (JR/fget this :rectangle) :jm_getMaxY_0) (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0))
                (do
                (if (JR/invoke (JR/fget this :clickTimeHelper) :jm_isTimeTNT_0)
                    (do
                    (vreset! l_gameCanvas (JR/invoke this :jm_getCanvas_0))
                    (JR/invoke @l_gameCanvas :jm_toggleMenu_0))))))))))



