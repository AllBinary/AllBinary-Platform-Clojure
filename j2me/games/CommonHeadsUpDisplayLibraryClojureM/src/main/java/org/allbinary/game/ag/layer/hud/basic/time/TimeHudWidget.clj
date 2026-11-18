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
;; package org.allbinary.game.ag.layer.hud.basic.time

(ns TimeHudWidget)

(JR/register 'TimeHudWidget 'BasicHud '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :TIME_STRING nil)
  (JR/fset this :TIME_CHAR_ARRAY nil)
  (JR/fset this :offset 0)
  (JR/fset this :string nil)
  (JR/fset this :totalDigits 0)
  (JR/fset this :timer nil)
    (JR/fset this :TIME_STRING "Time ")
    (JR/fset this :TIME_CHAR_ARRAY (JR/afrom "CHAR" 1 [\T \i \m \e \space]))
    (JR/fset this :string (JR/fget (JR/scall 'PrimitiveLongSingleton :jm_getInstance_0) :ZERO))
    (JR/fset this :totalDigits 1)
  this)

    
(defn jm_getInstance_4 [p_location p_direction p_basicColor p_timer]
  (let [this nil l_location (volatile! p_location) l_direction (volatile! p_direction) l_basicColor (volatile! p_basicColor) l_timer (volatile! p_timer)]
        (TimeHudWidget/jnew_5 @l_location @l_direction 2 @l_basicColor @l_timer)))

    
(defn jinit_5 [this p_location p_direction p_bufferZone p_basicColor p_timer]
  (let [ l_location (volatile! p_location) l_direction (volatile! p_direction) l_bufferZone (volatile! p_bufferZone) l_basicColor (volatile! p_basicColor) l_timer (volatile! p_timer)]
        (BasicHud/jinit_4 this @l_location @l_direction @l_bufferZone @l_basicColor) (jinitfields this)
        (JR/fset this :timer @l_timer)
        (JR/invoke this :jm_set_0)
        (JR/fset this :updateMaxHeight 14))
  this)

(defn jnew_5 [p_location p_direction p_bufferZone p_basicColor p_timer ]
  (let [o (JR/alloc 'TimeHudWidget)] (jinit_5 o p_location p_direction p_bufferZone p_basicColor p_timer) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :updateMaxWidth (* (JR/invoke @l_font :jm_getSize_0) 5))
        (JR/fset this :offset (+ (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :TIME_STRING)) (JR/scall 'MyFontProcessor :jm_defaultStringWidth_2 @l_font 3)))
        (JR/invoke-super 'BasicHud this :jm_updateMeasurement_1 @l_graphics)))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke (JR/fget this :timer) :jm_update_0)
        (JR/invoke this :jm_set_0)))

    
(defn jm_set_0 [this]
  (let []
        (JR/fset this :string (JR/invoke (JR/fget this :timer) :jm_getTimeChars_0))
        (JR/fset this :totalDigits (JR/invoke (JR/fget this :timer) :jm_getCurrentTotalDigits_0))))

    
(defn jm_getTimer_0 [this]
  (let []
        (JR/fget this :timer)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke-super 'BasicHud this :jm_paintDX_8 @l_graphics (JR/fget this :TIME_CHAR_ARRAY) 0 (JR/alen (JR/fget this :TIME_CHAR_ARRAY)) (JR/fget this :string) 0 (JR/fget this :totalDigits) (JR/fget this :offset))))



