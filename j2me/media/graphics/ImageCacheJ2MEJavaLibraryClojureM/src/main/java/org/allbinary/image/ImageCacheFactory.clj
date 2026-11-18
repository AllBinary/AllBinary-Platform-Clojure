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

(ns ImageCacheFactory)

(JR/register 'ImageCacheFactory nil '[])

(def jsv_IMAGE_CACHE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_IMAGE_CACHE [] (JR/ensure-init jclinit-state jclinit) @jsv_IMAGE_CACHE)
(defn jstatic_set_IMAGE_CACHE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_IMAGE_CACHE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_IMAGE_CACHE (ImageCache/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ImageCacheFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageCacheFactory/jstatic_IMAGE_CACHE)))

    
(defn jm_init_0 []
  (let [this nil]
        nil))



