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

;;OpenGLESNullImageJ2MEJavaLibrary
(ns OpenGLESImage)

(JR/register 'OpenGLESImage nil '[OpenGLSurfaceChangedInterface])

(def jsv_NULL_OPENGL_IMAGE (atom nil))
(def jsv_texture2dList (atom nil))
(def jsv_TYPE (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_OPENGL_IMAGE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_OPENGL_IMAGE)
(defn jstatic_set_NULL_OPENGL_IMAGE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_OPENGL_IMAGE v))
(defn jstatic_texture2dList [] (JR/ensure-init jclinit-state jclinit) @jsv_texture2dList)
(defn jstatic_set_texture2dList [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_texture2dList v))
(defn jstatic_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_TYPE)
(defn jstatic_set_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_OPENGL_IMAGE (OpenGLESImage/jnew_3 (JR/sget 'NullImage "NULL_IMAGE") (JR/sget 'PlatformBitmapBaseFactory "NULL_PLATFORM_BITMAP_BASE_FACTORY") (JR/sget 'PlatformTextureBaseFactory "NULL_PLATFORM_TEXTURE_BASE_FACTORY")))
    (reset! jsv_texture2dList (BasicArrayListD/jnew_0))
    (reset! jsv_TYPE 4)
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :textureFactory nil)
  (JR/fset this :openGLBitmap nil)
  (JR/fset this :openGLESImageProperties nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :openGLESImageProperties (OpenGLESImageProperties/jnew_0))
  this)

    
(defn jinit_3 [this p_image p_bitmapFactory p_textureFactory]
  (let [ l_image (volatile! p_image) l_bitmapFactory (volatile! p_bitmapFactory) l_textureFactory (volatile! p_textureFactory)]
    nil (jinitfields this)
        (JR/fset this :openGLBitmap (JR/invoke @l_bitmapFactory :jm_createBitmap_1 @l_image))
        (JR/fset this :textureFactory @l_textureFactory))
  this)

(defn jnew_3 [p_image p_bitmapFactory p_textureFactory ]
  (let [o (JR/alloc 'OpenGLESImage)] (jinit_3 o p_image p_bitmapFactory p_textureFactory) o))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_initTexture_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        false))

    
(defn jm_drawRegion_9 [this p_gl p_viewHeight p_x_src p_y_src p_width p_height p_x p_y p_z]
  (let [ l_gl (volatile! p_gl) l_viewHeight (volatile! p_viewHeight) l_x_src (volatile! p_x_src) l_y_src (volatile! p_y_src) l_width (volatile! p_width) l_height (volatile! p_height) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_draw_4 [this p_gl p_x p_y p_z]
  (let [ l_gl (volatile! p_gl) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_getType_0 [this]
  (let []
        (OpenGLESImage/jstatic_TYPE)))



