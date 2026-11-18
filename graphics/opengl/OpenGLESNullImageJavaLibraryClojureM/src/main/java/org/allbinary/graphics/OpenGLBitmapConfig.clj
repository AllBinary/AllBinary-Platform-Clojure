;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2026 AllBinary 
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

(ns OpenGLBitmapConfig)

(JR/register 'OpenGLBitmapConfig nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :bitmapConfig nil)
  this)

    
(defn jinit_1 [this p_bitmapConfig]
  (let [ l_bitmapConfig (volatile! p_bitmapConfig)]
    nil (jinitfields this)
        (JR/fset this :bitmapConfig @l_bitmapConfig))
  this)

(defn jnew_1 [p_bitmapConfig ]
  (let [o (JR/alloc 'OpenGLBitmapConfig)] (jinit_1 o p_bitmapConfig) o))



