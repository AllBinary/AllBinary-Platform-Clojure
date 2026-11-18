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
;; package org.allbinary.game.layer.weapon

(ns SimpleWeaponLayer)

(JR/register 'SimpleWeaponLayer 'WeaponLayer '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_createDestroyed_0 []
  (let [this nil]
        (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_getProcedural_1 (JR/fget (JR/scall 'ExplosionResources :jm_getInstance_0) :THIRD_EXPLOSION_RESOURCE)) :jm_getInstanceAnimation_1 (JR/invoke (JR/scall 'NullIndexedAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))))

    
(defn jinit_8 [this p_name p_remoteInfo p_multiPlayerType p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition]
  (let [ l_name (volatile! p_name) l_remoteInfo (volatile! p_remoteInfo) l_multiPlayerType (volatile! p_multiPlayerType) l_movement (volatile! p_movement) l_animationInterface (volatile! p_animationInterface) l_destroyedAnimationInterface (volatile! p_destroyedAnimationInterface) l_rectangle (volatile! p_rectangle) l_viewPosition (volatile! p_viewPosition)]
        (WeaponLayer/jinit_8 this @l_name @l_remoteInfo @l_multiPlayerType @l_movement @l_animationInterface @l_destroyedAnimationInterface @l_rectangle @l_viewPosition) (jinitfields this)
        (JR/invoke this :jm_setCollidableInferface_1 (CollidableWeaponBehavior/jnew_1 true)))
  this)

(defn jnew_8 [p_name p_remoteInfo p_multiPlayerType p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition ]
  (let [o (JR/alloc 'SimpleWeaponLayer)] (jinit_8 o p_name p_remoteInfo p_multiPlayerType p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition) o))



