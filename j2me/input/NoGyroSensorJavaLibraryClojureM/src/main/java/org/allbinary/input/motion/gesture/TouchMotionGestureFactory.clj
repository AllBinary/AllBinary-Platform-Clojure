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

(ns TouchMotionGestureFactory)

(JR/register 'TouchMotionGestureFactory nil '[])

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
  (JR/fset this :PRESSED nil)
  (JR/fset this :RELEASED nil)
  (JR/fset this :DIAGONAL_DOWN_RIGHT nil)
  (JR/fset this :DIAGONAL_DOWN_LEFT nil)
  (JR/fset this :DIAGONAL_UP_RIGHT nil)
  (JR/fset this :DIAGONAL_UP_LEFT nil)
  (JR/fset this :SCROLL_UP nil)
  (JR/fset this :SCROLL_DOWN nil)
  (JR/fset this :NO_MOTION nil)
  (JR/fset this :LAST_MOTION nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (TouchMotionGestureFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (TouchMotionGestureFactory/jstatic_set_instance (TouchMotionGestureFactory/jnew_0))))
        (TouchMotionGestureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_MAX (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_MAX (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX))
        (JR/fset this :LEFT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 3)) "Left Touch"))
        (JR/fset this :RIGHT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 4)) "Right Touch"))
        (JR/fset this :UP (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 5)) "Up Touch"))
        (JR/fset this :DOWN (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 6)) "Down Touch"))
        (JR/fset this :PRESSED (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 7)) "Screen Press"))
        (JR/fset this :RELEASED (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 8)) "Released"))
        (JR/fset this :DIAGONAL_DOWN_RIGHT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 9)) "Diagonal Dn R"))
        (JR/fset this :DIAGONAL_DOWN_LEFT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 10)) "Diagonal Dn L"))
        (JR/fset this :DIAGONAL_UP_RIGHT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 11)) "Diagonal Up R"))
        (JR/fset this :DIAGONAL_UP_LEFT (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 12)) "Diagonal Up L"))
        (JR/fset this :SCROLL_UP (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 13)) "Scroll Up"))
        (JR/fset this :SCROLL_DOWN (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 14)) "Scroll Down"))
        (JR/fset this :NO_MOTION (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 2)) "No Motion"))
        (JR/fset this :LAST_MOTION (MotionGestureInput/jnew_2 (unchecked-int (unchecked-subtract @l_MAX 19)) "Last Motion")))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchMotionGestureFactory)] (jinit_0 o) o))



