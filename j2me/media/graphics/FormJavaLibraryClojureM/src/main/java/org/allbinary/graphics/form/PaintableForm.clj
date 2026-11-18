;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form

(ns PaintableForm)

(JR/register 'PaintableForm 'ABCustomForm '[])

(def jsv_NULL_PAINTABLE_FORM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PAINTABLE_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PAINTABLE_FORM)
(defn jstatic_set_NULL_PAINTABLE_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PAINTABLE_FORM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PAINTABLE_FORM (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :canvasStrings nil)
  (JR/fset this :rectangle nil)
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  (JR/fset this :formType nil)
    (JR/fset this :canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
    (JR/fset this :rectangle (JR/sget 'RectangleFactory "SINGLETON"))
    (JR/fset this :formType (JR/fget (JR/scall 'FormTypeFactory :jm_getInstance_0) :NULL_FORM_TYPE))
  this)

    
(defn jm_getNullPaintableForm_0 []
  (let [this nil]
        (if (JR/eq (PaintableForm/jstatic_NULL_PAINTABLE_FORM) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (PaintableForm/jstatic_set_NULL_PAINTABLE_FORM (PaintableForm/jnew_4 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/anew "Object" 1 0) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))
        (PaintableForm/jstatic_NULL_PAINTABLE_FORM)))

    
(defn jinit_4 [this p_title p_items p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_items (volatile! p_items) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ABCustomForm/jinit_4 this @l_title @l_items @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke this :jm_setSelectedIndex_1 0))
  this)

(defn jnew_4 [p_title p_items p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'PaintableForm)] (jinit_4 o p_title p_items p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_init_2 [this p_rectangle p_formType]
  (let [ l_rectangle (volatile! p_rectangle) l_formType (volatile! p_formType) l_point (volatile! nil)]
        (JR/fset this :rectangle @l_rectangle)
        (vreset! l_point (JR/invoke (JR/fget this :rectangle) :jm_getPoint_0))
        (JR/fset this :x (JR/invoke @l_point :jm_getX_0))
        (JR/fset this :y (JR/invoke @l_point :jm_getY_0))
        (JR/fset this :formType @l_formType)))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0)))



