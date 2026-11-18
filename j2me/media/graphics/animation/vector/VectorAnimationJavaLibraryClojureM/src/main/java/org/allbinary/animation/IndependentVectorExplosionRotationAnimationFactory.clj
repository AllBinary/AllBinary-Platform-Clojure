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

(ns IndependentVectorExplosionRotationAnimationFactory)

(JR/register 'IndependentVectorExplosionRotationAnimationFactory nil '[ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :framePoints nil)
  (JR/fset this :vectorInfo nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :vectorAnimationFactoryInterface nil)
  (JR/fset this :vectorExplosionGenerator nil)
    (JR/fset this :framePoints (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY_ARRAY))
    (JR/fset this :vectorExplosionGenerator (JR/scall 'VectorExplosionGenerator :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_vectorInfo p_basicColor p_vectorAnimationFactoryInterface]
  (let [ l_vectorInfo (volatile! p_vectorInfo) l_basicColor (volatile! p_basicColor) l_vectorAnimationFactoryInterface (volatile! p_vectorAnimationFactoryInterface)]
    nil (jinitfields this)
        (JR/fset this :vectorInfo @l_vectorInfo)
        (JR/fset this :basicColor @l_basicColor)
        (JR/fset this :vectorAnimationFactoryInterface @l_vectorAnimationFactoryInterface)
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_3 [p_vectorInfo p_basicColor p_vectorAnimationFactoryInterface ]
  (let [o (JR/alloc 'IndependentVectorExplosionRotationAnimationFactory)] (jinit_3 o p_vectorInfo p_basicColor p_vectorAnimationFactoryInterface) o))

    
(defn jm_init_0 [this]
  (let []
        (JR/fset this :framePoints (JR/invoke (JR/scall 'VectorRotationGenerator :jm_getInstance_0) :jm_getInstance_1 (JR/fget this :vectorInfo)))))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface) l_frame (volatile! nil) l_rotationAnimationInterface (volatile! nil) l_points (volatile! nil)]
        (vreset! l_frame 0)
        (if (some? @l_animationInterface)
            (do
            (vreset! l_rotationAnimationInterface @l_animationInterface)
            (vreset! l_frame (JR/invoke @l_rotationAnimationInterface :jm_getFrame_0))))
        (vreset! l_points (JR/invoke (JR/fget this :vectorExplosionGenerator) :jm_getInstance_3 (JR/aget* (JR/fget this :framePoints) @l_frame) 6 (JR/fget (JR/fget this :vectorExplosionGenerator) :ROTATION)))
        (JR/invoke (JR/fget this :vectorAnimationFactoryInterface) :jm_getInstance_2 @l_points (JR/fget this :basicColor))))



