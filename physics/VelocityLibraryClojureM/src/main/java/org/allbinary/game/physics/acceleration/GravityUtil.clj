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
;; package org.allbinary.game.physics.acceleration

(ns GravityUtil)

(JR/register 'GravityUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GravityUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :GAME_GRAVITY_VELOCITY 0)
  (JR/fset this :MAX_GAME_VELOCITY 0)
    (JR/fset this :GAME_GRAVITY_VELOCITY 1800)
    (JR/fset this :MAX_GAME_VELOCITY 18000)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GravityUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GravityUtil/jstatic_instance)))

    
(defn jm_process_2 [this p_velocityProperties p_customGravity]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_customGravity (volatile! p_customGravity)]
        (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityYBasicDecimalP_0) :jm_addint_1 @l_customGravity)))



