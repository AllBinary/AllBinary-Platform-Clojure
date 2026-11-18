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

(ns CompositeShaderUpdater)

(JR/register 'CompositeShaderUpdater 'ShaderUpdater '[])

(def jsv_instanceC (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceC [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceC)
(defn jstatic_set_instanceC [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceC v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceC (CompositeShaderUpdater/jnew_4 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0) (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0) (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY)))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonSeps nil)
    (JR/fset this :commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CompositeShaderUpdater/jstatic_instanceC)))

    
(defn jinit_4 [this p_uniformBlockArray p_uniformArray p_attributeArray p_attributeHandleArray]
  (let [ l_uniformBlockArray (volatile! p_uniformBlockArray) l_uniformArray (volatile! p_uniformArray) l_attributeArray (volatile! p_attributeArray) l_attributeHandleArray (volatile! p_attributeHandleArray)]
    (ShaderUpdater/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_4 [p_uniformBlockArray p_uniformArray p_attributeArray p_attributeHandleArray ]
  (let [o (JR/alloc 'CompositeShaderUpdater)] (jinit_4 o p_uniformBlockArray p_uniformArray p_attributeArray p_attributeHandleArray) o))

    
(defn jm_onSurfaceCreated_3 [this p_gl p_eglConfig p_programHandle]
  (let [ l_gl (volatile! p_gl) l_eglConfig (volatile! p_eglConfig) l_programHandle (volatile! p_programHandle)]
        nil))

    
(defn jm_onSurfaceDestroyed_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        nil))



