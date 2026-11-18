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

(ns ImageArraySingletonAnimationInterfaceFactory)

(JR/register 'ImageArraySingletonAnimationInterfaceFactory 'SingletonAnimationInterfaceFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (SingletonAnimationInterfaceFactory/jinit_1 this (ImageArrayAnimation/jnew_2 @l_imageArray (JR/scall 'AnimationBehavior :jm_getInstance_0))) (jinitfields this))
  this)

(defn jnew_1 [p_imageArray ]
  (let [o (JR/alloc 'ImageArraySingletonAnimationInterfaceFactory)] (jinit_1 o p_imageArray) o))



