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

(ns BasicPaintablesCanvas)

(JR/register 'BasicPaintablesCanvas 'GameCommandCanvas '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :paintableArray nil)
  (JR/fset this :colorFillPaintable nil)
  this)

    
(defn jinit_4 [this p_cmdListener p_name p_allBinaryGameLayerManager p_paintableArray]
  (let [ l_cmdListener (volatile! p_cmdListener) l_name (volatile! p_name) l_allBinaryGameLayerManager (volatile! p_allBinaryGameLayerManager) l_paintableArray (volatile! p_paintableArray)]
        (GameCommandCanvas/jinit_4 this @l_cmdListener @l_name (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_allBinaryGameLayerManager :jm_getForegroundBasicColor_0)) (jinitfields this)
        (JR/fset this :paintableArray @l_paintableArray)
        (JR/fset this :colorFillPaintable (JR/invoke (JR/scall 'ColorFillPaintableFactory :jm_getInstance_0) :jm_getInstance_2 (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) false)))
  this)

(defn jnew_4 [p_cmdListener p_name p_allBinaryGameLayerManager p_paintableArray ]
  (let [o (JR/alloc 'BasicPaintablesCanvas)] (jinit_4 o p_cmdListener p_name p_allBinaryGameLayerManager p_paintableArray) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :foregroundColor))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :paintableArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :paintableArray) @l_index) :jm_paint_1 @l_graphics)))
        (JR/invoke-super 'GameCommandCanvas this :jm_paint_1 @l_graphics)))



