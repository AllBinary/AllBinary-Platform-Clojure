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

(ns PrimitiveLongUtil)

(JR/register 'PrimitiveLongUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :powerOfTen 0)
  (JR/fset this :maxValue 0)
  (JR/fset this :maxDigits 0)
  (JR/fset this :charArray nil)
  (JR/fset this :currentTotalDigits 0)
  (JR/fset this :primitiveLongSingleton nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :primitiveLongSingleton (JR/scall 'PrimitiveLongSingleton :jm_getInstance_0))
  this)

    
(defn jm_createPowerOfTen_1 [p_powerOfTen]
  (let [this nil l_powerOfTen (volatile! p_powerOfTen) l_primitiveLongUtil (volatile! nil) l_logUtil (volatile! nil) l_commonStrings (volatile! nil)]
        (vreset! l_primitiveLongUtil (PrimitiveLongUtil/jnew_2 @l_powerOfTen (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))
        (if (not (== (rem @l_powerOfTen 10) 0))
            (do
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) @l_primitiveLongUtil (JR/fget @l_commonStrings :CONSTRUCTOR) (new java.lang.Exception "Max must be power of 10"))))
        @l_primitiveLongUtil))

    
(defn jinit_2 [this p_powerOfTen p_unused]
  (let [ l_powerOfTen (volatile! p_powerOfTen) l_unused (volatile! p_unused)]
    nil (jinitfields this)
        (JR/fset this :maxDigits (JR/invoke (JR/scall 'MathUtil :jm_getInstance_0) :jm_getTotalDigits_1 @l_powerOfTen))
        (JR/fset this :powerOfTen @l_powerOfTen)
        (JR/fset this :maxValue (unchecked-int (unchecked-subtract (unchecked-int (unchecked-multiply @l_powerOfTen 10)) 1)))
        (JR/fset this :charArray (JR/anew "CHAR" 1 (JR/fget this :maxDigits))))
  this)

(defn jnew_2 [p_powerOfTen p_unused ]
  (let [o (JR/alloc 'PrimitiveLongUtil)] (jinit_2 o p_powerOfTen p_unused) o))

    
(defn jm_getCharArray_1 [this p_value]
  (let [ l_value (volatile! p_value) l_index (volatile! nil) l_div (volatile! nil) l_lastValue (volatile! nil) l_digit (volatile! nil)](JR/method
        (if (< @l_value 10)
            (do
            (JR/invoke this :jm_setCurrentTotalDigits_1 1)
            (JR/jreturn (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAYS) @l_value))))
        (if (> @l_value (JR/fget this :maxValue))
            (do
            (JR/invoke this :jm_setCurrentTotalDigits_1 3)
            (JR/jreturn (JR/fget (JR/fget this :primitiveLongSingleton) :UNK))))
        (vreset! l_index 0)
        (vreset! l_div (JR/fget this :powerOfTen))
        (vreset! l_lastValue 0)
        (JR/jwhile false false (>= @l_div 1)
            (vreset! l_digit (JR/idiv (unchecked-int (unchecked-subtract @l_value @l_lastValue)) @l_div))
            (if (and (>= @l_digit 0) (< @l_digit 10))
                (do
                (if (and (== @l_digit 0) (== @l_index 0))
                    (do
                    nil)
                    (do
                    (JR/aset* (JR/fget this :charArray) (JR/vinc l_index 1 :int true) (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) @l_digit))))
                (vreset! l_lastValue (unchecked-int (unchecked-add @l_lastValue (unchecked-int (unchecked-multiply @l_digit @l_div)))))))
            (vreset! l_div (JR/idiv @l_div 10)))
        (JR/invoke this :jm_setCurrentTotalDigits_1 @l_index)
        (JR/fget this :charArray))))

    
(defn jm_setCurrentTotalDigits_1 [this p_currentTotalDigits]
  (let [ l_currentTotalDigits (volatile! p_currentTotalDigits)]
        (JR/fset this :currentTotalDigits @l_currentTotalDigits)))

    
(defn jm_getCurrentTotalDigits_0 [this]
  (let []
        (JR/fget this :currentTotalDigits)))

    
(defn jm_getMaxDigits_0 [this]
  (let []
        (JR/fget this :maxDigits)))



