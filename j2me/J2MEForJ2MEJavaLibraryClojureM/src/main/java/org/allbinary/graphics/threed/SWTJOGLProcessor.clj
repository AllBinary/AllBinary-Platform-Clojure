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
;; package org.allbinary.graphics.threed

;;OpenGLNone
(ns SWTJOGLProcessor)

(JR/register 'SWTJOGLProcessor nil '[java.lang.Runnable])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SWTJOGLProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SWTJOGLProcessor)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SWTJOGLProcessor/jstatic_instance)))

    
(defn jm_init_2 [this p_display p_comp]
  (let [ l_display (volatile! p_display) l_comp (volatile! p_comp)]
        nil))

    
(defn jm_isHolderCreated_0 [this]
  (let []
        true))

    
(defn jm_setRenderer_1 [this p_renderer]
  (let [ l_renderer (volatile! p_renderer)]
        nil))

    
(defn jm_isJOGL_0 [this]
  (let []
        false))

    
(defn jm_createSurface_0 [this]
  (let []
        nil))

    
(defn jm_onSurfaceCreated_0 [this]
  (let []
        nil))

    
(defn jm_onSurfaceChangedForEvent_1 [this p_event]
  (let [ l_event (volatile! p_event)]
        nil))

    
(defn jm_onSurfaceChanged_0 [this]
  (let []
        nil))

    
(defn jm_onSurfaceChangedWH_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_addListener_0 [this]
  (let []
        nil))

    
(defn jm_addListeners_1 [this p_midlet]
  (let [ l_midlet (volatile! p_midlet)]
        nil))

    
(defn jm_run_0 [this]
  (let []
        nil))

    
(defn jm_clear_0 [this]
  (let []
        nil))

    
(defn jm_setCustom_3 [this p_width p_height p_ratio]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_ratio (volatile! p_ratio)]
        nil))

    
(defn jm_setRatioProcessor_1 [this p_ratioProcessor]
  (let [ l_ratioProcessor (volatile! p_ratioProcessor)]
        nil))

    
(defn jm_isPortraitRatioProcessor_0 [this]
  (let []
        true))

    
(defn jm_charWidth_2 [this p_font p_ch]
  (let [ l_font (volatile! p_font) l_ch (volatile! p_ch)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_charsWidth_4 [this p_font p_ch p_offset p_length]
  (let [ l_font (volatile! p_font) l_ch (volatile! p_ch) l_offset (volatile! p_offset) l_length (volatile! p_length)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_stringWidth_2 [this p_font p_str]
  (let [ l_font (volatile! p_font) l_str (volatile! p_str)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_substringWidth_4 [this p_font p_str p_offset p_len]
  (let [ l_font (volatile! p_font) l_str (volatile! p_str) l_offset (volatile! p_offset) l_len (volatile! p_len)]
        (JR/jthrow (new java.lang.RuntimeException))))



