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

(ns BottomToTopImageAnimationFactory)

(JR/register 'BottomToTopImageAnimationFactory 'BaseImageAnimationFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_image p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 @l_animationBehaviorFactory) (jinitfields this))
  this)

(defn jnew_2 [p_image p_animationBehaviorFactory ]
  (let [o (JR/alloc 'BottomToTopImageAnimationFactory)] (jinit_2 o p_image p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_scaledImage (volatile! nil)]
        (vreset! l_scaledImage (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_createImage_5 (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (BottomToTopImageAnimation/jnew_2 @l_scaledImage (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))



