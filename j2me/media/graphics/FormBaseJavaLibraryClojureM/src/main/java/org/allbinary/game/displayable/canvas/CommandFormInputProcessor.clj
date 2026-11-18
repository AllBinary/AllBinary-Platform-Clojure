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

;;In general allow scrolling of the menu and selection the center item
(ns CommandFormInputProcessor)

(JR/register 'CommandFormInputProcessor 'BasicMenuInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :MOTION_GESTURE_SOURCE_ID 0)
  (JR/fset this :CLICK_DELAY 0)
  (JR/fset this :clickTimeHelper nil)
  (JR/fset this :DOUBLE_CLICK_DELAY 0)
  (JR/fset this :doubleClickTimeHelper nil)
  (JR/fset this :isSingleKeyProcessing false)
  (JR/fset this :form nil)
  (JR/fset this :hasPressed false)
  (JR/fset this :PROCESS_COMMAND nil)
  (JR/fset this :NAME_LABEL nil)
    (JR/fset this :MOTION_GESTURE_SOURCE_ID (JR/fget (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :MOTION_GESTURE_SOURCE_ID))
    (JR/fset this :CLICK_DELAY 150)
    (JR/fset this :clickTimeHelper (TimeDelayHelper/jnew_1 (JR/fget this :CLICK_DELAY)))
    (JR/fset this :DOUBLE_CLICK_DELAY 1200)
    (JR/fset this :doubleClickTimeHelper (TimeDelayHelper/jnew_1 (JR/fget this :DOUBLE_CLICK_DELAY)))
    (JR/fset this :isSingleKeyProcessing (JR/invoke (JR/scall 'InputFeatureFactory :jm_getInstance_0) :jm_isSingleKeyProcessing_0))
    (JR/fset this :hasPressed false)
    (JR/fset this :PROCESS_COMMAND "processCommand")
    (JR/fset this :NAME_LABEL " ScrollSelectionForm: ")
  this)

    
(defn jinit_4 [this p_gameKeyEventList p_playerInputId p_gameCanvas p_form]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_playerInputId (volatile! p_playerInputId) l_gameCanvas (volatile! p_gameCanvas) l_form (volatile! p_form)]
        (BasicMenuInputProcessor/jinit_3 this @l_gameKeyEventList @l_playerInputId @l_gameCanvas) (jinitfields this)
        (JR/fset this :form @l_form))
  this)

(defn jnew_4 [p_gameKeyEventList p_playerInputId p_gameCanvas p_form ]
  (let [o (JR/alloc 'CommandFormInputProcessor)] (jinit_4 o p_gameKeyEventList p_playerInputId p_gameCanvas p_form) o))

    
(defn jm_processInput_1 [this p_key]
  (let [ l_key (volatile! p_key)](JR/method
        (if (or (or (or (JR/eq @l_key (JR/sget 'Canvas "LEFT")) (JR/eq @l_key (JR/sget 'Canvas "RIGHT"))) (JR/eq @l_key (JR/sget 'Canvas "UP"))) (JR/eq @l_key (JR/sget 'Canvas "DOWN")))
            (do
            (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
            (JR/invoke (JR/fget this :form) :jm_processInputKey_1 @l_key)
            (JR/jreturn 1))
            (if (JR/eq @l_key (JR/sget 'Canvas "FIRE"))
            (do
            (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
            (JR/jreturn (JR/invoke this :jm_processCommand_0)))))
        0)))

    
(defn jm_processCommand_0 [this]
  (let [ l_commandCurrentSelectionForm (volatile! nil) l_command (volatile! nil) l_features (volatile! nil) l_openGLFeatureFactory (volatile! nil)]
        (vreset! l_commandCurrentSelectionForm (JR/fget this :form))
        (vreset! l_command (JR/invoke @l_commandCurrentSelectionForm :jm_getSelectedCommand_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_command) this (JR/fget this :PROCESS_COMMAND))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
        (if (and (and (JR/sget 'SWTUtil "isSWT") (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_openGLFeatureFactory :OPENGL))) (not (JR/eq @l_command (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :EXIT_COMMAND))))
            (do
            (JR/invoke (CommandRunnable/jnew_2 this @l_command) :jm_run_0))
            (do
            (JR/invoke (JR/scall 'PrimaryThreadPool :jm_getInstance_0) :jm_runTask_1 (CommandRunnable/jnew_2 this @l_command))))
        (if (JR/eq @l_command (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :QUIT_COMMAND))
            (do
            (unchecked-int (unchecked-negate (JR/c2i 1))))
            (do
            1))))

    
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
                (vreset! l_key (JR/invoke @l_gameKeyEvent :jm_getKey_0))
                (if (not (== (JR/invoke @l_gameKeyEvent :jm_getSourceId_0) (JR/fget this :MOTION_GESTURE_SOURCE_ID)))
                    (do
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
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :PROCESS_INPUT) @l_e)
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
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent) l_touchMotionGestureFactory (volatile! nil) l_motionGestureInput (volatile! nil) l_point (volatile! nil) l_index (volatile! nil)]
        (vreset! l_touchMotionGestureFactory (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0))
        (vreset! l_motionGestureInput (JR/invoke @l_motionGestureEvent :jm_getMotionGesture_0))
        (if (JR/eq @l_motionGestureInput (JR/fget @l_touchMotionGestureFactory :RELEASED))
            (do
            (vreset! l_point (JR/invoke @l_motionGestureEvent :jm_getCurrentPoint_0))
            (if (JR/invoke (JR/fget this :form) :jm_isInForm_1 @l_point)
                (do
                (vreset! l_index (JR/invoke (JR/fget this :form) :jm_getSelectedIndexForPoint_1 @l_point))
                (if (not (== @l_index (unchecked-int (unchecked-negate (JR/c2i 1)))))
                    (do
                    (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
                    (if (== @l_index (JR/invoke (JR/fget this :form) :jm_getSelectedIndex_0))
                        (do
                        (if (JR/invoke (JR/fget this :clickTimeHelper) :jm_isTimeTNT_0)
                            (do
                            (JR/invoke this :jm_processCommand_0))))
                        (do
                        (JR/invoke (JR/fget this :form) :jm_setSelectedIndex_1 @l_index))))
                    (do
                    nil))))
            (if (JR/fget this :hasPressed)
                (do
                (if (not (JR/invoke (JR/fget this :doubleClickTimeHelper) :jm_isTimeTNT_0))
                    (do
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Double Press" this (JR/fget (JR/fget this :gameInputStrings) :PROCESS_MOTION_INPUT))
                    (JR/invoke this :jm_processCommand_0)))
                (JR/fset (JR/fget this :doubleClickTimeHelper) :delay (JR/fget this :DOUBLE_CLICK_DELAY))
                (JR/invoke (JR/fget this :doubleClickTimeHelper) :jm_setStartTimeTNT_0)))
            (JR/fset this :hasPressed false))
            (if (JR/eq @l_motionGestureInput (JR/fget @l_touchMotionGestureFactory :PRESSED))
            (do
            (JR/fset (JR/fget this :doubleClickTimeHelper) :delay 0)
            (JR/fset this :hasPressed true))))))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of this)) :jm_append_1 (JR/fget this :NAME_LABEL)) :jm_append_1 (JR/to-string-of (JR/fget this :form))))))



