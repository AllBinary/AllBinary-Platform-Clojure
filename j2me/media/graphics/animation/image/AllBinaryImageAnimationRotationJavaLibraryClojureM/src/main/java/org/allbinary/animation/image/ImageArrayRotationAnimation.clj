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

(ns ImageArrayRotationAnimation)

(JR/register 'ImageArrayRotationAnimation 'ImageArrayBaseRotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :expectedTotalFrames 0)
  this)

    
(defn jm_createAnimation_2 [p_anyType p_animationBehavior]
  (let [this nil l_anyType (volatile! p_anyType) l_animationBehavior (volatile! p_animationBehavior) l_imageRotationAnimationInfo (volatile! nil)]
        (vreset! l_imageRotationAnimationInfo @l_anyType)
        (ImageArrayRotationAnimation/jnew_4 (JR/invoke @l_imageRotationAnimationInfo :jm_getImageArray_0) (JR/invoke @l_imageRotationAnimationInfo :jm_getAngleInfoP_0) (JR/invoke @l_imageRotationAnimationInfo :jm_getTotalAngle_0) @l_animationBehavior)))

    
(defn jinit_4 [this p_imageArray p_angleInfo p_totalAngle p_animationBehavior]
  (let [ l_imageArray (volatile! p_imageArray) l_angleInfo (volatile! p_angleInfo) l_totalAngle (volatile! p_totalAngle) l_animationBehavior (volatile! p_animationBehavior)]
        (ImageArrayBaseRotationAnimation/jinit_3 this @l_imageArray @l_angleInfo @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_initImageArray_3 @l_imageArray @l_angleInfo @l_totalAngle))
  this)

(defn jnew_4 [p_imageArray p_angleInfo p_totalAngle p_animationBehavior ]
  (let [o (JR/alloc 'ImageArrayRotationAnimation)] (jinit_4 o p_imageArray p_angleInfo p_totalAngle p_animationBehavior) o))

    
(defn jm_initImageArray_3 [this p_imageArray p_angleInfo p_totalAngle]
  (let [ l_imageArray (volatile! p_imageArray) l_angleInfo (volatile! p_angleInfo) l_totalAngle (volatile! p_totalAngle)]
        (JR/fset this :expectedTotalFrames (JR/idiv @l_totalAngle (JR/invoke (JR/invoke (JR/fget this :angleInfo) :jm_getAngleIncrementInfo_0) :jm_getAngleIncrement_0)))
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 0)
        (if (not (== (JR/fget this :expectedTotalFrames) (JR/invoke this :jm_getSize_0)))
            (do
            (JR/jthrow (new java.lang.Exception "Wrong Number of Frames"))))))

    
(defn jm_setImageArray_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (JR/invoke-super 'ImageArrayBaseRotationAnimation this :jm_setImageArray_1 @l_imageArray)
        (JR/invoke (JR/fget this :angleInfo) :jm_adjustAngle_1 0)))



