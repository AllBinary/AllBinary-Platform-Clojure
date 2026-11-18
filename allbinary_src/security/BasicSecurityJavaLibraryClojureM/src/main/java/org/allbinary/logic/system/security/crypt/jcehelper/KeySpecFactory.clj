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

(ns KeySpecFactory)

(JR/register 'KeySpecFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (KeySpecFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :DES nil)
  (JR/fset this :DESEDE nil)
  (JR/fset this :BLOWFISH nil)
    (JR/fset this :DES "DES")
    (JR/fset this :DESEDE "DESede")
    (JR/fset this :BLOWFISH "Blowfish")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (KeySpecFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'KeySpecFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_2 [this p_algorithm p_keyData]
  (let [ l_algorithm (volatile! p_algorithm) l_keyData (volatile! p_keyData) l_tsUtil (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
            (if (== (JR/invoke @l_tsUtil :jm_compareTo_2 @l_algorithm (JR/fget this :DES)) 0)
                (do
                (JR/jreturn (new javax.crypto.spec.DESKeySpec @l_keyData)))
                (if (== (JR/invoke @l_tsUtil :jm_compareTo_2 @l_algorithm (JR/fget this :DESEDE)) 0)
                (do
                (JR/jreturn (new javax.crypto.spec.DESedeKeySpec @l_keyData)))
                (do
                (JR/jthrow (new java.lang.RuntimeException))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)
            (JR/jthrow (new java.lang.RuntimeException))) :else (throw jt))))))))



