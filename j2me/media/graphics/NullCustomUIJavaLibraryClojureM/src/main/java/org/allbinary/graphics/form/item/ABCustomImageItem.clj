;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns ABCustomImageItem)

(JR/register 'ABCustomImageItem 'ABCustomItem '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :yOffset 0)
    (JR/fset this :yOffset 0)
  this)

    
(defn jinit_6 [this p_label p_image p_layout p_altText p_basicColor p_yOffset]
  (let [ l_label (volatile! p_label) l_image (volatile! p_image) l_layout (volatile! p_layout) l_altText (volatile! p_altText) l_basicColor (volatile! p_basicColor) l_yOffset (volatile! p_yOffset)]
        (ABCustomItem/jinit_3 this @l_label @l_basicColor @l_basicColor) (jinitfields this))
  this)

(defn jnew_6 [p_label p_image p_layout p_altText p_basicColor p_yOffset ]
  (let [o (JR/alloc 'ABCustomImageItem)] (jinit_6 o p_label p_image p_layout p_altText p_basicColor p_yOffset) o))

    
(defn jm_getImage_0 [this]
  (let []
        (JR/sget 'NullImage "NULL_IMAGE")))



