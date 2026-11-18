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

(ns ColorFillBasePaintable)

(JR/register 'ColorFillBasePaintable 'Paintable '[ColorCompositeInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColor nil)
  (JR/fset this :colorP 0)
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE))
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'ColorFillBasePaintable)] (jinit_1 o p_basicColor) o))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)
        (JR/invoke this :jm_setColor_1 (JR/invoke (JR/invoke this :jm_getBasicColorP_0) :jm_intValue_0))))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_getColor_0 [this]
  (let []
        (JR/fget this :colorP)))

    
(defn jm_setColor_1 [this p_color]
  (let [ l_color (volatile! p_color)]
        (JR/fset this :colorP @l_color)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



