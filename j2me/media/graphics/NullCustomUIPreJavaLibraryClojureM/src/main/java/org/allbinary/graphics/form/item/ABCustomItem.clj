;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns ABCustomItem)

(JR/register 'ABCustomItem nil '[])

(def jsv_NULL_CUSTOM_ITEM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_CUSTOM_ITEM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_CUSTOM_ITEM)
(defn jstatic_set_NULL_CUSTOM_ITEM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_CUSTOM_ITEM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_CUSTOM_ITEM (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (ABCustomItem/jstatic_NULL_CUSTOM_ITEM) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (ABCustomItem/jstatic_set_NULL_CUSTOM_ITEM (ABCustomItem/jnew_3 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))
        (ABCustomItem/jstatic_NULL_CUSTOM_ITEM)))

    
(defn jinit_3 [this p_label p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_label (volatile! p_label) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
    nil (jinitfields this)
        nil)
  this)

(defn jnew_3 [p_label p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ABCustomItem)] (jinit_3 o p_label p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_setOwner_1 [this p_owner]
  (let [ l_owner (volatile! p_owner)]
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_paintUnselected_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_isFocusable_0 [this]
  (let []
        false))

    
(defn jm_getLabel_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_setLabel_1 [this p_label]
  (let [ l_label (volatile! p_label)]
        nil))

    
(defn jm_getHeight_0 [this]
  (let []
        0))

    
(defn jm_setHeight_1 [this p_height]
  (let [ l_height (volatile! p_height)]
        nil))

    
(defn jm_getValue_0 [this]
  (let []
        0.0))

    
(defn jm_setValue_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        nil))

    
(defn jm_getMinimumWidth_0 [this]
  (let []
        0))

    
(defn jm_getMinimumHeight_0 [this]
  (let []
        0))

    
(defn jm_preMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



