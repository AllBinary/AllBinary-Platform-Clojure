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

(ns AllBinarySpriteRotationAnimationFactory)

(JR/register 'AllBinarySpriteRotationAnimationFactory 'BaseImageAnimationFactory '[ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationFactorySpriteScaleUtil nil)
    (JR/fset this :animationFactorySpriteScaleUtil (JR/scall 'AnimationFactorySpriteScaleUtil :jm_getInstance_0))
  this)

    
(defn jm_createWHDY_4 [p_image p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_spriteRotationAnimationFactory (volatile! nil)]
        (vreset! l_spriteRotationAnimationFactory (AllBinarySpriteRotationAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2) (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2) 0 0 @l_animationBehaviorFactory))
        (JR/invoke @l_spriteRotationAnimationFactory :jm_initWH_2 @l_dx @l_dy)
        @l_spriteRotationAnimationFactory))

    
(defn jm_createWH_2 [p_image p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (AllBinarySpriteRotationAnimationFactory/jm_createWHDY_4 @l_image 0 0 @l_animationBehaviorFactory)))

    
(defn jm_createDXY_4 [p_image p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_spriteRotationAnimationFactory (volatile! nil)]
        (vreset! l_spriteRotationAnimationFactory (AllBinarySpriteRotationAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/invoke @l_image :jm_getHeight_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 @l_animationBehaviorFactory))
        (JR/invoke @l_spriteRotationAnimationFactory :jm_init_2 @l_dx @l_dy)
        @l_spriteRotationAnimationFactory))

    
(defn jm_createDXYQ_4 [p_image p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_spriteRotationAnimationFactory (volatile! nil)]
        (vreset! l_spriteRotationAnimationFactory (AllBinarySpriteRotationAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2) (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2) 0 0 @l_animationBehaviorFactory))
        (JR/invoke @l_spriteRotationAnimationFactory :jm_init_2 @l_dx @l_dy)
        @l_spriteRotationAnimationFactory))

    
(defn jm_createQ_2 [p_image p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (AllBinarySpriteRotationAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2) (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2) 0 0 @l_animationBehaviorFactory)))

    
(defn jm_createWHF_2 [p_image p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (AllBinarySpriteRotationAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/invoke @l_image :jm_getHeight_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 @l_animationBehaviorFactory)))

    
(defn jinit_7 [this p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_sequenceArray (volatile! p_sequenceArray) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image @l_sequenceArray @l_width @l_height @l_dx @l_dy @l_animationBehaviorFactory) (jinitfields this)
        (if (JR/eq @l_animationBehaviorFactory (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0))
            (do
            (JR/scall 'ForcedLogUtil :jm_log_2 "Using default AnimationBehaviorFactory with IndexedAnimationFactory" this))))
  this)

(defn jnew_7 [p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory ]
  (let [o (JR/alloc 'AllBinarySpriteRotationAnimationFactory)] (jinit_7 o p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory) o))

    
(defn jm_init_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx @l_dx)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy @l_dy)))

    
(defn jm_initWH_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/invoke this :jm_init_2 @l_dx @l_dy)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx (unchecked-int (unchecked-add (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/idiv (unchecked-int (unchecked-negate (JR/c2i (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width)))) 5))))
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy (unchecked-int (unchecked-add (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/idiv (unchecked-int (unchecked-negate (JR/c2i (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height)))) 5))))))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_sprite (volatile! nil)]
        (vreset! l_sprite (JR/invoke (JR/fget this :animationFactorySpriteScaleUtil) :jm_createImage_5 (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (AllBinaryAdjustedSpriteRotationAnimation/jnew_5 @l_sprite (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (AllBinarySpriteRotationAnimation/jnew_3 @l_sprite (JR/invoke this :jm_getImage_0) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/invoke this :jm_getInstance_1 0)))



