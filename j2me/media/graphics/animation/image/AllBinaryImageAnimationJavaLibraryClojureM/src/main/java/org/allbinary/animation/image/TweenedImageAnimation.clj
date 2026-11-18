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

(ns TweenedImageAnimation)

(JR/register 'TweenedImageAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :image nil)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :totalFrames 0)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :anchor 0)
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_5 [this p_image p_dx p_dy p_totalFrames p_animationBehavior]
  (let [ l_image (volatile! p_image) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_totalFrames (volatile! p_totalFrames) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :image @l_image)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy)
        (JR/fset this :totalFrames @l_totalFrames)
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/fget this :totalFrames))))
  this)

(defn jnew_5 [p_image p_dx p_dy p_totalFrames p_animationBehavior ]
  (let [o (JR/alloc 'TweenedImageAnimation)] (jinit_5 o p_image p_dx p_dy p_totalFrames p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_nextFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))

    
(defn jm_previousFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_previous_0)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setIndex_1 @l_index)))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/fget this :totalFrames)))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_frame (volatile! nil) l_currentX (volatile! nil) l_currentY (volatile! nil)]
        (vreset! l_frame (JR/invoke this :jm_getFrame_0))
        (vreset! l_currentX (unchecked-int (unchecked-multiply (JR/fget this :dx) @l_frame)))
        (vreset! l_currentY (unchecked-int (unchecked-multiply (JR/fget this :dy) @l_frame)))
        (JR/invoke @l_graphics :jm_drawImage_4 (JR/fget this :image) (unchecked-int (unchecked-add @l_x @l_currentX)) (unchecked-int (unchecked-add @l_y @l_currentY)) (JR/fget this :anchor))))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/scall 'DisposalUtil :jm_getInstance_0) :jm_disposeImage_1 (JR/fget this :image))))

    
(defn jm_finalize_0 [this]
  (let []
        (JR/invoke (JR/scall 'DisposalUtil :jm_getInstance_0) :jm_disposeImage_1 (JR/fget this :image))))



