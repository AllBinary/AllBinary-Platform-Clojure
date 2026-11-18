;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.animation.text

(ns AdjustCustomTextAnimation)

(JR/register 'AdjustCustomTextAnimation 'CustomTextAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_5 [this p_text p_fontSize p_dx p_dy p_animationBehavior]
  (let [ l_text (volatile! p_text) l_fontSize (volatile! p_fontSize) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehavior (volatile! p_animationBehavior)]
        (CustomTextAnimation/jinit_3 this @l_text @l_fontSize @l_animationBehavior) (jinitfields this)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_5 [p_text p_fontSize p_dx p_dy p_animationBehavior ]
  (let [o (JR/alloc 'AdjustCustomTextAnimation)] (jinit_5 o p_text p_fontSize p_dx p_dy p_animationBehavior) o))

    
(defn jm_getDx_0 [this]
  (let []
        (JR/fget this :dx)))

    
(defn jm_setDx_1 [this p_dx]
  (let [ l_dx (volatile! p_dx)]
        (JR/fset this :dx @l_dx)))

    
(defn jm_getDy_0 [this]
  (let []
        (JR/fget this :dy)))

    
(defn jm_setDy_1 [this p_dy]
  (let [ l_dy (volatile! p_dy)]
        (JR/fset this :dy @l_dy)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke-super 'CustomTextAnimation this :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add @l_y (JR/fget this :dy))))))



