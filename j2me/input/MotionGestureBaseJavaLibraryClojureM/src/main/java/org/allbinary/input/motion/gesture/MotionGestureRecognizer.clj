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
;; package org.allbinary.input.motion.gesture

(ns MotionGestureRecognizer)

(JR/register 'MotionGestureRecognizer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :j2seMath nil)
  (JR/fset this :origin nil)
  (JR/fset this :previous nil)
  (JR/fset this :intermediate nil)
  (JR/fset this :line nil)
  (JR/fset this :motionGesturesHandler nil)
  (JR/fset this :movedMotionGesturesHandler nil)
  (JR/fset this :scrolledMotionGesturesHandler nil)
  (JR/fset this :motionEventCircularPool nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :j2seMath (JR/scall 'J2SEMath :jm_getInstance_0))
    (JR/fset this :origin (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO))
    (JR/fset this :previous (JR/fget this :origin))
    (JR/fset this :intermediate (JR/fget this :origin))
    (JR/fset this :line (Line/jnew_2 (JR/fget this :origin) (JR/fget this :origin)))
  this)

    
(defn jinit_1 [this p_id]
  (let [ l_id (volatile! p_id) l_motionGesturesHandler (volatile! nil) l_movedMotionGesturesHandler (volatile! nil) l_scrolledMotionGesturesHandler (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
    nil (jinitfields this)
        (JR/fset this :motionEventCircularPool (JR/scall 'MotionEventCircularPool :jm_createPool_1 @l_id))
        (vreset! l_motionGesturesHandler (BasicEventHandler/jnew_0))
        (vreset! l_movedMotionGesturesHandler @l_motionGesturesHandler)
        (vreset! l_scrolledMotionGesturesHandler @l_motionGesturesHandler)
        (try (do
            (vreset! l_motionGesturesHandler (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0))
            (vreset! l_movedMotionGesturesHandler (JR/scall 'MovedMotionGesturesHandler :jm_getInstance_0))
            (vreset! l_scrolledMotionGesturesHandler (JR/scall 'ScrolledMotionGesturesHandler :jm_getInstance_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)) :else (throw jt)))))
        (JR/fset this :motionGesturesHandler @l_motionGesturesHandler)
        (JR/fset this :movedMotionGesturesHandler @l_movedMotionGesturesHandler)
        (JR/fset this :scrolledMotionGesturesHandler @l_scrolledMotionGesturesHandler))
  this)

(defn jnew_1 [p_id ]
  (let [o (JR/alloc 'MotionGestureRecognizer)] (jinit_1 o p_id) o))

    
(defn jm_processPressedMotionEvent_3 [this p_current p_deviceId p_button]
  (let [ l_current (volatile! p_current) l_deviceId (volatile! p_deviceId) l_button (volatile! p_button) l_event (volatile! nil)]
        (JR/fset this :intermediate (JR/fget this :origin))
        (JR/fset this :previous (JR/fget this :origin))
        (vreset! l_event (JR/invoke (JR/fget this :motionEventCircularPool) :jm_getInstance_1 (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :PRESSED)))
        (JR/invoke @l_event :jm_setPreviousPoint_1 (JR/fget this :previous))
        (JR/invoke @l_event :jm_setCurrentPoint_1 @l_current)
        (JR/invoke (JR/fget this :motionGesturesHandler) :jm_fireEvent_1 @l_event)
        true))

    
(defn jm_processReleasedMotionEvent_3 [this p_current p_deviceId p_button]
  (let [ l_current (volatile! p_current) l_deviceId (volatile! p_deviceId) l_button (volatile! p_button) l_event (volatile! nil)]
        (vreset! l_event (JR/invoke (JR/fget this :motionEventCircularPool) :jm_getInstance_1 (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :RELEASED)))
        (JR/invoke @l_event :jm_setPreviousPoint_1 (JR/fget this :previous))
        (JR/invoke @l_event :jm_setCurrentPoint_1 @l_current)
        (JR/invoke (JR/fget this :motionGesturesHandler) :jm_fireEvent_1 @l_event)
        true))

    
(defn jm_processDraggedMotionEvent_3 [this p_current p_deviceId p_buttonMask]
  (let [ l_current (volatile! p_current) l_deviceId (volatile! p_deviceId) l_buttonMask (volatile! p_buttonMask) l_minimumMotionGesture (volatile! nil) l_gradient (volatile! nil) l_absGradient (volatile! nil) l_conf (volatile! nil) l_touchMotionGestureFactory (volatile! nil) l_newMotionGesture (volatile! nil) l_diagonalToleranceHigher (volatile! nil) l_diagonalToleranceLower (volatile! nil) l_event (volatile! nil)](JR/method
        (if (or (JR/eq (JR/fget this :previous) (JR/fget this :origin)) (JR/eq (JR/fget this :intermediate) (JR/fget this :origin)))
            (do
            (JR/fset this :previous @l_current)
            (JR/fset this :intermediate @l_current)
            (JR/jreturn)))
        (JR/invoke (JR/fget this :line) :jm_setP1_1 (JR/fget this :previous))
        (JR/invoke (JR/fget this :line) :jm_setP2_1 @l_current)
        (vreset! l_minimumMotionGesture (JR/invoke (JR/scall 'MotionGestureConfigurationFactory :jm_getInstance_0) :jm_getMinimumMotionGesture_0))
        (if (and (< (JR/invoke (JR/fget this :j2seMath) :jm_abs_1 (JR/f32 (JR/invoke (JR/fget this :line) :jm_getDeltaX_0))) (JR/f32 @l_minimumMotionGesture)) (< (JR/invoke (JR/fget this :j2seMath) :jm_abs_1 (JR/f32 (JR/invoke (JR/fget this :line) :jm_getDeltaY_0))) (JR/f32 @l_minimumMotionGesture)))
            (do
            (JR/fset this :intermediate @l_current)
            (JR/jreturn)))
        (vreset! l_gradient (JR/invoke (JR/fget this :line) :jm_getGradient_0))
        (vreset! l_absGradient (double (JR/c2i (JR/invoke (JR/fget this :j2seMath) :jm_abs_1 (JR/f32 @l_gradient)))))
        (vreset! l_conf (JR/scall 'MotionGestureConfigurationFactory :jm_getInstance_0))
        (vreset! l_touchMotionGestureFactory (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0))
        (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :NO_MOTION))
        (vreset! l_diagonalToleranceHigher 12.0)
        (vreset! l_diagonalToleranceLower 12.0)
        (if (JR/invoke @l_conf :jm_isDiagonalMotionGestureAllowed_0)
            (do
            (vreset! l_diagonalToleranceHigher (double (JR/c2i (unchecked-int (unchecked-subtract 90 (JR/invoke @l_conf :jm_getDiagonalTolerance_0))))))
            (vreset! l_diagonalToleranceLower (double (JR/c2i (JR/invoke @l_conf :jm_getDiagonalTolerance_0))))))
        (if (> @l_absGradient (java.lang.Math/tan (double (java.lang.Math/toRadians (double @l_diagonalToleranceHigher)))))
            (do
            (if (> (JR/invoke (JR/fget this :line) :jm_getDeltaY_0) 0.0)
                (do
                (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :UP)))
                (do
                (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :DOWN)))))
            (do
            (if (< @l_absGradient (java.lang.Math/tan (double (java.lang.Math/toRadians (double @l_diagonalToleranceLower)))))
                (do
                (if (> (JR/invoke (JR/fget this :line) :jm_getDeltaX_0) 0.0)
                    (do
                    (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :LEFT)))
                    (do
                    (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :RIGHT)))))
                (do
                (if (> @l_gradient 0.0)
                    (do
                    (if (> (JR/invoke (JR/fget this :line) :jm_getDeltaX_0) 0.0)
                        (do
                        (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :DIAGONAL_UP_LEFT)))
                        (do
                        (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :DIAGONAL_DOWN_RIGHT)))))
                    (do
                    (if (> (JR/invoke (JR/fget this :line) :jm_getDeltaX_0) 0.0)
                        (do
                        (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :DIAGONAL_DOWN_LEFT)))
                        (do
                        (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :DIAGONAL_UP_RIGHT))))))))))
        (JR/fset this :previous @l_current)
        (JR/fset this :intermediate @l_current)
        (vreset! l_event (JR/invoke (JR/fget this :motionEventCircularPool) :jm_getInstance_1 @l_newMotionGesture))
        (JR/invoke @l_event :jm_setPreviousPoint_1 (JR/fget this :previous))
        (JR/invoke @l_event :jm_setCurrentPoint_1 @l_current)
        (JR/invoke (JR/fget this :motionGesturesHandler) :jm_fireEvent_1 @l_event)
        nil)))

    
(defn jm_processMovedMotionEvent_3 [this p_current p_deviceId p_button]
  (let [ l_current (volatile! p_current) l_deviceId (volatile! p_deviceId) l_button (volatile! p_button) l_event (volatile! nil)]
        (vreset! l_event (JR/invoke (JR/fget this :motionEventCircularPool) :jm_getInstance_1 (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION)))
        (JR/invoke @l_event :jm_setPreviousPoint_1 (JR/fget this :previous))
        (JR/invoke @l_event :jm_setCurrentPoint_1 @l_current)
        (JR/invoke (JR/fget this :movedMotionGesturesHandler) :jm_fireEvent_1 @l_event)
        true))

    
(defn jm_processScrolledMotionEvent_3 [this p_current p_deviceId p_button]
  (let [ l_current (volatile! p_current) l_deviceId (volatile! p_deviceId) l_button (volatile! p_button) l_touchMotionGestureFactory (volatile! nil) l_newMotionGesture (volatile! nil) l_event (volatile! nil)]
        (vreset! l_touchMotionGestureFactory (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0))
        (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :NO_MOTION))
        (if (> @l_button 0)
            (do
            (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :SCROLL_UP)))
            (if (< @l_button 0)
            (do
            (vreset! l_newMotionGesture (JR/fget @l_touchMotionGestureFactory :SCROLL_DOWN)))))
        (vreset! l_event (JR/invoke (JR/fget this :motionEventCircularPool) :jm_getInstance_1 @l_newMotionGesture))
        (JR/invoke @l_event :jm_setPreviousPoint_1 (JR/fget this :previous))
        (JR/invoke @l_event :jm_setCurrentPoint_1 @l_current)
        (JR/invoke (JR/fget this :scrolledMotionGesturesHandler) :jm_fireEvent_1 @l_event)
        true))

    
(defn jm_getMotionGesturesHandler_0 [this]
  (let []
        (JR/fget this :motionGesturesHandler)))



