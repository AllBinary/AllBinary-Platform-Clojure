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

(ns ImageArrayAnimation)

(JR/register 'ImageArrayAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :imageArray nil)
  (JR/fset this :totalFrames 0)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :anchor 0)
    (JR/fset this :imageArray (JR/sget 'NullImage "NULL_IMAGE_ARRAY"))
    (JR/fset this :circularIndexUtil (JR/sget 'CircularIndexUtil "NULL_CIRCULAR_INDEX_UTIL"))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_2 [this p_imageArray p_animationBehavior]
  (let [ l_imageArray (volatile! p_imageArray) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_setImageArray_1 @l_imageArray))
  this)

(defn jnew_2 [p_imageArray p_animationBehavior ]
  (let [o (JR/alloc 'ImageArrayAnimation)] (jinit_2 o p_imageArray p_animationBehavior) o))

    
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

    
(defn jm_getImage_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget this :imageArray) @l_index)))

    
(defn jm_getImageArray_0 [this]
  (let []
        (JR/fget this :imageArray)))

    
(defn jm_setImageArray_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (JR/fset this :imageArray @l_imageArray)
        (JR/fset this :totalFrames (JR/alen @l_imageArray))
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/fget this :totalFrames)))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_drawImage_4 (JR/aget* (JR/fget this :imageArray) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)) @l_x @l_y (JR/fget this :anchor))))



