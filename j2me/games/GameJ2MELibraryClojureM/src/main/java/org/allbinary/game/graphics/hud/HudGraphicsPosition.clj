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
;; package org.allbinary.game.graphics.hud

(ns HudGraphicsPosition)

(JR/register 'HudGraphicsPosition nil '[])

(def jsv_NULL_HUD_GRAPHICS_POSITION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_HUD_GRAPHICS_POSITION [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_HUD_GRAPHICS_POSITION)
(defn jstatic_set_NULL_HUD_GRAPHICS_POSITION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_HUD_GRAPHICS_POSITION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_HUD_GRAPHICS_POSITION (HudGraphicsPosition/jnew_2 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 9))
    nil))

(defn jinitfields [this]
  (JR/fset this :anchor 0)
  (JR/fset this :point nil)
    (JR/fset this :point (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO))
  this)

    
(defn jinit_2 [this p_point p_anchor]
  (let [ l_point (volatile! p_point) l_anchor (volatile! p_anchor)]
    nil (jinitfields this)
        (JR/invoke this :jm_setAnchor_1 @l_anchor)
        (JR/invoke this :jm_setPoint_1 @l_point))
  this)

(defn jnew_2 [p_point p_anchor ]
  (let [o (JR/alloc 'HudGraphicsPosition)] (jinit_2 o p_point p_anchor) o))

    
(defn jm_getAnchor_0 [this]
  (let []
        (JR/fget this :anchor)))

    
(defn jm_setAnchor_1 [this p_anchor]
  (let [ l_anchor (volatile! p_anchor)]
        (JR/fset this :anchor @l_anchor)))

    
(defn jm_getPoint_0 [this]
  (let []
        (JR/fget this :point)))

    
(defn jm_setPoint_1 [this p_point]
  (let [ l_point (volatile! p_point)]
        (JR/fset this :point @l_point)))



