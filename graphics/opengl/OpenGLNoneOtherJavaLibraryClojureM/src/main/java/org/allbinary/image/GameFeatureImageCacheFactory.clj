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
;; package org.allbinary.image

(ns GameFeatureImageCacheFactory)

(JR/register 'GameFeatureImageCacheFactory nil '[])

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
  (let [o (JR/alloc 'GameFeatureImageCacheFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (JR/scall 'ImageCacheFactory :jm_getInstance_0)))

    
(defn jm_init_0 []
  (let [this nil]
        (JR/scall 'ImageCacheFactory :jm_init_0)))

    
(defn jm_releaseAll_0 []
  (let [this nil]
        (JR/invoke (JR/scall 'ImageCacheFactory :jm_getInstance_0) :jm_releaseAll_0)))



