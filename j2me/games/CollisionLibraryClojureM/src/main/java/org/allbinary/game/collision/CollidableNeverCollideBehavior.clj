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
;; package org.allbinary.game.collision

(ns CollidableNeverCollideBehavior)

(JR/register 'CollidableNeverCollideBehavior 'CollidableBaseBehavior '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_isCollidable]
  (let [ l_isCollidable (volatile! p_isCollidable)]
        (CollidableBaseBehavior/jinit_1 this @l_isCollidable) (jinitfields this))
  this)

(defn jnew_1 [p_isCollidable ]
  (let [o (JR/alloc 'CollidableNeverCollideBehavior)] (jinit_1 o p_isCollidable) o))

    
(defn jm_isCollision_2 [this p_ownerLayer p_allbinaryCollidableLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_allbinaryCollidableLayer (volatile! p_allbinaryCollidableLayer)]
        false))

    
(defn jm_collide_2 [this p_ownerLayer p_allbinaryCollidableLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_allbinaryCollidableLayer (volatile! p_allbinaryCollidableLayer)]
        nil))

    
(defn jm_collideInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        nil))

    
(defn jm_isCollisionInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        false))



