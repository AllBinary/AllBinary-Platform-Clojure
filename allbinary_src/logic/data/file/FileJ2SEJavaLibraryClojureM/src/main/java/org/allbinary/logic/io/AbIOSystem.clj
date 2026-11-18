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
;; package org.allbinary.logic.io

(ns AbIOSystem)

(JR/register 'AbIOSystem nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AbIOSystem/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :type nil)
    (JR/fset this :type "java.io")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AbIOSystem)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AbIOSystem/jstatic_instance)))

    
(defn jm_getType_0 [this]
  (let []
        (JR/fget this :type)))

    
(defn jm_isType_1 [this p_type]
  (let [ l_type (volatile! p_type)]
        (if (JR/eq (JR/invoke (JR/fget this :type) :jm_compareTo_1 @l_type) 0)
            (do
            true)
            (do
            false))))



