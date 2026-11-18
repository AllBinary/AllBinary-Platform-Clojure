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

(ns ImageArrayRotationAnimationCacheable)

(JR/register 'ImageArrayRotationAnimationCacheable 'AdjustedImageArrayRotationAnimation '[CacheableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_anyType p_animationBehavior]
  (let [ l_anyType (volatile! p_anyType) l_animationBehavior (volatile! p_animationBehavior)]
        (AdjustedImageArrayRotationAnimation/jinit_6 this (JR/invoke @l_anyType :jm_getImageArray_0) (JR/invoke @l_anyType :jm_getAngleInfoP_0) (JR/invoke @l_anyType :jm_getTotalAngle_0) (JR/invoke @l_anyType :jm_getDx_0) (JR/invoke @l_anyType :jm_getDy_0) @l_animationBehavior) (jinitfields this))
  this)

(defn jnew_2 [p_anyType p_animationBehavior ]
  (let [o (JR/alloc 'ImageArrayRotationAnimationCacheable)] (jinit_2 o p_anyType p_animationBehavior) o))

    
(defn jm_getKey_0 [this]
  (let []
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))



