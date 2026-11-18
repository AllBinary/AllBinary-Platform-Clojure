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
;; package org.allbinary.input.gyro

(ns OrientationMotionGestureFactory)

(JR/register 'OrientationMotionGestureFactory nil '[])

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
  (JR/fset this :ROLL_LEFT nil)
  (JR/fset this :ROLL_RIGHT nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (OrientationMotionGestureFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (OrientationMotionGestureFactory/jstatic_set_instance (OrientationMotionGestureFactory/jnew_0))))
        (OrientationMotionGestureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_MAX (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_MAX (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX))
        (JR/fset this :LEFT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 20)) "Left Orient"))
        (JR/fset this :RIGHT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 21)) "Right Orient"))
        (JR/fset this :UP (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 22)) "Up Orient"))
        (JR/fset this :DOWN (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 23)) "Down Orient"))
        (JR/fset this :ROLL_LEFT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 24)) "Roll Left"))
        (JR/fset this :ROLL_RIGHT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 25)) "Roll Right")))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OrientationMotionGestureFactory)] (jinit_0 o) o))



