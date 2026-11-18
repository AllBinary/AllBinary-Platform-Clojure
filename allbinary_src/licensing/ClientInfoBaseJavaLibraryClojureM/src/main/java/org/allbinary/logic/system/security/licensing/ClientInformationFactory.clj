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
;; package org.allbinary.logic.system.security.licensing

(ns ClientInformationFactory)

(JR/register 'ClientInformationFactory nil '[])

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
  (let [o (JR/alloc 'ClientInformationFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 [this]
  (let [ l_logUtil (volatile! nil) l_commonStrings (volatile! nil) l_stringUtil (volatile! nil)]
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke @l_logUtil :jm_putF_3 (JR/fget @l_commonStrings :NOT_IMPLEMENTED) this (JR/fget @l_commonStrings :GET_INSTANCE))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (ClientInformation/jnew_4 (JR/fget @l_stringUtil :NULL_STRING) (JR/fget @l_stringUtil :NULL_STRING) (JR/fget @l_stringUtil :NULL_STRING) (JR/fget @l_stringUtil :NULL_STRING))))



