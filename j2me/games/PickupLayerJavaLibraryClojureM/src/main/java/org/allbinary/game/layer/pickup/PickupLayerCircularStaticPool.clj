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

(ns PickupLayerCircularStaticPool)

(JR/register 'PickupLayerCircularStaticPool 'AllBinaryLayerCircularPool '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (PickupLayerCircularStaticPool/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (AllBinaryLayerCircularPool/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'PickupLayerCircularStaticPool)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PickupLayerCircularStaticPool/jstatic_SINGLETON)))

    
(defn jm_getInstanceXYZ_4 [this p_pickedUpLayerInterfaceFactoryInterface p_x p_y p_z]
  (let [ l_pickedUpLayerInterfaceFactoryInterface (volatile! p_pickedUpLayerInterfaceFactoryInterface) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_pickupLayer (volatile! nil)]
        (vreset! l_pickupLayer (JR/invoke this :jm_getNextInstance_0))
        (JR/invoke @l_pickupLayer :jm_initXYZ_3 @l_x @l_y @l_z)
        (JR/invoke @l_pickupLayer :jm_init_2 @l_pickedUpLayerInterfaceFactoryInterface (JR/invoke @l_pickedUpLayerInterfaceFactoryInterface :jm_getAnimationInterface_0))
        @l_pickupLayer))



