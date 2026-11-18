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
;; package org.allbinary.game.combat.destroy

(ns DestroyableSimpleBehavior)

(JR/register 'DestroyableSimpleBehavior 'DestroyableBaseBehavior '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :ownerLayer nil)
  (JR/fset this :destroyed false)
    (JR/fset this :destroyed false)
  this)

    
(defn jinit_1 [this p_ownerLayer]
  (let [ l_ownerLayer (volatile! p_ownerLayer)]
    (DestroyableBaseBehavior/jinit_0 this) (jinitfields this)
        (JR/fset this :ownerLayer @l_ownerLayer))
  this)

(defn jnew_1 [p_ownerLayer ]
  (let [o (JR/alloc 'DestroyableSimpleBehavior)] (jinit_1 o p_ownerLayer) o))

    
(defn jm_isDestroyed_0 [this]
  (let []
        (JR/fget this :destroyed)))

    
(defn jm_setDestroyed_1 [this p_destroyed]
  (let [ l_destroyed (volatile! p_destroyed)]
        (JR/fset this :destroyed @l_destroyed)
        (if (JR/invoke this :jm_isDestroyed_0)
            (do
            (JR/invoke (JR/scall 'DestroyedLayerProcessor :jm_getInstance_0) :jm_add_1 (JR/fget this :ownerLayer))))))



