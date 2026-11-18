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

(ns ScrollSelectionForm)

(JR/register 'ScrollSelectionForm 'PaintableForm '[])

(def jsv_NULL_SCROLL_SELECTION_FORM (atom nil))
(def jsv_NULL_SCROLL_SELECTION_HORIZONTAL_FORM (atom nil))
(def jsv_INSIDE_FORM (atom nil))
(def jsv_IS_IN_FORM (atom nil))
(def jsv_GET_SELECTED_INDEX (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_SCROLL_SELECTION_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_SCROLL_SELECTION_FORM)
(defn jstatic_set_NULL_SCROLL_SELECTION_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_SCROLL_SELECTION_FORM v))
(defn jstatic_NULL_SCROLL_SELECTION_HORIZONTAL_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_SCROLL_SELECTION_HORIZONTAL_FORM)
(defn jstatic_set_NULL_SCROLL_SELECTION_HORIZONTAL_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_SCROLL_SELECTION_HORIZONTAL_FORM v))
(defn jstatic_INSIDE_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_INSIDE_FORM)
(defn jstatic_set_INSIDE_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INSIDE_FORM v))
(defn jstatic_IS_IN_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_IS_IN_FORM)
(defn jstatic_set_IS_IN_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_IS_IN_FORM v))
(defn jstatic_GET_SELECTED_INDEX [] (JR/ensure-init jclinit-state jclinit) @jsv_GET_SELECTED_INDEX)
(defn jstatic_set_GET_SELECTED_INDEX [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_GET_SELECTED_INDEX v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_SCROLL_SELECTION_FORM (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    (reset! jsv_NULL_SCROLL_SELECTION_HORIZONTAL_FORM (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    (reset! jsv_INSIDE_FORM " inside form")
    (reset! jsv_IS_IN_FORM "isInForm")
    (reset! jsv_GET_SELECTED_INDEX "getSelectedIndexForPoint")
    nil))

(defn jinitfields [this]
  (JR/fset this :rectangleCollisionUtil nil)
  (JR/fset this :border 0)
  (JR/fset this :halfBorder 0)
  (JR/fset this :buttonBasicColor nil)
  (JR/fset this :scrollSelectionFormFormTypeItemIndexPaintable nil)
  (JR/fset this :formTypeItemIndexDx nil)
  (JR/fset this :paintable nil)
  (JR/fset this :adjustedExtraBorder 0)
    (JR/fset this :rectangleCollisionUtil (JR/scall 'RectangleCollisionUtil :jm_getInstance_0))
    (JR/fset this :scrollSelectionFormFormTypeItemIndexPaintable (JR/scall 'ItemIndexPaintable :jm_getInstance_0))
    (JR/fset this :formTypeItemIndexDx (JR/scall 'ItemIndexDx :jm_getInstance_0))
    (JR/fset this :paintable (JR/scall 'ItemPaintableFactory :jm_getInstance_0))
  this)

    
(defn jm_createForm_6 [p_title p_items p_formPaintableFactory p_border p_backgroundBasicColor p_foregroundBasicColor]
  (let [this nil l_title (volatile! p_title) l_items (volatile! p_items) l_formPaintableFactory (volatile! p_formPaintableFactory) l_border (volatile! p_border) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_commonStrings (volatile! nil) l_logUtil (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (if (JR/eq @l_formPaintableFactory (JR/scall 'ItemPaintableFactory :jm_getInstance_0))
                (do
                (JR/jreturn (ScrollSelectionForm/jnew_7 @l_title @l_items @l_formPaintableFactory @l_border (unchecked-int (unchecked-negate (JR/c2i 3))) @l_backgroundBasicColor @l_foregroundBasicColor)))
                (do
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
                (JR/invoke @l_logUtil :jm_putF_3 (JR/fget @l_commonStrings :EXCEPTION) @l_logUtil (JR/fget @l_commonStrings :EXCEPTION))
                (JR/jreturn (JR/scall 'PaintableForm :jm_getNullPaintableForm_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) @l_logUtil (JR/fget @l_commonStrings :EXCEPTION) @l_e)
            (JR/jreturn (JR/scall 'PaintableForm :jm_getNullPaintableForm_0))) :else (throw jt))))))))

    
(defn jm_getNullScrollSelectionForm_0 []
  (let [this nil]
        (if (JR/eq (ScrollSelectionForm/jstatic_NULL_SCROLL_SELECTION_FORM) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (ScrollSelectionForm/jstatic_set_NULL_SCROLL_SELECTION_FORM (ScrollSelectionForm/jm_createForm_6 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/anew "Object" 1 0) (JR/scall 'ItemPaintableFactory :jm_getInstance_0) 0 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))
        (ScrollSelectionForm/jstatic_NULL_SCROLL_SELECTION_FORM)))

    
(defn jm_getNullScrollSelectionFormHorizontal_0 []
  (let [this nil]
        (if (JR/eq (ScrollSelectionForm/jstatic_NULL_SCROLL_SELECTION_HORIZONTAL_FORM) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (ScrollSelectionForm/jstatic_set_NULL_SCROLL_SELECTION_HORIZONTAL_FORM (ScrollSelectionForm/jm_createForm_6 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/anew "Object" 1 0) (JR/scall 'ItemPaintableFactory :jm_getInstance_0) 0 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))
        (ScrollSelectionForm/jstatic_NULL_SCROLL_SELECTION_HORIZONTAL_FORM)))

    
(defn jinit_7 [this p_title p_items p_formPaintableFactory p_border p_adjustedExtraBorder p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_items (volatile! p_items) l_formPaintableFactory (volatile! p_formPaintableFactory) l_border (volatile! p_border) l_adjustedExtraBorder (volatile! p_adjustedExtraBorder) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (PaintableForm/jinit_4 this @l_title @l_items @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/fset this :adjustedExtraBorder @l_adjustedExtraBorder)
        (JR/fset this :buttonBasicColor @l_foregroundBasicColor)
        (JR/fset this :border @l_border)
        (JR/fset this :halfBorder (JR/ishr @l_border 1))
        (JR/fset this :paintable (JR/invoke @l_formPaintableFactory :jm_getInstanceItemPaintable_1 this)))
  this)

(defn jnew_7 [p_title p_items p_formPaintableFactory p_border p_adjustedExtraBorder p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ScrollSelectionForm)] (jinit_7 o p_title p_items p_formPaintableFactory p_border p_adjustedExtraBorder p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_init_2 [this p_rectangle p_formType]
  (let [ l_rectangle (volatile! p_rectangle) l_formType (volatile! p_formType) l_formTypeFactory (volatile! nil)]
        (JR/invoke-super 'PaintableForm this :jm_init_2 @l_rectangle @l_formType)
        (vreset! l_formTypeFactory (JR/scall 'FormTypeFactory :jm_getInstance_0))
        (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :HORIZONTAL_FORM))
            (do
            (JR/fset this :scrollSelectionFormFormTypeItemIndexPaintable (ScrollSelectionFormHorizontalPaintable/jnew_1 this))
            (JR/fset this :formTypeItemIndexDx (ScrollSelectionFormHorizontalDx/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :VERTICAL_CENTER_FORM))
            (do
            (JR/fset this :scrollSelectionFormFormTypeItemIndexPaintable (ScrollSelectionFormVerticalPaintable/jnew_1 this))
            (JR/fset this :formTypeItemIndexDx (ScrollSelectionFormVericalDx/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :TEMP_HORIZONTAL_FORM))
            (do
            (JR/fset this :scrollSelectionFormFormTypeItemIndexPaintable (ScrollSelectionFormTempHorizontalPaintable/jnew_1 this))
            (JR/fset this :formTypeItemIndexDx (ScrollSelectionFormTempHorizontalDx/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :NULL_FORM_TYPE))
            (do
            nil)
            (do
            (JR/jthrow (new java.lang.Exception (JR/fget @l_formTypeFactory :UNK))))))))))

    
(defn jm_paintItemHorizontal_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! nil)]
        (vreset! l_width (JR/invoke @l_item :jm_getMinimumWidth_0))
        (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_x @l_width)) (JR/fget this :border)))))

    
(defn jm_paintItemVertical_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y) l_height (volatile! nil)]
        (vreset! l_height (JR/invoke @l_item :jm_getMinimumHeight_0))
        (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y @l_height)) (JR/fget this :border)))))

    
(defn jm_paintItemTempHorizontal_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y)]
        0))

    
(defn jm_getSelectedIndexForPointHorizontalDx_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (unchecked-int (unchecked-subtract @l_dx (JR/fget this :halfBorder)))))

    
(defn jm_getSelectedIndexForPointVerticalDx_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (unchecked-int (unchecked-add @l_dx (JR/invoke this :jm_getDiffX_1 @l_item)))))

    
(defn jm_getSelectedIndexForPointTempHorizontalDx_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (unchecked-int (unchecked-add @l_dx (JR/invoke this :jm_getDiffX_1 @l_item)))))

    
(defn jm_append_1 [this p_item]
  (let [ l_item (volatile! p_item)]
        (JR/invoke-super 'PaintableForm this :jm_append_1 @l_item)))

    
(defn jm_getSelectedItem_1 [this p_point]
  (let [ l_point (volatile! p_point) l_index (volatile! nil)]
        (vreset! l_index (JR/invoke this :jm_getSelectedIndexForPoint_1 @l_point))
        (if (not (== @l_index (unchecked-int (unchecked-negate (JR/c2i 1)))))
            (do
            (JR/invoke this :jm_get_1 @l_index))
            (do
            (JR/scall 'ABCustomItem :jm_getNullInstance_0)))))

    
(defn jm_getItemIndex_1 [this p_item]
  (let [ l_item (volatile! p_item) l_nextItem (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_nextItem nil)
        (vreset! l_size (JR/invoke this :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextItem (JR/invoke this :jm_get_1 @l_index))
            (if (JR/eq @l_nextItem @l_item)
                (do
                (JR/jreturn @l_index)))))
        (unchecked-int (unchecked-negate (JR/c2i 1))))))

    
(defn jm_getStartIndex_0 [this]
  (let []
        0))

    
(defn jm_getSelectedIndexForPoint_1 [this p_point]
  (let [ l_point (volatile! p_point) l_start (volatile! nil) l_size (volatile! nil) l_dx (volatile! nil) l_dy (volatile! nil) l_formTypeFactory (volatile! nil) l_commonLabels (volatile! nil) l_stringBuffer (volatile! nil) l_item (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_diffX (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_start (JR/invoke this :jm_getStartIndex_0))
        (vreset! l_size (JR/invoke this :jm_size_0))
        (vreset! l_dx (JR/invoke this :jm_getDx_0))
        (vreset! l_dy (JR/invoke this :jm_getDy_0))
        (vreset! l_formTypeFactory (JR/scall 'FormTypeFactory :jm_getInstance_0))
        (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :START_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_start)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :TOTAL_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_size)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (ScrollSelectionForm/jstatic_GET_SELECTED_INDEX))
        (vreset! l_item nil)
        (vreset! l_width 0)
        (vreset! l_height 0)
        (vreset! l_diffX 0)
        (do (vreset! l_index @l_start)
            (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_item (JR/invoke this :jm_get_1 @l_index))
            (vreset! l_width (JR/invoke @l_item :jm_getMinimumWidth_0))
            (vreset! l_height (JR/invoke @l_item :jm_getMinimumHeight_0))
            (vreset! l_diffX (JR/invoke (JR/fget this :formTypeItemIndexDx) :jm_getDx_4 @l_index @l_item @l_dx @l_dy))
            (if (JR/invoke (JR/fget this :rectangleCollisionUtil) :jm_isInside_6 @l_diffX (unchecked-int (unchecked-subtract @l_dy (JR/fget this :halfBorder))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_diffX @l_width)) (JR/fget this :border))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_dy @l_height)) (JR/fget this :halfBorder))) 1)) (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0))
                (do
                (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :ITEM_LABEL))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_item :jm_getLabel_0))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :INDEX_LABEL))
                (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (ScrollSelectionForm/jstatic_GET_SELECTED_INDEX))
                (JR/jreturn @l_index)))
            (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :HORIZONTAL_FORM))
                (do
                (vreset! l_dx (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_dx @l_width)) (JR/fget this :border))))
                (if (> @l_dx (JR/invoke (JR/fget this :rectangle) :jm_getMaxX_0))
                    (do
                    (JR/jbreak))))
                (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :VERTICAL_CENTER_FORM))
                (do
                (vreset! l_dy (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_dy @l_height)) (JR/fget this :border))))
                (if (> @l_dy (JR/invoke (JR/fget this :rectangle) :jm_getMaxY_0))
                    (do
                    (JR/jbreak))))
                (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :NULL_FORM_TYPE))
                (do
                nil)
                (do
                (JR/jthrow (new java.lang.Exception (JR/fget @l_formTypeFactory :UNK)))))))))
        (unchecked-int (unchecked-negate (JR/c2i 1))))))

    
