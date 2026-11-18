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

(ns ImageArrayAnimationFactory)

(JR/register 'ImageArrayAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :imageArray nil)
  (JR/fset this :animationBehaviorFactory nil)
    (JR/fset this :dx 0)
    (JR/fset this :dy 0)
  this)

    
(defn jinit_4 [this p_imageArray p_dx p_dy p_animationBehaviorFactory]
  (let [ l_imageArray (volatile! p_imageArray) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (JR/fset this :imageArray @l_imageArray)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_4 [p_imageArray p_dx p_dy p_animationBehaviorFactory ]
  (let [o (JR/alloc 'ImageArrayAnimationFactory)] (jinit_4 o p_imageArray p_dx p_dy p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (if (or (not (== (JR/fget this :dx) 0)) (not (== (JR/fget this :dy) 0)))
            (do
            (AdjustedImageArrayAnimation/jnew_4 (JR/fget this :imageArray) (JR/fget this :dx) (JR/fget this :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
            (do
            (ImageArrayAnimation/jnew_2 (JR/fget this :imageArray) (JR/scall 'AnimationBehavior :jm_getInstance_0))))))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



