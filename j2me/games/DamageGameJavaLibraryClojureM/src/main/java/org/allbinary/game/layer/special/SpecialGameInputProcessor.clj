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

(ns SpecialGameInputProcessor)

(JR/register 'SpecialGameInputProcessor 'GameInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :collidableDestroyableDamageableLayer nil)
  this)

    
(defn jinit_1 [this p_collidableDestroyableDamageableLayer]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer)]
    (GameInputProcessor/jinit_0 this) (jinitfields this)
        (JR/fset this :collidableDestroyableDamageableLayer @l_collidableDestroyableDamageableLayer))
  this)

(defn jnew_1 [p_collidableDestroyableDamageableLayer ]
  (let [o (JR/alloc 'SpecialGameInputProcessor)] (jinit_1 o p_collidableDestroyableDamageableLayer) o))



