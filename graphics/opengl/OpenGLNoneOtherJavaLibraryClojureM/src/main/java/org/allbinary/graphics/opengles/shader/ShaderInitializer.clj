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

(ns ShaderInitializer)

(JR/register 'ShaderInitializer nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ShaderInitializer/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ShaderInitializer)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ShaderInitializer/jstatic_instance)))

    
(defn jm_init_3 [this p_gl p_shader p_attributeArray]
  (let [ l_gl (volatile! p_gl) l_shader (volatile! p_shader) l_attributeArray (volatile! p_attributeArray)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))



