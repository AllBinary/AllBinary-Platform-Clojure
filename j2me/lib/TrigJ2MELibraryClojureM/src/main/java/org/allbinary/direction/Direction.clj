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
;; package org.allbinary.direction

(ns Direction)

(JR/register 'Direction nil '[])

(def jsv_directionArray (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_directionArray [] (JR/ensure-init jclinit-state jclinit) @jsv_directionArray)
(defn jstatic_set_directionArray [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_directionArray v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_directionArray (JR/anew "Object" 1 13))
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :otherName nil)
  (JR/fset this :value 0)
  (JR/fset this :frameFactor 0)
  this)

    
(defn jinit_4 [this p_name p_otherName p_value p_frameFactor]
  (let [ l_name (volatile! p_name) l_otherName (volatile! p_otherName) l_value (volatile! p_value) l_frameFactor (volatile! p_frameFactor)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :otherName @l_otherName)
        (JR/fset this :value @l_value)
        (JR/fset this :frameFactor @l_frameFactor)
        (JR/aset* (Direction/jstatic_directionArray) @l_value this))
  this)

(defn jnew_4 [p_name p_otherName p_value p_frameFactor ]
  (let [o (JR/alloc 'Direction)] (jinit_4 o p_name p_otherName p_value p_frameFactor) o))

    
(defn jm_getInstance_1 [p_direction]
  (let [this nil l_direction (volatile! p_direction)]
        (JR/aget* (Direction/jstatic_directionArray) @l_direction)))

    
(defn jm_getValue_0 [this]
  (let []
        (JR/fget this :value)))

    
(defn jm_getFrameFactor_0 [this]
  (let []
        (JR/fget this :frameFactor)))

    
(defn jm_getOtherName_0 [this]
  (let []
        (JR/fget this :otherName)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Direction: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Or: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getOtherName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Value: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :value))
        (JR/to-string-of @l_stringBuffer)))



