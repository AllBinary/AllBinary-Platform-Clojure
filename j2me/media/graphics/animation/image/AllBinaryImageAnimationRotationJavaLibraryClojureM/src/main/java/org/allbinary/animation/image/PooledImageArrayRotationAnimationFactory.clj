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

;;TWB - Adjustments should be done in the resource creation and not at the animation level
(ns PooledImageArrayRotationAnimationFactory)

(JR/register 'PooledImageArrayRotationAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :allBinaryImageRotationAnimationInfo nil)
  (JR/fset this :animationBehaviorFactory nil)
    (JR/fset this :allBinaryImageRotationAnimationInfo (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
  this)

    
(defn jm_createFactory_2 [p_image p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_totalAngle (volatile! nil) l_angleIncrement (volatile! nil)]
        (vreset! l_totalAngle (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE))
        (vreset! l_angleIncrement (JR/idiv @l_totalAngle (JR/invoke (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :jm_getGameControlFidelity_0)))
        (PooledImageArrayRotationAnimationFactory/jnew_7 @l_image (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/invoke @l_image :jm_getWidth_0) 2)))) (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/invoke @l_image :jm_getHeight_0) 2)))) @l_angleIncrement @l_animationBehaviorFactory)))

    
(defn jm_createDXY_4 [p_image p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_totalAngle (volatile! nil) l_angleIncrement (volatile! nil)]
        (vreset! l_totalAngle (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE))
        (vreset! l_angleIncrement (JR/idiv @l_totalAngle (JR/invoke (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :jm_getGameControlFidelity_0)))
        (PooledImageArrayRotationAnimationFactory/jnew_7 @l_image (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0) @l_dx @l_dy @l_angleIncrement @l_animationBehaviorFactory)))

    
(defn jinit_7 [this p_image p_width p_height p_dx p_dy p_angleIncrement p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_angleIncrement (volatile! p_angleIncrement) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_totalAngle (volatile! nil) l_imageArray (volatile! nil)]
    nil (jinitfields this)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory)
        (vreset! l_totalAngle (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE))
        (vreset! l_imageArray (JR/invoke (JR/scall 'ImageToRotationImageArrayUtil :jm_getInstance_0) :jm_generate_3 @l_image @l_angleIncrement @l_totalAngle))
        (JR/fset this :allBinaryImageRotationAnimationInfo (ImageArrayRotationAnimationInfo/jnew_5 @l_imageArray @l_angleIncrement @l_totalAngle @l_dx @l_dy)))
  this)

(defn jnew_7 [p_image p_width p_height p_dx p_dy p_angleIncrement p_animationBehaviorFactory ]
  (let [o (JR/alloc 'PooledImageArrayRotationAnimationFactory)] (jinit_7 o p_image p_width p_height p_dx p_dy p_angleIncrement p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (JR/scall 'AdjustedImageArrayRotationAnimation :jm_createAdjustedImageArrayRotationAnimationInfo_2 (JR/fget this :allBinaryImageRotationAnimationInfo) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



