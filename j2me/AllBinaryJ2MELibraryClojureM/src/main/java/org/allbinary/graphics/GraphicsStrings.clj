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
;; package org.allbinary.graphics

(ns GraphicsStrings)

(JR/register 'GraphicsStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GraphicsStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ANIMATION nil)
  (JR/fset this :ANGLE nil)
  (JR/fset this :MOVEMENT_ANGLE nil)
  (JR/fset this :ROTATION nil)
  (JR/fset this :OPACITY nil)
  (JR/fset this :HTML nil)
  (JR/fset this :WIDTH nil)
  (JR/fset this :HEIGHT nil)
    (JR/fset this :ANIMATION "animation")
    (JR/fset this :ANGLE "angle")
    (JR/fset this :MOVEMENT_ANGLE "movement_angle")
    (JR/fset this :ROTATION "rotation")
    (JR/fset this :OPACITY "opacity")
    (JR/fset this :HTML "HTML")
    (JR/fset this :WIDTH "width")
    (JR/fset this :HEIGHT "height")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GraphicsStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GraphicsStrings/jstatic_instance)))



