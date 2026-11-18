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

(ns ImageArrayBaseRotationAnimation)

(JR/register 'ImageArrayBaseRotationAnimation 'RotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :imageModifierUtil nil)
  (JR/fset this :originalImageArray nil)
  (JR/fset this :imageArray nil)
  (JR/fset this :currentImage nil)
  (JR/fset this :totalFrames 0)
  (JR/fset this :anchor 0)
    (JR/fset this :imageModifierUtil (JR/scall 'ImageModifierUtil :jm_getInstanceOrCreate_0))
    (JR/fset this :imageArray (JR/sget 'NullImage "NULL_IMAGE_ARRAY"))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_3 [this p_originalImageArray p_angleInfo p_animationBehavior]
  (let [ l_originalImageArray (volatile! p_originalImageArray) l_angleInfo (volatile! p_angleInfo) l_animationBehavior (volatile! p_animationBehavior)]
        (RotationAnimation/jinit_3 this @l_angleInfo (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/idiv 360 (JR/invoke (JR/invoke @l_angleInfo :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0))) @l_animationBehavior) (jinitfields this)
        (JR/fset this :originalImageArray @l_originalImageArray)
        (JR/invoke this :jm_setImageArray_1 (JR/invoke (JR/fget this :imageModifierUtil) :jm_getImageArray_1 @l_originalImageArray))
        (JR/fset this :currentImage (JR/aget* (JR/fget this :imageArray) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))))
  this)

(defn jnew_3 [p_originalImageArray p_angleInfo p_animationBehavior ]
  (let [o (JR/alloc 'ImageArrayBaseRotationAnimation)] (jinit_3 o p_originalImageArray p_angleInfo p_animationBehavior) o))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/invoke this :jm_getSize_0)))

    
(defn jm_setAlpha_1 [this p_alpha]
  (let [ l_alpha (volatile! p_alpha) l_index (volatile! nil)]
        (if (not (JR/eq (JR/fget this :alphaP) @l_alpha))
            (do
            (JR/invoke-super 'RotationAnimation this :jm_setAlpha_1 @l_alpha)
            (JR/invoke (JR/fget this :imageModifierUtil) :jm_reset_0)
            (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
            (JR/invoke (JR/fget this :imageModifierUtil) :jm_setAlpha_4 (JR/aget* (JR/fget this :originalImageArray) @l_index) (JR/aget* (JR/fget this :imageArray) @l_index) @l_index (JR/fget this :alphaP))))))

    
(defn jm_nextRotation_0 [this]
  (let [ l_index (volatile! nil)]
        (JR/invoke-super 'RotationAnimation this :jm_nextRotation_0)
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/invoke (JR/fget this :imageModifierUtil) :jm_setAlpha_4 (JR/aget* (JR/fget this :originalImageArray) @l_index) (JR/aget* (JR/fget this :imageArray) @l_index) @l_index (JR/fget this :alphaP))
        (JR/fset this :currentImage (JR/aget* (JR/fget this :imageArray) @l_index))))

    
(defn jm_previousRotation_0 [this]
  (let [ l_index (volatile! nil)]
        (JR/invoke-super 'RotationAnimation this :jm_previousRotation_0)
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/invoke (JR/fget this :imageModifierUtil) :jm_setAlpha_4 (JR/aget* (JR/fget this :originalImageArray) @l_index) (JR/aget* (JR/fget this :imageArray) @l_index) @l_index (JR/fget this :alphaP))
        (JR/fset this :currentImage (JR/aget* (JR/fget this :imageArray) @l_index))))

    
(defn jm_setFrame_1 [this p_index2]
  (let [ l_index2 (volatile! p_index2) l_index (volatile! nil)]
        (JR/invoke-super 'RotationAnimation this :jm_setFrame_1 @l_index2)
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/invoke (JR/fget this :imageModifierUtil) :jm_setAlpha_4 (JR/aget* (JR/fget this :originalImageArray) @l_index) (JR/aget* (JR/fget this :imageArray) @l_index) @l_index (JR/fget this :alphaP))
        (JR/fset this :currentImage (JR/aget* (JR/fget this :imageArray) @l_index))))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_setImageArray_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (JR/fset this :imageArray @l_imageArray)
        (JR/fset this :totalFrames (JR/alen @l_imageArray))
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/fget this :totalFrames)))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_drawImage_4 (JR/fget this :currentImage) @l_x @l_y (JR/fget this :anchor))))

    
(defn jm_close_0 [this]
  (let [ l_disposalUtil (volatile! nil) l_size2 (volatile! nil) l_index (volatile! nil) l_size (volatile! nil)]
        (vreset! l_disposalUtil (JR/scall 'DisposalUtil :jm_getInstance_0))
        (vreset! l_size2 (JR/alen (JR/fget this :imageArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_disposalUtil :jm_disposeImage_1 (JR/aget* (JR/fget this :imageArray) @l_index))))
        (vreset! l_size (JR/alen (JR/fget this :originalImageArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_disposalUtil :jm_disposeImage_1 (JR/aget* (JR/fget this :originalImageArray) @l_index))))
        (JR/invoke @l_disposalUtil :jm_disposeImage_1 (JR/fget this :currentImage))))

    
(defn jm_finalize_0 [this]
  (let [ l_disposalUtil (volatile! nil) l_size2 (volatile! nil) l_index (volatile! nil) l_size (volatile! nil)]
        (vreset! l_disposalUtil (JR/scall 'DisposalUtil :jm_getInstance_0))
        (vreset! l_size2 (JR/alen (JR/fget this :imageArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_disposalUtil :jm_disposeImage_1 (JR/aget* (JR/fget this :imageArray) @l_index))))
        (vreset! l_size (JR/alen (JR/fget this :originalImageArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_disposalUtil :jm_disposeImage_1 (JR/aget* (JR/fget this :originalImageArray) @l_index))))
        (JR/invoke @l_disposalUtil :jm_disposeImage_1 (JR/fget this :currentImage))))



