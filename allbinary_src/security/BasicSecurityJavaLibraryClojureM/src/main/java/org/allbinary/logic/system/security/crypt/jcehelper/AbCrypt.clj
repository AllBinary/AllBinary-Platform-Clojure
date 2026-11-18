;;
;; AllBinary Open License Version 1
;; Copyright (c) 2011 AllBinary
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

(ns AbCrypt)

(JR/register 'AbCrypt nil '[CryptInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :tsUtil nil)
  (JR/fset this :secretComposite nil)
  (JR/fset this :algorithm nil)
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :secretComposite (JR/sget 'BaseSecretComposite "NULL_SECRET_COMPOSITE"))
  this)

    
(defn jinit_1 [this p_algorithm]
  (let [ l_algorithm (volatile! p_algorithm)]
    nil (jinitfields this)
        (JR/fset this :algorithm @l_algorithm))
  this)

(defn jnew_1 [p_algorithm ]
  (let [o (JR/alloc 'AbCrypt)] (jinit_1 o p_algorithm) o))

    
(defn jm_init_1 [this p_keyAsString]
  (let [ l_keyAsString (volatile! p_keyAsString) l_commonStrings (volatile! nil) l_e (volatile! nil) l_key (volatile! nil) l_keySpec (volatile! nil) l_keyFactory (volatile! nil) l_secretKey (volatile! nil) l_cipher (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (try (do
            (try (do
                (java.security.Security/addProvider (BouncyCastleProvider/jnew_0)))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :INIT) @l_e)) :else (throw jt)))))
            (vreset! l_key (JR/invoke (JR/fget this :tsUtil) :jm_getByteArray_1 @l_keyAsString))
            (vreset! l_keySpec (JR/invoke (JR/scall 'KeySpecFactory :jm_getInstance_0) :jm_getInstance_2 (JR/fget this :algorithm) @l_key))
            (vreset! l_keyFactory (javax.crypto.SecretKeyFactory/getInstance (JR/fget this :algorithm)))
            (vreset! l_secretKey (JR/invoke @l_keyFactory :jm_generateSecret_1 @l_keySpec))
            (vreset! l_cipher (javax.crypto.Cipher/getInstance (JR/fget this :algorithm)))
            (JR/fset this :secretComposite (SecretComposite/jnew_3 @l_secretKey @l_cipher @l_key)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "init Failed" this (JR/fget @l_commonStrings :INIT) @l_e)) :else (throw jt)))))))

    
(defn jm_encrypt_1 [this p_array]
  (let [ l_array (volatile! p_array) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/invoke (JR/fget this :secretComposite) :jm_encrypt_1 @l_array)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "Encrypt Failed" this "encrypt" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY))) :else (throw jt))))))))

    
(defn jm_decrypt_1 [this p_array]
  (let [ l_array (volatile! p_array) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/invoke (JR/fget this :secretComposite) :jm_decrypt_1 @l_array)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "decrypt Failed" this "decrypt" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY))) :else (throw jt))))))))



