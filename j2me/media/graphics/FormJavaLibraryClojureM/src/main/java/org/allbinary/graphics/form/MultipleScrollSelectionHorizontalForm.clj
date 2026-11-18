;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form

(ns MultipleScrollSelectionHorizontalForm)

(JR/register 'MultipleScrollSelectionHorizontalForm 'ScrollSelectionForm '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :rectPaintable nil)
  (JR/fset this :multipleScrollSelectionHorizontalFormTypeItemIndexPaintable nil)
  (JR/fset this :backgroundColor 0)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :logged false)
  (JR/fset this :fontHeight 0)
    (JR/fset this :rectPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :multipleScrollSelectionHorizontalFormTypeItemIndexPaintable (JR/scall 'ItemIndexPaintable :jm_getInstance_0))
    (JR/fset this :backgroundColor (JR/invoke (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :TRANSPARENT_GREY) :jm_intValue_0))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :logged false)
    (JR/fset this :fontHeight 0)
  this)

    
(defn jm_createForm_7 [p_title p_items p_rectangle p_formType p_border p_backgroundBasicColor p_foregroundBasicColor]
  (let [this nil l_title (volatile! p_title) l_items (volatile! p_items) l_rectangle (volatile! p_rectangle) l_formType (volatile! p_formType) l_border (volatile! p_border) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_scrollSelectionForm (volatile! nil)]
        (vreset! l_scrollSelectionForm (MultipleScrollSelectionHorizontalForm/jnew_6 @l_title @l_items (JR/scall 'ItemPaintableFactory :jm_getInstance_0) @l_border @l_backgroundBasicColor @l_foregroundBasicColor))
        (JR/invoke @l_scrollSelectionForm :jm_init_2 @l_rectangle @l_formType)
        @l_scrollSelectionForm))

    
(defn jinit_6 [this p_title p_items p_formPaintableFactory p_border p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_items (volatile! p_items) l_formPaintableFactory (volatile! p_formPaintableFactory) l_border (volatile! p_border) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ScrollSelectionForm/jinit_7 this @l_title @l_items @l_formPaintableFactory @l_border 3 @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            nil)
            (do
            (JR/fset this :rectPaintable (MultipleScrollSelectionFormRectPaintable/jnew_1 this)))))
  this)

(defn jnew_6 [p_title p_items p_formPaintableFactory p_border p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'MultipleScrollSelectionHorizontalForm)] (jinit_6 o p_title p_items p_formPaintableFactory p_border p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_fillRect_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :backgroundColor))
        (JR/invoke @l_graphics :jm_fillRect_4 (JR/fget this :x) (JR/fget this :y) (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0))))

    
(defn jm_init_2 [this p_rectangle p_formType]
  (let [ l_rectangle (volatile! p_rectangle) l_formType (volatile! p_formType) l_formTypeFactory (volatile! nil)]
        (JR/invoke-super 'ScrollSelectionForm this :jm_init_2 @l_rectangle @l_formType)
        (vreset! l_formTypeFactory (JR/scall 'FormTypeFactory :jm_getInstance_0))
        (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :HORIZONTAL_FORM))
            (do
            (JR/fset this :multipleScrollSelectionHorizontalFormTypeItemIndexPaintable (MultipleScrollSelectionFormHorizontalPaintable/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :VERTICAL_CENTER_FORM))
            (do
            (JR/fset this :multipleScrollSelectionHorizontalFormTypeItemIndexPaintable (MultipleScrollSelectionFormVerticalPaintable/jnew_1 this)))
            (if (JR/eq @l_formType (JR/fget @l_formTypeFactory :NULL_FORM_TYPE))
            (do
            nil)
            (do
            (JR/jthrow (new java.lang.Exception (JR/fget @l_formTypeFactory :UNK)))))))))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :fontHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paintHorizontal_5 [this p_graphics p_index p_item p_dx p_dy]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_dx2 (volatile! nil)]
        (vreset! l_dx2 (+ (JR/invoke this :jm_paintItem_5 @l_graphics @l_index @l_item @l_dx @l_dy) (JR/fget this :border)))
        (JR/invoke (JR/fget this :paintable) :jm_paint_4 @l_graphics @l_index @l_dx @l_dy)
        (vreset! l_dx @l_dx2)
        @l_dx))

    
(defn jm_paintVertical_5 [this p_graphics p_index p_item p_dx p_dy]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/invoke this :jm_paintItem_5 @l_graphics @l_index @l_item @l_dx @l_dy)
        (JR/invoke (JR/fget this :paintable) :jm_paint_4 @l_graphics @l_index @l_dx @l_dy)
        @l_dx))

    
(defn jm_getStartIndex_0 [this]
  (let []
        (JR/invoke this :jm_getSelectedIndex_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_start (volatile! nil) l_size (volatile! nil) l_dx (volatile! nil) l_dy (volatile! nil) l_item (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
            (vreset! l_start (JR/invoke this :jm_getStartIndex_0))
            (vreset! l_size (JR/invoke this :jm_size_0))
            (vreset! l_dx (JR/fget this :x))
            (vreset! l_dy (JR/fget this :y))
            (JR/invoke (JR/fget this :rectPaintable) :jm_paint_1 @l_graphics)
            (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke this :jm_getTitle_0) (JR/fget this :x) (- (JR/fget this :y) (JR/fget this :fontHeight)) 0)
            (vreset! l_item nil)
            (do (vreset! l_index @l_start)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_item (JR/invoke this :jm_get_1 @l_index))
                (if (>= @l_dx (JR/invoke (JR/fget this :rectangle) :jm_getMaxX_0))
                    (do
                    (if (JR/fget this :logged)
                        (do
                        nil)
                        (do
                        (JR/fset this :logged true)
                        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "painting beyond maxx: ") :jm_appendint_1 (JR/invoke (JR/fget this :rectangle) :jm_getMaxX_0))) this (JR/fget (JR/fget this :canvasStrings) :PAINT))))))
                (vreset! l_dx (JR/invoke (JR/fget this :multipleScrollSelectionHorizontalFormTypeItemIndexPaintable) :jm_paint_5 @l_graphics @l_index @l_item @l_dx @l_dy)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :PAINT))) :else (throw jt)))))))



