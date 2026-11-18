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
;; package org.allbinary.game.collision

(ns OptimizedAllBinaryCollisionLayerProcessorForCollidableLayer)

(JR/register 'OptimizedAllBinaryCollisionLayerProcessorForCollidableLayer 'LayerProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (LayerProcessor/jinit_1 this (OptimizedAllBinaryCollisionLayerManager/jnew_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OptimizedAllBinaryCollisionLayerProcessorForCollidableLayer)] (jinit_0 o) o))

    
(defn jm_processAt_3 [this p_allBinaryLayerManager p_layerInterface p_startIndex]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerInterface (volatile! p_layerInterface) l_startIndex (volatile! p_startIndex) l_collidableInterfaceCompositeInterface (volatile! nil) l_collidableBase (volatile! nil) l_layerManager (volatile! nil) l_size (volatile! nil) l_collidableInterfaceCompositeInterface2 (volatile! nil) l_collidableBase2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_collidableInterfaceCompositeInterface @l_layerInterface)
        (vreset! l_collidableBase (JR/invoke @l_collidableInterfaceCompositeInterface :jm_getCollidableInferface_0))
        (if (JR/invoke @l_collidableBase :jm_isCollidable_1 @l_collidableInterfaceCompositeInterface)
            (do
            (vreset! l_layerManager (JR/invoke this :jm_getLayerManager_0))
            (vreset! l_size (JR/invoke @l_layerManager :jm_getSize_0))
            (vreset! l_collidableInterfaceCompositeInterface2 nil)
            (vreset! l_collidableBase2 nil)
            (do (vreset! l_index (unchecked-int (unchecked-add @l_startIndex 1)))
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_collidableInterfaceCompositeInterface2 (JR/invoke @l_layerManager :jm_getLayerAt_1 @l_index))
                (vreset! l_collidableBase2 (JR/invoke @l_collidableInterfaceCompositeInterface2 :jm_getCollidableInferface_0))
                (if (and (JR/invoke @l_collidableBase2 :jm_isCollidable_1 @l_collidableInterfaceCompositeInterface) (JR/invoke @l_collidableBase :jm_isCollision_2 @l_collidableInterfaceCompositeInterface @l_collidableInterfaceCompositeInterface2))
                    (do
                    (JR/invoke @l_collidableBase :jm_collide_2 @l_collidableInterfaceCompositeInterface @l_collidableInterfaceCompositeInterface2)
                    (JR/invoke @l_collidableBase2 :jm_collide_2 @l_collidableInterfaceCompositeInterface2 @l_collidableInterfaceCompositeInterface)))))))))

    
(defn jm_isProcessorLayer_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (if (JR/invoke @l_layerInterface :jm_implmentsCollidableInterface_0)
            (do
            true)
            (do
            false))))



