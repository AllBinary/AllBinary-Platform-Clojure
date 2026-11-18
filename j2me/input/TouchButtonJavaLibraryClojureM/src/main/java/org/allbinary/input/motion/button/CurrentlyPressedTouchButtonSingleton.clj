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
;; package org.allbinary.input.motion.button

(ns CurrentlyPressedTouchButtonSingleton)

(JR/register 'CurrentlyPressedTouchButtonSingleton nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CurrentlyPressedTouchButtonSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CurrentlyPressedTouchButtonSingleton/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CurrentlyPressedTouchButtonSingleton)] (jinit_0 o) o))

    
(defn jm_size_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_size_0)))

    
(defn jm_removeAt_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :list) :jm_removeAt_1 @l_index)))

    
(defn jm_remove_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke (JR/fget this :list) :jm_remove_1 @l_touchButtonInput)))

    
(defn jm_get_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index)))

    
(defn jm_contains_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke (JR/fget this :list) :jm_contains_1 @l_touchButtonInput)))

    
(defn jm_add_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_touchButtonInput)))



