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
;; package org.allbinary.graphics.opengles

(ns OpenGLFeatureFactory)

(JR/register 'OpenGLFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :OPENGL_OPTIONS nil)
  (JR/fset this :OPENGL nil)
  (JR/fset this :OPENGL_SURFACE_VIEW nil)
  (JR/fset this :OPENGL_2D nil)
  (JR/fset this :OPENGL_3D nil)
  (JR/fset this :OPENGL_2D_AND_3D nil)
  (JR/fset this :OPENGL_AUTO_SELECT nil)
  (JR/fset this :OPENGL_MINIMUM nil)
  (JR/fset this :OPENGL_AS_GAME_THREAD nil)
  (JR/fset this :OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS nil)
  (JR/fset this :IMAGE_COLOR_DEPTH_4444 nil)
  (JR/fset this :IMAGE_COLOR_DEPTH_8888 nil)
  (JR/fset this :IMAGE_COLOR_DEPTH_565 nil)
  (JR/fset this :OPENGL_COLOR_DEPTH_4444 nil)
  (JR/fset this :OPENGL_COLOR_DEPTH_8888 nil)
  (JR/fset this :OPENGL_COLOR_DEPTH_565 nil)
  (JR/fset this :OPENGL_DRAW_TEXTURE nil)
  (JR/fset this :OPENGL_VERTEX_BUFFER_OBJECT nil)
  (JR/fset this :OPENGL_SIMPLE_OBJECT3D_PROCESSOR nil)
  (JR/fset this :OPENGL_COMPLEX_OBJECT3D_PROCESSOR nil)
  (JR/fset this :OPENGL_SIMPLE_TEXTURE_PROCESSOR nil)
  (JR/fset this :OPENGL_COMPLEX_TEXTURE_PROCESSOR nil)
    (JR/fset this :OPENGL_OPTIONS (OpenGLFeature/jnew_1 "OpenGL Options"))
    (JR/fset this :OPENGL (OpenGLFeature/jnew_1 "OpenGL"))
    (JR/fset this :OPENGL_SURFACE_VIEW (OpenGLFeature/jnew_1 "GLSurfaceView"))
    (JR/fset this :OPENGL_2D (OpenGLFeature/jnew_1 "OpenGL 2D"))
    (JR/fset this :OPENGL_3D (OpenGLFeature/jnew_1 "OpenGL 3D"))
    (JR/fset this :OPENGL_2D_AND_3D (OpenGLFeature/jnew_1 "OpenGL 2D/3D"))
    (JR/fset this :OPENGL_AUTO_SELECT (OpenGLFeature/jnew_1 "Auto Select"))
    (JR/fset this :OPENGL_MINIMUM (OpenGLFeature/jnew_1 "Minimum"))
    (JR/fset this :OPENGL_AS_GAME_THREAD (OpenGLFeature/jnew_1 "As game thread"))
    (JR/fset this :OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS (OpenGLFeature/jnew_1 "As different threads"))
    (JR/fset this :IMAGE_COLOR_DEPTH_4444 (OpenGLFeature/jnew_1 "4444"))
    (JR/fset this :IMAGE_COLOR_DEPTH_8888 (OpenGLFeature/jnew_1 "8888"))
    (JR/fset this :IMAGE_COLOR_DEPTH_565 (OpenGLFeature/jnew_1 "565"))
    (JR/fset this :OPENGL_COLOR_DEPTH_4444 (OpenGLFeature/jnew_1 "4444"))
    (JR/fset this :OPENGL_COLOR_DEPTH_8888 (OpenGLFeature/jnew_1 "8888"))
    (JR/fset this :OPENGL_COLOR_DEPTH_565 (OpenGLFeature/jnew_1 "565"))
    (JR/fset this :OPENGL_DRAW_TEXTURE (OpenGLFeature/jnew_1 "GL_OES_draw_texture"))
    (JR/fset this :OPENGL_VERTEX_BUFFER_OBJECT (OpenGLFeature/jnew_1 "vertex_buffer_object"))
    (JR/fset this :OPENGL_SIMPLE_OBJECT3D_PROCESSOR (OpenGLFeature/jnew_1 "Simple Object3d Processor"))
    (JR/fset this :OPENGL_COMPLEX_OBJECT3D_PROCESSOR (OpenGLFeature/jnew_1 "Complex Object3d Processor"))
    (JR/fset this :OPENGL_SIMPLE_TEXTURE_PROCESSOR (OpenGLFeature/jnew_1 "Simple Texture Processor"))
    (JR/fset this :OPENGL_COMPLEX_TEXTURE_PROCESSOR (OpenGLFeature/jnew_1 "Complex Texture Processor"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLFeatureFactory)] (jinit_0 o) o))



