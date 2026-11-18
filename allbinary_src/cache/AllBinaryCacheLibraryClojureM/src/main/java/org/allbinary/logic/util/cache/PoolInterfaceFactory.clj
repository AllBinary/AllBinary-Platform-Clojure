;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2007 AllBinary 
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
;; package org.allbinary.logic.util.cache

(ns PoolInterfaceFactory)

(JR/register 'PoolInterfaceFactory nil '[])

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
  (let [o (JR/alloc 'PoolInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [p_cacheableInterfaceFactoryInterface p_poolType p_cachePolicy]
  (let [this nil l_cacheableInterfaceFactoryInterface (volatile! p_cacheableInterfaceFactoryInterface) l_poolType (volatile! p_poolType) l_cachePolicy (volatile! p_cachePolicy)]
        (JR/jthrow (new java.lang.Exception (str (JR/s "No Such PoolType: ") (JR/s (JR/to-string-of @l_poolType)))))))



