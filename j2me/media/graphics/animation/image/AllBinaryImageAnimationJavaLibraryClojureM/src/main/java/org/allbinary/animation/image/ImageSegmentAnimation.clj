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

(ns ImageSegmentAnimation)

(JR/register 'ImageSegmentAnimation 'ImageAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :startX 0)
  (JR/fset this :startY 0)
  (JR/fset this :drawWidth 0)
  (JR/fset this :drawHeight 0)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :sequenceArray nil)
  this)

    
(defn jinit_3 [this p_image p_sequenceArray p_animationBehavior]
  (let [ l_image (volatile! p_image) l_sequenceArray (volatile! p_sequenceArray) l_animationBehavior (volatile! p_animationBehavior)]
        (ImageAnimation/jinit_2 this @l_image @l_animationBehavior) (jinitfields this)
        (JR/fset this :startX 0)
        (JR/fset this :startY 0)
        (JR/fset this :drawWidth (JR/invoke (JR/invoke this :jm_getImage_0) :jm_getWidth_0))
        (JR/fset this :drawHeight (JR/invoke (JR/invoke this :jm_getImage_0) :jm_getHeight_0))
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/fget this :drawHeight)))
        (JR/fset this :sequenceArray @l_sequenceArray))
  this)

(defn jnew_3 [p_image p_sequenceArray p_animationBehavior ]
  (let [o (JR/alloc 'ImageSegmentAnimation)] (jinit_3 o p_image p_sequenceArray p_animationBehavior) o))

    
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
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_getSize_0)))

    
(defn jm_setSequence_1 [this p_sequenceArray]
  (let [ l_sequenceArray (volatile! p_sequenceArray)]
        (JR/fset this :sequenceArray @l_sequenceArray)))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/fget this :sequenceArray)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_getStartX_0 [this]
  (let []
        (JR/fget this :startX)))

    
(defn jm_setStartX_1 [this p_startX]
  (let [ l_startX (volatile! p_startX)]
        (JR/fset this :startX @l_startX)))

    
(defn jm_getStartY_0 [this]
  (let []
        (JR/fget this :startY)))

    
(defn jm_setStartY_1 [this p_startY]
  (let [ l_startY (volatile! p_startY)]
        (JR/fset this :startY @l_startY)))

    
(defn jm_getDrawWidth_0 [this]
  (let []
        (JR/fget this :drawWidth)))

    
(defn jm_setDrawWidth_1 [this p_drawWidth]
  (let [ l_drawWidth (volatile! p_drawWidth)]
        (JR/fset this :drawWidth @l_drawWidth)))

    
(defn jm_getDrawHeight_0 [this]
  (let []
        (JR/fget this :drawHeight)))

    
(defn jm_setDrawHeight_1 [this p_drawHeight]
  (let [ l_drawHeight (volatile! p_drawHeight)]
        (JR/fset this :drawHeight @l_drawHeight)))



