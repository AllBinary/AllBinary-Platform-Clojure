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
;; package org.allbinary.logic.communication.log

;;ActualPlatform
(ns LogFactory)

(JR/register 'LogFactory nil '[])

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
  (let [o (JR/alloc 'LogFactory)] (jinit_0 o) o))

    
(defn jm_getInstanceD_0 []
  (let [this nil l_stringUtil (volatile! nil) l_nullUtil (volatile! nil)]
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (vreset! l_nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
        (Log/jnew_4 (JR/fget @l_stringUtil :EMPTY_STRING) (JR/fget @l_nullUtil :NULL_OBJECT) (JR/fget @l_stringUtil :EMPTY_STRING) (JR/fget @l_nullUtil :NULL_OBJECT))))

    
(defn jm_getInstanceNoF_3 [p_specialMessage p_anyType p_exception]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_exception (volatile! p_exception)]
        (Log/jnew_4 @l_specialMessage @l_anyType (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) @l_exception)))

    
(defn jm_getInstance_4 [p_specialMessage p_anyType p_functionName p_exception]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception)]
        (Log/jnew_4 @l_specialMessage @l_anyType @l_functionName @l_exception)))

    
(defn jm_getInstanceF_3 [p_specialMessage p_anyType p_functionName]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName) l_nullUtil (volatile! nil)]
        (vreset! l_nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
        (Log/jnew_4 @l_specialMessage @l_anyType @l_functionName (JR/fget @l_nullUtil :NULL_OBJECT))))



