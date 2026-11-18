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
;; package org.allbinary.animation.image

(ns ImageArrayRotationAnimationPool)

(JR/register 'ImageArrayRotationAnimationPool 'BasicArrayListResetablePool '[])

(def jsv_IMAGE_ROTATION_ANIMATION_POOL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_IMAGE_ROTATION_ANIMATION_POOL [] (JR/ensure-init jclinit-state jclinit) @jsv_IMAGE_ROTATION_ANIMATION_POOL)
(defn jstatic_set_IMAGE_ROTATION_ANIMATION_POOL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_IMAGE_ROTATION_ANIMATION_POOL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_IMAGE_ROTATION_ANIMATION_POOL (ImageArrayRotationAnimationPool/jnew_1 (ImageArrayRotationAnimationCacheableInterfaceFactory/jnew_0)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_cacheableInterfaceFactoryInterface]
  (let [ l_cacheableInterfaceFactoryInterface (volatile! p_cacheableInterfaceFactoryInterface)]
        (BasicArrayListResetablePool/jinit_1 this @l_cacheableInterfaceFactoryInterface) (jinitfields this))
  this)

(defn jnew_1 [p_cacheableInterfaceFactoryInterface ]
  (let [o (JR/alloc 'ImageArrayRotationAnimationPool)] (jinit_1 o p_cacheableInterfaceFactoryInterface) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageArrayRotationAnimationPool/jstatic_IMAGE_ROTATION_ANIMATION_POOL)))

    
(defn jm_remove_1 [this p_key]
  (let [ l_key (volatile! p_key) l_cacheableInterface (volatile! nil) l_allBinaryImageRotationAnimationInfo (volatile! nil) l_imageArrayRotationAnimationCacheable (volatile! nil)]
        (vreset! l_cacheableInterface (JR/invoke-super 'BasicArrayListResetablePool this :jm_remove_1 @l_key))
        (vreset! l_allBinaryImageRotationAnimationInfo @l_key)
        (vreset! l_imageArrayRotationAnimationCacheable @l_cacheableInterface)
        (JR/invoke @l_imageArrayRotationAnimationCacheable :jm_setImageArray_1 (JR/invoke @l_allBinaryImageRotationAnimationInfo :jm_getImageArray_0))
        @l_cacheableInterface))



