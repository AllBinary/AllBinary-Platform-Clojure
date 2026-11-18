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

(ns TrackballMotionGestureFactory)

(JR/register 'TrackballMotionGestureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :UP nil)
  (JR/fset this :DOWN nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (TrackballMotionGestureFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (TrackballMotionGestureFactory/jstatic_set_instance (TrackballMotionGestureFactory/jnew_0))))
        (TrackballMotionGestureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_MAX (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_MAX (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX))
        (JR/fset this :LEFT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 26)) "L Trackball"))
        (JR/fset this :RIGHT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 27)) "R Trackball"))
        (JR/fset this :UP (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 28)) "Up Trackball"))
        (JR/fset this :DOWN (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 29)) "D Trackball")))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TrackballMotionGestureFactory)] (jinit_0 o) o))



