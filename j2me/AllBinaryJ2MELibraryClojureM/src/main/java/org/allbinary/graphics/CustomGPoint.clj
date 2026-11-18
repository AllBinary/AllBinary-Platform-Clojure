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
;; package org.allbinary.graphics

(ns CustomGPoint)

(JR/register 'CustomGPoint 'GPoint '[])

(def jsv_NULL_CUSTOM_POINT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_CUSTOM_POINT [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_CUSTOM_POINT)
(defn jstatic_set_NULL_CUSTOM_POINT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_CUSTOM_POINT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_CUSTOM_POINT (CustomGPoint/jnew_3 0 0 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :cx 0)
  (JR/fset this :cy 0)
  (JR/fset this :cz 0)
  this)

    
(defn jm_getInstance_1 [p_point]
  (let [this nil l_point (volatile! p_point)]
        (CustomGPoint/jnew_3 (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0) (JR/invoke @l_point :jm_getZ_0))))

    
(defn jm_getInstance3_2 [p_x p_y]
  (let [this nil l_x (volatile! p_x) l_y (volatile! p_y)]
        (CustomGPoint/jnew_3 @l_x @l_y 3)))

    
(defn jinit_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (GPoint/jinit_3 this @l_x @l_y @l_z) (jinitfields this))
  this)

(defn jnew_3 [p_x p_y p_z ]
  (let [o (JR/alloc 'CustomGPoint)] (jinit_3 o p_x p_y p_z) o))

    
(defn jm_setX_1 [this p_x]
  (let [ l_x (volatile! p_x)]
        (JR/fset this :cx @l_x)))

    
(defn jm_getX_0 [this]
  (let []
        (JR/fget this :cx)))

    
(defn jm_setY_1 [this p_y]
  (let [ l_y (volatile! p_y)]
        (JR/fset this :cy @l_y)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/fget this :cy)))

    
(defn jm_setZ_1 [this p_z]
  (let [ l_z (volatile! p_z)]
        (JR/fset this :cz @l_z)))

    
(defn jm_getZ_0 [this]
  (let []
        (JR/fget this :cz)))



