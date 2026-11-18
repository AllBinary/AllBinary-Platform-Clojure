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
;; package org.allbinary.init.crypt.jcehelper

(ns BasicCryptUtil)

(JR/register 'BasicCryptUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicCryptUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :XML_START nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :XML_START "<?xml")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicCryptUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicCryptUtil/jstatic_instance)))

    
(defn jm_getDecryptedInputStream_2 [this p_inputStream p_cryptInterface]
  (let [ l_inputStream (volatile! p_inputStream) l_cryptInterface (volatile! p_cryptInterface) l_buffer (volatile! nil) l_ch (volatile! nil) l_decrypted (volatile! nil) l_decryptedString (volatile! nil) l_index (volatile! nil)]
        (vreset! l_buffer (new java.io.ByteArrayOutputStream))
        (vreset! l_ch 0)
        (JR/jwhile true false true
            (vreset! l_ch (JR/invoke @l_inputStream :jm_read_0))
            (if (== @l_ch (unchecked-int (unchecked-negate (JR/c2i 1))))
                (do
                (JR/jbreak)))
            (JR/invoke @l_buffer :jm_write_1 @l_ch))
        (vreset! l_decrypted (JR/invoke @l_cryptInterface :jm_decrypt_1 (JR/invoke @l_buffer :jm_toByteArray_0)))
        (vreset! l_decryptedString (JR/new-string @l_decrypted))
        (vreset! l_index (JR/invoke @l_decryptedString :jm_indexOf_1 (JR/fget this :XML_START)))
        (if (> @l_index 0)
            (do
            (vreset! l_decryptedString (JR/invoke @l_decryptedString :jm_substring_1 @l_index))))
        (new java.io.ByteArrayInputStream (JR/invoke (JR/fget this :tsUtil) :jm_getByteArray_1 @l_decryptedString))))



