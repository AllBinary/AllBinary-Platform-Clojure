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
;; package org.allbinary.game.ag.layer.pickup.health

(ns HealLayerCircularStaticPool)

(JR/register 'HealLayerCircularStaticPool 'AllBinaryLayerCircularPool '[])

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
  (let [o (JR/alloc 'HealLayerCircularStaticPool)] (jinit_2 o p_allbinaryLayerFactoryInterface p_total) o))

    
(defn jm_visit_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_healLayer (volatile! nil) l_healthInterfaceCompositeInterface (volatile! nil) l_healthInterface (volatile! nil)]
        (vreset! l_healLayer (JR/invoke this :jm_getNextInstance_0))
        (vreset! l_healthInterfaceCompositeInterface @l_sourceLayerInterface)
        (vreset! l_healthInterface (JR/invoke @l_healthInterfaceCompositeInterface :jm_getHealthInterface_0))
        (JR/invoke @l_healLayer :jm_visit_1 @l_healthInterface)))



