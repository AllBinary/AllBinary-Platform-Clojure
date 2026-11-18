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

(ns VectorToImageArrayRotationAnimationFactory)

(JR/register 'VectorToImageArrayRotationAnimationFactory 'BaseImageAnimationFactory '[])

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

    
(defn jinit_3 [this p_vectorInfo p_basicColor p_animationBehaviorFactory]
  (let [ l_vectorInfo (volatile! p_vectorInfo) l_basicColor (volatile! p_basicColor) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this (JR/invoke (JR/scall 'AnimationFrameToImageUtil :jm_getInstance_0) :jm_getInstanceTranslate_3 (JR/invoke @l_vectorInfo :jm_getWidth_0) (JR/invoke @l_vectorInfo :jm_getHeight_0) (JR/scall 'VectorAnimation :jm_createVectorAnimation_3 (JR/invoke @l_vectorInfo :jm_getPoints_0) @l_basicColor (JR/invoke @l_animationBehaviorFactory :jm_getOrCreateInstance_0))) (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) 0 0 0 0 @l_animationBehaviorFactory) (jinitfields this)
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_3 [p_vectorInfo p_basicColor p_animationBehaviorFactory ]
  (let [o (JR/alloc 'VectorToImageArrayRotationAnimationFactory)] (jinit_3 o p_vectorInfo p_basicColor p_animationBehaviorFactory) o))

    
(defn jm_init_0 [this]
  (let [ l_angleFactory (volatile! nil)]
        (vreset! l_angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
        (JR/fset this :angleIncrement (JR/idiv (JR/fget @l_angleFactory :TOTAL_ANGLE) (JR/invoke (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :jm_getGameControlFidelity_0)))
        (JR/fset this :imageArray (JR/invoke (JR/scall 'ImageToRotationImageArrayUtil :jm_getInstance_0) :jm_generate_3 (JR/invoke this :jm_getImage_0) (JR/invoke this :jm_getAngleIncrement_0) (JR/fget @l_angleFactory :TOTAL_ANGLE)))))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (AdjustedImageArrayRotationAnimation/jnew_6 (JR/fget this :imageArray) (JR/scall 'AngleInfo :jm_getInstance_1 (JR/i16 (JR/invoke this :jm_getAngleIncrement_0))) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (JR/scall 'AdjustedImageArrayRotationAnimation :jm_createAnimation_4 (JR/fget this :imageArray) (JR/scall 'AngleInfo :jm_getInstance_1 (JR/i16 (JR/fget this :angleIncrement))) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))

    
(defn jm_getAngleIncrement_0 [this]
  (let []
        (JR/fget this :angleIncrement)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



