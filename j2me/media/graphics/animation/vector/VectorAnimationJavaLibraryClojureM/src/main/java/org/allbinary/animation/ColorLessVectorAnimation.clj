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
;; package org.allbinary.animation

(ns ColorLessVectorAnimation)

(JR/register 'ColorLessVectorAnimation 'VectorAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_currentPoints p_animationBehavior]
  (let [ l_currentPoints (volatile! p_currentPoints) l_animationBehavior (volatile! p_animationBehavior)]
        (VectorAnimation/jinit_3 this @l_currentPoints (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE) @l_animationBehavior) (jinitfields this))
  this)

(defn jnew_2 [p_currentPoints p_animationBehavior ]
  (let [o (JR/alloc 'ColorLessVectorAnimation)] (jinit_2 o p_currentPoints p_animationBehavior) o))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke this :jm_paintVectors_3 @l_graphics @l_x @l_y)))



