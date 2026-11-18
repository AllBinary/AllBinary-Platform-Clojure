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
;; package org.allbinary.logic

;;NoPlatform
(ns StdUtil)

(JR/register 'StdUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (StdUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EMPTY_VECTOR nil)
  (JR/fset this :NULL_TABLE nil)
  (JR/fset this :NULL_MAP nil)
    (JR/fset this :EMPTY_VECTOR (JR/invoke this :jm_createVector_0))
    (JR/fset this :NULL_TABLE (JR/invoke this :jm_createHashtable_0))
    (JR/fset this :NULL_MAP (JR/invoke this :jm_createHashMap_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'StdUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (StdUtil/jstatic_instance)))

    
(defn jm_createStack_0 [this]
  (let []
        (ABStack/jnew_0)))

    
(defn jm_createVector_0 [this]
  (let []
        (ABVector/jnew_0)))

    
(defn jm_createHashtable_0 [this]
  (let []
        (ABHashtable/jnew_0)))

    
(defn jm_createHashMap_0 [this]
  (let []
        (ABHashMap/jnew_0)))



