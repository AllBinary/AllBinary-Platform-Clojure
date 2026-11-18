;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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

(ns NoCrypt)

(JR/register 'NoCrypt nil '[CryptInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NoCrypt)] (jinit_0 o) o))

    
(defn jm_encrypt_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        @l_array))

    
(defn jm_decrypt_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        @l_array))



