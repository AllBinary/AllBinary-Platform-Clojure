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
;; package org.allbinary.logic.control.validate

(ns ValidatorBase)

(JR/register 'ValidatorBase nil '[ValidatorBaseInterface])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ValidatorBase/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ValidatorBase/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ValidatorBase)] (jinit_0 o) o))

    
(defn jm_isValid_0 [this]
  (let []
        (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE)))

    
(defn jm_validationInfo_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_toHashtable_0 [this]
  (let []
        (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE)))

    
(defn jm_toList_0 [this]
  (let []
        (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0)))



