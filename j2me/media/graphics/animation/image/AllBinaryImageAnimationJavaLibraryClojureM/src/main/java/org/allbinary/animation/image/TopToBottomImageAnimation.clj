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

(ns TopToBottomImageAnimation)

(JR/register 'TopToBottomImageAnimation 'ImageSegmentAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :currentHeight 0)
  (JR/fset this :anchor 0)
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_3 [this p_image p_sequenceArray p_animationBehavior]
  (let [ l_image (volatile! p_image) l_sequenceArray (volatile! p_sequenceArray) l_animationBehavior (volatile! p_animationBehavior)]
        (ImageSegmentAnimation/jinit_3 this @l_image @l_sequenceArray @l_animationBehavior) (jinitfields this)
        (JR/fset this :currentHeight 0)
        (if (JR/eq (JR/aget* (JR/invoke this :jm_getSequence_0) 0) (unchecked-int (unchecked-negate (JR/c2i 1))))
            (do
            (JR/invoke this :jm_setFrame_1 (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1))))))
  this)

(defn jnew_3 [p_image p_sequenceArray p_animationBehavior ]
  (let [o (JR/alloc 'TopToBottomImageAnimation)] (jinit_3 o p_image p_sequenceArray p_animationBehavior) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        (if (JR/eq (JR/aget* (JR/invoke this :jm_getSequence_0) 0) (unchecked-int (unchecked-negate (JR/c2i 1))))
            (do
            (JR/invoke-super 'ImageSegmentAnimation this :jm_previousFrame_0))
            (do
            (JR/invoke-super 'ImageSegmentAnimation this :jm_nextFrame_0)))
        (JR/invoke this :jm_update_0)))

    
(defn jm_previousFrame_0 [this]
  (let []
        (if (JR/eq (JR/aget* (JR/invoke this :jm_getSequence_0) 0) (unchecked-int (unchecked-negate (JR/c2i 1))))
            (do
            (JR/invoke-super 'ImageSegmentAnimation this :jm_nextFrame_0))
            (do
            (JR/invoke-super 'ImageSegmentAnimation this :jm_previousFrame_0)))
        (JR/invoke this :jm_update_0)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke-super 'ImageSegmentAnimation this :jm_setFrame_1 @l_index)
        (JR/invoke this :jm_update_0)))

    
(defn jm_update_0 [this]
  (let []
        (JR/fset this :currentHeight (JR/idiv (unchecked-int (unchecked-multiply (JR/invoke this :jm_getDrawHeight_0) (JR/invoke this :jm_getFrame_0))) (JR/invoke this :jm_getSize_0)))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_drawRegion_9 (JR/invoke this :jm_getImage_0) (JR/invoke this :jm_getStartX_0) (JR/invoke this :jm_getStartY_0) (JR/invoke this :jm_getDrawWidth_0) (JR/fget this :currentHeight) (JR/sget 'Sprite "TRANS_NONE") @l_x @l_y (JR/fget this :anchor))))



