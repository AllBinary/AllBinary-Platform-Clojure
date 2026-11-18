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

;;TWB - Adjustments should be done in the resource creation and not at the animation level
(ns AdjustedImageArrayRotationAnimation)

(JR/register 'AdjustedImageArrayRotationAnimation 'ImageArrayRotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jm_createAdjustedImageArrayRotationAnimationInfo_2 [p_anyType p_animationBehavior]
  (let [this nil l_anyType (volatile! p_anyType) l_animationBehavior (volatile! p_animationBehavior) l_imageRotationAnimationInfo (volatile! nil)]
        (vreset! l_imageRotationAnimationInfo @l_anyType)
        (AdjustedImageArrayRotationAnimation/jnew_6 (JR/invoke @l_imageRotationAnimationInfo :jm_getImageArray_0) (JR/invoke @l_imageRotationAnimationInfo :jm_getAngleInfoP_0) (JR/invoke @l_imageRotationAnimationInfo :jm_getTotalAngle_0) (JR/invoke @l_imageRotationAnimationInfo :jm_getDx_0) (JR/invoke @l_imageRotationAnimationInfo :jm_getDy_0) @l_animationBehavior)))

    
(defn jm_createAnimation_4 [p_imageArray p_angleInfo p_totalAngle p_animationBehavior]
  (let [this nil l_imageArray (volatile! p_imageArray) l_angleInfo (volatile! p_angleInfo) l_totalAngle (volatile! p_totalAngle) l_animationBehavior (volatile! p_animationBehavior)]
        (AdjustedImageArrayRotationAnimation/jnew_6 @l_imageArray @l_angleInfo @l_totalAngle (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/invoke (JR/aget* @l_imageArray 0) :jm_getWidth_0) 2)))) (unchecked-int (unchecked-negate (JR/c2i (JR/ishr (JR/invoke (JR/aget* @l_imageArray 0) :jm_getHeight_0) 2)))) @l_animationBehavior)))

    
(defn jinit_6 [this p_imageArray p_angleInfo p_totalAngle p_dx p_dy p_animationBehavior]
  (let [ l_imageArray (volatile! p_imageArray) l_angleInfo (volatile! p_angleInfo) l_totalAngle (volatile! p_totalAngle) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehavior (volatile! p_animationBehavior)]
        (ImageArrayRotationAnimation/jinit_4 this @l_imageArray @l_angleInfo @l_totalAngle @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_init_2 @l_dx @l_dy))
  this)

(defn jnew_6 [p_imageArray p_angleInfo p_totalAngle p_dx p_dy p_animationBehavior ]
  (let [o (JR/alloc 'AdjustedImageArrayRotationAnimation)] (jinit_6 o p_imageArray p_angleInfo p_totalAngle p_dx p_dy p_animationBehavior) o))

    
(defn jm_init_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/invoke this :jm_setDx_1 @l_dx)
        (JR/invoke this :jm_setDy_1 @l_dy)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke-super 'ImageArrayRotationAnimation this :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add @l_y (JR/fget this :dy))))))

    
(defn jm_setDx_1 [this p_dx]
  (let [ l_dx (volatile! p_dx)]
        (JR/fset this :dx @l_dx)))

    
(defn jm_getDx_0 [this]
  (let []
        (JR/fget this :dx)))

    
(defn jm_setDy_1 [this p_dy]
  (let [ l_dy (volatile! p_dy)]
        (JR/fset this :dy @l_dy)))

    
(defn jm_getDy_0 [this]
  (let []
        (JR/fget this :dy)))



