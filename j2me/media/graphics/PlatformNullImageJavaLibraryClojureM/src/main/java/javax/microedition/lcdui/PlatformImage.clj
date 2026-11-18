;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package javax.microedition.lcdui

;;PlatformNullImageJavaLibrary
(ns PlatformImage)

(JR/register 'PlatformImage nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformImage)] (jinit_0 o) o))

    
(defn jm_getImage_1 [this p_graphicsSurface2]
  (let [ l_graphicsSurface2 (volatile! p_graphicsSurface2)]
        (JR/sget 'NullImage "NULL_IMAGE")))

    
(defn jm_getSurfaceWidth_2 [this p_graphicsSurface2 p_width]
  (let [ l_graphicsSurface2 (volatile! p_graphicsSurface2) l_width (volatile! p_width)]
        @l_width))

    
(defn jm_getSurfaceHeight_2 [this p_graphicsSurface2 p_height]
  (let [ l_graphicsSurface2 (volatile! p_graphicsSurface2) l_height (volatile! p_height)]
        @l_height))

    
(defn jm_getWidth_2 [this p_image p_width]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width)]
        @l_width))

    
(defn jm_getHeight_2 [this p_image p_height]
  (let [ l_image (volatile! p_image) l_height (volatile! p_height)]
        @l_height))

    
(defn jm_getGraphics_4 [this p_graphicsSurface p_width p_height p_image]
  (let [ l_graphicsSurface (volatile! p_graphicsSurface) l_width (volatile! p_width) l_height (volatile! p_height) l_image (volatile! p_image)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_drawImage_6 [this p_image p_x p_y p_anchor p_g2 p_g]
  (let [ l_image (volatile! p_image) l_x (volatile! p_x) l_y (volatile! p_y) l_anchor (volatile! p_anchor) l_g2 (volatile! p_g2) l_g (volatile! p_g)]
        nil))

    
(defn jm_drawRegion_10 [this p_image p_x_src p_y_src p_width p_height p_transform p_x_dst p_y_dst p_anchor p_g]
  (let [ l_image (volatile! p_image) l_x_src (volatile! p_x_src) l_y_src (volatile! p_y_src) l_width (volatile! p_width) l_height (volatile! p_height) l_transform (volatile! p_transform) l_x_dst (volatile! p_x_dst) l_y_dst (volatile! p_y_dst) l_anchor (volatile! p_anchor) l_g (volatile! p_g)]
        nil))

    
(defn jm_getRGB_8 [this p_argb p_offset p_scanlength p_x p_y p_width p_height p_image]
  (let [ l_argb (volatile! p_argb) l_offset (volatile! p_offset) l_scanlength (volatile! p_scanlength) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height) l_image (volatile! p_image)]
        nil))

    
(defn jm_setRGB_8 [this p_argb p_offset p_scanlength p_x p_y p_width p_height p_image]
  (let [ l_argb (volatile! p_argb) l_offset (volatile! p_offset) l_scanlength (volatile! p_scanlength) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height) l_image (volatile! p_image)]
        nil))

    
(defn jm_getData_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY)))



