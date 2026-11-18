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

(ns AllBinaryAdjustedSpriteRotationAnimation)

(JR/register 'AllBinaryAdjustedSpriteRotationAnimation 'AllBinarySpriteRotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_5 [this p_sprite p_image p_dx p_dy p_animationBehavior]
  (let [ l_sprite (volatile! p_sprite) l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehavior (volatile! p_animationBehavior)]
        (AllBinarySpriteRotationAnimation/jinit_3 this @l_sprite @l_image @l_animationBehavior) (jinitfields this)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_5 [p_sprite p_image p_dx p_dy p_animationBehavior ]
  (let [o (JR/alloc 'AllBinaryAdjustedSpriteRotationAnimation)] (jinit_5 o p_sprite p_image p_dx p_dy p_animationBehavior) o))

    
(defn jm_paintXY_3 [this p_g p_x p_y]
  (let [ l_g (volatile! p_g) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add @l_y (JR/fget this :dy))))
        (JR/invoke this :jm_paint_1 @l_g)))



