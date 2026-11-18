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

(ns ImageArrayRotationAnimationCacheableInterfaceFactory)

(JR/register 'ImageArrayRotationAnimationCacheableInterfaceFactory nil '[CacheableInterfaceFactoryInterface])

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
  (let [o (JR/alloc 'ImageArrayRotationAnimationCacheableInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (ImageArrayRotationAnimationCacheable/jnew_2 @l_key (JR/scall 'AnimationBehavior :jm_getInstance_0))))



