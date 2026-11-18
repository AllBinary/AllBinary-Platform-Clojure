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

(ns GameMotionGestureListener)

(JR/register 'GameMotionGestureListener nil '[MotionGestureEventListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :motionGestureCollection nil)
  (JR/fset this :touchGestureCollection nil)
  (JR/fset this :signed nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :motionGestureCollection (BasicArrayListD/jnew_0))
    (JR/fset this :touchGestureCollection (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_signed]
  (let [ l_signed (volatile! p_signed)]
    nil (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :signed @l_signed))
  this)

(defn jnew_1 [p_signed ]
  (let [o (JR/alloc 'GameMotionGestureListener)] (jinit_1 o p_signed) o))

    
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
        (JR/invoke (JR/fget this :touchGestureCollection) :jm_add_1 (JR/invoke @l_ev :jm_getMotionGesture_0))))

    
(defn jm_released_1 [this p_ev]
  (let [ l_ev (volatile! p_ev) l_stringBuffer (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :touchGestureCollection) :jm_add_1 (JR/invoke @l_ev :jm_getMotionGesture_0))
            (JR/invoke (JR/fget this :signed) :jm_onMotionGestureCompleted_1 (JR/fget this :touchGestureCollection))
            (JR/invoke (JR/fget this :touchGestureCollection) :jm_clear_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke @l_ev :jm_getMotionGesture_0)))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/to-string-of @l_stringBuffer) this "release" @l_e)) :else (throw jt)))))))

    
(defn jm_onScrolledMotionGestureEvent_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent)]
        nil))

    
(defn jm_onMotionGestureEvent_1 [this p_ev]
  (let [ l_ev (volatile! p_ev) l_motionGestureInput (volatile! nil) l_stringBuffer (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_motionGestureInput (JR/invoke @l_ev :jm_getMotionGesture_0))
            (if (JR/eq @l_motionGestureInput (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :PRESSED))
                (do
                (JR/invoke this :jm_onPressedMotionGestureEvent_1 @l_ev))
                (if (JR/eq @l_motionGestureInput (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :RELEASED))
                (do
                (JR/invoke this :jm_released_1 @l_ev))
                (do
                (JR/invoke (JR/fget this :motionGestureCollection) :jm_add_1 @l_motionGestureInput)
                (JR/invoke (JR/fget this :signed) :jm_onMotionGestureCompleted_1 (JR/fget this :motionGestureCollection))
                (JR/invoke (JR/fget this :motionGestureCollection) :jm_clear_0)
                (JR/invoke (JR/fget this :touchGestureCollection) :jm_clear_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke @l_ev :jm_getMotionGesture_0)))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/to-string-of @l_stringBuffer) this "onMotionGestureEvent" @l_e)) :else (throw jt)))))))



