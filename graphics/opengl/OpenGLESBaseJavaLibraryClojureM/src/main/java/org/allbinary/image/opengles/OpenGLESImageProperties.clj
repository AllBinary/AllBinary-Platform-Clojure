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

(ns OpenGLESImageProperties)

(JR/register 'OpenGLESImageProperties nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :textureID 0)
  (JR/fset this :scaleX 0.0)
  (JR/fset this :scaleY 0.0)
  (JR/fset this :scaleX2 0.0)
  (JR/fset this :scaleY2 0.0)
  (JR/fset this :angle 0)
  (JR/fset this :redf 0.0)
  (JR/fset this :greenf 0.0)
  (JR/fset this :bluef 0.0)
  (JR/fset this :alphaf 0.0)
    (JR/fset this :textureID (unchecked-int (unchecked-negate (JR/c2i 1))))
    (JR/fset this :scaleX 1.0)
    (JR/fset this :scaleY 1.0)
    (JR/fset this :scaleX2 1.0)
    (JR/fset this :scaleY2 1.0)
    (JR/fset this :redf 1.0)
    (JR/fset this :greenf 1.0)
    (JR/fset this :bluef 1.0)
    (JR/fset this :alphaf 1.0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESImageProperties)] (jinit_0 o) o))



