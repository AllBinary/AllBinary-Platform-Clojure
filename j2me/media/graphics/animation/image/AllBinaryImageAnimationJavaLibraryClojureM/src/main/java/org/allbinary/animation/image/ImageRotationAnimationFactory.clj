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

(ns ImageRotationAnimationFactory)

(JR/register 'ImageRotationAnimationFactory 'BaseImageAnimationFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :angleIncrement 0)
  this)

    
(defn jinit_7 [this p_image p_width p_height p_dx p_dy p_angleIncrement p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_angleIncrement (volatile! p_angleIncrement) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jinit_7 this @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_width @l_height 0 0 @l_animationBehaviorFactory) (jinitfields this)
        (JR/fset this :angleIncrement @l_angleIncrement)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx @l_dx)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy @l_dy))
  this)

(defn jnew_7 [p_image p_width p_height p_dx p_dy p_angleIncrement p_animationBehaviorFactory ]
  (let [o (JR/alloc 'ImageRotationAnimationFactory)] (jinit_7 o p_image p_width p_height p_dx p_dy p_angleIncrement p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (if (or (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) 0)) (not (== (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) 0)))
            (do
            (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_processAdjust_1 this)
            (AdjustedImageBaseRotationAnimation/jnew_6 (JR/invoke this :jm_getImage_0) (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget this :angleIncrement)) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dx) (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (ImageBaseRotationAnimation/jnew_4 (JR/invoke this :jm_getImage_0) (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget this :angleIncrement)) (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))))

    
(defn jm_getAngleIncrementP_0 [this]
  (let []
        (JR/fget this :angleIncrement)))



