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

(ns RightToLeftImageAnimation)

(JR/register 'RightToLeftImageAnimation 'ImageSegmentAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :startWidth 0)
  (JR/fset this :currentWidth 0)
  (JR/fset this :anchor 0)
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_2 [this p_image p_animationBehavior]
  (let [ l_image (volatile! p_image) l_animationBehavior (volatile! p_animationBehavior)]
        (ImageSegmentAnimation/jinit_3 this @l_image (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0) @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_setFrame_1 (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1))))
  this)

(defn jnew_2 [p_image p_animationBehavior ]
  (let [o (JR/alloc 'RightToLeftImageAnimation)] (jinit_2 o p_image p_animationBehavior) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        (JR/invoke-super 'ImageSegmentAnimation this :jm_previousFrame_0)
        (JR/invoke this :jm_update_0)))

    
(defn jm_previousFrame_0 [this]
  (let []
        (JR/invoke-super 'ImageSegmentAnimation this :jm_nextFrame_0)
        (JR/invoke this :jm_update_0)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke-super 'ImageSegmentAnimation this :jm_setFrame_1 @l_index)
        (JR/invoke this :jm_update_0)))

    
(defn jm_update_0 [this]
  (let []
        (JR/fset this :startWidth (JR/idiv (unchecked-int (unchecked-multiply (JR/invoke this :jm_getDrawWidth_0) (JR/invoke this :jm_getFrame_0))) (JR/invoke this :jm_getSize_0)))
        (JR/fset this :currentWidth (unchecked-int (unchecked-subtract (JR/invoke this :jm_getDrawWidth_0) (JR/fget this :startWidth))))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_drawRegion_9 (JR/invoke this :jm_getImage_0) (JR/fget this :startWidth) (JR/invoke this :jm_getStartY_0) (JR/fget this :currentWidth) (JR/invoke this :jm_getDrawHeight_0) (JR/sget 'Sprite "TRANS_NONE") (unchecked-int (unchecked-add @l_x (JR/fget this :startWidth))) @l_y (JR/fget this :anchor))))



