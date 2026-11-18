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
;; package org.allbinary.game.combat.damage

(ns DamageFloaters)

(JR/register 'DamageFloaters 'Paintable '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (DamageFloaters/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (Paintable/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DamageFloaters)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DamageFloaters/jstatic_SINGLETON)))

    
(defn jm_add_1 [this p_damage]
  (let [ l_damage (volatile! p_damage)]
        nil))



