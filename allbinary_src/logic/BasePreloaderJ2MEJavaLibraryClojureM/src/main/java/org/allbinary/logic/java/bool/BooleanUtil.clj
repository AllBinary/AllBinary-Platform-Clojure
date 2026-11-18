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
;; package org.allbinary.logic.java.bool

(ns BooleanUtil)

(JR/register 'BooleanUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BooleanUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :tsUtil nil)
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BooleanUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BooleanUtil)] (jinit_0 o) o))

    
(defn jm_getFromString_1 [this p_booleanString]
  (let [ l_booleanString (volatile! p_booleanString) l_stringValidationUtil (volatile! nil) l_booleanFactory (volatile! nil) l_booleanStringLowerCase (volatile! nil)](JR/method
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (vreset! l_booleanFactory (JR/scall 'BooleanFactory :jm_getInstance_0))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_booleanString)
            (do
            (JR/jreturn false)))
        (vreset! l_booleanStringLowerCase (JR/invoke @l_booleanString :jm_toLowerCase_0))
        (if (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_booleanStringLowerCase (JR/fget @l_booleanFactory :TRUE_STRING)) 0)
            (do
            true)
            (if (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_booleanStringLowerCase (JR/fget @l_booleanFactory :FALSE_STRING)) 0)
            (do
            false)
            (do
            (JR/jthrow (new java.lang.Exception "Invalid booleanString - Must be true or false"))))))))

    
(defn jm_isStringBoolean_1 [this p_booleanString]
  (let [ l_booleanString (volatile! p_booleanString) l_booleanFactory (volatile! nil) l_booleanStringLowerCase (volatile! nil)](JR/method
        (vreset! l_booleanFactory (JR/scall 'BooleanFactory :jm_getInstance_0))
        (vreset! l_booleanStringLowerCase (JR/invoke @l_booleanString :jm_toLowerCase_0))
        (if (or (JR/eq (JR/invoke @l_booleanStringLowerCase :jm_compareTo_1 (JR/fget @l_booleanFactory :TRUE_STRING)) 0) (JR/eq (JR/invoke @l_booleanStringLowerCase :jm_compareTo_1 (JR/fget @l_booleanFactory :FALSE_STRING)) 0))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_toStringFromBooleanArray_1 [this p_booleanArray]
  (let [ l_booleanArray (volatile! p_booleanArray) l_stringMaker (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_size (JR/alen @l_booleanArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringMaker :jm_appendboolean_1 (JR/aget* @l_booleanArray @l_index))))
        (JR/to-string-of @l_stringMaker)))



