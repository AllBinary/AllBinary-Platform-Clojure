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

(ns NullReader)

(JR/register 'NullReader 'java.io.Reader '[])

(def jsv_NULL_READER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_READER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_READER)
(defn jstatic_set_NULL_READER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_READER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_READER (NullReader/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (JR/jsuper-init this 'java.io.Reader [])
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullReader)] (jinit_0 o) o))

    
(defn jm_read_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_read_3 [this p_cbuf p_off p_len]
  (let [ l_cbuf (volatile! p_cbuf) l_off (volatile! p_off) l_len (volatile! p_len)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_ready_0 [this]
  (let []
        false))

    
(defn jm_skip_1 [this p_n]
  (let [ l_n (volatile! p_n)]
        0))

    
(defn jm_close_0 [this]
  (let []
        nil))



