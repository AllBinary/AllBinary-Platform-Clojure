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
;; package org.allbinary.animation.special

(ns SpecialAnimation)

(JR/register 'SpecialAnimation 'IndexedAnimation '[SpecialAnimationInterface])

(def jsv_NULL_SPECIAL_ANIMATION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_SPECIAL_ANIMATION [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_SPECIAL_ANIMATION)
(defn jstatic_set_NULL_SPECIAL_ANIMATION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_SPECIAL_ANIMATION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_SPECIAL_ANIMATION (SpecialAnimation/jnew_1 (IndexedAnimationBehavior/jnew_2 1 250)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SpecialAnimation/jstatic_NULL_SPECIAL_ANIMATION)))

    
(defn jinit_1 [this p_animationBehavior]
  (let [ l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this))
  this)

(defn jnew_1 [p_animationBehavior ]
  (let [o (JR/alloc 'SpecialAnimation)] (jinit_1 o p_animationBehavior) o))

    
(defn jm_nextFrame_0 [this]
  (let [ l_indexedAnimationBehavior (volatile! nil)]
        (vreset! l_indexedAnimationBehavior (JR/fget this :animationBehaviorP))
        (JR/finc @l_indexedAnimationBehavior :loopIndex 1 :int false)))

    
(defn jm_setLastFrame_0 [this]
  (let []
        nil))

    
(defn jm_isComplete_0 [this]
  (let []
        false))

    
(defn jm_open_0 [this]
  (let []
        nil))

    
(defn jm_close_0 [this]
  (let []
        nil))

    
(defn jm_process_0 [this]
  (let []
        nil))



