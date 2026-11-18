;; Generated Code Do Not Modify
;; package org.allbinary.animation

(ns NullIndexedAnimation)

(JR/register 'NullIndexedAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_animationBehavior]
  (let [ l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this))
  this)

(defn jnew_1 [p_animationBehavior ]
  (let [o (JR/alloc 'NullIndexedAnimation)] (jinit_1 o p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        0))



