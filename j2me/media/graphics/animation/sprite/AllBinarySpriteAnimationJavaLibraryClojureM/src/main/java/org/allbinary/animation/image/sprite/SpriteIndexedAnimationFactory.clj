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

(ns SpriteIndexedAnimationFactory)

(JR/register 'SpriteIndexedAnimationFactory 'BaseImageAnimationFactory '[ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationFactorySpriteScaleUtil nil)
  (JR/fset this :basicColorArray nil)
    (JR/fset this :animationFactorySpriteScaleUtil (JR/scall 'AnimationFactorySpriteScaleUtil :jm_getInstance_0))
    (JR/fset this :basicColorArray (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ZERO_ARRAY))
  this)

    
(defn jm_createCWHDXY_7 [p_image p_basicColorArray p_width p_height p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_basicColorArray (volatile! p_basicColorArray) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (SpriteIndexedAnimationFactory/jnew_8 @l_image @l_basicColorArray (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height @l_dx @l_dy @l_animationBehaviorFactory)))

    
(defn jm_createCWH_5 [p_image p_basicColorArray p_width p_height p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_basicColorArray (volatile! p_basicColorArray) l_width (volatile! p_width) l_height (volatile! p_height) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_spriteIndexedAnimationFactory (volatile! nil)]
        (vreset! l_spriteIndexedAnimationFactory (SpriteIndexedAnimationFactory/jnew_8 @l_image @l_basicColorArray (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height 0 0 @l_animationBehaviorFactory))
        (JR/invoke @l_spriteIndexedAnimationFactory :jm_initHWH_0)
        @l_spriteIndexedAnimationFactory))

    
(defn jm_createWH_4 [p_image p_width p_height p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (SpriteIndexedAnimationFactory/jnew_8 @l_image (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ZERO_ARRAY) (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height 0 0 @l_animationBehaviorFactory)))

    
(defn jinit_8 [this p_image p_basicColorArray p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_basicColorArray (volatile! p_basicColorArray) l_sequenceArray (volatile! p_sequenceArray) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image @l_sequenceArray @l_width @l_height @l_dx @l_dy @l_animationBehaviorFactory) (jinitfields this)
        (JR/fset this :basicColorArray @l_basicColorArray))
  this)

(defn jnew_8 [p_image p_basicColorArray p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory ]
  (let [o (JR/alloc 'SpriteIndexedAnimationFactory)] (jinit_8 o p_image p_basicColorArray p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory) o))

    
(defn jm_initHWH_0 [this]
  (let []
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) 2)))))
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) 2)))))
        (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
            (do
            (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx (unchecked-int (unchecked-add (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 3)))))))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_sprite (volatile! nil)]
        (vreset! l_sprite (JR/invoke (JR/fget this :animationFactorySpriteScaleUtil) :jm_createImage_5 (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (AdjustedSpriteIndexedAnimation/jnew_6 @l_sprite (JR/invoke this :jm_getImage_0) (JR/fget this :basicColorArray) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (SpriteIndexedAnimation/jnew_4 @l_sprite (JR/invoke this :jm_getImage_0) (JR/fget this :basicColorArray) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/invoke this :jm_getInstance_1 0)))



