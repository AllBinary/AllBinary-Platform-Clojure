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
;; package org.allbinary.image.opengles

(ns OpenGLImageFactory)

(JR/register 'OpenGLImageFactory nil '[])

(def jsv_NULL_OPENGL_IMAGE_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_OPENGL_IMAGE_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_OPENGL_IMAGE_FACTORY)
(defn jstatic_set_NULL_OPENGL_IMAGE_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_OPENGL_IMAGE_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_OPENGL_IMAGE_FACTORY (OpenGLImageFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLImageFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [this p_image p_bitmapFactory p_textureFactory]
  (let [ l_image (volatile! p_image) l_bitmapFactory (volatile! p_bitmapFactory) l_textureFactory (volatile! p_textureFactory)]
        (JR/jthrow (new java.lang.RuntimeException))))



