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

(ns ShaderComposite)

(JR/register 'ShaderComposite nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :disableProgramShaderOpenGLProcessor nil)
  (JR/fset this :requiresOpenGLVersion nil)
  (JR/fset this :shaderArray nil)
  (JR/fset this :shaderInitializer nil)
  (JR/fset this :compositeShaderUpdater nil)
  (JR/fset this :modelViewProjection nil)
  (JR/fset this :colorOpenGLProcessor nil)
  (JR/fset this :vertexOpenGLProcessor nil)
  (JR/fset this :useProgramShaderOpenGLProcessor nil)
  (JR/fset this :shaderMatrixOpenGLProcessor nil)
  (JR/fset this :colorEnableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :normalEnableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :vertexEnableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :textureEnableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :colorDisableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :normalDisableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :vertexDisableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :textureDisableVertexAttribArrayOpenGLProcessor nil)
  (JR/fset this :uniformLightPositionOpenGLProcessor nil)
  (JR/fset this :uniformLightColorOpenGLProcessor nil)
  (JR/fset this :uniformCameraPositionOpenGLProcessor nil)
  (JR/fset this :uniformTextureUnitOpenGLProcessor nil)
  (JR/fset this :programHandle 0)
    (JR/fset this :useProgramShaderOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :shaderMatrixOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :colorEnableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :normalEnableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :vertexEnableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :textureEnableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :colorDisableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :normalDisableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :vertexDisableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :textureDisableVertexAttribArrayOpenGLProcessor (JR/scall 'NullOpenGLProcessorFactory :jm_getInstance_0))
    (JR/fset this :uniformLightPositionOpenGLProcessor (JR/scall 'NullOpenGLTextureProcessor :jm_getInstance_0))
    (JR/fset this :uniformLightColorOpenGLProcessor (JR/scall 'NullOpenGLTextureProcessor :jm_getInstance_0))
    (JR/fset this :uniformCameraPositionOpenGLProcessor (JR/scall 'NullOpenGLTextureProcessor :jm_getInstance_0))
    (JR/fset this :uniformTextureUnitOpenGLProcessor (JR/scall 'NullOpenGLTextureProcessor :jm_getInstance_0))
  this)

    
(defn jinit_8 [this p_requiresOpenGLVersion p_shaderArray p_compositeShaderUpdater p_shaderInitializer p_modelViewProjection p_colorOpenGLProcessor p_vertexOpenGLProcessor p_disableProgramShaderOpenGLProcessor]
  (let [ l_requiresOpenGLVersion (volatile! p_requiresOpenGLVersion) l_shaderArray (volatile! p_shaderArray) l_compositeShaderUpdater (volatile! p_compositeShaderUpdater) l_shaderInitializer (volatile! p_shaderInitializer) l_modelViewProjection (volatile! p_modelViewProjection) l_colorOpenGLProcessor (volatile! p_colorOpenGLProcessor) l_vertexOpenGLProcessor (volatile! p_vertexOpenGLProcessor) l_disableProgramShaderOpenGLProcessor (volatile! p_disableProgramShaderOpenGLProcessor)]
    nil (jinitfields this)
        (JR/fset this :requiresOpenGLVersion @l_requiresOpenGLVersion)
        (JR/fset this :shaderArray @l_shaderArray)
        (JR/fset this :shaderInitializer @l_shaderInitializer)
        (JR/fset this :compositeShaderUpdater @l_compositeShaderUpdater)
        (JR/fset this :modelViewProjection @l_modelViewProjection)
        (JR/fset this :colorOpenGLProcessor @l_colorOpenGLProcessor)
        (JR/fset this :vertexOpenGLProcessor @l_vertexOpenGLProcessor)
        (JR/fset this :disableProgramShaderOpenGLProcessor @l_disableProgramShaderOpenGLProcessor))
  this)

(defn jnew_8 [p_requiresOpenGLVersion p_shaderArray p_compositeShaderUpdater p_shaderInitializer p_modelViewProjection p_colorOpenGLProcessor p_vertexOpenGLProcessor p_disableProgramShaderOpenGLProcessor ]
  (let [o (JR/alloc 'ShaderComposite)] (jinit_8 o p_requiresOpenGLVersion p_shaderArray p_compositeShaderUpdater p_shaderInitializer p_modelViewProjection p_colorOpenGLProcessor p_vertexOpenGLProcessor p_disableProgramShaderOpenGLProcessor) o))

    
(defn jm_init_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        (JR/fset this :programHandle (JR/invoke (JR/fget this :shaderInitializer) :jm_init_3 @l_gl (JR/fget this :shaderArray) (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0)))))



