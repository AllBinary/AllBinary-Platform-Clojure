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
;; package org.allbinary.animation.image

(ns ImageAnimation)

(JR/register 'ImageAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :image nil)
  (JR/fset this :anchor 0)
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_2 [this p_image p_animationBehavior]
  (let [ l_image (volatile! p_image) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :image @l_image))
  this)

(defn jnew_2 [p_image p_animationBehavior ]
  (let [o (JR/alloc 'ImageAnimation)] (jinit_2 o p_image p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_previousFrame_0 [this]
  (let []
        nil))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        nil))

    
(defn jm_getFrame_0 [this]
  (let []
        0))

    
(defn jm_getSize_0 [this]
  (let []
        1))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_drawImage_4 (JR/fget this :image) @l_x @l_y (JR/fget this :anchor))))

    
(defn jm_getImage_0 [this]
  (let []
        (JR/fget this :image)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/scall 'DisposalUtil :jm_getInstance_0) :jm_disposeImage_1 (JR/fget this :image))))

    
(defn jm_finalize_0 [this]
  (let []
        (JR/invoke (JR/scall 'DisposalUtil :jm_getInstance_0) :jm_disposeImage_1 (JR/fget this :image))))



