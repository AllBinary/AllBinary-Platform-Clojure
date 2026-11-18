;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.graphics.opengles.shader

(ns ShaderManager)

(JR/register 'ShaderManager nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ShaderManager/jnew_2 (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1)))))
    nil))

(defn jinitfields [this]
  (JR/fset this :LOAD_SHADER nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :GL_VERTEX_SHADER 0)
  (JR/fset this :GL_FRAGMENT_SHADER 0)
    (JR/fset this :LOAD_SHADER "loadShader")
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ShaderManager/jstatic_instance)))

    
(defn jinit_2 [this p_GL_VERTEX_SHADER p_GL_FRAGMENT_SHADER]
  (let [ l_GL_VERTEX_SHADER (volatile! p_GL_VERTEX_SHADER) l_GL_FRAGMENT_SHADER (volatile! p_GL_FRAGMENT_SHADER)]
    nil (jinitfields this)
        (JR/fset this :GL_VERTEX_SHADER @l_GL_VERTEX_SHADER)
        (JR/fset this :GL_FRAGMENT_SHADER @l_GL_FRAGMENT_SHADER))
  this)

(defn jnew_2 [p_GL_VERTEX_SHADER p_GL_FRAGMENT_SHADER ]
  (let [o (JR/alloc 'ShaderManager)] (jinit_2 o p_GL_VERTEX_SHADER p_GL_FRAGMENT_SHADER) o))

    
(defn jm_load_4 [this p_gl p_resource p_shaderAsStringArray p_shaderType]
  (let [ l_gl (volatile! p_gl) l_resource (volatile! p_resource) l_shaderAsStringArray (volatile! p_shaderAsStringArray) l_shaderType (volatile! p_shaderType)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_loadShader_4 [this p_gl p_resource p_stringList p_shaderType]
  (let [ l_gl (volatile! p_gl) l_resource (volatile! p_resource) l_stringList (volatile! p_stringList) l_shaderType (volatile! p_shaderType)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))



