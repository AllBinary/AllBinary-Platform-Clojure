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
;; package org.allbinary.game.terrain

(ns BasicTerrainInfo)

(JR/register 'BasicTerrainInfo nil '[])

(def jsv_NULL_BASIC_TERRAIN_INFO (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_BASIC_TERRAIN_INFO [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_BASIC_TERRAIN_INFO)
(defn jstatic_set_NULL_BASIC_TERRAIN_INFO [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_BASIC_TERRAIN_INFO v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_BASIC_TERRAIN_INFO (BasicTerrainInfo/jnew_1 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :NOT_ANGLE)))
    nil))

(defn jinitfields [this]
  (JR/fset this :angle nil)
  this)

    
(defn jinit_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
    nil (jinitfields this)
        (JR/fset this :angle @l_angle))
  this)

(defn jnew_1 [p_angle ]
  (let [o (JR/alloc 'BasicTerrainInfo)] (jinit_1 o p_angle) o))

    
(defn jm_getAngle_0 [this]
  (let []
        (JR/fget this :angle)))

    
(defn jm_setAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/fset this :angle @l_angle)))



