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

(ns CollidableAlwaysPickupNeverCollideBehaviorFactory)

(JR/register 'CollidableAlwaysPickupNeverCollideBehaviorFactory 'CollidableBaseBehaviorFactory '[])

(def jsv_instanceC (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceC [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceC)
(defn jstatic_set_instanceC [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceC v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceC (CollidableAlwaysPickupNeverCollideBehaviorFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :instance nil)
    (JR/fset this :instance (CollidableAlwaysPickupNeverCollideBehavior/jnew_0))
  this)

(defn jinit_0 [this]
  (CollidableBaseBehaviorFactory/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CollidableAlwaysPickupNeverCollideBehaviorFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CollidableAlwaysPickupNeverCollideBehaviorFactory/jstatic_instanceC)))

    
(defn jm_createBehavior_0 [this]
  (let []
        (JR/fget this :instance)))



