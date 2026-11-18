;;
;; AllBinary Open License Version 1
;; Copyright (c) 2011 AllBinary
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

(ns ImageCreationUtil)

(JR/register 'ImageCreationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageCreationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageCreationUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageCreationUtil)] (jinit_0 o) o))

    
(defn jm_createImageWH_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_image (volatile! nil)]
        (vreset! l_image (JR/invoke (JR/scall 'GameFeatureImageCacheFactory :jm_getInstance_0) :jm_get_3 (JR/class-name this) @l_width @l_height))
        @l_image))

    
(defn jm_createImage_4 [this p_width p_height p_maxScaleX p_maxScaleY]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_maxScaleX (volatile! p_maxScaleX) l_maxScaleY (volatile! p_maxScaleY) l_image (volatile! nil)]
        (vreset! l_image (JR/invoke (JR/scall 'GameFeatureImageCacheFactory :jm_getInstance_0) :jm_get_3 (JR/class-name this) (unchecked-int (unchecked-add (JR/d2i (* (JR/f32 @l_width) @l_maxScaleX)) 1)) (unchecked-int (unchecked-add (JR/d2i (* (JR/f32 @l_height) @l_maxScaleY)) 1))))
        @l_image))



