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
;; package org.allbinary.game.paint

(ns ColorFillPaintable)

(JR/register 'ColorFillPaintable 'ColorFillBasePaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (ColorFillBasePaintable/jinit_1 this @l_basicColor) (jinitfields this))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'ColorFillPaintable)] (jinit_1 o p_basicColor) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :colorP))
        (JR/invoke @l_graphics :jm_fillRect_4 0 0 (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0) (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHeight_0))))



