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
;; package org.allbinary.input.motion.button

(ns TouchButtonRecognizer)

(JR/register 'TouchButtonRecognizer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :rectangleCollisionUtil nil)
  (JR/fset this :upGameKeyEventHandler nil)
  (JR/fset this :downGameKeyEventHandler nil)
  (JR/fset this :lastPressedTouchButtonInput nil)
  (JR/fset this :currentlyPressedTouchButtonSingleton nil)
  (JR/fset this :releaseHelper nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :rectangleCollisionUtil (JR/scall 'RectangleCollisionUtil :jm_getInstance_0))
    (JR/fset this :upGameKeyEventHandler (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :downGameKeyEventHandler (JR/scall 'DownGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :lastPressedTouchButtonInput (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :NONE))
    (JR/fset this :currentlyPressedTouchButtonSingleton (JR/scall 'CurrentlyPressedTouchButtonSingleton :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (if (JR/invoke (JR/scall 'TouchScreenFactory :jm_getInstance_0) :jm_isMultiTouch_0)
            (do
            (JR/fset this :releaseHelper (MultitouchReleaseHelper/jnew_1 this)))
            (do
            (JR/fset this :releaseHelper (ReleaseHelper/jnew_1 this)))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchButtonRecognizer)] (jinit_0 o) o))

    
(defn jm_processRelease_2 [this p_touchButtonInput p_deviceId]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput) l_deviceId (volatile! p_deviceId) l_gameKeyEvent (volatile! nil)]
        (JR/invoke (JR/fget this :releaseHelper) :jm_release_2 @l_touchButtonInput @l_deviceId)
        (vreset! l_gameKeyEvent (JR/invoke @l_touchButtonInput :jm_getGameKeyEvent_0))
        (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
        (JR/invoke (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent)
        (JR/invoke (JR/fget this :currentlyPressedTouchButtonSingleton) :jm_remove_1 @l_touchButtonInput)))

    
(defn jm_releaseTouchButtonInput_3 [this p_x p_y p_deviceId]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_touchButtonInput (volatile! nil) l_list (volatile! nil) l_rectangle (volatile! nil) l_point (volatile! nil) l_touchButton (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_touchButtonInput (JR/fget this :lastPressedTouchButtonInput))
        (if (JR/invoke (JR/fget this :currentlyPressedTouchButtonSingleton) :jm_contains_1 @l_touchButtonInput)
            (do
            (JR/fset this :lastPressedTouchButtonInput (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :NONE))
            (JR/invoke this :jm_processRelease_2 @l_touchButtonInput @l_deviceId)
            (JR/jreturn true))
            (do
            (vreset! l_list (JR/invoke (JR/scall 'TouchButtonFactory :jm_getInstance_0) :jm_getList_0))
            (vreset! l_rectangle nil)
            (vreset! l_point nil)
            (vreset! l_touchButton nil)
            (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 1)))
                (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
                (vreset! l_touchButton (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                (vreset! l_rectangle (JR/invoke @l_touchButton :jm_getRectangle_0))
                (vreset! l_point (JR/invoke @l_rectangle :jm_getPoint_0))
                (if (JR/invoke (JR/fget this :rectangleCollisionUtil) :jm_isInside_6 (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0) (JR/invoke @l_rectangle :jm_getMaxX_0) (JR/invoke @l_rectangle :jm_getMaxY_0) @l_x @l_y)
                    (do
                    (vreset! l_touchButtonInput (JR/invoke @l_touchButton :jm_getTouchButtonInput_0))
                    (JR/invoke this :jm_processRelease_2 @l_touchButtonInput @l_deviceId)
                    (JR/jreturn true)))))))
        false)))

    
(defn jm_pressTouchButtonInput_3 [this p_x p_y p_deviceId]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_list (volatile! nil) l_rectangle (volatile! nil) l_point (volatile! nil) l_touchButton (volatile! nil) l_touchButtonInput (volatile! nil) l_gameKeyEvent (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_list (JR/invoke (JR/scall 'TouchButtonFactory :jm_getInstance_0) :jm_getList_0))
        (vreset! l_rectangle nil)
        (vreset! l_point nil)
        (vreset! l_touchButton nil)
        (vreset! l_touchButtonInput nil)
        (vreset! l_gameKeyEvent nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_touchButton (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (vreset! l_rectangle (JR/invoke @l_touchButton :jm_getRectangle_0))
            (vreset! l_point (JR/invoke @l_rectangle :jm_getPoint_0))
            (if (JR/invoke (JR/fget this :rectangleCollisionUtil) :jm_isInside_6 (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0) (JR/invoke @l_rectangle :jm_getMaxX_0) (JR/invoke @l_rectangle :jm_getMaxY_0) @l_x @l_y)
                (do
                (vreset! l_touchButtonInput (JR/invoke @l_touchButton :jm_getTouchButtonInput_0))
                (if (not (JR/invoke (JR/fget this :currentlyPressedTouchButtonSingleton) :jm_contains_1 @l_touchButtonInput))
                    (do
                    (JR/invoke (JR/fget this :releaseHelper) :jm_release_2 @l_touchButtonInput @l_deviceId)
                    (JR/fset this :lastPressedTouchButtonInput @l_touchButtonInput)
                    (JR/invoke (JR/fget this :currentlyPressedTouchButtonSingleton) :jm_add_1 @l_touchButtonInput)
                    (vreset! l_gameKeyEvent (JR/invoke @l_touchButtonInput :jm_getGameKeyEvent_0))
                    (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
                    (JR/invoke (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent)))
                (JR/jreturn true)))))
        false)))



