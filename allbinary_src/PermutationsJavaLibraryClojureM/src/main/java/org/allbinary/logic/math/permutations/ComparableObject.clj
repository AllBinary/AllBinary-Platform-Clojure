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
;; package org.allbinary.logic.math.permutations

(ns ComparableObject)

(JR/register 'ComparableObject nil '[java.lang.Comparable])

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
  (let [o (JR/alloc 'ComparableObject)] (jinit_0 o) o))

    
(defn jm_compareTo_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)](JR/method
        (if (< (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this) (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 @l_anyType))
            (do
            (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1)))))
            (if (> (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this) (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 @l_anyType))
            (do
            (JR/jreturn 1))))
        0)))



