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

(ns CollidableDamageWeaponBehavior)

(JR/register 'CollidableDamageWeaponBehavior 'CollidableDestroyableDamageableBehavior '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :collided false)
  (JR/fset this :collisionHelper nil)
  this)

    
(defn jinit_1 [this p_collidable]
  (let [ l_collidable (volatile! p_collidable)]
        (CollidableDestroyableDamageableBehavior/jinit_1 this @l_collidable) (jinitfields this)
        (JR/invoke this :jm_setCollided_1 false)
        (JR/invoke this :jm_setCollidable_1 true)
        (JR/fset this :collisionHelper (JR/scall 'CollidableHelperFactory :jm_getInstance_0)))
  this)

(defn jnew_1 [p_collidable ]
  (let [o (JR/alloc 'CollidableDamageWeaponBehavior)] (jinit_1 o p_collidable) o))

    
(defn jm_init_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface)]
        (JR/invoke this :jm_setCollided_1 false)
        (JR/invoke (JR/fget this :collisionHelper) :jm_setOwnerLayerInterface_1 @l_sourceLayerInterface)))

    
(defn jm_isCollision_2 [this p_ownerLayer p_collisionLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collisionLayer (volatile! p_collisionLayer)](JR/method
        (if (JR/invoke (JR/fget this :collisionHelper) :jm_isCollidable_1 @l_collisionLayer)
            (do
            (if (not (JR/eq (JR/aget* (JR/invoke @l_ownerLayer :jm_getGroupInterface_0) 0) (JR/aget* (JR/invoke @l_collisionLayer :jm_getGroupInterface_0) 0)))
                (do
                (JR/jreturn (JR/invoke-super 'CollidableDestroyableDamageableBehavior this :jm_isCollision_2 @l_ownerLayer @l_collisionLayer))))))
        false)))

    
(defn jm_collide_2 [this p_ownerLayer p_collisionLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collisionLayer (volatile! p_collisionLayer)]
        (JR/invoke-super 'CollidableDestroyableDamageableBehavior this :jm_collide_2 @l_ownerLayer @l_collisionLayer)
        (JR/fset this :collided true)))

    
(defn jm_isCollisionInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface) l_layerInterface (volatile! nil)](JR/method
        (if (JR/invoke (JR/fget this :collisionHelper) :jm_isCollidable_1 @l_collidableInterfaceCompositeInterface)
            (do
            (vreset! l_layerInterface @l_collidableInterfaceCompositeInterface)
            (if (not (JR/eq (JR/aget* (JR/invoke @l_ownerLayer :jm_getGroupInterface_0) 0) (JR/aget* (JR/invoke @l_layerInterface :jm_getGroupInterface_0) 0)))
                (do
                (if (JR/invoke (JR/fget this :layerCollisionUtil) :jm_isCollision_2 @l_ownerLayer @l_layerInterface)
                    (do
                    (JR/jreturn true)))))))
        false)))

    
(defn jm_collideInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        (JR/invoke (JR/fget this :damageUtil) :jm_process_2 @l_ownerLayer @l_collidableInterfaceCompositeInterface)
        (JR/fset this :collided true)))

    
(defn jm_getCollisionTypeWith_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/fget (JR/scall 'CollisionTypeFactory :jm_getInstance_0) :COLLISION)))

    
(defn jm_isCollided_0 [this]
  (let []
        (JR/fget this :collided)))

    
(defn jm_setCollided_1 [this p_collided]
  (let [ l_collided (volatile! p_collided)]
        (JR/fset this :collided @l_collided)))



