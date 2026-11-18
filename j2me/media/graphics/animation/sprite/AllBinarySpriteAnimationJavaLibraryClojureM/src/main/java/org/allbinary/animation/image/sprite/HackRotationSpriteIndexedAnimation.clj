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

(ns HackRotationSpriteIndexedAnimation)

(JR/register 'HackRotationSpriteIndexedAnimation 'RotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :sprite nil)
  (JR/fset this :image nil)
  this)

    
(defn jinit_4 [this p_sprite p_image p_angleInfo p_animationBehavior]
  (let [ l_sprite (volatile! p_sprite) l_image (volatile! p_image) l_angleInfo (volatile! p_angleInfo) l_animationBehavior (volatile! p_animationBehavior)]
        (RotationAnimation/jinit_3 this @l_angleInfo (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/idiv 360 (JR/invoke (JR/invoke @l_angleInfo :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0))) @l_animationBehavior) (jinitfields this)
        (JR/fset this :sprite @l_sprite)
        (JR/fset this :image @l_image))
  this)

(defn jnew_4 [p_sprite p_image p_angleInfo p_animationBehavior ]
  (let [o (JR/alloc 'HackRotationSpriteIndexedAnimation)] (jinit_4 o p_sprite p_image p_angleInfo p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_paintFrame_4 [this p_g p_frame p_x p_y]
  (let [ l_g (volatile! p_g) l_frame (volatile! p_frame) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke this :jm_setFrame_1 @l_frame)
        (JR/invoke this :jm_paintXY_3 @l_g @l_x @l_y)))

    
(defn jm_paintXY_3 [this p_g p_x p_y]
  (let [ l_g (volatile! p_g) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 @l_x @l_y)
        (JR/invoke this :jm_paint_1 @l_g)))

    
(defn jm_paint_1 [this p_g]
  (let [ l_g (volatile! p_g)]
        (JR/invoke (JR/fget this :sprite) :jm_paint_1 @l_g)))

    
(defn jm_nextRotation_0 [this]
  (let []
        (JR/invoke (JR/fget this :sprite) :jm_nextFrame_0)))

    
(defn jm_previousRotation_0 [this]
  (let []
        (JR/invoke (JR/fget this :sprite) :jm_prevFrame_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :sprite) :jm_getRawFrameCount_0)))

    
(defn jm_setFrame_1 [this p_frame]
  (let [ l_frame (volatile! p_frame)]
        (JR/invoke (JR/fget this :sprite) :jm_setFrame_1 @l_frame)))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :sprite) :jm_getFrame_0)))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))



