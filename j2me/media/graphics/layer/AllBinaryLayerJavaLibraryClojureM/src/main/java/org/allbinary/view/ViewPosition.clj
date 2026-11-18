;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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

(ns ViewPosition)

(JR/register 'ViewPosition 'ViewPositionBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :allbinaryLayer nil)
    (JR/fset this :allbinaryLayer (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
  this)

    
(defn jm_getInstanceD_0 []
  (let [this nil]
        (ViewPosition/jnew_3 0 0 0)))

    
(defn jinit_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (ViewPositionBase/jinit_3 this @l_x @l_y @l_z) (jinitfields this))
  this)

(defn jnew_3 [p_x p_y p_z ]
  (let [o (JR/alloc 'ViewPosition)] (jinit_3 o p_x p_y p_z) o))

    
(defn jm_getX_0 [this]
  (let []
        (JR/invoke (JR/fget this :allbinaryLayer) :jm_getXP_0)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/invoke (JR/fget this :allbinaryLayer) :jm_getYP_0)))

    
(defn jm_getZ_0 [this]
  (let []
        (JR/invoke (JR/fget this :allbinaryLayer) :jm_getZP_0)))

    
(defn jm_getX2_0 [this]
  (let []
        (unchecked-int (unchecked-add (JR/invoke this :jm_getX_0) (JR/invoke (JR/fget this :allbinaryLayer) :jm_getWidth_0)))))

    
(defn jm_getY2_0 [this]
  (let []
        (unchecked-int (unchecked-add (JR/invoke this :jm_getY_0) (JR/invoke (JR/fget this :allbinaryLayer) :jm_getHeight_0)))))

    
(defn jm_getZ2_0 [this]
  (let []
        (JR/i32 (unchecked-add (JR/invoke this :jm_getZ_0) (JR/invoke (JR/fget this :allbinaryLayer) :jm_getDepth_0)))))

    
(defn jm_setAllbinaryLayer_1 [this p_allbinaryLayer]
  (let [ l_allbinaryLayer (volatile! p_allbinaryLayer)]
        (JR/fset this :allbinaryLayer @l_allbinaryLayer)))



