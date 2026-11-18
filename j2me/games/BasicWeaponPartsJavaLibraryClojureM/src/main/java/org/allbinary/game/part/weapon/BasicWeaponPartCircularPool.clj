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
;; package org.allbinary.game.part.weapon

(ns BasicWeaponPartCircularPool)

(JR/register 'BasicWeaponPartCircularPool nil '[])

(def jsv_NULL_BASIC_WEAPON_PART_CIRCULAR_POOL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_BASIC_WEAPON_PART_CIRCULAR_POOL [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_BASIC_WEAPON_PART_CIRCULAR_POOL)
(defn jstatic_set_NULL_BASIC_WEAPON_PART_CIRCULAR_POOL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_BASIC_WEAPON_PART_CIRCULAR_POOL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_BASIC_WEAPON_PART_CIRCULAR_POOL (BasicWeaponPartCircularPool/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :basicWeaponPart nil)
    (JR/fset this :basicWeaponPart (JR/sget 'BasicWeaponPart "NULL_BASIC_WEAPON_PART"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicWeaponPartCircularPool)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_basicWeaponPartFactoryInterface]
  (let [ l_basicWeaponPartFactoryInterface (volatile! p_basicWeaponPartFactoryInterface)]
        (JR/fset this :basicWeaponPart (JR/invoke @l_basicWeaponPartFactoryInterface :jm_getInstance_0))))

    
(defn jm_getInstance_4 [this p_sourceLayerInterface p_weaponProperties p_scoreableInterface p_relativeRelationship]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_relativeRelationship (volatile! p_relativeRelationship)]
        (JR/invoke (JR/fget this :basicWeaponPart) :jm_init_4 @l_sourceLayerInterface @l_weaponProperties @l_scoreableInterface @l_relativeRelationship)
        (JR/fget this :basicWeaponPart)))



