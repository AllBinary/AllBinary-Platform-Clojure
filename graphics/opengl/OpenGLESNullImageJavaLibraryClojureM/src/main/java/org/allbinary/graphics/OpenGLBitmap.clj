;; Generated Code Do Not Modify
;; package org.allbinary.graphics

(ns OpenGLBitmap)

(JR/register 'OpenGLBitmap 'PlatformBitmapBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :bitmap nil)
  this)

    
(defn jinit_1 [this p_bitmap]
  (let [ l_bitmap (volatile! p_bitmap)]
    (PlatformBitmapBase/jinit_0 this) (jinitfields this)
        (JR/fset this :bitmap @l_bitmap))
  this)

(defn jnew_1 [p_bitmap ]
  (let [o (JR/alloc 'OpenGLBitmap)] (jinit_1 o p_bitmap) o))

    
(defn jm_getPixels_7 [this p_pixels p_offset p_stride p_x p_y p_width p_height]
  (let [ l_pixels (volatile! p_pixels) l_offset (volatile! p_offset) l_stride (volatile! p_stride) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_setPixels_7 [this p_pixels p_offset p_stride p_x p_y p_width p_height]
  (let [ l_pixels (volatile! p_pixels) l_offset (volatile! p_offset) l_stride (volatile! p_stride) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_recycle_0 [this]
  (let []
        nil))



