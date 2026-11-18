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

(ns HealPickedUpLayerInterfaceFactory)

(JR/register 'HealPickedUpLayerInterfaceFactory 'PickedUpLayerInterfaceFactory '[PickupProcessorInterface])

(def jsv_pickedUpLayerInterfaceFactoryInterface (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_pickedUpLayerInterfaceFactoryInterface [] (JR/ensure-init jclinit-state jclinit) @jsv_pickedUpLayerInterfaceFactoryInterface)
(defn jstatic_set_pickedUpLayerInterfaceFactoryInterface [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_pickedUpLayerInterfaceFactoryInterface v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_pickedUpLayerInterfaceFactoryInterface (JR/sget 'CountedPickedUpLayerInterfaceFactory "NULL_COUNTED_PICKUP_LAYER_FACTORY"))
    nil))

(defn jinitfields [this]
  (JR/fset this :pool nil)
    (JR/fset this :pool (HealLayerCircularStaticPool/jnew_2 (HealLayerFactory/jnew_0) 1))
  this)

    
(defn jm_init_0 []
  (let [this nil]
        (HealPickedUpLayerInterfaceFactory/jstatic_set_pickedUpLayerInterfaceFactoryInterface (HealPickedUpLayerInterfaceFactory/jnew_0))))

    
(defn jinit_0 [this]
  (let []
        (PickedUpLayerInterfaceFactory/jinit_3 this (JR/fget (JR/scall 'PickedUpLayerTypeFactory :jm_getInstance_0) :HEAL) (JR/scall 'IconLayerFactory :jm_getInstance_3 (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget (JR/scall 'HealthResources :jm_getInstance_0) :RESOURCE)) :jm_getInstance_1 0) 10 10) (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget (JR/scall 'HealthResources :jm_getInstance_0) :RESOURCE)) :jm_getInstance_1 0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HealPickedUpLayerInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getTotal_0 [this]
  (let []
        1))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HealPickedUpLayerInterfaceFactory/jstatic_pickedUpLayerInterfaceFactoryInterface)))

    
(defn jm_process_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface)]
        (JR/invoke (JR/fget this :pool) :jm_visit_1 @l_sourceLayerInterface)))



