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
;; package org.allbinary.graphics.draw

(ns CanvasDrawLineString)

(JR/register 'CanvasDrawLineString nil '[UpdateMyFontInterface])

(def jsv_NULL_CANVAS_DRAW_LINE_STRING (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_CANVAS_DRAW_LINE_STRING [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_CANVAS_DRAW_LINE_STRING)
(defn jstatic_set_NULL_CANVAS_DRAW_LINE_STRING [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_CANVAS_DRAW_LINE_STRING v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_CANVAS_DRAW_LINE_STRING (CanvasDrawLineString/jnew_2 0 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :drawStringUtil nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  (JR/fset this :fontHeight 0)
    (JR/fset this :drawStringUtil (JR/scall 'DrawStringUtil :jm_getInstance_0))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :fontHeight 0)
  this)

    
(defn jinit_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
    nil (jinitfields this)
        (JR/fset this :x @l_x)
        (JR/fset this :y @l_y))
  this)

(defn jnew_2 [p_x p_y ]
  (let [o (JR/alloc 'CanvasDrawLineString)] (jinit_2 o p_x p_y) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :fontHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_3 [this p_graphics p_string p_line]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_line (volatile! p_line)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :drawStringUtil) :jm_drawCenterString_6 @l_graphics @l_string 0 (JR/slength @l_string) (JR/fget this :x) (unchecked-int (unchecked-add (JR/fget this :y) (unchecked-int (unchecked-multiply @l_line (JR/fget this :fontHeight))))))))



