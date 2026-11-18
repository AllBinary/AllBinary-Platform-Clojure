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

(ns PrimitiveLongSingleton)

(JR/register 'PrimitiveLongSingleton nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PrimitiveLongSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :UNK nil)
  (JR/fset this :NUMBER_ARRAY nil)
  (JR/fset this :NUMBER_CHAR_ARRAY nil)
  (JR/fset this :NUMBER_CHAR_ARRAYS nil)
  (JR/fset this :ZERO nil)
    (JR/fset this :UNK (JR/afrom "CHAR" 1 [\U \n \k]))
    (JR/fset this :NUMBER_ARRAY (JR/afrom "BYTE" 1 [0 1 2 3 4 5 6 7 8 9]))
    (JR/fset this :NUMBER_CHAR_ARRAY (JR/afrom "CHAR" 1 [\0 \1 \2 \3 \4 \5 \6 \7 \8 \9]))
    (JR/fset this :NUMBER_CHAR_ARRAYS (JR/afrom "CHAR" 2 [(JR/afrom "CHAR" 1 [\0]) (JR/afrom "CHAR" 1 [\1]) (JR/afrom "CHAR" 1 [\2]) (JR/afrom "CHAR" 1 [\3]) (JR/afrom "CHAR" 1 [\4]) (JR/afrom "CHAR" 1 [\5]) (JR/afrom "CHAR" 1 [\6]) (JR/afrom "CHAR" 1 [\7]) (JR/afrom "CHAR" 1 [\8]) (JR/afrom "CHAR" 1 [\9])]))
    (JR/fset this :ZERO (JR/afrom "CHAR" 1 [(JR/aget* (JR/fget this :NUMBER_CHAR_ARRAY) 0)]))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PrimitiveLongSingleton)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PrimitiveLongSingleton/jstatic_instance)))

    
(defn jm_getNumberFromChar_1 [this p_numberAsChar]
  (let [ l_numberAsChar (volatile! p_numberAsChar) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_size (JR/alen (JR/fget this :NUMBER_CHAR_ARRAY)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (== (JR/c2i (JR/aget* (JR/fget this :NUMBER_CHAR_ARRAY) @l_index)) (JR/c2i @l_numberAsChar))
                (do
                (JR/jreturn (JR/aget* (JR/fget this :NUMBER_ARRAY) @l_index))))))
        (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "numberAsChar was not in array: ") :jm_appendchar_1 @l_numberAsChar)))))))



