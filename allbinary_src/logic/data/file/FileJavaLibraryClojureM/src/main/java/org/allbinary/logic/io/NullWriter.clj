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

(ns NullWriter)

(JR/register 'NullWriter 'java.io.Writer '[])

(def jsv_NULL_WRITER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_WRITER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_WRITER)
(defn jstatic_set_NULL_WRITER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_WRITER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_WRITER (NullWriter/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (JR/jsuper-init this 'java.io.Writer [])
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullWriter)] (jinit_0 o) o))

    
(defn jm_write_1 [this p_c]
  (let [ l_c (volatile! p_c)]
        nil))

    
(defn jm_write_3 [this p_cbuf p_off p_len]
  (let [ l_cbuf (volatile! p_cbuf) l_off (volatile! p_off) l_len (volatile! p_len)]
        nil))

    
(defn jm_write_1 [this p_str]
  (let [ l_str (volatile! p_str)]
        nil))

    
(defn jm_write_3 [this p_str p_off p_len]
  (let [ l_str (volatile! p_str) l_off (volatile! p_off) l_len (volatile! p_len)]
        nil))

    
(defn jm_flush_0 [this]
  (let []
        nil))

    
(defn jm_close_0 [this]
  (let []
        nil))



