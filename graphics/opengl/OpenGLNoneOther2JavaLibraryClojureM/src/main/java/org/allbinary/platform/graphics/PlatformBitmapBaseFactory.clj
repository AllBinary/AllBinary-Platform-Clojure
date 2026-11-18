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
;; package org.allbinary.platform.graphics

(ns PlatformBitmapBaseFactory)

(JR/register 'PlatformBitmapBaseFactory nil '[])

(def jsv_NULL_PLATFORM_BITMAP_BASE_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PLATFORM_BITMAP_BASE_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PLATFORM_BITMAP_BASE_FACTORY)
(defn jstatic_set_NULL_PLATFORM_BITMAP_BASE_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PLATFORM_BITMAP_BASE_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PLATFORM_BITMAP_BASE_FACTORY (PlatformBitmapBaseFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformBitmapBaseFactory)] (jinit_0 o) o))

    
(defn jm_createBitmap_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        (JR/sget 'PlatformBitmapBase "NULL_PLATFORM_BITMAP_BASE")))



