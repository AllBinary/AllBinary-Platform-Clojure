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
;; package org.allbinary.logic.math

(ns J2SEMath)

(JR/register 'J2SEMath nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (J2SEMath/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'J2SEMath)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (J2SEMath/jstatic_instance)))

    
(defn jm_round_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/d2i @l_value)))

    
(defn jm_abs_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (if (< @l_value 0.0) (- @l_value) @l_value)))

    
(defn jm_absdouble_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (if (< @l_value 0.0) (- @l_value) @l_value)))



