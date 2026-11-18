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
;; package org.allbinary.game.paint.help

(ns HelpPaintable)

(JR/register 'HelpPaintable 'Paintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfo nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :anchor 0)
  (JR/fset this :title nil)
  (JR/fset this :inputInfo nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :titleBeginWidth 0)
  (JR/fset this :beginWidthArray nil)
  (JR/fset this :charHeight 0)
    (JR/fset this :displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
    (JR/fset this :inputInfo (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0))
    (JR/fset this :beginWidthArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY))
  this)

    
(defn jinit_3 [this p_title p_backgroundBasicColor p_basicColor]
  (let [ l_title (volatile! p_title) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_basicColor (volatile! p_basicColor)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :title @l_title)
        (JR/fset this :basicColor @l_basicColor))
  this)

(defn jnew_3 [p_title p_backgroundBasicColor p_basicColor ]
  (let [o (JR/alloc 'HelpPaintable)] (jinit_3 o p_title p_backgroundBasicColor p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :titleBeginWidth (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :title)) 1))
        (JR/fset this :charHeight (JR/invoke @l_font :jm_getHeight_0))
        (vreset! l_size (JR/alen (JR/fget this :inputInfo)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :beginWidthArray) @l_index (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/aget* (JR/fget this :inputInfo) @l_index)) 1))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_setInputInfoP_1 [this p_inputInfo]
  (let [ l_inputInfo (volatile! p_inputInfo)]
        (JR/fset this :inputInfo @l_inputInfo)
        (JR/fset this :beginWidthArray (JR/anew "INT" 1 (JR/alen (JR/fget this :inputInfo))))
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_halfWidth (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_halfWidth (JR/invoke (JR/fget this :displayInfo) :jm_getLastHalfWidth_0))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/fget this :basicColor) :jm_intValue_0))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :title) (unchecked-int (unchecked-subtract @l_halfWidth (JR/fget this :titleBeginWidth))) (JR/fget this :charHeight) (JR/fget this :anchor))
        (vreset! l_size (JR/alen (JR/fget this :inputInfo)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/aget* (JR/fget this :inputInfo) @l_index) (unchecked-int (unchecked-subtract @l_halfWidth (JR/aget* (JR/fget this :beginWidthArray) @l_index))) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add @l_index 3)) (JR/fget this :charHeight))) (JR/fget this :anchor))))))



