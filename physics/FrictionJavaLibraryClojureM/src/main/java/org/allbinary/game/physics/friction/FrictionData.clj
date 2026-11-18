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
;; package org.allbinary.game.physics.friction

(ns FrictionData)

(JR/register 'FrictionData nil '[])

(def jsv_FRICTION_DENOMINATOR (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_FRICTION_DENOMINATOR [] (JR/ensure-init jclinit-state jclinit) @jsv_FRICTION_DENOMINATOR)
(defn jstatic_set_FRICTION_DENOMINATOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_FRICTION_DENOMINATOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_FRICTION_DENOMINATOR 100)
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FrictionData)] (jinit_0 o) o))

    
(defn jm_getFrictionDenominator_0 []
  (let [this nil]
        (FrictionData/jstatic_FRICTION_DENOMINATOR)))



