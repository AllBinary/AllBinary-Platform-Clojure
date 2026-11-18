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
;; package org.allbinary.game.part

(ns CountedLayersHudPaintable)

(JR/register 'CountedLayersHudPaintable nil '[PaintableInterface UpdateMyFontInterface])

(def jsv_XXStringWidth (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_XXStringWidth [] (JR/ensure-init jclinit-state jclinit) @jsv_XXStringWidth)
(defn jstatic_set_XXStringWidth [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_XXStringWidth v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_XXStringWidth 0)
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :partInterfaceArray nil)
  (JR/fset this :countedTotalStringColor 0)
  (JR/fset this :countedPartsBorder 0)
  (JR/fset this :startIndex 0)
  (JR/fset this :dropSize 0)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :height 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
  this)

    
(defn jinit_5 [this p_partInterfaceArray p_dropSize p_startIndex p_countedTotalStringColor p_countedPartsBorder]
  (let [ l_partInterfaceArray (volatile! p_partInterfaceArray) l_dropSize (volatile! p_dropSize) l_startIndex (volatile! p_startIndex) l_countedTotalStringColor (volatile! p_countedTotalStringColor) l_countedPartsBorder (volatile! p_countedPartsBorder)]
    nil (jinitfields this)
        (JR/fset this :partInterfaceArray @l_partInterfaceArray)
        (JR/fset this :startIndex @l_startIndex)
        (JR/fset this :countedTotalStringColor @l_countedTotalStringColor)
        (JR/fset this :countedPartsBorder @l_countedPartsBorder)
        (JR/fset this :dropSize @l_dropSize))
  this)

(defn jnew_5 [p_partInterfaceArray p_dropSize p_startIndex p_countedTotalStringColor p_countedPartsBorder ]
  (let [o (JR/alloc 'CountedLayersHudPaintable)] (jinit_5 o p_partInterfaceArray p_dropSize p_startIndex p_countedTotalStringColor p_countedPartsBorder) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_XXString (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :height (JR/invoke @l_font :jm_getHeight_0))
        (if (> (JR/fget this :dropSize) (JR/invoke @l_font :jm_getHeight_0))
            (do
            (JR/fset this :height (JR/fget this :dropSize))))
        (if (== (CountedLayersHudPaintable/jstatic_XXStringWidth) 0)
            (do
            (vreset! l_XXString "XX")
            (CountedLayersHudPaintable/jstatic_set_XXStringWidth (JR/invoke @l_font :jm_stringWidth_1 @l_XXString))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_lastWidth (volatile! nil) l_widthEdge (volatile! nil) l_size (volatile! nil) l_count (volatile! nil) l_y (volatile! nil) l_countedLayerInterfaceFactory (volatile! nil) l_pickedUpLayerInterfaceFactoryInterface (volatile! nil) l_layerInterface (volatile! nil) l_charArray (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_lastWidth (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0))
        (vreset! l_widthEdge (unchecked-int (unchecked-subtract @l_lastWidth (JR/fget this :dropSize))))
        (vreset! l_size (JR/alen (JR/fget this :partInterfaceArray)))
        (vreset! l_count 0)
        (vreset! l_y 0)
        (vreset! l_countedLayerInterfaceFactory nil)
        (vreset! l_pickedUpLayerInterfaceFactoryInterface nil)
        (vreset! l_layerInterface nil)
        (vreset! l_charArray nil)
        (do (vreset! l_index (JR/fget this :startIndex))
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_countedLayerInterfaceFactory (JR/aget* (JR/fget this :partInterfaceArray) @l_index))
            (if (> (JR/invoke @l_countedLayerInterfaceFactory :jm_getTotal_0) 0)
                (do
                (vreset! l_pickedUpLayerInterfaceFactoryInterface (JR/invoke @l_countedLayerInterfaceFactory :jm_getCountedPickedUpLayerInterfaceFactory_0))
                (vreset! l_layerInterface (JR/invoke @l_pickedUpLayerInterfaceFactoryInterface :jm_getIconLayer_0))
                (vreset! l_y (unchecked-int (unchecked-add 40 (unchecked-int (unchecked-multiply @l_count (JR/fget this :height))))))
                (JR/invoke @l_layerInterface :jm_setPosition_3 @l_widthEdge @l_y (JR/invoke @l_layerInterface :jm_getZP_0))
                (JR/invoke @l_layerInterface :jm_paint_1 @l_graphics)
                (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :countedTotalStringColor))
                (JR/invoke @l_countedLayerInterfaceFactory :jm_paint_1 @l_graphics)
                (vreset! l_charArray (JR/invoke @l_countedLayerInterfaceFactory :jm_getTotalString_0))
                (JR/invoke @l_graphics :jm_drawChars_6 @l_charArray 0 (JR/alen @l_charArray) (unchecked-int (unchecked-subtract @l_widthEdge (JR/invoke @l_countedLayerInterfaceFactory :jm_getXOffset_0))) @l_y 0)
                (JR/vinc l_count 1 :int false)))))
        (if (> @l_count 0)
            (do
            (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :countedPartsBorder))
            (JR/invoke @l_graphics :jm_drawRect_4 (unchecked-int (unchecked-subtract @l_lastWidth (unchecked-int (unchecked-add (CountedLayersHudPaintable/jstatic_XXStringWidth) (JR/fget this :dropSize))))) 40 (unchecked-int (unchecked-add (CountedLayersHudPaintable/jstatic_XXStringWidth) (JR/fget this :dropSize))) (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_count (JR/fget this :height))) 3)))))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



