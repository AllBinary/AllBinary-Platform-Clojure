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
;; package org.allbinary.game.layer.pickup

(ns PickupBehavior)

(JR/register 'PickupBehavior nil '[PickupBehaviorInterface])

(def jsv_NULL_PICKUP_BEHAVIOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PICKUP_BEHAVIOR [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PICKUP_BEHAVIOR)
(defn jstatic_set_NULL_PICKUP_BEHAVIOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PICKUP_BEHAVIOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PICKUP_BEHAVIOR (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :countedIndex 0)
  (JR/fset this :ownerLayerInterface nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (PickupBehavior/jstatic_NULL_PICKUP_BEHAVIOR) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (PickupBehavior/jstatic_set_NULL_PICKUP_BEHAVIOR (PickupBehavior/jnew_2 (JR/scall 'CollidableCompositeLayer :jm_getNullInstance_0) 0))))
        (PickupBehavior/jstatic_NULL_PICKUP_BEHAVIOR)))

    
(defn jinit_2 [this p_ownerLayerInterface p_countedIndex]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_countedIndex (volatile! p_countedIndex)]
    nil (jinitfields this)
        (JR/fset this :ownerLayerInterface @l_ownerLayerInterface)
        (JR/fset this :countedIndex @l_countedIndex))
  this)

(defn jnew_2 [p_ownerLayerInterface p_countedIndex ]
  (let [o (JR/alloc 'PickupBehavior)] (jinit_2 o p_ownerLayerInterface p_countedIndex) o))

    
(defn jm_doPickup_1 [this p_pickupProcessorInterface]
  (let [ l_pickupProcessorInterface (volatile! p_pickupProcessorInterface) l_healthInterfaceCompositeInterface (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_healthInterfaceCompositeInterface (JR/fget this :ownerLayerInterface))
            (if (JR/invoke (JR/invoke @l_healthInterfaceCompositeInterface :jm_getHealthInterface_0) :jm_isAlive_0)
                (do
                (JR/invoke @l_pickupProcessorInterface :jm_process_1 (JR/fget this :ownerLayerInterface)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "doPickup" @l_e)) :else (throw jt)))))))

    
(defn jm_doPickupLayer_1 [this p_pickupLayerInterface]
  (let [ l_pickupLayerInterface (volatile! p_pickupLayerInterface) l_pickedUpLayerInterfaceFactoryInterface (volatile! nil) l_pickedUpLayerType (volatile! nil) l_pickedUpLayerTypeFactory (volatile! nil) l_pickupProcessorInterface (volatile! nil) l_collidableDestroyableDamageableLayer (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_pickedUpLayerInterfaceFactoryInterface (JR/invoke @l_pickupLayerInterface :jm_getPickedUpLayerInterfaceFactoryInterface_0))
            (vreset! l_pickedUpLayerType (JR/invoke @l_pickedUpLayerInterfaceFactoryInterface :jm_getPickedUpLayerType_0))
            (vreset! l_pickedUpLayerTypeFactory (JR/scall 'PickedUpLayerTypeFactory :jm_getInstance_0))
            (if (or (or (or (JR/eq @l_pickedUpLayerType (JR/fget @l_pickedUpLayerTypeFactory :BEAM)) (JR/eq @l_pickedUpLayerType (JR/fget @l_pickedUpLayerTypeFactory :MINE))) (JR/eq @l_pickedUpLayerType (JR/fget @l_pickedUpLayerTypeFactory :PROJECTILE))) (JR/eq @l_pickedUpLayerType (JR/fget @l_pickedUpLayerTypeFactory :ENHANCEMENT)))
                (do
                (JR/invoke this :jm_add_1 @l_pickedUpLayerInterfaceFactoryInterface))
                (if (JR/eq (JR/invoke @l_pickedUpLayerInterfaceFactoryInterface :jm_getPickedUpLayerType_0) (JR/fget @l_pickedUpLayerTypeFactory :PART))
                (do
                (vreset! l_collidableDestroyableDamageableLayer (JR/fget this :ownerLayerInterface))
                (JR/invoke @l_collidableDestroyableDamageableLayer :jm_addPart_1 @l_pickedUpLayerInterfaceFactoryInterface))
                (if (JR/eq @l_pickedUpLayerType (JR/fget @l_pickedUpLayerTypeFactory :NONE))
                (do
                nil)
                (do
                (vreset! l_pickupProcessorInterface @l_pickedUpLayerInterfaceFactoryInterface)
                (JR/invoke this :jm_doPickup_1 @l_pickupProcessorInterface)))))
            (JR/invoke @l_pickupLayerInterface :jm_setPickedUp_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget @l_commonStrings :EXCEPTION) this "doPickup" @l_e)) :else (throw jt)))))))

    
(defn jm_add_1 [this p_countedPickedUpLayerInterfaceFactoryInterface]
  (let [ l_countedPickedUpLayerInterfaceFactoryInterface (volatile! p_countedPickedUpLayerInterfaceFactoryInterface) l_partIndex (volatile! nil)]
        (vreset! l_partIndex (unchecked-int (unchecked-add (JR/invoke @l_countedPickedUpLayerInterfaceFactoryInterface :jm_getId_0) (JR/fget this :countedIndex))))
        (JR/invoke this :jm_addAt_2 @l_countedPickedUpLayerInterfaceFactoryInterface @l_partIndex)))

    
(defn jm_addAt_2 [this p_countedPickedUpLayerInterfaceFactoryInterface p_partIndex]
  (let [ l_countedPickedUpLayerInterfaceFactoryInterface (volatile! p_countedPickedUpLayerInterfaceFactoryInterface) l_partIndex (volatile! p_partIndex) l_collidableDestroyableDamageableLayer (volatile! nil) l_countedLayerInterfaceFactory (volatile! nil)]
        (vreset! l_collidableDestroyableDamageableLayer (JR/fget this :ownerLayerInterface))
        (vreset! l_countedLayerInterfaceFactory (JR/aget* (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getPartInterfaceArray_0) @l_partIndex))
        (JR/invoke @l_countedLayerInterfaceFactory :jm_setTotal_1 (unchecked-int (unchecked-add (JR/invoke @l_countedLayerInterfaceFactory :jm_getTotal_0) (JR/invoke @l_countedPickedUpLayerInterfaceFactoryInterface :jm_getTotal_0))))))

    
(defn jm_getFirstAvailableCountedLayerInterfaceFactory_1 [this p_pickedUpLayerTypeArray]
  (let [ l_pickedUpLayerTypeArray (volatile! p_pickedUpLayerTypeArray) l_collidableDestroyableDamageableLayer (volatile! nil) l_partInterfaceArray (volatile! nil) l_size (volatile! nil) l_nextCountedLayerInterfaceFactory (volatile! nil) l_countedPickedUpLayerInterfaceFactory (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_collidableDestroyableDamageableLayer (JR/fget this :ownerLayerInterface))
        (vreset! l_partInterfaceArray (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getPartInterfaceArray_0))
        (vreset! l_size (JR/alen @l_partInterfaceArray))
        (vreset! l_nextCountedLayerInterfaceFactory nil)
        (vreset! l_countedPickedUpLayerInterfaceFactory nil)
        (do (vreset! l_index (JR/fget this :countedIndex))
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextCountedLayerInterfaceFactory (JR/aget* (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getPartInterfaceArray_0) @l_index))
            (vreset! l_countedPickedUpLayerInterfaceFactory (JR/invoke @l_nextCountedLayerInterfaceFactory :jm_getCountedPickedUpLayerInterfaceFactory_0))
            (do (vreset! l_index2 (JR/alen @l_pickedUpLayerTypeArray))
                (JR/jfor false false (>= (JR/vinc l_index2 -1 :int false) 0) (do )
                (if (JR/eq (JR/invoke @l_countedPickedUpLayerInterfaceFactory :jm_getPickedUpLayerType_0) (JR/aget* @l_pickedUpLayerTypeArray @l_index2))
                    (do
                    (if (> (JR/invoke @l_nextCountedLayerInterfaceFactory :jm_getTotal_0) 0)
                        (do
                        (JR/jreturn @l_nextCountedLayerInterfaceFactory)))))))))
        (JR/sget 'CountedLayerInterfaceFactoryPart "NULL_COUNTED_LAYER_INTERFACE_FACTORY"))))

    
(defn jm_getCountedLayerInterfaceFactoryForSlot_1 [this p_slotIndex]
  (let [ l_slotIndex (volatile! p_slotIndex) l_currentSlot (volatile! nil) l_collidableDestroyableDamageableLayer (volatile! nil) l_partInterfaceArray (volatile! nil) l_size (volatile! nil) l_nextCountedLayerInterfaceFactory (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_currentSlot 0)
        (vreset! l_collidableDestroyableDamageableLayer (JR/fget this :ownerLayerInterface))
        (vreset! l_partInterfaceArray (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getPartInterfaceArray_0))
        (vreset! l_size (JR/alen @l_partInterfaceArray))
        (vreset! l_nextCountedLayerInterfaceFactory nil)
        (do (vreset! l_index (JR/fget this :countedIndex))
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextCountedLayerInterfaceFactory (JR/aget* (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getPartInterfaceArray_0) @l_index))
            (if (> (JR/invoke @l_nextCountedLayerInterfaceFactory :jm_getTotal_0) 0)
                (do
                (if (== @l_currentSlot @l_slotIndex)
                    (do
                    (JR/jreturn @l_nextCountedLayerInterfaceFactory))
                    (do
                    (JR/vinc l_currentSlot 1 :int false)))))))
        (JR/sget 'CountedLayerInterfaceFactoryPart "NULL_COUNTED_LAYER_INTERFACE_FACTORY"))))

    
(defn jm_getCountedIndex_0 [this]
  (let []
        (JR/fget this :countedIndex)))



