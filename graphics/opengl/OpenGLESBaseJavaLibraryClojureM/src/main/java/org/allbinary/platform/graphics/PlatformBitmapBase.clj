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

(ns PlatformBitmapBase)

(JR/register 'PlatformBitmapBase nil '[])

(def jsv_NULL_PLATFORM_BITMAP_BASE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PLATFORM_BITMAP_BASE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PLATFORM_BITMAP_BASE)
(defn jstatic_set_NULL_PLATFORM_BITMAP_BASE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PLATFORM_BITMAP_BASE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PLATFORM_BITMAP_BASE (PlatformBitmapBase/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :alpha 0)
  (JR/fset this :basicColor nil)
    (JR/fset this :alpha 255)
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :NULL_COLOR))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformBitmapBase)] (jinit_0 o) o))

    
(defn jm_getWidth_0 [this]
  (let []
        0))

    
(defn jm_getHeight_0 [this]
  (let []
        0))

    
(defn jm_getImage_0 [this]
  (let []
        (JR/sget 'NullImage "NULL_IMAGE")))



