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
;; package org.allbinary.logic.system.security.crypt.jcehelper

(ns BaseSecretComposite)

(JR/register 'BaseSecretComposite nil '[])

(def jsv_NULL_SECRET_COMPOSITE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_SECRET_COMPOSITE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_SECRET_COMPOSITE)
(defn jstatic_set_NULL_SECRET_COMPOSITE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_SECRET_COMPOSITE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_SECRET_COMPOSITE (BaseSecretComposite/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BaseSecretComposite)] (jinit_0 o) o))

    
(defn jm_encrypt_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY)))

    
(defn jm_decrypt_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY)))



