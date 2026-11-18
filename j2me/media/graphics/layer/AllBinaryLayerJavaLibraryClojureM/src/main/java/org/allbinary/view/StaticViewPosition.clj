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

(ns StaticViewPosition)

(JR/register 'StaticViewPosition 'ViewPosition '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (ViewPosition/jinit_3 this @l_x @l_y @l_z) (jinitfields this))
  this)

(defn jnew_3 [p_x p_y p_z ]
  (let [o (JR/alloc 'StaticViewPosition)] (jinit_3 o p_x p_y p_z) o))

    
(defn jm_getX_0 [this]
  (let []
        (JR/invoke this :jm_getRawX_0)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/invoke this :jm_getRawY_0)))

    
(defn jm_getZ_0 [this]
  (let []
        (JR/invoke this :jm_getRawZ_0)))



