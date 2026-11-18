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
;; package org.allbinary.logic.java

(ns PrimitiveArrayToString)

(JR/register 'PrimitiveArrayToString nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PrimitiveArrayToString)] (jinit_0 o) o))

    
(defn jm_toString_1 [p_floats]
  (let [this nil l_floats (volatile! p_floats) l_stringBuffer (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_floats)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringBuffer :jm_appendfloat_1 (JR/aget* @l_floats @l_index))))
        (JR/to-string-of @l_stringBuffer)))



