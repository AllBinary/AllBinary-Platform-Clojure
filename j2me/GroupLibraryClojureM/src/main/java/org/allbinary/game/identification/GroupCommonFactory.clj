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
;; package org.allbinary.game.identification

(ns GroupCommonFactory)

(JR/register 'GroupCommonFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :ID nil)
  (JR/fset this :GROUP_NAME_LABEL nil)
  (JR/fset this :ID_LABEL nil)
  (JR/fset this :ADDING_LABEL nil)
  (JR/fset this :TO_LABEL nil)
    (JR/fset this :ID (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 10))
    (JR/fset this :GROUP_NAME_LABEL "Group Name: ")
    (JR/fset this :ID_LABEL " Id: ")
    (JR/fset this :ADDING_LABEL "Adding: ")
    (JR/fset this :TO_LABEL " to: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GroupCommonFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GroupCommonFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GroupCommonFactory/jstatic_set_instance (GroupCommonFactory/jnew_0))))
        (GroupCommonFactory/jstatic_instance)))



