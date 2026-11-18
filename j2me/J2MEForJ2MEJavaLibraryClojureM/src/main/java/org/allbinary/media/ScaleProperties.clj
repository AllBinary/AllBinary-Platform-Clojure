;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.media

(ns ScaleProperties)

(JR/register 'ScaleProperties nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ScaleProperties/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :scaleX 0.0)
  (JR/fset this :scaleY 0.0)
  (JR/fset this :scaleWidth 0)
  (JR/fset this :scaleHeight 0)
  (JR/fset this :shouldScale false)
    (JR/fset this :scaleX 1.0)
    (JR/fset this :scaleY 1.0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ScaleProperties)] (jinit_0 o) o))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :COLON_SEP)) :jm_appendboolean_1 (JR/fget this :shouldScale)) :jm_append_1 "scaleX: ") :jm_appendfloat_1 (JR/fget this :scaleX)) :jm_append_1 "scaleY: ") :jm_appendfloat_1 (JR/fget this :scaleY)) :jm_append_1 "scaleWidth: ") :jm_appendint_1 (JR/fget this :scaleWidth)) :jm_append_1 "scaleHeight: ") :jm_appendint_1 (JR/fget this :scaleHeight)))))



