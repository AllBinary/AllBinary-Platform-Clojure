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

(ns AdjustedVectorAnimation)

(JR/register 'AdjustedVectorAnimation 'VectorAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_5 [this p_currentPoints p_basicColor p_dx p_dy p_animationBehavior]
  (let [ l_currentPoints (volatile! p_currentPoints) l_basicColor (volatile! p_basicColor) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehavior (volatile! p_animationBehavior)]
        (VectorAnimation/jinit_3 this @l_currentPoints @l_basicColor @l_animationBehavior) (jinitfields this)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_5 [p_currentPoints p_basicColor p_dx p_dy p_animationBehavior ]
  (let [o (JR/alloc 'AdjustedVectorAnimation)] (jinit_5 o p_currentPoints p_basicColor p_dx p_dy p_animationBehavior) o))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke-super 'VectorAnimation this :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add @l_y (JR/fget this :dy))))))



