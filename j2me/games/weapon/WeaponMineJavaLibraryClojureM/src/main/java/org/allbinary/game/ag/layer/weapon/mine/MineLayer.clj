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

(ns MineLayer)

(JR/register 'MineLayer 'SimpleWeaponLayer '[])

(def jsv_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NAME "MineLayer")
    nil))

(defn jinitfields [this]
  (JR/fset this :viewPositionEventHandler nil)
    (JR/fset this :viewPositionEventHandler (JR/scall 'ViewPositionEventHandler :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_viewPosition]
  (let [ l_viewPosition (volatile! p_viewPosition)]
        (SimpleWeaponLayer/jinit_8 this (MineLayer/jstatic_NAME) (JR/sget 'RemoteInfo "REMOTE_INFO") (unchecked-int (unchecked-negate (JR/c2i 1))) (JR/invoke (JR/scall 'NoMovementFactory :jm_getInstance_0) :jm_getMovmentInstance_0) (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget (JR/scall 'MineWeaponResources :jm_getInstance_0) :RESOURCE)) :jm_getInstance_1 0) (JR/scall 'SimpleWeaponLayer :jm_createDestroyed_0) (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 10 10) @l_viewPosition) (jinitfields this))
  this)

(defn jnew_1 [p_viewPosition ]
  (let [o (JR/alloc 'MineLayer)] (jinit_1 o p_viewPosition) o))

    
(defn jm_initXYZ_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/invoke this :jm_setPosition_3 (unchecked-int (unchecked-add @l_x 5)) (unchecked-int (unchecked-add @l_y 5)) @l_z)
        (JR/invoke (JR/fget this :viewPositionEventHandler) :jm_addListener_1 this)
        (JR/invoke (JR/scall 'SecondaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'DropWeaponSound :jm_getInstance_0))))

    
(defn jm_damage_2 [this p_damage p_damageType]
  (let [ l_damage (volatile! p_damage) l_damageType (volatile! p_damageType)]
        (JR/fset this :totalDamage (unchecked-int (unchecked-add (JR/invoke this :jm_getInitDamage_0) 1)))))

    
(defn jm_getDamage_1 [this p_damageType]
  (let [ l_damageType (volatile! p_damageType)]
        (JR/invoke-super 'SimpleWeaponLayer this :jm_getDamage_1 @l_damageType)
        (JR/invoke this :jm_getInitDamage_0)))

    
(defn jm_setDestroyed_1 [this p_destroyed]
  (let [ l_destroyed (volatile! p_destroyed)]
        (JR/invoke-super 'SimpleWeaponLayer this :jm_setDestroyed_1 @l_destroyed)
        (if (JR/invoke this :jm_isDestroyed_0)
            (do
            (JR/invoke (JR/fget this :viewPositionEventHandler) :jm_removeListener_1 this)))))



