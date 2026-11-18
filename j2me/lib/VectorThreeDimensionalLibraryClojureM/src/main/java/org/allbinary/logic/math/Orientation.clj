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
;; package org.allbinary.logic.math

(ns Orientation)

(JR/register 'Orientation nil '[])

(def jsv_NONE (atom nil))
(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NONE [] (JR/ensure-init jclinit-state jclinit) @jsv_NONE)
(defn jstatic_set_NONE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NONE v))
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NONE (Orientation/jnew_3 0 0 0))
    (reset! jsv_SINGLETON (Orientation/jnew_3 0 0 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :yaw nil)
  (JR/fset this :pitch nil)
  (JR/fset this :roll nil)
    (JR/fset this :yaw (BasicDecimal/jnew_1 0))
    (JR/fset this :pitch (BasicDecimal/jnew_1 0))
    (JR/fset this :roll (BasicDecimal/jnew_1 0))
  this)

    
(defn jm_getInstance_3 [p_yaw p_pitch p_roll]
  (let [this nil l_yaw (volatile! p_yaw) l_pitch (volatile! p_pitch) l_roll (volatile! p_roll)]
        (JR/invoke (JR/fget (Orientation/jstatic_SINGLETON) :yaw) :jm_setint_1 @l_yaw)
        (JR/invoke (JR/fget (Orientation/jstatic_SINGLETON) :pitch) :jm_setint_1 @l_pitch)
        (JR/invoke (JR/fget (Orientation/jstatic_SINGLETON) :roll) :jm_setint_1 @l_roll)
        (Orientation/jstatic_SINGLETON)))

    
(defn jinit_3 [this p_yaw p_pitch p_roll]
  (let [ l_yaw (volatile! p_yaw) l_pitch (volatile! p_pitch) l_roll (volatile! p_roll)]
    nil (jinitfields this)
        (JR/invoke (JR/fget this :yaw) :jm_setint_1 @l_yaw)
        (JR/invoke (JR/fget this :pitch) :jm_setint_1 @l_pitch)
        (JR/invoke (JR/fget this :roll) :jm_setint_1 @l_roll))
  this)

(defn jnew_3 [p_yaw p_pitch p_roll ]
  (let [o (JR/alloc 'Orientation)] (jinit_3 o p_yaw p_pitch p_roll) o))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Y: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :yaw)))
        (JR/invoke @l_stringBuffer :jm_append_1 " P: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :pitch)))
        (JR/invoke @l_stringBuffer :jm_append_1 " R: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :roll)))
        (JR/to-string-of @l_stringBuffer)))



