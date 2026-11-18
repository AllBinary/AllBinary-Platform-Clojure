;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns ABTextFieldItem)

(JR/register 'ABTextFieldItem 'ABTextItem '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :font nil)
  this)

    
(defn jinit_10 [this p_canvas p_visitor p_label p_value p_maxSize p_layout p_altText p_font p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_canvas (volatile! p_canvas) l_visitor (volatile! p_visitor) l_label (volatile! p_label) l_value (volatile! p_value) l_maxSize (volatile! p_maxSize) l_layout (volatile! p_layout) l_altText (volatile! p_altText) l_font (volatile! p_font) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ABTextItem/jinit_5 this @l_label @l_layout @l_altText @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/fset this :font @l_font))
  this)

(defn jnew_10 [p_canvas p_visitor p_label p_value p_maxSize p_layout p_altText p_font p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ABTextFieldItem)] (jinit_10 o p_canvas p_visitor p_label p_value p_maxSize p_layout p_altText p_font p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_getLabel_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_setLabel_1 [this p_label]
  (let [ l_label (volatile! p_label)]
        nil))

    
(defn jm_getString_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_setString_1 [this p_string]
  (let [ l_string (volatile! p_string)]
        nil))

    
(defn jm_setFocus_1 [this p_state]
  (let [ l_state (volatile! p_state)]
        nil))

    
(defn jm_getFontHeight_0 [this]
  (let []
        (JR/invoke (JR/fget this :font) :jm_getHeight_0)))

    
(defn jm_setBackgroundBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        nil))

    
(defn jm_setForegroundBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        nil))



