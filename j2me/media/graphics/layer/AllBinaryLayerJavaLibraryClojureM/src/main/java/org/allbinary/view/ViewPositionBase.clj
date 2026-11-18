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
;; package org.allbinary.view

(ns ViewPositionBase)

(JR/register 'ViewPositionBase 'GPoint '[])

(def jsv_NULL_VIEW_POSITION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_VIEW_POSITION [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_VIEW_POSITION)
(defn jstatic_set_NULL_VIEW_POSITION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_VIEW_POSITION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_VIEW_POSITION (ViewPositionBase/jnew_3 0 0 0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (GPoint/jinit_3 this @l_x @l_y @l_z) (jinitfields this))
  this)

(defn jnew_3 [p_x p_y p_z ]
  (let [o (JR/alloc 'ViewPositionBase)] (jinit_3 o p_x p_y p_z) o))

    
(defn jm_getX2_0 [this]
  (let []
        (JR/invoke this :jm_getX_0)))

    
(defn jm_getY2_0 [this]
  (let []
        (JR/invoke this :jm_getY_0)))

    
(defn jm_getZ2_0 [this]
  (let []
        (JR/invoke this :jm_getZ_0)))

    
(defn jm_setAllbinaryLayer_1 [this p_allbinaryLayer]
  (let [ l_allbinaryLayer (volatile! p_allbinaryLayer)]
        nil))



