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
;; package org.allbinary.game.displayable.canvas

(ns StartIntermissionPaintable)

(JR/register 'StartIntermissionPaintable 'InitUpdatePaintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :fontDebugFactory nil)
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :gameCanvas nil)
  (JR/fset this :stringArray nil)
  (JR/fset this :fontSize 0)
  (JR/fset this :font nil)
  (JR/fset this :lastWidth nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :color 0)
  (JR/fset this :lineYOffsetArray nil)
  (JR/fset this :hasChanged false)
  (JR/fset this :anchor 0)
  (JR/fset this :fontHeightP 0)
  (JR/fset this :BEGIN_LEVEL nil)
  (JR/fset this :EMPTY_STRING nil)
    (JR/fset this :fontDebugFactory (JR/scall 'FontDebugFactory :jm_getInstance_0))
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK))
    (JR/fset this :lineYOffsetArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY))
    (JR/fset this :hasChanged true)
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
    (JR/fset this :BEGIN_LEVEL "Begin Level ")
    (JR/fset this :EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_4 [this p_gameCanvas p_stringArray p_basicColor p_font]
  (let [ l_gameCanvas (volatile! p_gameCanvas) l_stringArray (volatile! p_stringArray) l_basicColor (volatile! p_basicColor) l_font (volatile! p_font)]
    (InitUpdatePaintable/jinit_0 this) (jinitfields this)
        (JR/fset this :gameCanvas @l_gameCanvas)
        (JR/fset this :stringArray @l_stringArray)
        (JR/fset this :lastWidth (JR/anew "INT" 1 (JR/alen (JR/fget this :stringArray))))
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor)
        (JR/fset this :color (JR/invoke @l_basicColor :jm_intValue_0))
        (JR/fset this :fontSize (JR/invoke @l_font :jm_getSize_0))
        (JR/fset this :font @l_font))
  this)

(defn jnew_4 [p_gameCanvas p_stringArray p_basicColor p_font ]
  (let [o (JR/alloc 'StartIntermissionPaintable)] (jinit_4 o p_gameCanvas p_stringArray p_basicColor p_font) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :fontHeightP (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_existingFont (volatile! nil) l_displayInfo (volatile! nil) l_beginWidth (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_existingFont (JR/invoke @l_graphics :jm_getFont_0))
        (JR/invoke (JR/fget this :fontDebugFactory) :jm_setFont_2 (JR/fget this :font) @l_graphics)
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/fget this :basicColor) (JR/fget this :color))
        (vreset! l_beginWidth 0)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :lineYOffsetArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (JR/fget this :hasChanged)
                (do
                (JR/aset* (JR/fget this :lastWidth) @l_index (JR/ishr (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/aget* (JR/fget this :stringArray) @l_index)) 1))))
            (vreset! l_beginWidth (JR/aget* (JR/fget this :lastWidth) @l_index))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/aget* (JR/fget this :stringArray) @l_index) (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHalfWidth_0) @l_beginWidth)) (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHalfHeight_0) (JR/aget* (JR/fget this :lineYOffsetArray) @l_index))) (JR/fget this :anchor))))
        (JR/fset this :hasChanged false)
        (JR/invoke (JR/fget this :fontDebugFactory) :jm_setFont_2 @l_existingFont @l_graphics)))

    
(defn jm_update_0 [this]
  (let [ l_level (volatile! nil) l_index (volatile! nil)]
        (vreset! l_level (JR/invoke (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getLayerManager_0) :jm_getGameInfo_0) :jm_getCurrentLevel_0))
        (JR/aset* (JR/fget this :stringArray) 0 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :BEGIN_LEVEL)) :jm_appendint_1 @l_level)))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :stringArray)) 1)))
            (JR/jfor false false (>= @l_index 1) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :stringArray) @l_index (JR/fget this :EMPTY_STRING))))))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))



