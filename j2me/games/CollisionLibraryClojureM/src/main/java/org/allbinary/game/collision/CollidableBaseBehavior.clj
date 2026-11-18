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

(ns CollidableBaseBehavior)

(JR/register 'CollidableBaseBehavior nil '[CollidableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :layerCollisionUtil nil)
  (JR/fset this :collidable false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :layerCollisionUtil (JR/scall 'LayerCollisionUtil :jm_getInstance_0))
    (JR/fset this :collidable true)
  this)

    
(defn jinit_1 [this p_collidable]
  (let [ l_collidable (volatile! p_collidable)]
    nil (jinitfields this)
        (JR/fset this :collidable @l_collidable))
  this)

(defn jnew_1 [p_collidable ]
  (let [o (JR/alloc 'CollidableBaseBehavior)] (jinit_1 o p_collidable) o))

    
(defn jm_update_0 [this]
  (let []
        nil))

    
(defn jm_getName_0 [this]
  (let []
        (JR/class-name this)))

    
(defn jm_setCollidable_1 [this p_collidable]
  (let [ l_collidable (volatile! p_collidable)]
        (JR/fset this :collidable @l_collidable)))

    
(defn jm_isCollidable_1 [this p_ownerLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer)]
        (JR/fget this :collidable)))

    
(defn jm_collide_2 [this p_ownerLayer p_allbinaryCollidableLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_allbinaryCollidableLayer (volatile! p_allbinaryCollidableLayer)]
        (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :COLON_SEP)) :jm_append_1 (JR/class-name this)))))))

    
(defn jm_isCollision_2 [this p_ownerLayer p_collisionLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collisionLayer (volatile! p_collisionLayer)]
        (JR/invoke (JR/fget this :layerCollisionUtil) :jm_isCollision_2 @l_ownerLayer @l_collisionLayer)))

    
(defn jm_isCollisionInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        (JR/invoke (JR/fget this :layerCollisionUtil) :jm_isCollision_2 @l_ownerLayer @l_collidableInterfaceCompositeInterface)))

    
(defn jm_collideInterface_2 [this p_ownerLayer p_collidableInterfaceCompositeInterface]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_paint_2 [this p_ownerLayer p_graphics]
  (let [ l_ownerLayer (volatile! p_ownerLayer) l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getCollisionTypeWith_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/fget (JR/scall 'CollisionTypeFactory :jm_getInstance_0) :NONE)))



