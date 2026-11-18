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
;; package org.allbinary.game.combat.weapon

(ns SimpleWeaponProperties)

(JR/register 'SimpleWeaponProperties nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :damage 0)
  (JR/fset this :dissipation 0)
  (JR/fset this :range 0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SimpleWeaponProperties)] (jinit_0 o) o))

    
(defn jm_set_1 [this p_simpleWeaponProperties]
  (let [ l_simpleWeaponProperties (volatile! p_simpleWeaponProperties)]
        (JR/invoke this :jm_setDamage_1 (JR/invoke @l_simpleWeaponProperties :jm_getDamage_0))
        (JR/invoke this :jm_setDissipation_1 (JR/invoke @l_simpleWeaponProperties :jm_getDissipation_0))
        (JR/invoke this :jm_setRange_1 (JR/invoke @l_simpleWeaponProperties :jm_getRange_0))))

    
(defn jm_setDamage_1 [this p_damage]
  (let [ l_damage (volatile! p_damage)]
        (JR/fset this :damage @l_damage)))

    
(defn jm_getDamage_0 [this]
  (let []
        (JR/fget this :damage)))

    
(defn jm_setDissipation_1 [this p_dissipation]
  (let [ l_dissipation (volatile! p_dissipation)]
        (JR/fset this :dissipation @l_dissipation)))

    
(defn jm_getDissipation_0 [this]
  (let []
        (JR/fget this :dissipation)))

    
(defn jm_getRange_0 [this]
  (let []
        (JR/fget this :range)))

    
(defn jm_setRange_1 [this p_range]
  (let [ l_range (volatile! p_range)]
        (JR/fset this :range @l_range)))



