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
;; package org.allbinary.animation.vector

(ns RectangleFilledAdjustedAnimation)

(JR/register 'RectangleFilledAdjustedAnimation 'RectangleFilledAnimation '[ColorCompositeInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :offsetX 0)
  (JR/fset this :offsetY 0)
  this)

    
(defn jinit_5 [this p_width p_height p_offsetX p_offsetY p_basicColor]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_offsetX (volatile! p_offsetX) l_offsetY (volatile! p_offsetY) l_basicColor (volatile! p_basicColor)]
        (RectangleFilledAnimation/jinit_3 this @l_width @l_height @l_basicColor) (jinitfields this)
        (JR/fset this :offsetX @l_offsetX)
        (JR/fset this :offsetY @l_offsetY)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor))
  this)

(defn jnew_5 [p_width p_height p_offsetX p_offsetY p_basicColor ]
  (let [o (JR/alloc 'RectangleFilledAdjustedAnimation)] (jinit_5 o p_width p_height p_offsetX p_offsetY p_basicColor) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/invoke this :jm_getBasicColorP_0) (JR/invoke this :jm_getColor_0))
        (JR/invoke-super 'RectangleFilledAnimation this :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :offsetX))) (unchecked-int (unchecked-add @l_y (JR/fget this :offsetY))))))

    
(defn jm_setOffsetX_1 [this p_offsetX]
  (let [ l_offsetX (volatile! p_offsetX)]
        (JR/fset this :offsetX @l_offsetX)))

    
(defn jm_setOffsetY_1 [this p_offsetY]
  (let [ l_offsetY (volatile! p_offsetY)]
        (JR/fset this :offsetY @l_offsetY)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/invoke-super 'RectangleFilledAnimation this :jm_getBasicColorP_0)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke-super 'RectangleFilledAnimation this :jm_setBasicColorP_1 @l_basicColor)))



