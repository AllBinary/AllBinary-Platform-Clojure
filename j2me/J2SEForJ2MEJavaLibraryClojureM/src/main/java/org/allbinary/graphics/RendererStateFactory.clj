;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.graphics

(ns RendererStateFactory)

(JR/register 'RendererStateFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (RendererStateFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :loaded false)
  (JR/fset this :surfaceChanged false)
    (JR/fset this :loaded false)
    (JR/fset this :surfaceChanged false)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'RendererStateFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (RendererStateFactory/jstatic_instance)))

    
(defn jm_setLoaded_1 [this p_loaded]
  (let [ l_loaded (volatile! p_loaded)]
        (JR/fset this :loaded @l_loaded)))

    
(defn jm_isLoaded_0 [this]
  (let []
        (JR/fget this :loaded)))

    
(defn jm_setSurfaceChanged_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :surfaceChanged @l_initialized)))

    
(defn jm_isSurfaceChanged_0 [this]
  (let []
        (JR/fget this :surfaceChanged)))



