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

(ns MineCountedPickedUpLayerInterfaceFactory)

(JR/register 'MineCountedPickedUpLayerInterfaceFactory 'CountedPickedUpLayerInterfaceFactory '[])

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
  (JR/fset this :weaponLayerCircularStaticPool nil)
  (JR/fset this :weaponProperties nil)
  (JR/fset this :smallIntegerSingletonFactory nil)
    (JR/fset this :weaponLayerCircularStaticPool (JR/scall 'MineLayerCircularStaticPool :jm_getInstance_0))
    (JR/fset this :weaponProperties (WeaponProperties/jnew_5 (unchecked-negate 1) (unchecked-negate 1) 0 8000 (JR/i16 10)))
    (JR/fset this :smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
  this)

    
(defn jm_init_0 []
  (let [this nil]
        (MineCountedPickedUpLayerInterfaceFactory/jstatic_set_pickedUpLayerInterfaceFactoryInterface (MineCountedPickedUpLayerInterfaceFactory/jnew_0))))

    
(defn jinit_0 [this]
  (let []
        (CountedPickedUpLayerInterfaceFactory/jinit_3 this (JR/fget (JR/scall 'PickedUpLayerTypeFactory :jm_getInstance_0) :MINE) (JR/scall 'IconLayerFactory :jm_getInstance_3 (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget (JR/scall 'MineWeaponResources :jm_getInstance_0) :DROP_ICON_RESOURCE)) :jm_getInstance_1 0) 10 10) (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget (JR/scall 'MineWeaponResources :jm_getInstance_0) :DROP_RESOURCE)) :jm_getInstance_1 0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MineCountedPickedUpLayerInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MineCountedPickedUpLayerInterfaceFactory/jstatic_pickedUpLayerInterfaceFactoryInterface)))

    
(defn jm_getTotal_0 [this]
  (let []
        3))

    
(defn jm_getNextInstance_4 [this p_hashtable p_x p_y p_z]
  (let [ l_hashtable (volatile! p_hashtable) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_sourceLayerInterface (volatile! nil) l_angle (volatile! nil) l_scoreableInterface (volatile! nil)]
        (vreset! l_sourceLayerInterface (JR/invoke @l_hashtable :jm_get_1 (JR/invoke (JR/fget this :smallIntegerSingletonFactory) :jm_getAt_1 0)))
        (vreset! l_angle (JR/invoke @l_hashtable :jm_get_1 (JR/invoke (JR/fget this :smallIntegerSingletonFactory) :jm_getAt_1 1)))
        (vreset! l_scoreableInterface @l_sourceLayerInterface)
        (JR/invoke (JR/fget this :weaponLayerCircularStaticPool) :jm_getInstanceWeaponLayer_8 @l_sourceLayerInterface @l_x @l_y @l_z (JR/i32 (JR/invoke @l_angle :jm_intValue_0)) 0 (JR/fget this :weaponProperties) @l_scoreableInterface)))



