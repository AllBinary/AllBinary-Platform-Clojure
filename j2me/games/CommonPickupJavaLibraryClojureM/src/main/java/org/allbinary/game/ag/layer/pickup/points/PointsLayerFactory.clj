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

(ns PointsLayerFactory)

(JR/register 'PointsLayerFactory nil '[AllBinaryLayerFactoryInterface])

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
    nil (jinitfields this)
        (JR/fset this :points @l_points))
  this)

(defn jnew_1 [p_points ]
  (let [o (JR/alloc 'PointsLayerFactory)] (jinit_1 o p_points) o))

    
(defn jm_getInstance_0 [this]
  (let []
        (PointsLayer/jnew_1 (JR/fget this :points))))



