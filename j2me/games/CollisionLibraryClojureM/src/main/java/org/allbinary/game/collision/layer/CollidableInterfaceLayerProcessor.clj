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
;; package org.allbinary.game.collision.layer

(ns CollidableInterfaceLayerProcessor)

(JR/register 'CollidableInterfaceLayerProcessor 'LayerProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (LayerProcessor/jinit_1 this (CollidableInterfaceLayerManager/jnew_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CollidableInterfaceLayerProcessor)] (jinit_0 o) o))

    
(defn jm_processAt_3 [this p_allBinaryLayerManager p_layerInterface p_index]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerInterface (volatile! p_layerInterface) l_index (volatile! p_index) l_collidableInterfaceCompositeInterface (volatile! nil)]
        (vreset! l_collidableInterfaceCompositeInterface @l_layerInterface)
        (if (JR/invoke (JR/invoke @l_collidableInterfaceCompositeInterface :jm_getCollidableInferface_0) :jm_isCollidable_1 @l_collidableInterfaceCompositeInterface)
            (do
            (JR/invoke (JR/scall 'AllBinaryCollisionManager :jm_getInstance_0) :jm_process_3 (JR/invoke this :jm_getLayerManager_0) @l_collidableInterfaceCompositeInterface @l_index)))))

    
(defn jm_isProcessorLayer_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (if (JR/invoke @l_layerInterface :jm_implmentsCollidableInterface_0)
            (do
            true)
            (do
            false))))