(defn jm_processInputKey_1 [this p_gameKeyCode]
  (let [ l_gameKeyCode (volatile! p_gameKeyCode) l_formTypeFactory (volatile! nil) l_index (volatile! nil) l_max (volatile! nil)](JR/method
        (vreset! l_formTypeFactory (JR/scall 'FormTypeFactory :jm_getInstance_0))
        (if (== (JR/invoke this :jm_size_0) 0)
            (do
            (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1))))))
        (vreset! l_index (JR/invoke this :jm_getSelectedIndex_0))
        (if (or (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :HORIZONTAL_FORM)) (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :TEMP_HORIZONTAL_FORM)))
            (do
            (if (JR/eq @l_gameKeyCode (JR/sget 'Canvas "RIGHT"))
                (do
                (JR/vinc l_index 1 :int false))
                (if (JR/eq @l_gameKeyCode (JR/sget 'Canvas "LEFT"))
                (do
                (JR/vinc l_index -1 :int false)))))
            (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :VERTICAL_CENTER_FORM))
            (do
            (if (JR/eq @l_gameKeyCode (JR/sget 'Canvas "DOWN"))
                (do
                (JR/vinc l_index 1 :int false))
                (if (JR/eq @l_gameKeyCode (JR/sget 'Canvas "UP"))
                (do
                (JR/vinc l_index -1 :int false)))))
            (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :NULL_FORM_TYPE))
            (do
            nil)
            (do
            (JR/jthrow (new java.lang.Exception (JR/fget @l_formTypeFactory :UNK)))))))
        (vreset! l_max (unchecked-int (unchecked-subtract (JR/invoke this :jm_size_0) 1)))
        (if (< @l_index 0)
            (do
            (JR/invoke this :jm_setSelectedIndex_1 0))
            (if (> @l_index @l_max)
            (do
            (JR/invoke this :jm_setSelectedIndex_1 @l_max))
            (do
            (JR/invoke this :jm_setSelectedIndex_1 @l_index))))
        (unchecked-int (unchecked-negate (JR/c2i 1))))))

    
(defn jm_isInForm_1 [this p_point]
  (let [ l_point (volatile! p_point)](JR/method
        (if (JR/invoke (JR/fget this :rectangleCollisionUtil) :jm_isInside_6 (JR/fget this :x) (- (JR/fget this :y) (JR/fget this :halfBorder)) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :rectangle) :jm_getMaxX_0) (JR/fget this :border))) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :rectangle) :jm_getMaxY_0) (JR/fget this :border))) (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_point)) :jm_append_1 (ScrollSelectionForm/jstatic_INSIDE_FORM))) this (ScrollSelectionForm/jstatic_IS_IN_FORM))
            (JR/jreturn true)))
        false)))

    
