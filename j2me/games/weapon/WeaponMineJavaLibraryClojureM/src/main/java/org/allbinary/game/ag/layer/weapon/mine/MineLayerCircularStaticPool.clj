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
;; package org.allbinary.game.ag.layer.weapon.mine

(ns MineLayerCircularStaticPool)

(JR/register 'MineLayerCircularStaticPool nil '[])

(def jsv_WEAPON_LAYER_CIRCULAR_STATIC_POOL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_WEAPON_LAYER_CIRCULAR_STATIC_POOL [] (JR/ensure-init jclinit-state jclinit) @jsv_WEAPON_LAYER_CIRCULAR_STATIC_POOL)
(defn jstatic_set_WEAPON_LAYER_CIRCULAR_STATIC_POOL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_WEAPON_LAYER_CIRCULAR_STATIC_POOL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_WEAPON_LAYER_CIRCULAR_STATIC_POOL (WeaponLayerCircularPool/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MineLayerCircularStaticPool)] (jinit_0 o) o))

    
(defn jm_init_1 [p_viewPositionFactoryInterface]
  (let [this nil l_viewPositionFactoryInterface (volatile! p_viewPositionFactoryInterface)]
        (JR/scall 'MineCountedPickedUpLayerInterfaceFactory :jm_init_0)
        (JR/invoke (MineLayerCircularStaticPool/jstatic_WEAPON_LAYER_CIRCULAR_STATIC_POOL) :jm_initAllBinaryLayerCircularPool_2 (MineLayerFactory/jnew_1 @l_viewPositionFactoryInterface) 20)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MineLayerCircularStaticPool/jstatic_WEAPON_LAYER_CIRCULAR_STATIC_POOL)))



