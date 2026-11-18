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
;; package org.allbinary.animation.image.sprite

(ns ColorCompositeSpriteIndexedAnimationFactory)

(JR/register 'ColorCompositeSpriteIndexedAnimationFactory 'BaseImageAnimationFactory '[ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationFactorySpriteScaleUtil nil)
  (JR/fset this :basicColorArray nil)
    (JR/fset this :animationFactorySpriteScaleUtil (JR/scall 'AnimationFactorySpriteScaleUtil :jm_getInstance_0))
  this)

    
(defn jinit_5 [this p_image p_basicColorArray p_width p_height p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_basicColorArray (volatile! p_basicColorArray) l_width (volatile! p_width) l_height (volatile! p_height) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height 0 0 @l_animationBehaviorFactory) (jinitfields this)
        (JR/fset this :basicColorArray @l_basicColorArray))
  this)

(defn jnew_5 [p_image p_basicColorArray p_width p_height p_animationBehaviorFactory ]
  (let [o (JR/alloc 'ColorCompositeSpriteIndexedAnimationFactory)] (jinit_5 o p_image p_basicColorArray p_width p_height p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_sprite (volatile! nil)]
        (vreset! l_sprite (JR/invoke (JR/fget this :animationFactorySpriteScaleUtil) :jm_createImage_5 (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (SpriteIndexedAnimation/jnew_4 @l_sprite (JR/invoke this :jm_getImage_0) (JR/fget this :basicColorArray) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/invoke this :jm_getInstance_1 0)))



