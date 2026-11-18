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

(ns ReleaseControlledMotionGestureListener)

(JR/register 'ReleaseControlledMotionGestureListener nil '[MotionGestureEventListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :currentMotionGesture nil)
  (JR/fset this :isMouseGestureOccurring false)
  (JR/fset this :motionGestureCollection nil)
  (JR/fset this :signed nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :currentMotionGesture (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION))
    (JR/fset this :isMouseGestureOccurring false)
    (JR/fset this :motionGestureCollection (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_signed]
  (let [ l_signed (volatile! p_signed)]
    nil (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :signed @l_signed))
  this)

(defn jnew_1 [p_signed ]
  (let [o (JR/alloc 'ReleaseControlledMotionGestureListener)] (jinit_1 o p_signed) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)))

    
(defn jm_onUpMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onDownMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onLeftMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onRightMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onDiagonalDownRightMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onDiagonalDownLeftMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onDiagonalUpRightMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onDiagonalUpLeftMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onPressedMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev)]
        (JR/fset this :isMouseGestureOccurring true)
        (JR/fset this :currentMotionGesture (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION))
        (JR/invoke this :jm_onMotionGestureEvent_1 @l_ev)))

    
(defn jm_onScrolledMotionGestureEvent_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent)]
        nil))

    
(defn jm_released_1 [this p_ev]
  (let [ l_ev (volatile! p_ev) l_e (volatile! nil)](JR/method
        (try (do
            (if (= (JR/fget this :isMouseGestureOccurring) false)
                (do
                (JR/jreturn)))
            (JR/fset this :isMouseGestureOccurring false)
            (JR/invoke (JR/fget this :signed) :jm_onMotionGestureCompleted_1 (JR/fget this :motionGestureCollection))
            (JR/invoke (JR/fget this :motionGestureCollection) :jm_clear_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke @l_ev :jm_getMotionGesture_0)))) this "release" @l_e)) :else (throw jt))))))))

    
(defn jm_onMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev) l_motionGestureInput (volatile! nil)](JR/method
        (if (= (JR/fget this :isMouseGestureOccurring) false)
            (do
            (JR/jreturn)))
        (vreset! l_motionGestureInput (JR/invoke @l_ev :jm_getMotionGesture_0))
        (if (JR/eq @l_motionGestureInput (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :PRESSED))
            (do
            (JR/invoke this :jm_onPressedMotionGestureEvent_1 @l_ev))
            (if (JR/eq @l_motionGestureInput (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :RELEASED))
            (do
            (JR/invoke this :jm_released_1 @l_ev))
            (do
            (if (not (JR/eq (JR/fget this :currentMotionGesture) @l_motionGestureInput))
                (do
                (JR/fset this :currentMotionGesture @l_motionGestureInput)
                (JR/invoke (JR/fget this :motionGestureCollection) :jm_add_1 (JR/invoke @l_ev :jm_getMotionGesture_0))))))))))



