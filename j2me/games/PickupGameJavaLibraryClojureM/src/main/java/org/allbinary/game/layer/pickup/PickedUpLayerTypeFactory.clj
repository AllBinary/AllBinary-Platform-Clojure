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
;; package org.allbinary.game.layer.pickup

(ns PickedUpLayerTypeFactory)

(JR/register 'PickedUpLayerTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PickedUpLayerTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NONE nil)
  (JR/fset this :BEAM nil)
  (JR/fset this :MINE nil)
  (JR/fset this :PROJECTILE nil)
  (JR/fset this :ENHANCEMENT nil)
  (JR/fset this :MORPH nil)
  (JR/fset this :PART nil)
  (JR/fset this :HEAL nil)
  (JR/fset this :LIFE nil)
  (JR/fset this :POINTS nil)
    (JR/fset this :NONE (PickedUpLayerType/jnew_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))
    (JR/fset this :BEAM (PickedUpLayerType/jnew_1 "BEAM"))
    (JR/fset this :MINE (PickedUpLayerType/jnew_1 "MINE"))
    (JR/fset this :PROJECTILE (PickedUpLayerType/jnew_1 "PROJECTILE"))
    (JR/fset this :ENHANCEMENT (PickedUpLayerType/jnew_1 "Enhancement"))
    (JR/fset this :MORPH (PickedUpLayerType/jnew_1 "Morph"))
    (JR/fset this :PART (PickedUpLayerType/jnew_1 "Part"))
    (JR/fset this :HEAL (PickedUpLayerType/jnew_1 "Heal"))
    (JR/fset this :LIFE (PickedUpLayerType/jnew_1 "Life"))
    (JR/fset this :POINTS (PickedUpLayerType/jnew_1 "Points"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PickedUpLayerTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PickedUpLayerTypeFactory/jstatic_instance)))



