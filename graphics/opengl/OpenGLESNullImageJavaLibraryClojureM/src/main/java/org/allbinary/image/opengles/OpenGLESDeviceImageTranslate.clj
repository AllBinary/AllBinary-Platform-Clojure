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
;; package org.allbinary.image.opengles

(ns OpenGLESDeviceImageTranslate)

(JR/register 'OpenGLESDeviceImageTranslate 'OpenGLESImageTranslate '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :translateX 0.0)
  (JR/fset this :translateY 0.0)
  (JR/fset this :translateX2 0.0)
  (JR/fset this :translateY2 0.0)
    (JR/fset this :translateX 0.0)
    (JR/fset this :translateY 0.0)
    (JR/fset this :translateX2 0.0)
    (JR/fset this :translateY2 0.0)
  this)

(defn jinit_0 [this]
  (OpenGLESImageTranslate/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESDeviceImageTranslate)] (jinit_0 o) o))

    
(defn jm_translate_4 [this p_gl p_openGLESImage p_x p_y]
  (let [ l_gl (volatile! p_gl) l_openGLESImage (volatile! p_openGLESImage) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget @l_openGLESImage :imageProcessor) :jm_translate_3 @l_gl (+ (JR/fget this :translateX) (* (JR/fget (JR/fget @l_openGLESImage :openGLESImageProperties) :scaleX) @l_x)) (+ (JR/fget this :translateY) (* (JR/fget (JR/fget @l_openGLESImage :openGLESImageProperties) :scaleY) @l_y)))))

    
(defn jm_translate2_2 [this p_gl p_openGLESImage]
  (let [ l_gl (volatile! p_gl) l_openGLESImage (volatile! p_openGLESImage)]
        (JR/invoke (JR/fget @l_openGLESImage :imageProcessor) :jm_translate_3 @l_gl (JR/fget this :translateX2) (JR/fget this :translateY2))))



