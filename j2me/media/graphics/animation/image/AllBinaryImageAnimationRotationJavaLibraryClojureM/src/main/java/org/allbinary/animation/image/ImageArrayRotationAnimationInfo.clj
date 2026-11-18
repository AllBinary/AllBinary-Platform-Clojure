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

(ns ImageArrayRotationAnimationInfo)

(JR/register 'ImageArrayRotationAnimationInfo nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :imageArray nil)
  (JR/fset this :angleIncrement 0)
  (JR/fset this :totalAngle 0)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_5 [this p_imageArray p_angleIncrement p_totalAngle p_dx p_dy]
  (let [ l_imageArray (volatile! p_imageArray) l_angleIncrement (volatile! p_angleIncrement) l_totalAngle (volatile! p_totalAngle) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
    nil (jinitfields this)
        (JR/fset this :imageArray @l_imageArray)
        (JR/fset this :angleIncrement @l_angleIncrement)
        (JR/fset this :totalAngle @l_totalAngle)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_5 [p_imageArray p_angleIncrement p_totalAngle p_dx p_dy ]
  (let [o (JR/alloc 'ImageArrayRotationAnimationInfo)] (jinit_5 o p_imageArray p_angleIncrement p_totalAngle p_dx p_dy) o))

    
(defn jm_setImageArray_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (JR/fset this :imageArray @l_imageArray)))

    
(defn jm_getImageArray_0 [this]
  (let []
        (JR/fget this :imageArray)))

    
(defn jm_getAngleInfoP_0 [this]
  (let []
        (JR/scall 'AngleInfo :jm_getInstance_1 (JR/i16 (JR/fget this :angleIncrement)))))

    
(defn jm_setTotalAngle_1 [this p_totalAngle]
  (let [ l_totalAngle (volatile! p_totalAngle)]
        (JR/fset this :totalAngle @l_totalAngle)))

    
(defn jm_getTotalAngle_0 [this]
  (let []
        (JR/fget this :totalAngle)))

    
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



