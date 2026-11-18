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
;; package org.allbinary.platform.opengles

(ns PlatformTextureBaseFactory)

(JR/register 'PlatformTextureBaseFactory nil '[])

(def jsv_NULL_PLATFORM_TEXTURE_BASE_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PLATFORM_TEXTURE_BASE_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PLATFORM_TEXTURE_BASE_FACTORY)
(defn jstatic_set_NULL_PLATFORM_TEXTURE_BASE_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PLATFORM_TEXTURE_BASE_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PLATFORM_TEXTURE_BASE_FACTORY (PlatformTextureBaseFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformTextureBaseFactory)] (jinit_0 o) o))

    
(defn jm_load_6 [this p_gl p_target p_level p_image p_border p_flip]
  (let [ l_gl (volatile! p_gl) l_target (volatile! p_target) l_level (volatile! p_level) l_image (volatile! p_image) l_border (volatile! p_border) l_flip (volatile! p_flip)]
        nil))



