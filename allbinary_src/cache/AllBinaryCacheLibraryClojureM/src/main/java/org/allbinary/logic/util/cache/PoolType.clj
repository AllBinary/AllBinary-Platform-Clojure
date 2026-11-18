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

(ns PoolType)

(JR/register 'PoolType nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :cacheType nil)
  this)

    
(defn jinit_1 [this p_cacheType]
  (let [ l_cacheType (volatile! p_cacheType)]
    nil (jinitfields this)
        (JR/fset this :cacheType @l_cacheType))
  this)

(defn jnew_1 [p_cacheType ]
  (let [o (JR/alloc 'PoolType)] (jinit_1 o p_cacheType) o))

    
(defn jm_getCacheType_0 [this]
  (let []
        (JR/fget this :cacheType)))

    
(defn jm_toString_0 [this]
  (let [ l_POOL_TYPE (volatile! nil)]
        (vreset! l_POOL_TYPE "PoolType: ")
        (str (JR/s @l_POOL_TYPE) (JR/s (JR/to-string-of (JR/invoke this :jm_getCacheType_0))))))



