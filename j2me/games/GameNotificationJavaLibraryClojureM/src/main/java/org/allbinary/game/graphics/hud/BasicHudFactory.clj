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

(ns BasicHudFactory)

(JR/register 'BasicHudFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicHudFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :DIRECTION_EXCEPTION nil)
  (JR/fset this :VERTICAL 0)
  (JR/fset this :HORIZONTAL 0)
  (JR/fset this :BOTTOMLEFT 0)
  (JR/fset this :BOTTOMRIGHT 0)
  (JR/fset this :TOPLEFT 0)
  (JR/fset this :TOPRIGHT 0)
  (JR/fset this :BOTTOMCENTER 0)
  (JR/fset this :TOPCENTER 0)
  (JR/fset this :ABSOLUTE 0)
    (JR/fset this :DIRECTION_EXCEPTION "Only Horizontal Direction is Allowed Currently")
    (JR/fset this :VERTICAL 0)
    (JR/fset this :HORIZONTAL 1)
    (JR/fset this :BOTTOMLEFT 0)
    (JR/fset this :BOTTOMRIGHT 1)
    (JR/fset this :TOPLEFT 2)
    (JR/fset this :TOPRIGHT 3)
    (JR/fset this :BOTTOMCENTER 4)
    (JR/fset this :TOPCENTER 5)
    (JR/fset this :ABSOLUTE 6)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicHudFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicHudFactory)] (jinit_0 o) o))



