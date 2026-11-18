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
;; package org.allbinary.game.combat

(ns CombatBaseBehavior)

(JR/register 'CombatBaseBehavior nil '[])

(def jsv_NULL_COMBAT_BEHAVIOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COMBAT_BEHAVIOR [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COMBAT_BEHAVIOR)
(defn jstatic_set_NULL_COMBAT_BEHAVIOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COMBAT_BEHAVIOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COMBAT_BEHAVIOR (CombatBaseBehavior/jnew_2 (JR/scall 'DamageableBaseBehavior :jm_getInstance_0) (JR/scall 'DestroyableBaseBehavior :jm_getInstance_0)))
    nil))

(defn jinitfields [this]
  (JR/fset this :damageableBaseBehavior nil)
  (JR/fset this :destroyableBaseBehavior nil)
  (JR/fset this :readyForExplosion false)
  this)

    
(defn jinit_2 [this p_damageableBaseBehavior p_destroyableBaseBehavior]
  (let [ l_damageableBaseBehavior (volatile! p_damageableBaseBehavior) l_destroyableBaseBehavior (volatile! p_destroyableBaseBehavior)]
    nil (jinitfields this)
        (JR/fset this :damageableBaseBehavior @l_damageableBaseBehavior)
        (JR/fset this :destroyableBaseBehavior @l_destroyableBaseBehavior))
  this)

(defn jnew_2 [p_damageableBaseBehavior p_destroyableBaseBehavior ]
  (let [o (JR/alloc 'CombatBaseBehavior)] (jinit_2 o p_damageableBaseBehavior p_destroyableBaseBehavior) o))

    
(defn jm_getDamageableBaseBehavior_0 [this]
  (let []
        (JR/fget this :damageableBaseBehavior)))

    
(defn jm_getDestroyableBaseBehavior_0 [this]
  (let []
        (JR/fget this :destroyableBaseBehavior)))

    
(defn jm_isReadyForExplosion_0 [this]
  (let []
        (JR/fget this :readyForExplosion)))

    
(defn jm_setReadyForExplosion_1 [this p_readyForExplosion]
  (let [ l_readyForExplosion (volatile! p_readyForExplosion)]
        (JR/fset this :readyForExplosion @l_readyForExplosion)))



