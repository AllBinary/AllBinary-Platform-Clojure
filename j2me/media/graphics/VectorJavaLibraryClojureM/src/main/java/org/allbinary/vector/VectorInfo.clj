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
;; package org.allbinary.vector

(ns VectorInfo)

(JR/register 'VectorInfo nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :width 0)
  (JR/fset this :height 0)
  (JR/fset this :points nil)
  (JR/fset this :totalFrames 0)
  this)

    
(defn jinit_4 [this p_width p_height p_points p_totalFrames]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_points (volatile! p_points) l_totalFrames (volatile! p_totalFrames)]
    nil (jinitfields this)
        (JR/fset this :width @l_width)
        (JR/fset this :height @l_height)
        (JR/fset this :points @l_points)
        (JR/fset this :totalFrames @l_totalFrames))
  this)

(defn jnew_4 [p_width p_height p_points p_totalFrames ]
  (let [o (JR/alloc 'VectorInfo)] (jinit_4 o p_width p_height p_points p_totalFrames) o))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/fget this :width)))

    
(defn jm_setWidth_1 [this p_width]
  (let [ l_width (volatile! p_width)]
        (JR/fset this :width @l_width)))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/fget this :height)))

    
(defn jm_setHeight_1 [this p_height]
  (let [ l_height (volatile! p_height)]
        (JR/fset this :height @l_height)))

    
(defn jm_getPoints_0 [this]
  (let []
        (JR/fget this :points)))

    
(defn jm_setPoints_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (JR/fset this :points @l_points)))

    
(defn jm_getTotalFrames_0 [this]
  (let []
        (JR/fget this :totalFrames)))

    
(defn jm_setTotalFrames_1 [this p_totalFrames]
  (let [ l_totalFrames (volatile! p_totalFrames)]
        (JR/fset this :totalFrames @l_totalFrames)))



