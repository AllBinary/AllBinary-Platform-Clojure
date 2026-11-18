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
;; package org.allbinary.thread

(ns NullThread)

(JR/register 'NullThread nil '[])

(def jsv_NULL_THREAD (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_THREAD [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_THREAD)
(defn jstatic_set_NULL_THREAD [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_THREAD v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_THREAD (new java.lang.Thread))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullThread)] (jinit_0 o) o))



