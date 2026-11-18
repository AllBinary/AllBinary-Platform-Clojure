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
;; package org.allbinary.input

;;TouchJ2ME
(ns TouchJ2ME)

(JR/register 'TouchJ2ME nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :DEVICE_ID 0)
  (JR/fset this :motionRecognizer nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :DEVICE_ID 0)
    (JR/fset this :motionRecognizer (AllMotionRecognizer/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let [ l_motionGesturesHandler (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_motionGesturesHandler (JR/invoke (JR/invoke (JR/fget this :motionRecognizer) :jm_getMotionGestureRecognizer_0) :jm_getMotionGesturesHandler_0))
        (JR/invoke @l_motionGesturesHandler :jm_addListenerInterface_1 (GameMotionGestureListener/jnew_1 (JR/scall 'MotionGestureReceiveInterfaceFactory :jm_getInstance_0))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchJ2ME)] (jinit_0 o) o))

    
(defn jm_pointerDragged_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :motionRecognizer) :jm_processDraggedMotionEvent_4 @l_x @l_y (JR/fget this :DEVICE_ID) 0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "pointerDragged" @l_e)) :else (throw jt)))))))

    
(defn jm_pointerPressed_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :motionRecognizer) :jm_processStartMotionEvent_4 @l_x @l_y (JR/fget this :DEVICE_ID) 0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "pointerPressed" @l_e)) :else (throw jt)))))))

    
(defn jm_pointerReleased_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :motionRecognizer) :jm_processEndMotionEvent_4 @l_x @l_y (JR/fget this :DEVICE_ID) 0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "pointerReleased" @l_e)) :else (throw jt)))))))



