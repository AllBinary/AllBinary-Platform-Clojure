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
;; package org.allbinary.game.layer.weapon

(ns WeaponLayerCircularPool)

(JR/register 'WeaponLayerCircularPool 'AllBinaryLayerCircularPool '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (AllBinaryLayerCircularPool/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'WeaponLayerCircularPool)] (jinit_0 o) o))

    
(defn jm_getInstanceWeaponLayer_8 [this p_sourceLayerInterface p_x p_y p_z p_angle p_otherAngle p_weaponProperties p_scoreable]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_weaponProperties (volatile! p_weaponProperties) l_scoreable (volatile! p_scoreable) l_weaponLayer (volatile! nil)]
        (vreset! l_weaponLayer (JR/invoke-super 'AllBinaryLayerCircularPool this :jm_getNextInstance_0))
        (JR/invoke @l_weaponLayer :jm_initXYZ_3 @l_x @l_y @l_z)
        (JR/invoke @l_weaponLayer :jm_init_5 @l_sourceLayerInterface @l_angle @l_otherAngle @l_weaponProperties @l_scoreable)
        @l_weaponLayer))



