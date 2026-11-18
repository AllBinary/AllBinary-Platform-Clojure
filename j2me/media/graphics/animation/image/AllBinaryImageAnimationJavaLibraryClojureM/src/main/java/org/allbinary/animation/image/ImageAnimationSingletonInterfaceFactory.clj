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

(ns ImageAnimationSingletonInterfaceFactory)

(JR/register 'ImageAnimationSingletonInterfaceFactory 'SingletonAnimationInterfaceFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_3 [this p_animationInterface p_width p_height]
  (let [ l_animationInterface (volatile! p_animationInterface) l_width (volatile! p_width) l_height (volatile! p_height)]
        (SingletonAnimationInterfaceFactory/jinit_1 this (ImageAnimation/jnew_2 (JR/invoke (JR/scall 'AnimationFrameToImageUtil :jm_getInstance_0) :jm_getInstanceWH_3 @l_width @l_height @l_animationInterface) (JR/scall 'AnimationBehavior :jm_getInstance_0))) (jinitfields this))
  this)

(defn jnew_3 [p_animationInterface p_width p_height ]
  (let [o (JR/alloc 'ImageAnimationSingletonInterfaceFactory)] (jinit_3 o p_animationInterface p_width p_height) o))



