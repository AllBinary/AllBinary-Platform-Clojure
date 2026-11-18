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

(ns CollidableDestroyableDamageableBehavior)

(JR/register 'CollidableDestroyableDamageableBehavior 'CollidableBaseBehavior '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :damageUtil nil)
    (JR/fset this :damageUtil (JR/scall 'DamageUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_collidable]
  (let [ l_collidable (volatile! p_collidable)]
        (CollidableBaseBehavior/jinit_1 this @l_collidable) (jinitfields this))
  this)

(defn jnew_1 [p_collidable ]
  (let [o (JR/alloc 'CollidableDestroyableDamageableBehavior)] (jinit_1 o p_collidable) o))

    
(defn jm_isCollision_2 [this p_ownerLayer p_collisionLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collisionLayer (volatile! p_collisionLayer)](JR/method
        (if (not (JR/eq (JR/aget* (JR/invoke @l_ownerLayer :jm_getGroupInterface_0) 0) (JR/aget* (JR/invoke @l_collisionLayer :jm_getGroupInterface_0) 0)))
            (do
            (JR/jreturn (JR/invoke-super 'CollidableBaseBehavior this :jm_isCollision_2 @l_ownerLayer @l_collisionLayer))))
        false)))

    
(defn jm_collide_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface) l_ownerCollidableDestroyableDamageableLayer (volatile! nil) l_collidableDestroyableDamageableLayer (volatile! nil)]
        (vreset! l_ownerCollidableDestroyableDamageableLayer @l_ownerLayer)
        (vreset! l_collidableDestroyableDamageableLayer @l_collidableInterfaceCompositeInterface)
        (JR/invoke @l_ownerCollidableDestroyableDamageableLayer :jm_damage_2 (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getDamage_1 0) 0)))

    
(defn jm_isCollisionInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        (JR/scall 'ForcedLogUtil :jm_log_2 "No Longer Used" this)
        false))

    
(defn jm_collideInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        (JR/scall 'ForcedLogUtil :jm_log_2 "No Longer Used" this)))



