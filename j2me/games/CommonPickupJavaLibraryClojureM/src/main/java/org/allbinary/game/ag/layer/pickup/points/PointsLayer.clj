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
;; package org.allbinary.game.ag.layer.pickup.points

(ns PointsLayer)

(JR/register 'PointsLayer 'AllBinaryLayer '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :points 0)
  this)

    
(defn jinit_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (AllBinaryLayer/jinit_3 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 0 0) (JR/scall 'ViewPosition :jm_getInstanceD_0)) (jinitfields this)
        (JR/fset this :points @l_points))
  this)

(defn jnew_1 [p_points ]
  (let [o (JR/alloc 'PointsLayer)] (jinit_1 o p_points) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_visit_1 [this p_scoreableInterface]
  (let [ l_scoreableInterface (volatile! p_scoreableInterface)]
        (JR/invoke @l_scoreableInterface :jm_addPoints_1 (JR/fget this :points))))



