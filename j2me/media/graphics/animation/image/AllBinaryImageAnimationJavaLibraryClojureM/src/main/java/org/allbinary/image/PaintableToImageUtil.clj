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
;; package org.allbinary.image

(ns PaintableToImageUtil)

(JR/register 'PaintableToImageUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PaintableToImageUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PaintableToImageUtil)] (jinit_0 o) o))

    
(defn jm_getImage_3 [p_paintableInterface p_width p_height]
  (let [this nil l_paintableInterface (volatile! p_paintableInterface) l_width (volatile! p_width) l_height (volatile! p_height) l_image (volatile! nil) l_graphics (volatile! nil)]
        (vreset! l_image (JR/invoke (JR/scall 'GameFeatureImageCacheFactory :jm_getInstance_0) :jm_get_3 (JR/class-name (PaintableToImageUtil/jstatic_instance)) @l_width @l_height))
        (vreset! l_graphics (JR/invoke @l_image :jm_getGraphics_0))
        (JR/invoke @l_paintableInterface :jm_paint_1 @l_graphics)
        @l_image))



