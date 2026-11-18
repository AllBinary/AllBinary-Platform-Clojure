;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2026 AllBinary 
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

(ns VectorUtil)

(JR/register 'VectorUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (VectorUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'VectorUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (VectorUtil/jstatic_instance)))

    
(defn jm_getSize_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_vector (volatile! nil)]
        (vreset! l_vector @l_anyType)
        (JR/invoke @l_vector :jm_size_0)))

    
(defn jm_elementAt_2 [this p_anyType p_index]
  (let [ l_anyType (volatile! p_anyType) l_index (volatile! p_index) l_vector (volatile! nil)]
        (vreset! l_vector @l_anyType)
        (JR/invoke @l_vector :jm_elementAt_1 @l_index)))



