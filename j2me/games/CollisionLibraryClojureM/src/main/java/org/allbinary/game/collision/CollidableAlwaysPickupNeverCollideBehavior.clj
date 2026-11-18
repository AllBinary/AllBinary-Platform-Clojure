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

(ns CollidableAlwaysPickupNeverCollideBehavior)

(JR/register 'CollidableAlwaysPickupNeverCollideBehavior 'CollidableNeverCollideBehavior '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (CollidableNeverCollideBehavior/jinit_1 this true) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CollidableAlwaysPickupNeverCollideBehavior)] (jinit_0 o) o))

    
(defn jm_getCollisionTypeWith_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/fget (JR/scall 'CollisionTypeFactory :jm_getInstance_0) :PICKUP)))



