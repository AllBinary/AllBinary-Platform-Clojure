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
;; package org.allbinary.graphics.opengles.renderer

(ns RendererStrings)

(JR/register 'RendererStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (RendererStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ON_SURFACE_CREATED nil)
  (JR/fset this :ON_SURFACE_CHANGED nil)
  (JR/fset this :ON_DRAW_FRAME nil)
  (JR/fset this :ON_DRAW_FRAME_THREED nil)
  (JR/fset this :ON_DRAW_FRAME_2D nil)
    (JR/fset this :ON_SURFACE_CREATED "onSurfaceCreated")
    (JR/fset this :ON_SURFACE_CHANGED "onSurfaceChanged")
    (JR/fset this :ON_DRAW_FRAME "onDrawFrame")
    (JR/fset this :ON_DRAW_FRAME_THREED "onDrawFrameThreed")
    (JR/fset this :ON_DRAW_FRAME_2D "onDrawFrame2d")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'RendererStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (RendererStrings/jstatic_instance)))



