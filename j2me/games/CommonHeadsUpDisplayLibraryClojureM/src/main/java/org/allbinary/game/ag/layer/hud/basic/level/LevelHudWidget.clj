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
;; package org.allbinary.game.ag.layer.hud.basic.level

(ns LevelHudWidget)

(JR/register 'LevelHudWidget 'BasicHud '[PaintableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :level 0)
  (JR/fset this :maxlevel 0)
  (JR/fset this :levelString nil)
  (JR/fset this :levelNumberCharArray nil)
  (JR/fset this :levelNumberTotalDigits 0)
  (JR/fset this :offset 0)
  (JR/fset this :primitiveLongUtil nil)
    (JR/fset this :levelNumberCharArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_CHAR_ARRAY))
  this)

    
(defn jm_createHud_3 [p_maxlevel p_location p_direction]
  (let [this nil l_maxlevel (volatile! p_maxlevel) l_location (volatile! p_location) l_direction (volatile! p_direction)]
        (LevelHudWidget/jnew_3 @l_maxlevel @l_location @l_direction)))

    
(defn jinit_3 [this p_maxlevel p_location p_direction]
  (let [ l_maxlevel (volatile! p_maxlevel) l_location (volatile! p_location) l_direction (volatile! p_direction) l_LEVEL (volatile! nil)]
        (BasicHud/jinit_4 this @l_location @l_direction 2 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :GREY)) (jinitfields this)
        (JR/fset this :primitiveLongUtil (JR/scall 'PrimitiveLongUtil :jm_createPowerOfTen_1 1000))
        (vreset! l_LEVEL "Lv ")
        (JR/fset this :levelString (JR/invoke @l_LEVEL :jm_toCharArray_0))
        (JR/fset this :maxlevel @l_maxlevel)
        (JR/fset this :level @l_maxlevel)
        (JR/invoke this :jm_update_0)
        (JR/fset this :updateMaxHeight 14))
  this)

(defn jnew_3 [p_maxlevel p_location p_direction ]
  (let [o (JR/alloc 'LevelHudWidget)] (jinit_3 o p_maxlevel p_location p_direction) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :updateMaxWidth (* (JR/invoke @l_font :jm_getSize_0) 4))
        (JR/fset this :offset (+ (JR/invoke @l_font :jm_charsWidth_3 (JR/fget this :levelString) 0 (JR/alen (JR/fget this :levelString))) (JR/invoke @l_font :jm_getSize_0)))
        (JR/invoke-super 'BasicHud this :jm_updateMeasurement_1 @l_graphics)))

    
(defn jm_update_0 [this]
  (let []
        (JR/fset this :levelNumberCharArray (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCharArray_1 (JR/fget this :level)))
        (JR/fset this :levelNumberTotalDigits (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCurrentTotalDigits_0))))

    
(defn jm_setLevel_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        (JR/fset this :level @l_level)
        (JR/invoke this :jm_update_0)))

    
(defn jm_nextLevel_0 [this]
  (let []
        (JR/finc this :level 1 :int false)
        (JR/invoke this :jm_update_0)))

    
(defn jm_previousLevel_0 [this]
  (let []
        (JR/finc this :level -1 :int false)
        (if (< (JR/fget this :level) 0)
            (do
            (JR/fset this :level 0)))
        (JR/invoke this :jm_update_0)))

    
(defn jm_isComplete_0 [this]
  (let []
        (if (<= (JR/fget this :level) (JR/fget this :maxlevel))
            (do
            false)
            (do
            true))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke-super 'BasicHud this :jm_paintDX_8 @l_graphics (JR/fget this :levelString) 0 (JR/alen (JR/fget this :levelString)) (JR/fget this :levelNumberCharArray) 0 (JR/fget this :levelNumberTotalDigits) (JR/fget this :offset))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



