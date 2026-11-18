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

(ns StringValidationJSEUtil)

(JR/register 'StringValidationJSEUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'StringValidationJSEUtil)] (jinit_0 o) o))

    
(defn jm_isBlank_1 [p_string]
  (let [this nil l_string (volatile! p_string) l_len (volatile! nil) l_c (volatile! nil) l_i (volatile! nil)](JR/method
        (vreset! l_len (JR/slength @l_string))
        (do (vreset! l_i 0)
            (JR/jfor false false (< @l_i @l_len) (do (JR/vinc l_i 1 :int false))
            (vreset! l_c (JR/char-at @l_string @l_i))
            (if (= (java.lang.Character/isWhitespace @l_c) false)
                (do
                (JR/jreturn false)))))
        true)))



