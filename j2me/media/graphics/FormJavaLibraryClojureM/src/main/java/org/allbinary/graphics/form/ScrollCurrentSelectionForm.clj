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

(ns ScrollCurrentSelectionForm)

(JR/register 'ScrollCurrentSelectionForm 'ScrollSelectionForm '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :moveForSmallScreen false)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :processor nil)
  (JR/fset this :preItemIndexDx nil)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :maxWidth 0)
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :processor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :preItemIndexDx (JR/scall 'ItemIndexDx :jm_getInstance_0))
    (JR/fset this :maxWidth 0)
  this)

    
(defn jinit_8 [this p_title p_items p_formPaintableFactory p_border p_adjustedExtraBorder p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_items (volatile! p_items) l_formPaintableFactory (volatile! p_formPaintableFactory) l_border (volatile! p_border) l_adjustedExtraBorder (volatile! p_adjustedExtraBorder) l_moveForSmallScreen (volatile! p_moveForSmallScreen) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ScrollSelectionForm/jinit_7 this @l_title @l_items @l_formPaintableFactory @l_border @l_adjustedExtraBorder @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/fset this :moveForSmallScreen @l_moveForSmallScreen))
  this)

(defn jnew_8 [p_title p_items p_formPaintableFactory p_border p_adjustedExtraBorder p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ScrollCurrentSelectionForm)] (jinit_8 o p_title p_items p_formPaintableFactory p_border p_adjustedExtraBorder p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_init_2 [this p_rectangle p_formType]
  (let [ l_rectangle (volatile! p_rectangle) l_formType (volatile! p_formType) l_formTypeFactory (volatile! nil)]
        (JR/invoke-super 'ScrollSelectionForm this :jm_init_2 @l_rectangle @l_formType)
        (vreset! l_formTypeFactory (JR/scall 'FormTypeFactory :jm_getInstance_0))
        (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :TEMP_HORIZONTAL_FORM))
            (do
            (JR/fset this :processor (TempHorizontalFormProcessor/jnew_1 this))
            (JR/fset this :preItemIndexDx (TempHorizontalItemIndexDx/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :HORIZONTAL_FORM))
            (do
            (JR/fset this :processor (HorizontalFormProcessor/jnew_1 this))
            (JR/fset this :preItemIndexDx (HorizontalItemIndexDx/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :VERTICAL_CENTER_FORM))
            (do
            (JR/fset this :processor (VerticalFormProcessor/jnew_1 this))
            (JR/fset this :preItemIndexDx (VerticalItemIndexDx/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :NULL_FORM_TYPE))
            (do
            nil)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget @l_formTypeFactory :UNK) this (JR/fget (JR/fget this :commonStrings) :INIT)))))))
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_processTempHorizontalForm_0 [this]
  (let []
        (JR/fset this :dx (+ (- (JR/fget this :x) 30) (JR/ishr (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0) 1)))
        (JR/fset this :dy (JR/fget this :y))))

    
(defn jm_processHorizontalForm_0 [this]
  (let [ l_size (volatile! nil) l_totalWidth (volatile! nil) l_item (volatile! nil) l_index (volatile! nil) l_maxTitleHeight (volatile! nil)]
        (vreset! l_size (JR/invoke this :jm_size_0))
        (vreset! l_totalWidth 0)
        (vreset! l_item nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_item (JR/invoke this :jm_get_1 @l_index))
            (vreset! l_totalWidth (unchecked-int (unchecked-add @l_totalWidth (+ (JR/invoke @l_item :jm_getMinimumWidth_0) (JR/fget this :border)))))))
        (JR/fset this :dx (- (+ (JR/fget this :x) (JR/ishr (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0) 1)) (JR/ishr @l_totalWidth 1)))
        (JR/fset this :dy (+ (JR/fget this :y) (JR/ishr (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0) 1)))
        (if (JR/fget this :moveForSmallScreen)
            (do
            (vreset! l_maxTitleHeight 175)
            (if (< (JR/fget this :dy) @l_maxTitleHeight)
                (do
                (JR/fset this :dy @l_maxTitleHeight)))))))

    
