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

(ns BasicCrypt)

(JR/register 'BasicCrypt nil '[CryptInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :byteUtil nil)
  (JR/fset this :key nil)
    (JR/fset this :byteUtil (JR/scall 'ByteUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_keyAsString]
  (let [ l_keyAsString (volatile! p_keyAsString) l_key (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_key (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY))
        (try (do
            (vreset! l_key (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_getByteArray_1 @l_keyAsString)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget @l_commonStrings :EXCEPTION) this "AbCrypt(alg,key)" @l_e)) :else (throw jt)))))
        (JR/fset this :key @l_key))
  this)

(defn jnew_1 [p_keyAsString ]
  (let [o (JR/alloc 'BasicCrypt)] (jinit_1 o p_keyAsString) o))

    
(defn jm_encrypt_1 [this p_array]
  (let [ l_array (volatile! p_array) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/invoke this :jm_mutilate_1 @l_array)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "Encrypt Failed" this "encrypt" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY))) :else (throw jt))))))))

    
(defn jm_decrypt_1 [this p_array]
  (let [ l_array (volatile! p_array) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/invoke this :jm_mutilate_1 @l_array)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "decrypt Failed" this "decrypt" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY))) :else (throw jt))))))))

    
(defn jm_mutilate_1 [this p_array]
  (let [ l_array (volatile! p_array) l_value (volatile! nil) l_index (volatile! nil)]
        (vreset! l_value 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen (JR/fget this :key))) (do (JR/vinc l_index 1 :int false))
            (vreset! l_value (JR/aget* (JR/fget this :key) @l_index))
            (vreset! l_array (JR/invoke (JR/fget this :byteUtil) :jm_xor_2 @l_array @l_value))))
        @l_array))



