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

(ns GamePerformanceInitUpdatePaintable)

(JR/register 'GamePerformanceInitUpdatePaintable 'InitUpdatePaintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :halfHeight 0)
  (JR/fset this :yArray nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :baseRefreshHelperCharArray nil)
  (JR/fset this :defaultStringWidth 0)
  (JR/fset this :RED 0)
    (JR/fset this :halfHeight (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_getLastHalfHeight_0))
    (JR/fset this :yArray (JR/afrom "INT" 1 [(unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) 15)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) 15)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) 30)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) 30)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) 45)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/fget this :halfHeight) 30)) 45))]))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :baseRefreshHelperCharArray (JR/anew "CHAR" 2 0 0))
    (JR/fset this :RED (JR/invoke (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED) :jm_intValue_0))
  this)

(defn jinit_0 [this]
  (InitUpdatePaintable/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GamePerformanceInitUpdatePaintable)] (jinit_0 o) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :defaultStringWidth (JR/scall 'MyFontProcessor :jm_defaultStringWidth_2 @l_font 2))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_update_0 [this]
  (let []
        (JR/fset this :baseRefreshHelperCharArray (JR/invoke (JR/scall 'GameStatisticsFactory :jm_getInstance_0) :jm_to2DCharArray_0))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_charArray (volatile! nil) l_charArray2 (volatile! nil) l_size2 (volatile! nil) l_size3 (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :RED))
        (vreset! l_charArray nil)
        (vreset! l_charArray2 nil)
        (vreset! l_size2 0)
        (vreset! l_size3 0)
        (vreset! l_size (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :baseRefreshHelperCharArray)) 2)))
        (do (vreset! l_index @l_size)
            (JR/jfor false false (>= @l_index 0) (do (vreset! l_index (unchecked-int (unchecked-subtract @l_index 2))))
            (vreset! l_charArray (JR/aget* (JR/fget this :baseRefreshHelperCharArray) @l_index))
            (vreset! l_charArray2 (JR/aget* (JR/fget this :baseRefreshHelperCharArray) (unchecked-int (unchecked-add @l_index 1))))
            (vreset! l_size2 (JR/alen @l_charArray))
            (vreset! l_size3 (JR/alen @l_charArray2))
            (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray 0 @l_size2 0 (JR/aget* (JR/fget this :yArray) @l_index) 0)
            (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray2 0 @l_size3 (unchecked-int (unchecked-multiply @l_size2 (JR/fget this :defaultStringWidth))) (JR/aget* (JR/fget this :yArray) (unchecked-int (unchecked-add @l_index 1))) 0)))))



