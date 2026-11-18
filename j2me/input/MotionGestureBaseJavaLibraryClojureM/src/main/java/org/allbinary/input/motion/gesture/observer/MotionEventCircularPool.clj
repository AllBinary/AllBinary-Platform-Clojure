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

(ns MotionEventCircularPool)

(JR/register 'MotionEventCircularPool nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :MIN 0)
  (JR/fset this :eventPool nil)
    (JR/fset this :MIN (JR/invoke (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :LAST_MOTION) :jm_getId_0))
    (JR/fset this :eventPool (AllBinaryEventCircularPool/jnew_1 (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 1)) (JR/fget this :MIN)))))
  this)

    
(defn jm_createPool_1 [p_id]
  (let [this nil l_id (volatile! p_id)]
        (MotionEventCircularPool/jnew_1 @l_id)))

    
(defn jinit_1 [this p_id]
  (let [ l_id (volatile! p_id)]
    nil (jinitfields this)
        (JR/invoke (JR/fget this :eventPool) :jm_initAllBinaryEventCircularPool_1 (MotionEventFactory/jnew_2 (JR/fget this :eventPool) @l_id)))
  this)

(defn jnew_1 [p_id ]
  (let [o (JR/alloc 'MotionEventCircularPool)] (jinit_1 o p_id) o))

    
(defn jm_getInstance_1 [this p_motionGestureInput]
  (let [ l_motionGestureInput (volatile! p_motionGestureInput)]
        (JR/invoke (JR/fget this :eventPool) :jm_getInstance_1 (unchecked-int (unchecked-subtract (JR/invoke @l_motionGestureInput :jm_getId_0) (JR/fget this :MIN))))))



