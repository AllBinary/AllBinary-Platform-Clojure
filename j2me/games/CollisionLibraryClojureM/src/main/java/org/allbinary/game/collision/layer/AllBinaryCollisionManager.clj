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

(ns AllBinaryCollisionManager)

(JR/register 'AllBinaryCollisionManager nil '[])

(def jsv_allBinaryCollisionManager (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_allBinaryCollisionManager [] (JR/ensure-init jclinit-state jclinit) @jsv_allBinaryCollisionManager)
(defn jstatic_set_allBinaryCollisionManager [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_allBinaryCollisionManager v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_allBinaryCollisionManager (AllBinaryCollisionManager/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryCollisionManager)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AllBinaryCollisionManager/jstatic_allBinaryCollisionManager)))

    
(defn jm_process_3 [this p_layerManager p_collidableInterfaceCompositeInterface p_startIndex]
  (let [ l_layerManager (volatile! p_layerManager) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface) l_startIndex (volatile! p_startIndex) l_size (volatile! nil) l_collidableInterfaceCompositeInterface2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke @l_layerManager :jm_getSize_0))
        (do (vreset! l_index (unchecked-int (unchecked-add @l_startIndex 1)))
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_collidableInterfaceCompositeInterface2 (JR/invoke @l_layerManager :jm_getLayerAt_1 @l_index))
            (JR/invoke this :jm_collide_3 @l_layerManager @l_collidableInterfaceCompositeInterface @l_collidableInterfaceCompositeInterface2)))))

    
(defn jm_collide_3 [this p_layerManager p_collidableInterfaceCompositeInterface p_collidableInterfaceCompositeInterface2]
  (let [ l_layerManager (volatile! p_layerManager) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface) l_collidableInterfaceCompositeInterface2 (volatile! p_collidableInterfaceCompositeInterface2) l_collidableBase2 (volatile! nil) l_collidableBase (volatile! nil)]
        (vreset! l_collidableBase2 (JR/invoke @l_collidableInterfaceCompositeInterface2 :jm_getCollidableInferface_0))
        (vreset! l_collidableBase (JR/invoke @l_collidableInterfaceCompositeInterface :jm_getCollidableInferface_0))
        (if (JR/invoke @l_collidableBase2 :jm_isCollidable_1 @l_collidableInterfaceCompositeInterface)
            (do
            (if (JR/invoke @l_collidableBase :jm_isCollisionInterface_2 @l_collidableInterfaceCompositeInterface @l_collidableInterfaceCompositeInterface2)
                (do
                (JR/invoke @l_collidableBase :jm_collideInterface_2 @l_collidableInterfaceCompositeInterface @l_collidableInterfaceCompositeInterface2)
                (JR/invoke @l_collidableBase2 :jm_collideInterface_2 @l_collidableInterfaceCompositeInterface @l_collidableInterfaceCompositeInterface)))))))