(defn jm_processVerticalForm_0 [this]
  (let [ l_totalHeight (volatile! nil) l_size (volatile! nil) l_item2 (volatile! nil) l_index (volatile! nil) l_maxTitleHeight (volatile! nil)]
        (vreset! l_totalHeight 0)
        (vreset! l_size (JR/invoke this :jm_size_0))
        (vreset! l_item2 nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_item2 (JR/invoke this :jm_get_1 @l_index))
            (if (< (JR/fget this :maxWidth) (JR/invoke @l_item2 :jm_getMinimumWidth_0))
                (do
                (JR/fset this :maxWidth (JR/invoke @l_item2 :jm_getMinimumWidth_0))))
            (vreset! l_totalHeight (unchecked-int (unchecked-add @l_totalHeight (+ (JR/invoke @l_item2 :jm_getMinimumHeight_0) (JR/fget this :border)))))))
        (JR/fset this :dx (JR/idiv (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0) (JR/fget this :maxWidth))) 2))
        (if (> (JR/invoke this :jm_size_0) 0)
            (do
            (JR/fset this :dy (+ (JR/fget this :y) (JR/idiv (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0) @l_totalHeight)) 2)))
            (if (JR/fget this :moveForSmallScreen)
                (do
                (vreset! l_maxTitleHeight 175)
                (if (< (JR/fget this :dy) @l_maxTitleHeight)
                    (do
                    (JR/fset this :dy @l_maxTitleHeight))))))
            (do
            (JR/fset this :dy (JR/fget this :y))))))

    
(defn jm_getXTempHorizontalForm_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/invoke this :jm_getDiffX_1 @l_item)))

    
(defn jm_getXHorizontalForm_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        0))

    
(defn jm_getXVerticalForm_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (+ (JR/invoke this :jm_getDiffX_1 @l_item) (JR/fget this :halfBorder))))

    
(defn jm_getDiffX_1 [this p_item]
  (let [ l_item (volatile! p_item)]
        (JR/ishr (unchecked-int (unchecked-subtract (JR/fget this :maxWidth) (JR/invoke @l_item :jm_getMinimumWidth_0))) 1)))

    
(defn jm_getDx_0 [this]
  (let []
        (JR/fget this :dx)))

    
(defn jm_getDy_0 [this]
  (let []
        (JR/fget this :dy)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_delta (volatile! nil) l_deltaX (volatile! nil) l_deltaY (volatile! nil) l_size (volatile! nil) l_formTypeFactory (volatile! nil) l_item (volatile! nil) l_diffX (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :processor) :jm_process_0)
            (vreset! l_delta 0)
            (vreset! l_deltaX (JR/invoke this :jm_getDx_0))
            (vreset! l_deltaY (JR/invoke this :jm_getDy_0))
            (vreset! l_size (JR/invoke this :jm_size_0))
            (vreset! l_formTypeFactory (JR/scall 'FormTypeFactory :jm_getInstance_0))
            (vreset! l_item nil)
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_item (JR/invoke this :jm_get_1 @l_index))
                (vreset! l_diffX (JR/invoke (JR/fget this :preItemIndexDx) :jm_getDx_4 @l_index @l_item (JR/fget this :dx) (JR/fget this :dy)))
                (if (== @l_index (JR/invoke this :jm_getSelectedIndex_0))
                    (do
                    (vreset! l_delta (JR/invoke this :jm_paintItem_5 @l_graphics @l_index @l_item (unchecked-int (unchecked-add @l_deltaX @l_diffX)) @l_deltaY))
                    (JR/invoke (JR/fget this :paintable) :jm_paint_4 @l_graphics @l_index (unchecked-int (unchecked-add @l_deltaX @l_diffX)) @l_deltaY))
                    (do
                    (vreset! l_delta (JR/invoke this :jm_paintUnselectedItem_5 @l_graphics @l_index @l_item (unchecked-int (unchecked-add @l_deltaX @l_diffX)) @l_deltaY))
                    (JR/invoke (JR/fget this :paintable) :jm_paint_4 @l_graphics @l_index (unchecked-int (unchecked-add @l_deltaX @l_diffX)) @l_deltaY)))
                (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :TEMP_HORIZONTAL_FORM))
                    (do
                    nil)
                    (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :HORIZONTAL_FORM))
                    (do
                    (vreset! l_deltaX @l_delta))
                    (if (JR/eq (JR/fget this :formType) (JR/fget @l_formTypeFactory :VERTICAL_CENTER_FORM))
                    (do
                    (vreset! l_deltaY @l_delta))
                    (do
                    (JR/jthrow (new java.lang.Exception (JR/fget @l_formTypeFactory :UNK))))))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :PAINT) @l_e)) :else (throw jt)))))))



