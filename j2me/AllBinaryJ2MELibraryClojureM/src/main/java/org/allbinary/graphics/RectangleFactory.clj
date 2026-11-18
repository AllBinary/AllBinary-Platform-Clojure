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
;; package org.allbinary.graphics

(ns RectangleFactory)

(JR/register 'RectangleFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jsv_ARRAY_OF_ARRAYS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))
(defn jstatic_ARRAY_OF_ARRAYS [] (JR/ensure-init jclinit-state jclinit) @jsv_ARRAY_OF_ARRAYS)
(defn jstatic_set_ARRAY_OF_ARRAYS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ARRAY_OF_ARRAYS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 0 0))
    (reset! jsv_ARRAY_OF_ARRAYS (JR/anew "Object" 2 0 0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'RectangleFactory)] (jinit_0 o) o))



