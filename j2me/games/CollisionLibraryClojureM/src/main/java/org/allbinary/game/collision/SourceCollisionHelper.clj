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

(ns SourceCollisionHelper)

(JR/register 'SourceCollisionHelper 'CollisionHelper '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (CollisionHelper/jinit_1 this @l_layerInterface) (jinitfields this))
  this)

(defn jnew_1 [p_layerInterface ]
  (let [o (JR/alloc 'SourceCollisionHelper)] (jinit_1 o p_layerInterface) o))

    
(defn jm_isCollidable_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)](JR/method
        (if (not (JR/eq (JR/fget this :sourceLayerInterface) @l_layerInterface))
            (do
            (JR/jreturn true)))
        false)))



