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
;; package org.allbinary.media.image

(ns ImageModifierUtil)

(JR/register 'ImageModifierUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageModifierUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ImageModifierUtil)] (jinit_0 o) o))

    
(defn jm_getInstanceOrCreate_0 []
  (let [this nil]
        (ImageModifierUtil/jstatic_instance)))

    
(defn jm_setColor_4 [this p_unusedOriginalImage p_image p_imageIndex p_basicColor]
  (let [ l_unusedOriginalImage (volatile! p_unusedOriginalImage) l_image (volatile! p_image) l_imageIndex (volatile! p_imageIndex) l_basicColor (volatile! p_basicColor)]
        nil))

    
(defn jm_changeColor_4 [this p_unusedOriginalImage p_image p_imageIndex p_basicColor]
  (let [ l_unusedOriginalImage (volatile! p_unusedOriginalImage) l_image (volatile! p_image) l_imageIndex (volatile! p_imageIndex) l_basicColor (volatile! p_basicColor)]
        nil))

    
(defn jm_setAlpha_4 [this p_originalImage p_image p_imageIndex p_alphaInt]
  (let [ l_originalImage (volatile! p_originalImage) l_image (volatile! p_image) l_imageIndex (volatile! p_imageIndex) l_alphaInt (volatile! p_alphaInt)]
        nil))

    
(defn jm_getImageArray_1 [this p_originalImageArray]
  (let [ l_originalImageArray (volatile! p_originalImageArray)]
        @l_originalImageArray))

    
(defn jm_handleImage_3 [this p_imageArray p_index p_image]
  (let [ l_imageArray (volatile! p_imageArray) l_index (volatile! p_index) l_image (volatile! p_image)]
        nil))

    
(defn jm_reset_0 [this]
  (let []
        nil))



