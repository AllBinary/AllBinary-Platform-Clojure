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
;; package org.allbinary.game.input

(ns InputFactory)

(JR/register 'InputFactory nil '[])

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
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :KEY_CODE_LABEL nil)
  (JR/fset this :DEVICE_ID_LABEL nil)
  (JR/fset this :MAX 0)
  (JR/fset this :inputIntegerArray nil)
  (JR/fset this :NO_INPUT nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :KEY_CODE_LABEL "KeyCode: ")
    (JR/fset this :DEVICE_ID_LABEL "DeviceId: ")
    (JR/fset this :MAX (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getMin_0))
    (JR/fset this :inputIntegerArray (JR/anew "Object" 1 (JR/fget this :MAX)))
    (JR/fset this :NO_INPUT (Input/jnew_2 0 (JR/fget (JR/fget this :commonStrings) :UNKNOWN)))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (InputFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (InputFactory/jstatic_set_instance (InputFactory/jnew_0))))
        (InputFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_size (volatile! nil) l_index (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_size (JR/alen (JR/fget this :inputIntegerArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :inputIntegerArray) @l_index (JR/fget this :NO_INPUT)))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'InputFactory)] (jinit_0 o) o))

    
(defn jm_add_2 [this p_id p_input]
  (let [ l_id (volatile! p_id) l_input (volatile! p_input)]
        (JR/aset* (JR/fget this :inputIntegerArray) @l_id @l_input)))

    
(defn jm_getInstanceById_1 [this p_id]
  (let [ l_id (volatile! p_id)](JR/method
        (if (< @l_id 0)
            (do
            (vreset! l_id (unchecked-int (unchecked-negate (JR/c2i @l_id))))))
        (if (> @l_id (JR/alen (JR/fget this :inputIntegerArray)))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Warning id: ") :jm_appendint_1 @l_id)) this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE))
            (JR/jreturn (JR/fget this :NO_INPUT))))
        (JR/aget* (JR/fget this :inputIntegerArray) @l_id))))



