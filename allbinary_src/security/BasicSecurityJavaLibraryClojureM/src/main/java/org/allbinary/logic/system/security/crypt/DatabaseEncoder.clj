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
;; package org.allbinary.logic.system.security.crypt

(ns DatabaseEncoder)

(JR/register 'DatabaseEncoder nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DatabaseEncoder)] (jinit_0 o) o))

    
(defn jm_encode_1 [p_value]
  (let [this nil l_value (volatile! p_value) l_array (volatile! nil) l_stringBuffer (volatile! nil) l_index (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_array @l_value)
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/alen @l_array)) (do (JR/vinc l_index 1 :int false))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (long (JR/aget* @l_array @l_index))))
                (if (< @l_index (unchecked-int (unchecked-subtract (JR/alen @l_array) 1)))
                    (do
                    (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))))))
            (JR/jreturn (JR/to-string-of @l_stringBuffer)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget @l_commonStrings :EXCEPTION) "DatabaseEncoder" "decode" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))) :else (throw jt))))))))

    
(defn jm_decode_1 [p_value]
  (let [this nil l_value (volatile! p_value) l_tokenizer (volatile! nil) l_vector (volatile! nil) l_size (volatile! nil) l_decode (volatile! nil) l_byteOfData (volatile! nil) l_index (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_tokenizer (Tokenizer/jnew_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)))
            (vreset! l_vector (JR/invoke @l_tokenizer :jm_getTokensFromString_2 @l_value (BasicArrayListD/jnew_0)))
            (vreset! l_size (JR/invoke @l_vector :jm_size_0))
            (vreset! l_decode (JR/anew "BYTE" 1 @l_size))
            (vreset! l_byteOfData nil)
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_byteOfData (JR/aget* (JR/fget @l_vector :objectArray) @l_index))
                (JR/aset* @l_decode @l_index (java.lang.Byte/parseByte @l_byteOfData))))
            (JR/jreturn @l_decode))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_putSE_4 (JR/fget @l_commonStrings :EXCEPTION) "DatabaseEncoder" "decode" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_BYTE_ARRAY))) :else (throw jt))))))))



