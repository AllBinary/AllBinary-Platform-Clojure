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

(ns OpenGLESImageTranslate)

(JR/register 'OpenGLESImageTranslate nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLESImageTranslate/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESImageTranslate)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLESImageTranslate/jstatic_instance)))

    
(defn jm_translate_4 [this p_gl p_openGLESImage p_x p_y]
  (let [ l_gl (volatile! p_gl) l_openGLESImage (volatile! p_openGLESImage) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_translate2_2 [this p_gl p_openGLESImage]
  (let [ l_gl (volatile! p_gl) l_openGLESImage (volatile! p_openGLESImage)]
        nil))



