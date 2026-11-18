;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns CustomCustomItem)

(JR/register 'CustomCustomItem 'ABCustomItem '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
  this)

    
(defn jinit_3 [this p_label p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_label (volatile! p_label) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ABCustomItem/jinit_3 this @l_label @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this))
  this)

(defn jnew_3 [p_label p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'CustomCustomItem)] (jinit_3 o p_label p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



