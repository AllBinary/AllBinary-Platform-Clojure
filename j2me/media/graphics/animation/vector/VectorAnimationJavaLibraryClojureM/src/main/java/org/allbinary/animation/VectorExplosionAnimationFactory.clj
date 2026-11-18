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
;; package org.allbinary.animation

(ns VectorExplosionAnimationFactory)

(JR/register 'VectorExplosionAnimationFactory nil '[ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :vectorExplosionGenerator nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :animationBehaviorFactory nil)
    (JR/fset this :vectorExplosionGenerator (JR/scall 'VectorExplosionGenerator :jm_getInstance_0))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE))
  this)

    
(defn jinit_2 [this p_basicColor p_animationBehaviorFactory]
  (let [ l_basicColor (volatile! p_basicColor) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor))
  this)

(defn jnew_2 [p_basicColor p_animationBehaviorFactory ]
  (let [o (JR/alloc 'VectorExplosionAnimationFactory)] (jinit_2 o p_basicColor p_animationBehaviorFactory) o))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface) l_vectorRotationAnimationInterface (volatile! nil) l_frame (volatile! nil) l_framePoints (volatile! nil) l_points (volatile! nil)]
        (vreset! l_vectorRotationAnimationInterface @l_animationInterface)
        (vreset! l_frame (JR/invoke @l_vectorRotationAnimationInterface :jm_getFrame_0))
        (vreset! l_framePoints (JR/invoke @l_vectorRotationAnimationInterface :jm_getPoints_1 @l_frame))
        (vreset! l_points (JR/invoke (JR/fget this :vectorExplosionGenerator) :jm_getInstance_3 @l_framePoints 6 (JR/fget (JR/fget this :vectorExplosionGenerator) :ROTATION)))
        (VectorRotationAnimation/jnew_3 @l_points (JR/invoke this :jm_getBasicColorP_0) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))



