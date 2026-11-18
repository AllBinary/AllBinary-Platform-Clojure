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
;; package org.allbinary.image.opengles

(ns OpenGLESImageProcessor)

(JR/register 'OpenGLESImageProcessor nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLESImageProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESImageProcessor)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLESImageProcessor/jstatic_instance)))

    
(defn jm_translate_3 [this p_gl p_translateX p_translateY]
  (let [ l_gl (volatile! p_gl) l_translateX (volatile! p_translateX) l_translateY (volatile! p_translateY)]
        nil))

    
(defn jm_rotate_2 [this p_gl p_angle]
  (let [ l_gl (volatile! p_gl) l_angle (volatile! p_angle)]
        nil))

    
(defn jm_scale_3 [this p_gl p_scaleX p_scaleY]
  (let [ l_gl (volatile! p_gl) l_scaleX (volatile! p_scaleX) l_scaleY (volatile! p_scaleY)]
        nil))

    
(defn jm_colorMask_5 [this p_gl p_red p_green p_blue p_alpha]
  (let [ l_gl (volatile! p_gl) l_red (volatile! p_red) l_green (volatile! p_green) l_blue (volatile! p_blue) l_alpha (volatile! p_alpha)]
        nil))



