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

(ns TouchButtonsPaintableComposite)

(JR/register 'TouchButtonsPaintableComposite 'ProcessPaintable '[CompleteMotionGestureInputEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :inputMappingInterface nil)
  (JR/fset this :touchButtonsPaintable nil)
  (JR/fset this :timeHelper nil)
  (JR/fset this :released false)
  (JR/fset this :METHOD_NAME nil)
  (JR/fset this :RELEASE nil)
  (JR/fset this :FAST_REPEAT nil)
  (JR/fset this :IGNORE nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :timeHelper (TimeDelayHelper/jnew_1 250))
    (JR/fset this :released true)
    (JR/fset this :METHOD_NAME "onCompleteMotionGestureInputEvent")
    (JR/fset this :RELEASE "Ignoring: MotionGestureInput Release")
    (JR/fset this :FAST_REPEAT "Ignoring: MotionGestureInput Repeated To Quickly")
    (JR/fset this :IGNORE "Ignoring: Until Released")
  this)

    
(defn jinit_2 [this p_inputMappingInterface p_basicColor]
  (let [ l_inputMappingInterface (volatile! p_inputMappingInterface) l_basicColor (volatile! p_basicColor)]
    (ProcessPaintable/jinit_0 this) (jinitfields this)
        (JR/fset this :inputMappingInterface @l_inputMappingInterface)
        (JR/invoke (JR/scall 'CompleteMotionGestureInputEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this)
        (JR/fset this :touchButtonsPaintable (TouchButtonsMappingPaintable/jnew_1 @l_basicColor)))
  this)

(defn jnew_2 [p_inputMappingInterface p_basicColor ]
  (let [o (JR/alloc 'TouchButtonsPaintableComposite)] (jinit_2 o p_inputMappingInterface p_basicColor) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onCompleteMotionGestureInputEvent_1 [this p_completeMotionGestureInputEvent]
  (let [ l_completeMotionGestureInputEvent (volatile! p_completeMotionGestureInputEvent) l_touchMotionGestureFactory (volatile! nil) l_gameKeyCompleteMotionGestureInputEvent (volatile! nil) l_gameKey (volatile! nil) l_motionGestureInput (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "onCompleteMotionGestureInputEvent")
            (vreset! l_touchMotionGestureFactory (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0))
            (vreset! l_gameKeyCompleteMotionGestureInputEvent @l_completeMotionGestureInputEvent)
            (vreset! l_gameKey (JR/invoke @l_gameKeyCompleteMotionGestureInputEvent :jm_getGameKey_0))
            (vreset! l_motionGestureInput (JR/invoke @l_completeMotionGestureInputEvent :jm_getMotionGestureInput_0))
            (if (JR/eq @l_motionGestureInput (JR/fget @l_touchMotionGestureFactory :RELEASED))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget this :RELEASE) this (JR/fget this :METHOD_NAME))
                (JR/fset this :released true)
                (JR/jreturn)))
            (if (and (JR/eq @l_motionGestureInput (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION)) (not (JR/invoke (JR/fget this :timeHelper) :jm_isTimeTNT_0)))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget this :FAST_REPEAT) this (JR/fget this :METHOD_NAME))
                (JR/jreturn)))
            (if (not (JR/fget this :released))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget this :IGNORE) this (JR/fget this :METHOD_NAME))
                (JR/jreturn)))
            (JR/fset this :released false)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "GameKey: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_gameKey)) :jm_append_1 " MotionGestureInput: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_motionGestureInput))) this (JR/fget this :METHOD_NAME))
            (JR/invoke (JR/fget this :inputMappingInterface) :jm_processInputMapping_2 @l_gameKey @l_motionGestureInput))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget this :METHOD_NAME) @l_e)) :else (throw jt))))))))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/scall 'CompleteMotionGestureInputEventHandler :jm_getInstance_0) :jm_removeListener_1 this)))



