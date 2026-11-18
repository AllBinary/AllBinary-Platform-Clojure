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

(ns AllBinaryArrayImageRotationAnimationFactory)

(JR/register 'AllBinaryArrayImageRotationAnimationFactory 'BaseImageAnimationFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :imageArray nil)
  (JR/fset this :angleIncrement 0)
    (JR/fset this :imageArray (JR/sget 'NullImage "NULL_IMAGE_ARRAY"))
  this)

    
(defn jm_createFactory_3 [p_image p_dx p_dy]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_arrayImageRotationAnimationFactory (volatile! nil)]
        (vreset! l_arrayImageRotationAnimationFactory (AllBinaryArrayImageRotationAnimationFactory/jnew_5 @l_image (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) (JR/idiv (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/invoke (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :jm_getGameControlFidelity_0)) (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke @l_arrayImageRotationAnimationFactory :jm_initDXY_2 @l_dx @l_dy)
        @l_arrayImageRotationAnimationFactory))

    
(defn jm_createFactoryA_4 [p_image p_dx p_dy p_angleIncrement]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_angleIncrement (volatile! p_angleIncrement) l_arrayImageRotationAnimationFactory (volatile! nil)]
        (vreset! l_arrayImageRotationAnimationFactory (AllBinaryArrayImageRotationAnimationFactory/jnew_5 @l_image (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) @l_angleIncrement (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke @l_arrayImageRotationAnimationFactory :jm_initDXY_2 @l_dx @l_dy)
        @l_arrayImageRotationAnimationFactory))

    
(defn jinit_5 [this p_image p_width p_height p_angleIncrement p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_angleIncrement (volatile! p_angleIncrement) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height 0 0 @l_animationBehaviorFactory) (jinitfields this)
        (JR/fset this :angleIncrement @l_angleIncrement)
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_5 [p_image p_width p_height p_angleIncrement p_animationBehaviorFactory ]
  (let [o (JR/alloc 'AllBinaryArrayImageRotationAnimationFactory)] (jinit_5 o p_image p_width p_height p_angleIncrement p_animationBehaviorFactory) o))

    
(defn jm_init_0 [this]
  (let []
        (JR/invoke this :jm_setImageArray_1 (JR/invoke (JR/scall 'ImageToRotationImageArrayUtil :jm_getInstance_0) :jm_generate_3 (JR/invoke this :jm_getImage_0) (JR/invoke this :jm_getAngleIncrement_0) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE)))))

    
(defn jm_initDXY_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx @l_dx)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy @l_dy)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :originalDx @l_dx)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :originalDy @l_dy)))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_scaledImageArray (volatile! nil) l_size (volatile! nil) l_image (volatile! nil) l_index (volatile! nil)]
        (vreset! l_scaledImageArray (JR/anew "Object" 1 (JR/alen (JR/fget this :imageArray))))
        (vreset! l_size (JR/alen @l_scaledImageArray))
        (vreset! l_image (JR/invoke this :jm_getImage_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_scaledImageArray @l_index (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_createImage_5 @l_image (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))))
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_processAdjust_1 this)
            (AdjustedImageArrayRotationAnimation/jnew_6 @l_scaledImageArray (JR/scall 'AngleInfo :jm_getInstance_1 (JR/i16 (JR/invoke this :jm_getAngleIncrement_0))) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (ImageArrayRotationAnimation/jnew_4 @l_scaledImageArray (JR/scall 'AngleInfo :jm_getInstance_1 (JR/i16 (JR/invoke this :jm_getAngleIncrement_0))) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))

    
(defn jm_setImageArray_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (JR/fset this :imageArray @l_imageArray)))

    
(defn jm_getAngleIncrement_0 [this]
  (let []
        (JR/fget this :angleIncrement)))



