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
;; package org.allbinary.game.graphics.hud

(ns BasicHud)

(JR/register 'BasicHud nil '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :canvasStrings nil)
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :displayInfo nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :location 0)
  (JR/fset this :direction 0)
  (JR/fset this :bufferZone 0)
  (JR/fset this :bufferZoneY 0)
  (JR/fset this :hudGraphicsPosition nil)
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  (JR/fset this :basicColor nil)
  (JR/fset this :color 0)
  (JR/fset this :updateMaxWidth 0)
  (JR/fset this :updateMaxHeight 0)
  (JR/fset this :offsetY 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :hudGraphicsPosition (JR/sget 'HudGraphicsPosition "NULL_HUD_GRAPHICS_POSITION"))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK))
  this)

    
(defn jinit_4 [this p_location p_direction p_bufferZone p_basicColor]
  (let [ l_location (volatile! p_location) l_direction (volatile! p_direction) l_bufferZone (volatile! p_bufferZone) l_basicColor (volatile! p_basicColor)]
    nil (jinitfields this)
        (JR/invoke this :jm_setLocation_1 @l_location)
        (JR/invoke this :jm_setDirection_1 @l_direction)
        (JR/invoke this :jm_setBufferZone_1 @l_bufferZone)
        (JR/invoke this :jm_onDisplayChangeEvent_1 (JR/fget (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :displayChangeEvent))
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor)
        (JR/fset this :color (JR/invoke @l_basicColor :jm_intValue_0)))
  this)

(defn jnew_4 [p_location p_direction p_bufferZone p_basicColor ]
  (let [o (JR/alloc 'BasicHud)] (jinit_4 o p_location p_direction p_bufferZone p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/fset this :hudGraphicsPosition (JR/invoke this :jm_getHudGraphicsPositionWH_4 (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) (JR/invoke (JR/fget this :displayInfo) :jm_getLastHeight_0) (JR/fget this :updateMaxWidth) (JR/fget this :updateMaxHeight)))
            (JR/fset this :x (JR/invoke (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getPoint_0) :jm_getX_0))
            (JR/invoke this :jm_setY_1 (JR/invoke (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getPoint_0) :jm_getY_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT) @l_e)) :else (throw jt)))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_getLocation_0 [this]
  (let []
        (JR/fget this :location)))

    
(defn jm_getDirection_0 [this]
  (let []
        (JR/fget this :direction)))

    
(defn jm_getHudGraphicsPositionWH_4 [this p_width p_height p_maxWidth p_maxHeight]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_maxWidth (volatile! p_maxWidth) l_maxHeight (volatile! p_maxHeight) l_x (volatile! nil) l_y (volatile! nil) l_anchor (volatile! nil) l_basicHudFactory (volatile! nil)]
        (vreset! l_x 0)
        (vreset! l_y 0)
        (vreset! l_anchor 0)
        (vreset! l_basicHudFactory (JR/scall 'BasicHudFactory :jm_getInstance_0))
        (if (== (JR/fget @l_basicHudFactory :BOTTOMLEFT) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x (unchecked-int (unchecked-add (JR/fget this :bufferZone) 2)))
            (vreset! l_y (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_height @l_maxHeight)) (JR/fget this :bufferZone))))
            (vreset! l_anchor (bit-and (JR/sget 'Graphics "BOTTOM") (JR/sget 'Graphics "LEFT"))))
            (if (== (JR/fget @l_basicHudFactory :BOTTOMRIGHT) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x (unchecked-int (unchecked-subtract @l_width @l_maxWidth)))
            (vreset! l_y (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_height @l_maxHeight)) (JR/fget this :bufferZone))))
            (vreset! l_anchor (bit-and (JR/sget 'Graphics "BOTTOM") (JR/sget 'Graphics "RIGHT"))))
            (if (== (JR/fget @l_basicHudFactory :TOPLEFT) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x (unchecked-int (unchecked-add (JR/fget this :bufferZone) 2)))
            (vreset! l_y (JR/fget this :bufferZoneY))
            (vreset! l_anchor (JR/sget 'Anchor "TOP_LEFT")))
            (if (== (JR/fget @l_basicHudFactory :TOPRIGHT) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x (unchecked-int (unchecked-subtract @l_width @l_maxWidth)))
            (vreset! l_y (JR/fget this :bufferZoneY))
            (vreset! l_anchor (bit-and (JR/sget 'Graphics "TOP") (JR/sget 'Graphics "RIGHT"))))
            (if (== (JR/fget @l_basicHudFactory :TOPCENTER) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x (JR/idiv (unchecked-int (unchecked-subtract @l_width @l_maxWidth)) 2))
            (vreset! l_y (JR/fget this :bufferZoneY))
            (vreset! l_anchor (bit-and (JR/sget 'Graphics "TOP") (JR/sget 'Graphics "HCENTER"))))
            (if (== (JR/fget @l_basicHudFactory :BOTTOMCENTER) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x (JR/idiv (unchecked-int (unchecked-subtract @l_width @l_maxWidth)) 2))
            (vreset! l_y (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_height @l_maxHeight)) (JR/fget this :bufferZone))))
            (vreset! l_anchor (bit-and (JR/sget 'Graphics "BOTTOM") (JR/sget 'Graphics "HCENTER"))))
            (if (== (JR/fget @l_basicHudFactory :ABSOLUTE) (JR/invoke this :jm_getLocation_0))
            (do
            (vreset! l_x @l_maxHeight)
            (vreset! l_y @l_maxWidth)
            (vreset! l_anchor 0)))))))))
        (HudGraphicsPosition/jnew_2 (JR/invoke this :jm_getPoint_2 @l_x @l_y) @l_anchor)))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onDisplayChangeEvent_1 [this p_displayChangeEvent]
  (let [ l_displayChangeEvent (volatile! p_displayChangeEvent)]
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_getPoint_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/scall 'PointFactory :jm_getInstance_0) :jm_createXY_2 @l_x @l_y)))

    
(defn jm_getBufferZone_0 [this]
  (let []
        (JR/fget this :bufferZone)))

    
(defn jm_setBufferZone_1 [this p_bufferZone]
  (let [ l_bufferZone (volatile! p_bufferZone)]
        (JR/fset this :bufferZone @l_bufferZone)
        (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            (JR/fset this :bufferZoneY (JR/fget this :bufferZone)))
            (do
            (JR/fset this :bufferZoneY (unchecked-int (unchecked-add (JR/fget this :bufferZone) 5)))))))

    
