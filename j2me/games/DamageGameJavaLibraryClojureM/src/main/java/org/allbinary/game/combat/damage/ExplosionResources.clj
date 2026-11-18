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

(ns ExplosionResources)

(JR/register 'ExplosionResources nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ExplosionResources/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EXPLOSION_90_RESOURCE nil)
  (JR/fset this :EXPLOSION_60_RESOURCE nil)
  (JR/fset this :HALF_EXPLOSION_RESOURCE nil)
  (JR/fset this :THIRD_EXPLOSION_RESOURCE nil)
    (JR/fset this :EXPLOSION_90_RESOURCE "/explosion_sprite_90_by_90.png")
    (JR/fset this :EXPLOSION_60_RESOURCE "/explosion_sprite_60_by_60.png")
    (JR/fset this :HALF_EXPLOSION_RESOURCE "/explosion_sprite_30_by_30.png")
    (JR/fset this :THIRD_EXPLOSION_RESOURCE "/explosion_sprite_15_by_15.png")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ExplosionResources/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ExplosionResources)] (jinit_0 o) o))



