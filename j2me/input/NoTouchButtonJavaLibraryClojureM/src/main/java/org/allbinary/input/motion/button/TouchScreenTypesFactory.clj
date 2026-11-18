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
;; package org.allbinary.input.motion.button

(ns TouchScreenTypesFactory)

(JR/register 'TouchScreenTypesFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TouchScreenTypesFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :FINGER nil)
  (JR/fset this :NOTOUCH nil)
  (JR/fset this :STYLUS nil)
  (JR/fset this :UNDEFINED nil)
    (JR/fset this :FINGER (TouchScreenType/jnew_1 "Finger"))
    (JR/fset this :NOTOUCH (TouchScreenType/jnew_1 "No Touch"))
    (JR/fset this :STYLUS (TouchScreenType/jnew_1 "Stylus"))
    (JR/fset this :UNDEFINED (TouchScreenType/jnew_1 "Undefined"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TouchScreenTypesFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TouchScreenTypesFactory/jstatic_instance)))



