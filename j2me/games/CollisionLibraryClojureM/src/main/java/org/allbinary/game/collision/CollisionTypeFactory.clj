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
;; package org.allbinary.game.collision

(ns CollisionTypeFactory)

(JR/register 'CollisionTypeFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (CollisionTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NONE nil)
  (JR/fset this :DAMAGE nil)
  (JR/fset this :PICKUP nil)
  (JR/fset this :COLLISION nil)
    (JR/fset this :NONE (CollisionType/jnew_1 "None"))
    (JR/fset this :DAMAGE (CollisionType/jnew_1 "Damage"))
    (JR/fset this :PICKUP (CollisionType/jnew_1 "Pickup"))
    (JR/fset this :COLLISION (CollisionType/jnew_1 "Collision"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CollisionTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CollisionTypeFactory/jstatic_SINGLETON)))



