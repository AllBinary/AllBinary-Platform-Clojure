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

(ns PointsLayerCircularStaticPool)

(JR/register 'PointsLayerCircularStaticPool 'AllBinaryLayerCircularPool '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_allbinaryLayerFactoryInterface p_total]
  (let [ l_allbinaryLayerFactoryInterface (volatile! p_allbinaryLayerFactoryInterface) l_total (volatile! p_total)]
    (AllBinaryLayerCircularPool/jinit_0 this) (jinitfields this)
        (JR/invoke-super 'AllBinaryLayerCircularPool this :jm_initAllBinaryLayerCircularPool_2 @l_allbinaryLayerFactoryInterface @l_total))
  this)

(defn jnew_2 [p_allbinaryLayerFactoryInterface p_total ]
  (let [o (JR/alloc 'PointsLayerCircularStaticPool)] (jinit_2 o p_allbinaryLayerFactoryInterface p_total) o))

    
(defn jm_visit_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_pointsLayer (volatile! nil) l_scoreableInterface (volatile! nil)]
        (vreset! l_pointsLayer (JR/invoke this :jm_getNextInstance_0))
        (vreset! l_scoreableInterface @l_sourceLayerInterface)
        (JR/invoke @l_pointsLayer :jm_visit_1 @l_scoreableInterface)))



