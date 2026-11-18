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
;; package org.allbinary.game.ag.layer.hud.basic

(ns HudResources)

(JR/register 'HudResources nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (HudResources/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :RESOURCE_LIFE nil)
  (JR/fset this :RESOURCE_HEALTH nil)
    (JR/fset this :RESOURCE_LIFE "/hud_life_10_by_10.png")
    (JR/fset this :RESOURCE_HEALTH "/hud_health_10_by_10.png")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HudResources/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HudResources)] (jinit_0 o) o))



