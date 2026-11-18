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
;; package org.allbinary.input.motion

(ns CompleteMotionGestureInputToGameMotionGestureInput)

(JR/register 'CompleteMotionGestureInputToGameMotionGestureInput nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CompleteMotionGestureInputToGameMotionGestureInput/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CompleteMotionGestureInputToGameMotionGestureInput)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CompleteMotionGestureInputToGameMotionGestureInput/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let [ l_commonStrings (volatile! nil) l_motionGestureConfiguration (volatile! nil) l_touchMotionGestureFactory (volatile! nil) l_list (volatile! nil) l_e (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (try (do
            (JR/scall 'PreLogUtil :jm_put_3 "Compound Motion Gestures" this (JR/fget @l_commonStrings :INIT))
            (vreset! l_motionGestureConfiguration (JR/scall 'MotionGestureConfigurationFactory :jm_getInstance_0))
            (vreset! l_touchMotionGestureFactory (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :DIAGONAL_DOWN_LEFT))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'DiagonalDownLeftTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :DIAGONAL_DOWN_RIGHT))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'DiagonalDownRightTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :DIAGONAL_UP_LEFT))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'DiagonalUpLeftTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :DIAGONAL_UP_RIGHT))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'DiagonalUpRightTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :LEFT))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'LeftTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :RIGHT))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'RightTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :DOWN))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'DownTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :UP))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'UpTouchInputToGameKeyEventAction :jm_getInstance_0))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke @l_list :jm_add_1 (JR/fget @l_touchMotionGestureFactory :RELEASED))
            (JR/invoke @l_motionGestureConfiguration :jm_addMotionGestureAction_2 @l_list (JR/scall 'ReleaseTouchInputToGameKeyEventAction :jm_getInstance_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :INIT) @l_e)) :else (throw jt)))))))



