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
;; package org.allbinary.game.ag.layer.hud.basic

(ns NumberStringHud)

(JR/register 'NumberStringHud 'BasicHud '[PaintableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :primitiveLongUtil nil)
  (JR/fset this :prependString nil)
  (JR/fset this :PREPEND_STRING nil)
  (JR/fset this :value 0)
  (JR/fset this :max 0)
  (JR/fset this :offset 0)
  (JR/fset this :valueString nil)
  (JR/fset this :valueTotalDigits 0)
  this)

    
(defn jinit_6 [this p_prependString p_max p_location p_direction p_bufferZone p_basicColor]
  (let [ l_prependString (volatile! p_prependString) l_max (volatile! p_max) l_location (volatile! p_location) l_direction (volatile! p_direction) l_bufferZone (volatile! p_bufferZone) l_basicColor (volatile! p_basicColor)]
        (BasicHud/jinit_4 this @l_location @l_direction @l_bufferZone @l_basicColor) (jinitfields this)
        (JR/fset this :prependString @l_prependString)
        (JR/fset this :PREPEND_STRING (JR/invoke @l_prependString :jm_toCharArray_0))
        (JR/fset this :valueString (JR/aget* (JR/fget (JR/scall 'PrimitiveLongSingleton :jm_getInstance_0) :NUMBER_CHAR_ARRAYS) 0))
        (JR/fset this :primitiveLongUtil (JR/scall 'PrimitiveLongUtil :jm_createPowerOfTen_1 (unchecked-int (unchecked-add @l_max 1))))
        (JR/fset this :max @l_max)
        (JR/fset this :value 0)
        (if (== @l_direction 0)
            (do
            (JR/jthrow (new java.lang.RuntimeException (JR/fget (JR/scall 'BasicHudFactory :jm_getInstance_0) :DIRECTION_EXCEPTION))))))
  this)

(defn jnew_6 [p_prependString p_max p_location p_direction p_bufferZone p_basicColor ]
  (let [o (JR/alloc 'NumberStringHud)] (jinit_6 o p_prependString p_max p_location p_direction p_bufferZone p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :offset (+ (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :prependString)) (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font)))
        (JR/invoke-super 'BasicHud this :jm_updateMeasurement_1 @l_graphics)))

    
(defn jm_get_0 [this]
  (let []
        (JR/fget this :value)))

    
(defn jm_add_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/invoke this :jm_set_1 (unchecked-int (unchecked-add (JR/fget this :value) @l_value)))))

    
(defn jm_set_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :value @l_value)
        (if (> (JR/fget this :value) (JR/fget this :max))
            (do
            (JR/fset this :value 0)))
        (JR/fset this :valueString (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCharArray_1 (JR/fget this :value)))
        (JR/fset this :valueTotalDigits (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCurrentTotalDigits_0))))

    
(defn jm_reduce_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/invoke this :jm_set_1 (unchecked-int (unchecked-subtract (JR/fget this :value) @l_value)))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke-super 'BasicHud this :jm_paintDX_8 @l_graphics (JR/fget this :PREPEND_STRING) 0 (JR/alen (JR/fget this :PREPEND_STRING)) (JR/fget this :valueString) 0 (JR/fget this :valueTotalDigits) (JR/fget this :offset))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_charArray (volatile! nil) l_len (volatile! nil) l_charArray2 (volatile! nil) l_len2 (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_charArray (JR/fget this :PREPEND_STRING))
        (vreset! l_len (JR/alen (JR/fget this :PREPEND_STRING)))
        (vreset! l_charArray2 (JR/fget this :valueString))
        (vreset! l_len2 (JR/fget this :valueTotalDigits))
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke this :jm_getBasicColorP_0))
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray 0 @l_len @l_x @l_y 0)
        (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray2 0 @l_len2 (unchecked-int (unchecked-subtract @l_x (JR/fget this :offset))) @l_y 0)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



