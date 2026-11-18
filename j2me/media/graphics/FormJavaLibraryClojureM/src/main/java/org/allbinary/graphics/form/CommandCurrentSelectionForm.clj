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
;; package org.allbinary.graphics.form

(ns CommandCurrentSelectionForm)

(JR/register 'CommandCurrentSelectionForm 'ScrollCurrentSelectionForm '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :selectedAnimationArray nil)
  (JR/fset this :unSelectedAnimationArray nil)
    (JR/fset this :selectedAnimationArray (JR/anew "Object" 1 16))
    (JR/fset this :unSelectedAnimationArray (JR/anew "Object" 1 16))
  this)

    
(defn jinit_6 [this p_title p_items p_border p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_items (volatile! p_items) l_border (volatile! p_border) l_moveForSmallScreen (volatile! p_moveForSmallScreen) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ScrollCurrentSelectionForm/jinit_8 this @l_title @l_items (JR/scall 'ItemPaintableFactory :jm_getInstance_0) @l_border (unchecked-int (unchecked-negate (JR/c2i 3))) @l_moveForSmallScreen @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke this :jm_initAnimations_0)
        (JR/invoke this :jm_addAll_1 @l_items))
  this)

(defn jnew_6 [p_title p_items p_border p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'CommandCurrentSelectionForm)] (jinit_6 o p_title p_items p_border p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke this :jm_updateAll_2 @l_graphics (JR/invoke this :jm_getAllitems_0))
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_updateMeasurement_1 @l_graphics)))

    
(defn jm_initAnimations_0 [this]
  (let [ l_nullAnimation (volatile! nil) l_index (volatile! nil)]
        (vreset! l_nullAnimation (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))
        (do (vreset! l_index (JR/alen (JR/fget this :selectedAnimationArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/aset* (JR/fget this :selectedAnimationArray) @l_index @l_nullAnimation)))
        (do (vreset! l_index (JR/alen (JR/fget this :unSelectedAnimationArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/aset* (JR/fget this :unSelectedAnimationArray) @l_index @l_nullAnimation)))))

    
(defn jm_addAll_1 [this p_items]
  (let [ l_items (volatile! p_items) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen @l_items))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke this :jm_addAt_2 @l_index (JR/aget* @l_items @l_index))))))

    
(defn jm_addAt_2 [this p_index p_item]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_basicColorFactory (volatile! nil) l_buttonColor (volatile! nil) l_selectedButtonColor (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_adjustedBorder (volatile! nil) l_offset (volatile! nil) l_rectWidth (volatile! nil) l_rectHeight (volatile! nil)]
        (vreset! l_basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
        (vreset! l_buttonColor (JR/fget @l_basicColorFactory :TRANSPARENT_GREY))
        (vreset! l_selectedButtonColor (JR/fget @l_basicColorFactory :TRANSPARENT_RED))
        (vreset! l_width (JR/invoke @l_item :jm_getMinimumWidth_0))
        (vreset! l_height (JR/invoke @l_item :jm_getMinimumHeight_0))
        (vreset! l_adjustedBorder 3)
        (vreset! l_offset (- (+ (JR/fget this :halfBorder) @l_adjustedBorder)))
        (vreset! l_rectWidth (- (+ @l_width (JR/fget this :border)) @l_adjustedBorder))
        (vreset! l_rectHeight (- (+ @l_height (JR/fget this :border)) @l_adjustedBorder))
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            (JR/aset* (JR/fget this :selectedAnimationArray) @l_index (RectangleAdjustedAnimation/jnew_5 @l_rectWidth @l_rectHeight @l_offset @l_offset @l_selectedButtonColor)))
            (do
            (JR/aset* (JR/fget this :selectedAnimationArray) @l_index (RectangleFilledAdjustedAnimation/jnew_5 @l_rectWidth @l_rectHeight @l_offset @l_offset @l_selectedButtonColor))))
        (vreset! l_adjustedBorder 4)
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            (JR/aset* (JR/fget this :unSelectedAnimationArray) @l_index (RectangleAdjustedAnimation/jnew_5 @l_rectWidth @l_rectHeight @l_offset @l_offset @l_buttonColor)))
            (do
            (JR/aset* (JR/fget this :unSelectedAnimationArray) @l_index (RectangleFilledAdjustedAnimation/jnew_5 @l_rectWidth @l_rectHeight @l_offset @l_offset @l_buttonColor))))))

    
(defn jm_updateAll_2 [this p_graphics p_items]
  (let [ l_graphics (volatile! p_graphics) l_items (volatile! p_items) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen @l_items))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* @l_items @l_index) :jm_preMeasurement_1 @l_graphics)
            (JR/invoke this :jm_updateAt_2 @l_index (JR/aget* @l_items @l_index))))))

    
