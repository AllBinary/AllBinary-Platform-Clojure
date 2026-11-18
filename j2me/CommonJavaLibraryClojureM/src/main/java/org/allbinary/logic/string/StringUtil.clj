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
;; package org.allbinary.logic.string

(ns StringUtil)

(JR/register 'StringUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (StringUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :INIT_STRING nil)
  (JR/fset this :NULL_STRING nil)
  (JR/fset this :EMPTY_STRING nil)
  (JR/fset this :ONE_EMPTY_STRING_ARRAY nil)
  (JR/fset this :ONE_EMPTY_STRING_ARRAY_OF_ARRAYS nil)
  (JR/fset this :stringArray nil)
    (JR/fset this :INIT_STRING (JR/new-string ""))
    (JR/fset this :NULL_STRING "null")
    (JR/fset this :EMPTY_STRING "")
    (JR/fset this :ONE_EMPTY_STRING_ARRAY (JR/afrom "String" 1 [(JR/fget this :EMPTY_STRING)]))
    (JR/fset this :ONE_EMPTY_STRING_ARRAY_OF_ARRAYS (JR/anew "String" 2 0 0))
    (JR/fset this :stringArray (JR/anew "String" 1 0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (StringUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'StringUtil)] (jinit_0 o) o))

    
(defn jm_getNonNull_1 [this p_string]
  (let [ l_string (volatile! p_string)]
        @l_string))

    
(defn jm_getArrayInstance_0 [this]
  (let []
        (JR/fget this :stringArray)))

    
(defn jm_count_2 [this p_string p_aChar]
  (let [ l_string (volatile! p_string) l_aChar (volatile! p_aChar) l_count (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_count 0)
        (vreset! l_size (JR/slength @l_string))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (== (JR/c2i (JR/char-at @l_string @l_index)) (JR/c2i @l_aChar))
                (do
                (JR/vinc l_count 1 :int false)))))
        @l_count))

    
(defn jm_toString_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (if (some? @l_anyType)
            (do
            (JR/to-string-of @l_anyType))
            (do
            (JR/fget this :NULL_STRING)))))



