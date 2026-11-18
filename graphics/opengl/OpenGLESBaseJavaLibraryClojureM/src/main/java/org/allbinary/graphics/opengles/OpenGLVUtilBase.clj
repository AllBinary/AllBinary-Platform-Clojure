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
;; package org.allbinary.graphics.opengles

(ns OpenGLVUtilBase)

(JR/register 'OpenGLVUtilBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLVUtilBase)] (jinit_0 o) o))

    
(defn jm_glTexEnvix_4 [this p_gl p_target p_pname p_param]
  (let [ l_gl (volatile! p_gl) l_target (volatile! p_target) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glTexParameterix_4 [this p_gl p_target p_pname p_param]
  (let [ l_gl (volatile! p_gl) l_target (volatile! p_target) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glGenerateMipmap_4 [this p_gl p_textureId p_target p_generateMipMap]
  (let [ l_gl (volatile! p_gl) l_textureId (volatile! p_textureId) l_target (volatile! p_target) l_generateMipMap (volatile! p_generateMipMap)]
        nil))



