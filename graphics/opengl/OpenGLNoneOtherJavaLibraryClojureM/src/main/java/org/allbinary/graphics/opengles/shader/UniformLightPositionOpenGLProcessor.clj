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

(ns UniformLightPositionOpenGLProcessor)

(JR/register 'UniformLightPositionOpenGLProcessor 'OpenGLObject3dProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_shaderComposite p_handleIndex]
  (let [ l_shaderComposite (volatile! p_shaderComposite) l_handleIndex (volatile! p_handleIndex)]
    (OpenGLObject3dProcessor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_2 [p_shaderComposite p_handleIndex ]
  (let [o (JR/alloc 'UniformLightPositionOpenGLProcessor)] (jinit_2 o p_shaderComposite p_handleIndex) o))

    
(defn jm_process_2 [this p_gl p_unused]
  (let [ l_gl (volatile! p_gl) l_unused (volatile! p_unused)]
        nil))



