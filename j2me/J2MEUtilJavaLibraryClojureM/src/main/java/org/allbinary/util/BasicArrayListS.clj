;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.util

(ns BasicArrayListS)

(JR/register 'BasicArrayListS 'BasicArrayList '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_size]
  (let [ l_size (volatile! p_size)]
        (BasicArrayList/jinit_1 this (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT_ARRAY)) (jinitfields this)
        (if (< @l_size 0)
            (do
            (JR/jthrow (new java.lang.IllegalArgumentException (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Init Size Exception: ") :jm_appendint_1 @l_size))))))
        (JR/fset this :objectArray (JR/anew "Object" 1 @l_size)))
  this)

(defn jnew_1 [p_size ]
  (let [o (JR/alloc 'BasicArrayListS)] (jinit_1 o p_size) o))



