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

;;NoPlatform
(ns PreLogUtil)

(JR/register 'PreLogUtil nil '[])

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
  (let [o (JR/alloc 'PreLogUtil)] (jinit_0 o) o))

    
(defn jm_put_3 [p_specialMessage p_anyType p_functionName]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName)]
        (PreLogUtil/jm_putOE_4 @l_specialMessage @l_anyType @l_functionName (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))))

    
(defn jm_putOE_4 [p_specialMessage p_anyType p_functionName p_exception]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_putSE_4 [p_specialMessage p_className p_functionName p_exception]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception)]
        (JR/jthrow (new java.lang.RuntimeException))))



