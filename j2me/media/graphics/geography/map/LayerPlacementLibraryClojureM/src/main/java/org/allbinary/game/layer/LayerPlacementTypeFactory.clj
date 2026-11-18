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
;; package org.allbinary.game.layer

(ns LayerPlacementTypeFactory)

(JR/register 'LayerPlacementTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LayerPlacementTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :MAP nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :UP nil)
  (JR/fset this :RIGHT nil)
    (JR/fset this :MAP (LayerPlacementType/jnew_1 java.lang.Integer/MAX_VALUE))
    (JR/fset this :LEFT (LayerPlacementType/jnew_1 (JR/invoke (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :LEFT) :jm_getValue_0)))
    (JR/fset this :DOWN (LayerPlacementType/jnew_1 (JR/invoke (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :DOWN) :jm_getValue_0)))
    (JR/fset this :UP (LayerPlacementType/jnew_1 (JR/invoke (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :UP) :jm_getValue_0)))
    (JR/fset this :RIGHT (LayerPlacementType/jnew_1 (JR/invoke (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :RIGHT) :jm_getValue_0)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LayerPlacementTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LayerPlacementTypeFactory/jstatic_instance)))



