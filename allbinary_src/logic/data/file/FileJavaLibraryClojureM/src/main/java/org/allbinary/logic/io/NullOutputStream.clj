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

(ns NullOutputStream)

(JR/register 'NullOutputStream 'java.io.OutputStream '[])

(def jsv_NULL_OUTPUT_STREAM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_OUTPUT_STREAM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_OUTPUT_STREAM)
(defn jstatic_set_NULL_OUTPUT_STREAM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_OUTPUT_STREAM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_OUTPUT_STREAM (NullOutputStream/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (JR/jsuper-init this 'java.io.OutputStream [])
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullOutputStream)] (jinit_0 o) o))

    
(defn jm_write_1 [this p_b]
  (let [ l_b (volatile! p_b)]
        nil))

    
(defn jm_write_3 [this p_b p_off p_len]
  (let [ l_b (volatile! p_b) l_off (volatile! p_off) l_len (volatile! p_len)]
        nil))

    
(defn jm_close_0 [this]
  (let []
        nil))



