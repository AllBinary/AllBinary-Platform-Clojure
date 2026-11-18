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

(ns MotionEventFactory)

(JR/register 'MotionEventFactory nil '[AllBinaryEventObjectFactoryInterface])

(def jsv_index (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_index [] (JR/ensure-init jclinit-state jclinit) @jsv_index)
(defn jstatic_set_index [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_index v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_index 0)
    nil))

(defn jinitfields [this]
  (JR/fset this :source nil)
  (JR/fset this :id 0)
  this)

    
(defn jinit_2 [this p_source p_id]
  (let [ l_source (volatile! p_source) l_id (volatile! p_id)]
    nil (jinitfields this)
        (JR/fset this :source @l_source)
        (JR/fset this :id @l_id)
        (MotionEventFactory/jstatic_set_index (JR/invoke (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :LAST_MOTION) :jm_getId_0)))
  this)

(defn jnew_2 [p_source p_id ]
  (let [o (JR/alloc 'MotionEventFactory)] (jinit_2 o p_source p_id) o))

    
(defn jm_getInstance_0 [this]
  (let [ l_inputFactory (volatile! nil) l_input (volatile! nil)]
        (vreset! l_inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
        (vreset! l_input (JR/invoke @l_inputFactory :jm_getInstanceById_1 (JR/ginc (fn [] (MotionEventFactory/jstatic_index)) (fn [v] (MotionEventFactory/jstatic_set_index v)) 1 :int true)))
        (if (JR/eq @l_input (JR/fget @l_inputFactory :NO_INPUT))
            (do
            (MotionGestureEvent/jnew_3 (JR/fget this :source) (JR/fget this :id) (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :NO_MOTION)))
            (do
            (MotionGestureEvent/jnew_3 (JR/fget this :source) (JR/fget this :id) @l_input)))))



