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
;; package org.allbinary.graphics.paint

(ns SimpleTextPaintable)

(JR/register 'SimpleTextPaintable 'Paintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :text nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :topScoresWidth 0)
  (JR/fset this :fontHeight 0)
  (JR/fset this :anchor 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :topScoresWidth 0)
    (JR/fset this :fontHeight 0)
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_2 [this p_text p_basicColor]
  (let [ l_text (volatile! p_text) l_basicColor (volatile! p_basicColor)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :text @l_text)
        (JR/fset this :basicColor @l_basicColor))
  this)

(defn jnew_2 [p_text p_basicColor ]
  (let [o (JR/alloc 'SimpleTextPaintable)] (jinit_2 o p_text p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :topScoresWidth (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :text)) 1))
        (JR/fset this :fontHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_width (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_width (JR/aget* (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLast_0) (JR/fget (JR/fget this :displayInfoSingleton) :WIDTH)))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/invoke this :jm_getBasicColorP_0) :jm_intValue_0))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :text) (unchecked-int (unchecked-subtract (JR/ishr @l_width 1) (JR/fget this :topScoresWidth))) (JR/fget this :fontHeight) (JR/fget this :anchor))))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_setText_1 [this p_text]
  (let [ l_text (volatile! p_text)]
        (JR/fset this :text @l_text)
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_getText_0 [this]
  (let []
        (JR/fget this :text)))



