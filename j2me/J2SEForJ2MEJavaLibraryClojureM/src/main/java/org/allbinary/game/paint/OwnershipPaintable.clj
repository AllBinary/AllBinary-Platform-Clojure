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

;;J2SEForJ2ME
(ns OwnershipPaintable)

(JR/register 'OwnershipPaintable 'Paintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :displayInfo nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :COPYRIGHT nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :color 0)
  (JR/fset this :anchor 0)
  (JR/fset this :COPYRIGHT_Y 0)
  (JR/fset this :beginWidth 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :COPYRIGHT "AllBinary Copyright (c) 2011")
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE))
    (JR/fset this :color (JR/invoke (JR/fget this :basicColor) :jm_intValue_0))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OwnershipPaintable/jnew_0)))

    
(defn jinit_0 [this]
  (let []
    (Paintable/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OwnershipPaintable)] (jinit_0 o) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :COPYRIGHT_Y (* 2 (JR/invoke @l_font :jm_getHeight_0)))
        (JR/fset this :beginWidth (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :COPYRIGHT)) 1))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)
        (JR/fset this :color (JR/invoke @l_basicColor :jm_intValue_0))))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_halfWidth (volatile! nil) l_height (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :color))
        (vreset! l_halfWidth (JR/invoke (JR/fget this :displayInfo) :jm_getLastHalfWidth_0))
        (vreset! l_height (JR/invoke (JR/fget this :displayInfo) :jm_getLastHeight_0))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :COPYRIGHT) (unchecked-int (unchecked-subtract @l_halfWidth (JR/fget this :beginWidth))) (unchecked-int (unchecked-subtract @l_height (JR/fget this :COPYRIGHT_Y))) (JR/fget this :anchor))))



