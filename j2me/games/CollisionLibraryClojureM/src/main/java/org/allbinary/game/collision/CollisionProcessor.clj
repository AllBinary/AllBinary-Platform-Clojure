;; Generated Code Do Not Modify
;; package org.allbinary.game.collision

(ns CollisionProcessor)

(JR/register 'CollisionProcessor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CollisionProcessor)] (jinit_0 o) o))

    
(defn jm_isCollision_2 [this p_myLayer p_myLayer2]
  (let [ l_myLayer (volatile! p_myLayer) l_myLayer2 (volatile! p_myLayer2)]
        false))



