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
;; package org.allbinary.logic.math

(ns BasicDecimal)

(JR/register 'BasicDecimal nil '[])

(def jsv_ZERO_BIGDECIMAL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_ZERO_BIGDECIMAL [] (JR/ensure-init jclinit-state jclinit) @jsv_ZERO_BIGDECIMAL)
(defn jstatic_set_ZERO_BIGDECIMAL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ZERO_BIGDECIMAL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_ZERO_BIGDECIMAL (BasicDecimal/jnew_1 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :units 0)
  (JR/fset this :scaled 0)
  (JR/fset this :factor 0)
  (JR/fset this :factorValue 0)
    (JR/fset this :factor (JR/fget (JR/scall 'ScaleFactorFactory :jm_getInstance_0) :DEFAULT_SCALE_FACTOR))
    (JR/fset this :factorValue (JR/fget (JR/scall 'ScaleFactorFactory :jm_getInstance_0) :DEFAULT_SCALE_VALUE))
  this)

    
(defn jm_createBigDecimal_1 [p_bigDecimal]
  (let [this nil l_bigDecimal (volatile! p_bigDecimal)]
        (BasicDecimal/jnew_1 (JR/invoke @l_bigDecimal :jm_getUnscaled_0))))

    
(defn jinit_1 [this p_units]
  (let [ l_units (volatile! p_units)]
    nil (jinitfields this)
        (JR/fset this :units @l_units)
        (JR/invoke this :jm_updateScaled_0))
  this)

(defn jnew_1 [p_units ]
  (let [o (JR/alloc 'BasicDecimal)] (jinit_1 o p_units) o))

    
(defn jm_setint_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units @l_value)
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_setlong_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units @l_value)
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_set_1 [this p_bigDecimal]
  (let [ l_bigDecimal (volatile! p_bigDecimal)]
        (JR/fset this :units (JR/invoke @l_bigDecimal :jm_getUnscaled_0))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_addint_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (unchecked-add (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_addlong_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (unchecked-add (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_add_1 [this p_bigDecimal]
  (let [ l_bigDecimal (volatile! p_bigDecimal)]
        (JR/fset this :units (unchecked-add (JR/fget this :units) (JR/invoke @l_bigDecimal :jm_getUnscaled_0)))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_subtractint_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (unchecked-subtract (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_subtractlong_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (unchecked-subtract (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_subtract_1 [this p_bigDecimal]
  (let [ l_bigDecimal (volatile! p_bigDecimal)]
        (JR/fset this :units (unchecked-subtract (JR/fget this :units) (JR/invoke @l_bigDecimal :jm_getUnscaled_0)))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_multiplyint_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (unchecked-multiply (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_multiplylong_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (unchecked-multiply (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_multiply_1 [this p_bigDecimal]
  (let [ l_bigDecimal (volatile! p_bigDecimal)]
        (JR/fset this :units (unchecked-multiply (JR/fget this :units) (JR/invoke @l_bigDecimal :jm_getUnscaled_0)))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_divideint_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (JR/ldiv (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_dividelong_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :units (JR/ldiv (JR/fget this :units) @l_value))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_divide_1 [this p_bigDecimal]
  (let [ l_bigDecimal (volatile! p_bigDecimal)]
        (JR/fset this :units (JR/ldiv (JR/fget this :units) (JR/invoke @l_bigDecimal :jm_getUnscaled_0)))
        (JR/invoke this :jm_updateScaled_0)))

    
(defn jm_getUnscaled_0 [this]
  (let []
        (JR/fget this :units)))

    
(defn jm_updateScaled_0 [this]
  (let []
        (JR/fset this :scaled (JR/i32 (JR/ldiv (JR/fget this :units) (JR/fget this :factorValue))))))

    
(defn jm_getScaled_0 [this]
  (let []
        (JR/fget this :scaled)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/s (JR/fget this :units))))

    
(defn jm_getScaledFactor_0 [this]
  (let []
        (JR/fget this :factor)))

    
(defn jm_getScaledFactorValue_0 [this]
  (let []
        (JR/fget this :factorValue)))



