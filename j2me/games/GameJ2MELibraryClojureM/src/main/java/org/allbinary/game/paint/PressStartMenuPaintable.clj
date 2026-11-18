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

(ns PressStartMenuPaintable)

(JR/register 'PressStartMenuPaintable 'Paintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfo nil)
  (JR/fset this :PRESS_START nil)
  (JR/fset this :KEY_START nil)
  (JR/fset this :MENU_START nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :startString nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :flash false)
  (JR/fset this :anchor 0)
  (JR/fset this :beginWidth 0)
  (JR/fset this :line 0)
    (JR/fset this :displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :PRESS_START "Press Screen To Start")
    (JR/fset this :KEY_START "Press or Click F2 To Begin")
    (JR/fset this :MENU_START "Press Start From The Menu To Begin")
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :startString (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 1100))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_0 [this]
  (let []
    (Paintable/jinit_0 this) (jinitfields this)
        (if (JR/invoke (JR/scall 'TouchScreenFactory :jm_getInstance_0) :jm_isTouch_0)
            (do
            (JR/fset this :startString (JR/fget this :PRESS_START)))
            (if (JR/scall 'AppletUtil :jm_isAppletLoader_1 this)
            (do
            (JR/fset this :startString (JR/fget this :KEY_START)))
            (do
            (JR/fset this :startString (JR/fget this :MENU_START))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'PressStartMenuPaintable)] (jinit_0 o) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :beginWidth (JR/ishr (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/fget this :startString)) 1))
        (JR/fset this :line (+ (unchecked-int (unchecked-multiply 4 (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font))) (JR/ishr (JR/invoke @l_font :jm_getHeight_0) 1)))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTimeTNT_0)
            (do
            (if (JR/invoke this :jm_isFlash_0)
                (do
                (JR/invoke this :jm_setFlash_1 false))
                (do
                (JR/invoke this :jm_setFlash_1 true)))))
        (if (JR/invoke this :jm_isFlash_0)
            (do
            (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
            (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :startString) (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfo) :jm_getLastHalfWidth_0) (JR/fget this :beginWidth))) (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfo) :jm_getLastHeight_0) (JR/fget this :line))) (JR/fget this :anchor))))))

    
(defn jm_setFlash_1 [this p_flash]
  (let [ l_flash (volatile! p_flash)]
        (JR/fset this :flash @l_flash)))

    
(defn jm_isFlash_0 [this]
  (let []
        (JR/fget this :flash)))



