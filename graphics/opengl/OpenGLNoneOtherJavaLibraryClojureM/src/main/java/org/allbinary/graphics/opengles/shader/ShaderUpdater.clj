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

(ns ShaderUpdater)

(JR/register 'ShaderUpdater nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ShaderUpdater/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :rendererStrings nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :rendererStrings (JR/scall 'RendererStrings :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ShaderUpdater)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ShaderUpdater/jstatic_instance)))

    
(defn jm_onSurfaceCreated_2 [this p_gl p_eglConfig]
  (let [ l_gl (volatile! p_gl) l_eglConfig (volatile! p_eglConfig)]
        nil))



