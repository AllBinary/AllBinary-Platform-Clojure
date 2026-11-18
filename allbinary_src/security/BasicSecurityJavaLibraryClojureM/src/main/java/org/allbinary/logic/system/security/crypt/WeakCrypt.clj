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

(ns WeakCrypt)

(JR/register 'WeakCrypt nil '[])

(def jsv_keys (atom nil))
(def jsv_KEYMAX (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_keys [] (JR/ensure-init jclinit-state jclinit) @jsv_keys)
(defn jstatic_set_keys [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_keys v))
(defn jstatic_KEYMAX [] (JR/ensure-init jclinit-state jclinit) @jsv_KEYMAX)
(defn jstatic_set_KEYMAX [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_KEYMAX v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_keys (JR/afrom "String" 1 ["qwres6qewrupoi1132790jfahleavi89398" "143uk32lngf8675gt1tv9214uvt924ut9u9" "12kvjlvlkv11445v12951v512v9m51295v1" "gampipoiupg4g43y5u238tu2485u20u0932" "a93u5uu02s2d2g3259u4395u409u093u9vu" "nlkxzj90je3mln9l8l89qjf0j3v50j23r9j" "2lk5fn5j23nr8f0233vq35n23jn58vhy843" "9q24334m598t092tkn2iv0982456n425j9g" "5m9uvmt9436243m5v34g09d43i52ki35g99" "n123lr1iubiu2br32lv32rbu23b32ub2rlb" "va0u0iovji2ojpvj2oij22poiu4ov2uv28v" "bkk80gn2v9uc902340ut209pcup0u09utc9" "mn32m32neee23c42fn32nf3mf2n3fn2m3fm" "zcxpozo3423voizupovsijevnv3n33o33n3" "v0345324thv93h03893893vh893v8h3vhzz" "v8na898v8wyef9ty39yv98yaw39yeeyf8ye" "45zd36d34jg09434hfshp8uj9sy8s7cyr78" "b098yy0908vdvh983b2lb327980a76s5e5e" "v90y9v9p8y3r98pagsdgsagyr6y3985yhfh" "vblkzhhzp8yvzi8u4t9856456zy3rv8a388" "da7696023rgf28dssfa98asd879hg32hewe" "afo7d6ffkjb3jr3i34gb24ytuvu3jr3uryf" "4gijvqo8vq984hv984hj5j3511h832hf833"]))
    (reset! jsv_KEYMAX (JR/alen (WeakCrypt/jstatic_keys)))
    nil))

(defn jinitfields [this]
  (JR/fset this :tsUtil nil)
  (JR/fset this :abCrypt nil)
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :abCrypt (AbCrypt/jnew_1 (JR/fget (JR/scall 'KeySpecFactory :jm_getInstance_0) :DES)))
  this)

    
(defn jinit_1 [this p_key]
  (let [ l_key (volatile! p_key) l_commonStrings (volatile! nil) l_e (volatile! nil)]
    nil (jinitfields this)
        (try (do
            (JR/invoke (JR/fget this :abCrypt) :jm_init_1 (JR/aget* (WeakCrypt/jstatic_keys) @l_key)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget @l_commonStrings :EXCEPTION) this "SuperCrypt(key)" @l_e)) :else (throw jt))))))
  this)

(defn jnew_1 [p_key ]
  (let [o (JR/alloc 'WeakCrypt)] (jinit_1 o p_key) o))

    
(defn jm_encrypt_1 [this p_value]
  (let [ l_value (volatile! p_value) l_crypted (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_crypted (JR/invoke (JR/fget this :abCrypt) :jm_encrypt_1 (JR/invoke (JR/fget this :tsUtil) :jm_getByteArray_1 @l_value)))
            (JR/jreturn (JR/scall 'DatabaseEncoder :jm_encode_1 @l_crypted)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "Encrypt Failed" this "encrypt" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))) :else (throw jt))))))))

    
(defn jm_decrypt_1 [this p_value]
  (let [ l_value (volatile! p_value) l_decrypted (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_decrypted (JR/invoke (JR/fget this :abCrypt) :jm_decrypt_1 (JR/scall 'DatabaseEncoder :jm_decode_1 @l_value)))
            (JR/jreturn (JR/new-string @l_decrypted)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 "decrypt Failed" this "decrypt" @l_e)
            (JR/jreturn (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))) :else (throw jt))))))))



