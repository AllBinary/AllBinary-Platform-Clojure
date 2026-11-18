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
;; package org.allbinary.animation.image

(ns ImageAnimationFactory)

(JR/register 'ImageAnimationFactory 'BaseImageAnimationFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_createFactory_1 [p_image]
  (let [this nil l_image (volatile! p_image)]
        (ImageAnimationFactory/jnew_6 @l_image (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0))))

    
(defn jinit_6 [this p_image p_width p_height p_dx p_dy p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height @l_dx @l_dy @l_animationBehaviorFactory) (jinitfields this))
  this)

(defn jnew_6 [p_image p_width p_height p_dx p_dy p_animationBehaviorFactory ]
  (let [o (JR/alloc 'ImageAnimationFactory)] (jinit_6 o p_image p_width p_height p_dx p_dy p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_scaledImage (volatile! nil) l_openGLUtil (volatile! nil)]
        (vreset! l_scaledImage (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_createImage_5 (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (vreset! l_openGLUtil (JR/scall 'OpenGLUtil :jm_getInstance_0))
        (vreset! l_scaledImage (JR/invoke @l_openGLUtil :jm_addImage_1 @l_scaledImage))
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_processAdjust_1 this)
            (AdjustedImageAnimation/jnew_4 @l_scaledImage (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (ImageAnimation/jnew_2 @l_scaledImage (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))



