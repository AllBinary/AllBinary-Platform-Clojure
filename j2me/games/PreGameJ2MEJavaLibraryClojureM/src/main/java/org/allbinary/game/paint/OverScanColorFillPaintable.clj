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

(ns OverScanColorFillPaintable)

(JR/register 'OverScanColorFillPaintable 'ColorFillPaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (ColorFillPaintable/jinit_1 this @l_basicColor) (jinitfields this))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'OverScanColorFillPaintable)] (jinit_1 o p_basicColor) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :colorP))
        (JR/invoke @l_graphics :jm_fillRect_4 (- (JR/invoke @l_graphics :jm_getClipX_0)) (- (JR/invoke @l_graphics :jm_getClipY_0)) (+ (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0) (* (JR/invoke @l_graphics :jm_getClipX_0) 2)) (+ (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHeight_0) (* (JR/invoke @l_graphics :jm_getClipY_0) 2)))))



