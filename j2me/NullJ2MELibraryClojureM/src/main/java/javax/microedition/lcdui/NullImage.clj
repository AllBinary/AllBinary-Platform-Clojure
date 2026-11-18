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
;; package javax.microedition.lcdui

(ns NullImage)

(JR/register 'NullImage nil '[])

(def jsv_NULL_IMAGE_ARRAY (atom nil))
(def jsv_NULL_IMAGE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_IMAGE_ARRAY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_IMAGE_ARRAY)
(defn jstatic_set_NULL_IMAGE_ARRAY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_IMAGE_ARRAY v))
(defn jstatic_NULL_IMAGE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_IMAGE)
(defn jstatic_set_NULL_IMAGE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_IMAGE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_IMAGE_ARRAY (JR/anew "Object" 1 0))
    (reset! jsv_NULL_IMAGE (Image/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullImage)] (jinit_0 o) o))