(defn jm_paintItem_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! nil) l_height (volatile! nil) l_adjustedBorder (volatile! nil)]
        (JR/invoke @l_item :jm_paintXY_3 @l_graphics @l_x @l_y)
        (vreset! l_width (JR/invoke @l_item :jm_getMinimumWidth_0))
        (vreset! l_height (JR/invoke @l_item :jm_getMinimumHeight_0))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/invoke this :jm_getButtonBasicColor_0) :jm_intValue_0))
        (vreset! l_adjustedBorder 3)
        (JR/invoke @l_graphics :jm_drawRect_4 (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_x (JR/fget this :halfBorder))) @l_adjustedBorder)) (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_y (JR/fget this :halfBorder))) @l_adjustedBorder)) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_width (JR/fget this :border))) (JR/fget this :adjustedExtraBorder))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_height (JR/fget this :border))) (JR/fget this :adjustedExtraBorder))))
        (JR/invoke (JR/fget this :scrollSelectionFormFormTypeItemIndexPaintable) :jm_paint_5 @l_graphics @l_index @l_item @l_x @l_y)))

    
(defn jm_paintUnselectedItem_5 [this p_graphics p_index p_item p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/invoke this :jm_getButtonBasicColor_0) :jm_intValue_0))
        (JR/invoke @l_item :jm_paintUnselected_3 @l_graphics @l_x @l_y)
        (JR/invoke (JR/fget this :scrollSelectionFormFormTypeItemIndexPaintable) :jm_paint_5 @l_graphics @l_index @l_item @l_x @l_y)))

    
(defn jm_getDiffX_1 [this p_item]
  (let [ l_item (volatile! p_item)]
        0))

    
(defn jm_getDx_0 [this]
  (let []
        (JR/fget this :x)))

    
(defn jm_getDy_0 [this]
  (let []
        (JR/fget this :y)))

    
(defn jm_setButtonBasicColor_1 [this p_buttonBasicColor]
  (let [ l_buttonBasicColor (volatile! p_buttonBasicColor)]
        (JR/fset this :buttonBasicColor @l_buttonBasicColor)))

    
(defn jm_getButtonBasicColor_0 [this]
  (let []
        (JR/fget this :buttonBasicColor)))



