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
;; package org.allbinary.device

(ns OpenGLESGraphicsCompositeFactory)

(JR/register 'OpenGLESGraphicsCompositeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLESGraphicsCompositeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :openGLESGraphicsFactory nil)
    (JR/fset this :openGLESGraphicsFactory (OpenGLESGraphicsFactory/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESGraphicsCompositeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLESGraphicsCompositeFactory/jstatic_instance)))

    
(defn jm_set_1 [this p_openGLESGraphicsFactory]
  (let [ l_openGLESGraphicsFactory (volatile! p_openGLESGraphicsFactory)]
        (JR/fset this :openGLESGraphicsFactory @l_openGLESGraphicsFactory)))

    
(defn jm_get_0 [this]
  (let []
        (JR/fget this :openGLESGraphicsFactory)))



