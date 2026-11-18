;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns ABTextItem)

(JR/register 'ABTextItem 'CustomCustomItem '[ABCustomItemInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_5 [this p_label p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_label (volatile! p_label) l_layout (volatile! p_layout) l_altText (volatile! p_altText) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (CustomCustomItem/jinit_3 this @l_label @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this))
  this)

(defn jnew_5 [p_label p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ABTextItem)] (jinit_5 o p_label p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_keyPressed_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        nil))

    
(defn jm_paintUnselected_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_getLabelStringComponent_0 [this]
  (let []
        (JR/sget 'ABStringComponent "NULL_STRING_COMPONENT")))

    
(defn jm_getMinimumWidth_0 [this]
  (let []
        (JR/invoke-super 'CustomCustomItem this :jm_getMinimumWidth_0)))

    
(defn jm_getMinimumHeight_0 [this]
  (let []
        (JR/invoke-super 'CustomCustomItem this :jm_getMinimumHeight_0)))

    
(defn jm_getLabel_0 [this]
  (let []
        (JR/invoke-super 'CustomCustomItem this :jm_getLabel_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke-super 'CustomCustomItem this :jm_paintXY_3 @l_graphics @l_x @l_y)))



