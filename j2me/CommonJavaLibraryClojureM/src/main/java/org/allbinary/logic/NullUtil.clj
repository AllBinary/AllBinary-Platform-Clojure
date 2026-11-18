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

;;ActualPlatform
(ns NullUtil)

(JR/register 'NullUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (NullUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_OBJECT nil)
  (JR/fset this :NULL_CLASS nil)
  (JR/fset this :NULL_OBJECT_ARRAY nil)
  (JR/fset this :NULL_CHAR_ARRAY nil)
  (JR/fset this :NULL_BYTE_ARRAY nil)
  (JR/fset this :NULL_SHORT_ARRAY_ARRAY nil)
  (JR/fset this :NULL_INT_ARRAY nil)
  (JR/fset this :NULL_INT_ARRAY_ARRAY nil)
  (JR/fset this :NULL_INT_ARRAY_ARRAY_ARRAY nil)
  (JR/fset this :NULL_FLOAT_ARRAY nil)
    (JR/fset this :NULL_OBJECT (new java.lang.Object))
    (JR/fset this :NULL_CLASS (JR/class-name (JR/fget this :NULL_OBJECT)))
    (JR/fset this :NULL_OBJECT_ARRAY (JR/anew "Object" 1 0))
    (JR/fset this :NULL_CHAR_ARRAY (JR/anew "CHAR" 1 0))
    (JR/fset this :NULL_BYTE_ARRAY (JR/anew "BYTE" 1 0))
    (JR/fset this :NULL_SHORT_ARRAY_ARRAY (JR/anew "SHORT" 2 0 0))
    (JR/fset this :NULL_INT_ARRAY (JR/anew "INT" 1 0))
    (JR/fset this :NULL_INT_ARRAY_ARRAY (JR/anew "INT" 2 0 0))
    (JR/fset this :NULL_INT_ARRAY_ARRAY_ARRAY (JR/anew "INT" 3 0 0 0))
    (JR/fset this :NULL_FLOAT_ARRAY (JR/anew "FLOAT" 1 0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NullUtil/jstatic_instance)))



