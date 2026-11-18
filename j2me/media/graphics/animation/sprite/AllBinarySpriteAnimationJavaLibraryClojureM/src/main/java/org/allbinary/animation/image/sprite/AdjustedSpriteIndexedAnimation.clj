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
;; package org.allbinary.animation.image.sprite

(ns AdjustedSpriteIndexedAnimation)

(JR/register 'AdjustedSpriteIndexedAnimation 'SpriteIndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_6 [this p_sprite p_image p_basicColorArray p_dx p_dy p_animationBehavior]
  (let [ l_sprite (volatile! p_sprite) l_image (volatile! p_image) l_basicColorArray (volatile! p_basicColorArray) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehavior (volatile! p_animationBehavior)]
        (SpriteIndexedAnimation/jinit_4 this @l_sprite @l_image @l_basicColorArray @l_animationBehavior) (jinitfields this)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_6 [p_sprite p_image p_basicColorArray p_dx p_dy p_animationBehavior ]
  (let [o (JR/alloc 'AdjustedSpriteIndexedAnimation)] (jinit_6 o p_sprite p_image p_basicColorArray p_dx p_dy p_animationBehavior) o))

    
(defn jm_paintFrame_4 [this p_graphics p_frame p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_frame (volatile! p_frame) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke this :jm_setFrame_1 @l_frame)
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add @l_y (JR/fget this :dy))))
        (JR/invoke-super 'SpriteIndexedAnimation this :jm_paint_1 @l_graphics)))

    
(defn jm_paintXY_3 [this p_g p_x p_y]
  (let [ l_g (volatile! p_g) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add @l_y (JR/fget this :dy))))
        (JR/invoke-super 'SpriteIndexedAnimation this :jm_paint_1 @l_g)))

    
(defn jm_paint_1 [this p_g]
  (let [ l_g (volatile! p_g)]
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 (JR/fget this :dx) (JR/fget this :dy))
        (JR/invoke-super 'SpriteIndexedAnimation this :jm_paint_1 @l_g)))



