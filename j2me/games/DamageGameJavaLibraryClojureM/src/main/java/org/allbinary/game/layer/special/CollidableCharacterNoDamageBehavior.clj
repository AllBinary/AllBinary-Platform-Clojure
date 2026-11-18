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
;; package org.allbinary.game.layer.special

(ns CollidableCharacterNoDamageBehavior)

(JR/register 'CollidableCharacterNoDamageBehavior 'CollidableDestroyableDamageableBehavior '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_collidable]
  (let [ l_collidable (volatile! p_collidable)]
        (CollidableDestroyableDamageableBehavior/jinit_1 this @l_collidable) (jinitfields this))
  this)

(defn jnew_1 [p_collidable ]
  (let [o (JR/alloc 'CollidableCharacterNoDamageBehavior)] (jinit_1 o p_collidable) o))

    
(defn jm_collide_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface) l_collisionTypeFactory (volatile! nil) l_collisionType (volatile! nil) l_collidableDestroyableDamageableLayer (volatile! nil)]
        (vreset! l_collisionTypeFactory (JR/scall 'CollisionTypeFactory :jm_getInstance_0))
        (vreset! l_collisionType (JR/invoke (JR/invoke @l_collidableInterfaceCompositeInterface :jm_getCollidableInferface_0) :jm_getCollisionTypeWith_1 @l_ownerLayer))
        (if (JR/eq @l_collisionType (JR/fget @l_collisionTypeFactory :PICKUP))
            (do
            (vreset! l_collidableDestroyableDamageableLayer @l_ownerLayer)
            (JR/invoke (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getPickupBehavior_0) :jm_doPickupLayer_1 @l_collidableInterfaceCompositeInterface))
            (do
            nil))))

    
(defn jm_collideInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)))



