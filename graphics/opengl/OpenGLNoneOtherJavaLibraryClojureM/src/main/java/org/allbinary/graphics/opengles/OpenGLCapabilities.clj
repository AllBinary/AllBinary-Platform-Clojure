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

(ns OpenGLCapabilities)

(JR/register 'OpenGLCapabilities nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLCapabilities/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :CUSTOM_GL_SURFACE_VIEW false)
  (JR/fset this :VERSION_1_0 nil)
  (JR/fset this :VERSION_1_1 nil)
  (JR/fset this :VERSION_2_0 nil)
  (JR/fset this :VERSION_3_0 nil)
  (JR/fset this :VERSION_3_1 nil)
  (JR/fset this :VERSION_3_2 nil)
  (JR/fset this :VERSION_HIGHER_THAN_EXISTS nil)
  (JR/fset this :glVersion nil)
  (JR/fset this :shaderVersion 0)
  (JR/fset this :glInstanceVersion nil)
  (JR/fset this :maxTextureSize 0)
    (JR/fset this :CUSTOM_GL_SURFACE_VIEW true)
    (JR/fset this :VERSION_1_0 "1.0")
    (JR/fset this :VERSION_1_1 "1.1")
    (JR/fset this :VERSION_2_0 "2.0")
    (JR/fset this :VERSION_3_0 "3.0")
    (JR/fset this :VERSION_3_1 "3.1")
    (JR/fset this :VERSION_3_2 "3.2")
    (JR/fset this :VERSION_HIGHER_THAN_EXISTS "999.999")
    (JR/fset this :glVersion (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :shaderVersion 0)
    (JR/fset this :glInstanceVersion (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :maxTextureSize 64)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLCapabilities/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLCapabilities)] (jinit_0 o) o))

    
(defn jm_isInitialized_0 [this]
  (let []
        true))

    
(defn jm_initCapabilities_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        nil))

    
(defn jm_isGlExtensionDrawTexture_0 [this]
  (let []
        false))

    
(defn jm_getGlVersion_0 [this]
  (let []
        (JR/fget this :glVersion)))

    
(defn jm_isVertexBufferObjectSupport_0 [this]
  (let []
        false))

    
(defn jm_isTextureSizeValid_1 [this p_widthAndHeight]
  (let [ l_widthAndHeight (volatile! p_widthAndHeight)]
        true))