(defn jm_updateAt_2 [this p_index p_item]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_basicColorFactory (volatile! nil) l_buttonColor (volatile! nil) l_selectedButtonColor (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_adjustedBorder (volatile! nil) l_offset (volatile! nil) l_rectWidth (volatile! nil) l_rectHeight (volatile! nil) l_rectangleAdjustedAnimation (volatile! nil)]
        (vreset! l_basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
        (vreset! l_buttonColor (JR/fget @l_basicColorFactory :TRANSPARENT_GREY))
        (vreset! l_selectedButtonColor (JR/fget @l_basicColorFactory :TRANSPARENT_RED))
        (vreset! l_width (JR/invoke @l_item :jm_getMinimumWidth_0))
        (vreset! l_height (JR/invoke @l_item :jm_getMinimumHeight_0))
        (vreset! l_adjustedBorder 3)
        (vreset! l_offset (- (+ (JR/fget this :halfBorder) @l_adjustedBorder)))
        (vreset! l_rectWidth (- (+ @l_width (JR/fget this :border)) @l_adjustedBorder))
        (vreset! l_rectHeight (- (+ @l_height (JR/fget this :border)) @l_adjustedBorder))
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            (vreset! l_rectangleAdjustedAnimation (JR/aget* (JR/fget this :selectedAnimationArray) @l_index))
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setWidth_1 @l_rectWidth)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setHeight_1 @l_rectHeight)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetX_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetY_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setBasicColorP_1 @l_selectedButtonColor))
            (do
            (vreset! l_rectangleAdjustedAnimation (JR/aget* (JR/fget this :selectedAnimationArray) @l_index))
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setWidth_1 @l_rectWidth)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setHeight_1 @l_rectHeight)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetX_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetY_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setBasicColorP_1 @l_selectedButtonColor)))
        (vreset! l_adjustedBorder 4)
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            (vreset! l_rectangleAdjustedAnimation (JR/aget* (JR/fget this :unSelectedAnimationArray) @l_index))
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setWidth_1 @l_rectWidth)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setHeight_1 @l_rectHeight)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetX_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetY_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setBasicColorP_1 @l_buttonColor))
            (do
            (vreset! l_rectangleAdjustedAnimation (JR/aget* (JR/fget this :unSelectedAnimationArray) @l_index))
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setWidth_1 @l_rectWidth)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setHeight_1 @l_rectHeight)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetX_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setOffsetY_1 @l_offset)
            (JR/invoke @l_rectangleAdjustedAnimation :jm_setBasicColorP_1 @l_buttonColor)))))

    
(defn jm_getSelectedCommand_0 [this]
  (let [ l_index (volatile! nil) l_commandTextItem (volatile! nil)]
        (vreset! l_index (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_getSelectedIndex_0))
        (vreset! l_commandTextItem (JR/invoke this :jm_get_1 @l_index))
        (JR/invoke @l_commandTextItem :jm_getCommand_0)))

    
(defn jm_append_1 [this p_item]
  (let [ l_item (volatile! p_item) l_result (volatile! nil)]
        (vreset! l_result (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_append_1 @l_item))
        (JR/invoke this :jm_addAt_2 @l_result @l_item)
        @l_result))

    
(defn jm_delete_1 [this p_itemNum]
  (let [ l_itemNum (volatile! p_itemNum)]
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_delete_1 @l_itemNum)))

    
(defn jm_deleteAll_0 [this]
  (let []
        (JR/invoke this :jm_initAnimations_0)
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_deleteAll_0)))

    
(defn jm_insert_2 [this p_itemNum p_item]
  (let [ l_itemNum (volatile! p_itemNum) l_item (volatile! p_item)]
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_insert_2 @l_itemNum @l_item)))

    
(defn jm_set_2 [this p_itemNum p_item]
  (let [ l_itemNum (volatile! p_itemNum) l_item (volatile! p_item)]
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_set_2 @l_itemNum @l_item)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_paint_1 @l_graphics)))

    
(defn jm_paintItem_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/aget* (JR/fget this :selectedAnimationArray) @l_index) :jm_paintXY_3 @l_graphics @l_x @l_y)
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_paintItem_5 @l_graphics @l_index @l_item @l_x @l_y)))

    
(defn jm_paintUnselectedItem_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/aget* (JR/fget this :unSelectedAnimationArray) @l_index) :jm_paintXY_3 @l_graphics @l_x @l_y)
        (JR/invoke-super 'ScrollCurrentSelectionForm this :jm_paintUnselectedItem_5 @l_graphics @l_index @l_item @l_x @l_y)))



