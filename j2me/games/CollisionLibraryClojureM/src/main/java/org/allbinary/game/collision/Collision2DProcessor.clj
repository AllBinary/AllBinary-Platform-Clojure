;; Generated Code Do Not Modify
;; package org.allbinary.game.collision

(ns Collision2DProcessor)

(JR/register 'Collision2DProcessor 'CollisionProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (CollisionProcessor/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'Collision2DProcessor)] (jinit_0 o) o))

    
(defn jm_isCollision_2 [this p_myLayer p_myLayer2]
  (let [ l_myLayer (volatile! p_myLayer) l_myLayer2 (volatile! p_myLayer2)]
        (if (or (or (or (>= (JR/invoke @l_myLayer2 :jm_getXP_0) (JR/invoke @l_myLayer :jm_getX2_0)) (>= (JR/invoke @l_myLayer2 :jm_getYP_0) (JR/invoke @l_myLayer :jm_getY2_0))) (<= (JR/invoke @l_myLayer2 :jm_getX2_0) (JR/invoke @l_myLayer :jm_getXP_0))) (<= (JR/invoke @l_myLayer2 :jm_getY2_0) (JR/invoke @l_myLayer :jm_getYP_0)))
            (do
            false)
            (do
            true))))