(defn jm_setLocation_1 [this p_location]
  (let [ l_location (volatile! p_location)]
        (JR/fset this :location @l_location)))

    
(defn jm_setDirection_1 [this p_direction]
  (let [ l_direction (volatile! p_direction)]
        (JR/fset this :direction @l_direction)))

    
(defn jm_getHudGraphicsPosition_0 [this]
  (let []
        (JR/fget this :hudGraphicsPosition)))

    
(defn jm_getColor_0 [this]
  (let []
        (JR/fget this :color)))

    
(defn jm_getX_0 [this]
  (let []
        (JR/fget this :x)))

    
(defn jm_setX_1 [this p_x]
  (let [ l_x (volatile! p_x)]
        (JR/fset this :x @l_x)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_setY_1 [this p_y]
  (let [ l_y (volatile! p_y)]
        (JR/fset this :y @l_y)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/fget this :y)))

    
(defn jm_paintSSO_4 [this p_graphics p_string p_string2 p_offset]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_string2 (volatile! p_string2) l_offset (volatile! p_offset)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke this :jm_getBasicColorP_0))
        (JR/invoke @l_graphics :jm_drawString_4 @l_string (JR/fget this :x) (JR/invoke this :jm_getY_0) (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))
        (JR/invoke @l_graphics :jm_drawString_4 @l_string2 (unchecked-int (unchecked-add (JR/fget this :x) @l_offset)) (JR/invoke this :jm_getY_0) (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))))

    
(defn jm_paintSSOO_5 [this p_graphics p_string p_string2 p_offset p_offset2]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_string2 (volatile! p_string2) l_offset (volatile! p_offset) l_offset2 (volatile! p_offset2)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke this :jm_getColor_0))
        (JR/invoke @l_graphics :jm_drawString_4 @l_string (unchecked-int (unchecked-add (JR/fget this :x) @l_offset)) (JR/invoke this :jm_getY_0) (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))
        (JR/invoke @l_graphics :jm_drawString_4 @l_string2 (unchecked-int (unchecked-add (JR/fget this :x) @l_offset2)) (JR/invoke this :jm_getY_0) (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))))

    
(defn jm_paintDXY_9 [this p_graphics p_charArray p_offset p_len p_charArray2 p_offset2 p_len2 p_xOffset p_xOffset2]
  (let [ l_graphics (volatile! p_graphics) l_charArray (volatile! p_charArray) l_offset (volatile! p_offset) l_len (volatile! p_len) l_charArray2 (volatile! p_charArray2) l_offset2 (volatile! p_offset2) l_len2 (volatile! p_len2) l_xOffset (volatile! p_xOffset) l_xOffset2 (volatile! p_xOffset2) l_y (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke this :jm_getBasicColorP_0))
        (vreset! l_y (JR/invoke this :jm_getY_0))
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray @l_offset @l_len (unchecked-int (unchecked-add (JR/fget this :x) @l_xOffset)) @l_y (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray2 @l_offset2 @l_len2 (unchecked-int (unchecked-add (JR/fget this :x) @l_xOffset2)) @l_y (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))))

    
(defn jm_paintDX_8 [this p_graphics p_charArray p_offset p_len p_charArray2 p_offset2 p_len2 p_xOffset]
  (let [ l_graphics (volatile! p_graphics) l_charArray (volatile! p_charArray) l_offset (volatile! p_offset) l_len (volatile! p_len) l_charArray2 (volatile! p_charArray2) l_offset2 (volatile! p_offset2) l_len2 (volatile! p_len2) l_xOffset (volatile! p_xOffset) l_y (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke this :jm_getBasicColorP_0))
        (vreset! l_y (JR/invoke this :jm_getY_0))
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray @l_offset @l_len (JR/fget this :x) @l_y (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray2 @l_offset2 @l_len2 (unchecked-int (unchecked-add (JR/fget this :x) @l_xOffset)) @l_y (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))))

    
(defn jm_paintOffsetAndLength_4 [this p_graphics p_charArray p_offset p_len]
  (let [ l_graphics (volatile! p_graphics) l_charArray (volatile! p_charArray) l_offset (volatile! p_offset) l_len (volatile! p_len) l_y (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke this :jm_getBasicColorP_0))
        (vreset! l_y (JR/invoke this :jm_getY_0))
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray @l_offset @l_len (JR/fget this :x) @l_y (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))))

    
(defn jm_paintString_2 [this p_graphics p_string]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_y (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke this :jm_getBasicColorP_0))
        (vreset! l_y (unchecked-int (unchecked-add (JR/invoke this :jm_getY_0) (JR/fget this :offsetY))))
        (JR/invoke @l_graphics :jm_drawString_4 @l_string (JR/fget this :x) @l_y (JR/invoke (JR/fget this :hudGraphicsPosition) :jm_getAnchor_0))))



