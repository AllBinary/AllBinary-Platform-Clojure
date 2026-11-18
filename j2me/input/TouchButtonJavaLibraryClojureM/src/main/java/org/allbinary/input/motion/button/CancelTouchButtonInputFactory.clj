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

(ns CancelTouchButtonInputFactory)

(JR/register 'CancelTouchButtonInputFactory nil '[])

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
  (JR/fset this :cancelInputArray nil)
    (JR/fset this :cancelInputArray (JR/anew "Object" 1 (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX)))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (CancelTouchButtonInputFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (CancelTouchButtonInputFactory/jstatic_set_instance (CancelTouchButtonInputFactory/jnew_0))))
        (CancelTouchButtonInputFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_basicTouchInputFactory (volatile! nil) l_index (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_basicTouchInputFactory (JR/scall 'BasicTouchInputFactory :jm_getInstance_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :cancelInputArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :cancelInputArray) @l_index (JR/fget @l_basicTouchInputFactory :NONE))))
        (JR/aset* (JR/fget this :cancelInputArray) (JR/invoke (JR/fget @l_basicTouchInputFactory :UP) :jm_getSourceId_0) (JR/fget @l_basicTouchInputFactory :DOWN))
        (JR/aset* (JR/fget this :cancelInputArray) (JR/invoke (JR/fget @l_basicTouchInputFactory :DOWN) :jm_getSourceId_0) (JR/fget @l_basicTouchInputFactory :UP))
        (JR/aset* (JR/fget this :cancelInputArray) (JR/invoke (JR/fget @l_basicTouchInputFactory :LEFT) :jm_getSourceId_0) (JR/fget @l_basicTouchInputFactory :RIGHT))
        (JR/aset* (JR/fget this :cancelInputArray) (JR/invoke (JR/fget @l_basicTouchInputFactory :RIGHT) :jm_getSourceId_0) (JR/fget @l_basicTouchInputFactory :LEFT)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CancelTouchButtonInputFactory)] (jinit_0 o) o))

    
(defn jm_getCancel_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/aget* (JR/fget this :cancelInputArray) (JR/invoke @l_touchButtonInput :jm_getSourceId_0))))



