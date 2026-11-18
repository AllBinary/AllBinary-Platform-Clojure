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

(ns CollisionHelper)

(JR/register 'CollisionHelper nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :sourceLayerInterface nil)
  this)

    
(defn jinit_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface)]
    nil (jinitfields this)
        (JR/fset this :sourceLayerInterface @l_sourceLayerInterface))
  this)

(defn jnew_1 [p_sourceLayerInterface ]
  (let [o (JR/alloc 'CollisionHelper)] (jinit_1 o p_sourceLayerInterface) o))

    
(defn jm_isCollidable_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        true))

    
(defn jm_getOwnerLayerInterface_0 [this]
  (let []
        (JR/fget this :sourceLayerInterface)))

    
(defn jm_setOwnerLayerInterface_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface)]
        (JR/fset this :sourceLayerInterface @l_sourceLayerInterface)))



