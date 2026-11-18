;;
;; AllBinary Open License Version 1
;; Copyright (c) 2011 AllBinary
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
;; package org.allbinary.logic.math.vector

(ns AxisMathVectorUtil)

(JR/register 'AxisMathVectorUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AxisMathVectorUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :noDecimalTrigTable nil)
    (JR/fset this :noDecimalTrigTable (JR/scall 'NoDecimalTrigTable :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AxisMathVectorUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AxisMathVectorUtil/jstatic_instance)))

    
(defn jm_calculateX_2 [this p_magnitude p_angle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle)]
        (JR/ldiv (unchecked-multiply @l_magnitude (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_cos_1 @l_angle)) 10)))

    
(defn jm_calculateY_2 [this p_magnitude p_angle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle)]
        (JR/ldiv (unchecked-multiply @l_magnitude (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_sin_1 @l_angle)) 10)))

    
(defn jm_calculateZ_2 [this p_magnitude p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_otherAngle (volatile! p_otherAngle)]
        (JR/ldiv (unchecked-multiply @l_magnitude (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_sin_1 @l_otherAngle)) 10)))



