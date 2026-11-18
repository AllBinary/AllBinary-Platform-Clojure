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

(ns PlatformShaderComposite)

(JR/register 'PlatformShaderComposite 'ShaderComposite '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_7 [this p_requiresOpenGLVersion p_shaderArray p_compositeShaderUpdater p_shaderInitializer p_modelViewProjection p_colorOpenGLProcessor p_vertexOpenGLProcessor]
  (let [ l_requiresOpenGLVersion (volatile! p_requiresOpenGLVersion) l_shaderArray (volatile! p_shaderArray) l_compositeShaderUpdater (volatile! p_compositeShaderUpdater) l_shaderInitializer (volatile! p_shaderInitializer) l_modelViewProjection (volatile! p_modelViewProjection) l_colorOpenGLProcessor (volatile! p_colorOpenGLProcessor) l_vertexOpenGLProcessor (volatile! p_vertexOpenGLProcessor)]
        (ShaderComposite/jinit_8 this @l_requiresOpenGLVersion @l_shaderArray @l_compositeShaderUpdater @l_shaderInitializer @l_modelViewProjection @l_colorOpenGLProcessor @l_vertexOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0)) (jinitfields this))
  this)

(defn jnew_7 [p_requiresOpenGLVersion p_shaderArray p_compositeShaderUpdater p_shaderInitializer p_modelViewProjection p_colorOpenGLProcessor p_vertexOpenGLProcessor ]
  (let [o (JR/alloc 'PlatformShaderComposite)] (jinit_7 o p_requiresOpenGLVersion p_shaderArray p_compositeShaderUpdater p_shaderInitializer p_modelViewProjection p_colorOpenGLProcessor p_vertexOpenGLProcessor) o))



