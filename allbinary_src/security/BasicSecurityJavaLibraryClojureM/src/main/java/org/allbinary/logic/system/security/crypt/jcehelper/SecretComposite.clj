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

(ns SecretComposite)

(JR/register 'SecretComposite 'BaseSecretComposite '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :byteUtil nil)
  (JR/fset this :cipher nil)
  (JR/fset this :secretKey nil)
  (JR/fset this :key nil)
    (JR/fset this :byteUtil (JR/scall 'ByteUtil :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_secretKey p_cipher p_key]
  (let [ l_secretKey (volatile! p_secretKey) l_cipher (volatile! p_cipher) l_key (volatile! p_key)]
    (BaseSecretComposite/jinit_0 this) (jinitfields this)
        (JR/fset this :secretKey @l_secretKey)
        (JR/fset this :cipher @l_cipher)
        (JR/fset this :key @l_key))
  this)

(defn jnew_3 [p_secretKey p_cipher p_key ]
  (let [o (JR/alloc 'SecretComposite)] (jinit_3 o p_secretKey p_cipher p_key) o))

    
(defn jm_encrypt_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        (vreset! l_array (JR/invoke this :jm_mutilate_1 @l_array))
        (JR/invoke (JR/fget this :cipher) :jm_init_2 javax.crypto.Cipher/ENCRYPT_MODE (JR/fget this :secretKey))
        (JR/invoke (JR/fget this :cipher) :jm_doFinal_1 @l_array)))

    
(defn jm_decrypt_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        (JR/invoke (JR/fget this :cipher) :jm_init_2 javax.crypto.Cipher/DECRYPT_MODE (JR/fget this :secretKey))
        (JR/invoke this :jm_mutilate_1 (JR/invoke (JR/fget this :cipher) :jm_doFinal_1 @l_array))))

    
(defn jm_mutilate_1 [this p_array]
  (let [ l_array (volatile! p_array) l_value (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen (JR/fget this :key))) (do (JR/vinc l_index 1 :int false))
            (vreset! l_value (JR/aget* (JR/fget this :key) @l_index))
            (if (and (< @l_value 8) (> @l_value 0))
                (do
                (vreset! l_array (JR/invoke (JR/fget this :byteUtil) :jm_xorByte_2 @l_array @l_value))))))
        @l_array))



