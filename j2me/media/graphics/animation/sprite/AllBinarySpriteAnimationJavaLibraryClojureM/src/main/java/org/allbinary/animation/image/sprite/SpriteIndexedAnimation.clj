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

(ns SpriteIndexedAnimation)

(JR/register 'SpriteIndexedAnimation 'IndexedAnimation '[ColorCompositeInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :sprite nil)
  (JR/fset this :image nil)
  (JR/fset this :basicColorArray nil)
  this)

    
(defn jinit_4 [this p_sprite p_image p_basicColorArray p_animationBehavior]
  (let [ l_sprite (volatile! p_sprite) l_image (volatile! p_image) l_basicColorArray (volatile! p_basicColorArray) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :sprite @l_sprite)
        (JR/fset this :image @l_image)
        (JR/fset this :basicColorArray @l_basicColorArray)
        (if (and (not (== (JR/alen (JR/fget this :basicColorArray)) 0)) (not (== (JR/invoke this :jm_getSize_0) (JR/alen (JR/fget this :basicColorArray)))))
            (do
            (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :TOTAL_LABEL)) :jm_appendint_1 (JR/invoke this :jm_getSize_0)) :jm_append_1 "!=") :jm_appendint_1 (JR/alen (JR/fget this :basicColorArray)))))))))
  this)

(defn jnew_4 [p_sprite p_image p_basicColorArray p_animationBehavior ]
  (let [o (JR/alloc 'SpriteIndexedAnimation)] (jinit_4 o p_sprite p_image p_basicColorArray p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor) l_index (volatile! nil)]
        (do (vreset! l_index 0)
            (JR/jfor true false (< @l_index (JR/alen (JR/fget this :basicColorArray))) (do (JR/vinc l_index 1 :int false))
            (if (JR/eq @l_basicColor (JR/aget* (JR/fget this :basicColorArray) @l_index))
                (do
                (JR/invoke this :jm_setFrame_1 @l_index)
                (JR/jbreak)))))))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (if (< (JR/alen (JR/fget this :basicColorArray)) (JR/invoke this :jm_getFrame_0))
            (do
            (JR/aget* (JR/fget this :basicColorArray) (JR/invoke this :jm_getFrame_0)))
            (do
            (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))

    
(defn jm_paintFrame_4 [this p_graphics p_frame p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_frame (volatile! p_frame) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke this :jm_setFrame_1 @l_frame)
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 @l_x @l_y)
        (JR/invoke (JR/fget this :sprite) :jm_paint_1 @l_graphics)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :sprite) :jm_setPosition_2 @l_x @l_y)
        (JR/invoke (JR/fget this :sprite) :jm_paint_1 @l_graphics)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :sprite) :jm_paint_1 @l_graphics)))

    
(defn jm_nextFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :sprite) :jm_nextFrame_0)))

    
(defn jm_previousFrame_0 [this]
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

    
(defn jm_isLastFrame_0 [this]
  (let []
        (if (JR/eq (JR/invoke (JR/fget this :sprite) :jm_getFrame_0) (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1)))
            (do
            true)
            (do
            false))))

    
(defn jm_getLastFrame_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_close_0 [this]
  (let []
        nil))

    
(defn jm_finalize_0 [this]
  (let []
        nil))



