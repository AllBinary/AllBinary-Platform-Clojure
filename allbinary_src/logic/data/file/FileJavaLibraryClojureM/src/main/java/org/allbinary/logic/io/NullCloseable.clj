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
;; package org.allbinary.logic.io

(ns NullCloseable)

(JR/register 'NullCloseable nil '[java.io.Closeable])

(def jsv_NULL_CLOSEABLE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_CLOSEABLE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_CLOSEABLE)
(defn jstatic_set_NULL_CLOSEABLE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_CLOSEABLE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_CLOSEABLE (NullCloseable/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullCloseable)] (jinit_0 o) o))

    
(defn jm_close_0 [this]
  (let []
        nil))



