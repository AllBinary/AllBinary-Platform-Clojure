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

(ns OneRowSpriteIndexedAnimationFactory)

(JR/register 'OneRowSpriteIndexedAnimationFactory 'BaseImageAnimationFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationFactorySpriteScaleUtil nil)
    (JR/fset this :animationFactorySpriteScaleUtil (JR/scall 'AnimationFactorySpriteScaleUtil :jm_getInstance_0))
  this)

    
(defn jm_createFactoryDX_3 [p_image p_dx p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_oneRowSpriteIndexedAnimationFactory (volatile! nil)]
        (vreset! l_oneRowSpriteIndexedAnimationFactory (OneRowSpriteIndexedAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/invoke @l_image :jm_getHeight_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 @l_animationBehaviorFactory))
        (JR/invoke @l_oneRowSpriteIndexedAnimationFactory :jm_initW_1 @l_dx)
        @l_oneRowSpriteIndexedAnimationFactory))

    
(defn jm_createFactoryDXY_4 [p_image p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_oneRowSpriteIndexedAnimationFactory (volatile! nil)]
        (vreset! l_oneRowSpriteIndexedAnimationFactory (OneRowSpriteIndexedAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/invoke @l_image :jm_getHeight_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 @l_animationBehaviorFactory))
        (JR/invoke @l_oneRowSpriteIndexedAnimationFactory :jm_init_2 @l_dx @l_dy)
        @l_oneRowSpriteIndexedAnimationFactory))

    
(defn jm_createFactoryWH_4 [p_image p_width p_height p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (OneRowSpriteIndexedAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height 0 0 @l_animationBehaviorFactory)))

    
(defn jm_createFactory_2 [p_image p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (OneRowSpriteIndexedAnimationFactory/jnew_7 @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) (JR/invoke @l_image :jm_getHeight_0) (JR/invoke @l_image :jm_getHeight_0) 0 0 @l_animationBehaviorFactory)))

    
(defn jinit_7 [this p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_sequenceArray (volatile! p_sequenceArray) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image @l_sequenceArray @l_width @l_height @l_dx @l_dy @l_animationBehaviorFactory) (jinitfields this))
  this)

(defn jnew_7 [p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory ]
  (let [o (JR/alloc 'OneRowSpriteIndexedAnimationFactory)] (jinit_7 o p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory) o))

    
(defn jm_init_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx @l_dx)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy @l_dy)))

    
(defn jm_initW_1 [this p_dx]
  (let [ l_dx (volatile! p_dx)]
        (JR/invoke this :jm_init_2 @l_dx 0)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx (unchecked-int (unchecked-add (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) 2)))))))))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_sprite (volatile! nil)]
        (vreset! l_sprite (JR/invoke (JR/fget this :animationFactorySpriteScaleUtil) :jm_createImage_5 (JR/invoke this :jm_getImage_0) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (AdjustedSpriteIndexedAnimation/jnew_6 @l_sprite (JR/invoke this :jm_getImage_0) (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ZERO_ARRAY) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (SpriteIndexedAnimation/jnew_4 @l_sprite (JR/invoke this :jm_getImage_0) (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ZERO_ARRAY) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))



