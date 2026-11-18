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
;; package org.allbinary

;;TempBase
(ns TsUtil)

(JR/register 'TsUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TsUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TsUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TsUtil/jstatic_instance)))

    
(defn jm_longBitsToDouble_1 [this p_bits]
  (let [ l_bits (volatile! p_bits)]
        (java.lang.Double/longBitsToDouble @l_bits)))

    
(defn jm_intBitsToFloat_1 [this p_bits]
  (let [ l_bits (volatile! p_bits)]
        (java.lang.Float/intBitsToFloat @l_bits)))

    
(defn jm_hashCode_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke @l_anyType :jm_hashCode_0)))

    
(defn jm_waitFor_2 [this p_any p_timeoutMillis]
  (let [ l_any (volatile! p_any) l_timeoutMillis (volatile! p_timeoutMillis) l_anyType (volatile! nil)]
        (vreset! l_anyType @l_any)
        (JR/invoke @l_anyType :jm_wait_1 @l_timeoutMillis)))

    
(defn jm_compareTo_2 [this p_a p_b]
  (let [ l_a (volatile! p_a) l_b (volatile! p_b)]
        (JR/invoke @l_a :jm_compareTo_1 @l_b)))



