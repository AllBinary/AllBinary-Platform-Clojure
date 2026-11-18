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
;; package org.allbinary.logic.string

(ns StringValidationUtil)

(JR/register 'StringValidationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (StringValidationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :stringUtil nil)
  (JR/fset this :tsUtil nil)
    (JR/fset this :stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (StringValidationUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'StringValidationUtil)] (jinit_0 o) o))

    
(defn jm_containsSpaces_1 [this p_value]
  (let [ l_value (volatile! p_value)](JR/method
        (if (>= (JR/invoke @l_value :jm_indexOf_1 \space) 0)
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isNumber_1 [this p_value]
  (let [ l_value (volatile! p_value) l_numberOfDecimalPoints (volatile! nil) l_digit (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_numberOfDecimalPoints 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/slength @l_value)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_digit (JR/char-at @l_value @l_index))
            (if (and (not (JR/invoke this :jm_isNumberFromChar_1 @l_digit)) (not (== (JR/c2i @l_digit) (JR/c2i \.))))
                (do
                (JR/jreturn false)))
            (if (== (JR/c2i @l_digit) (JR/c2i \.))
                (do
                (JR/vinc l_numberOfDecimalPoints 1 :int false)
                (if (> @l_numberOfDecimalPoints 1)
                    (do
                    (JR/jreturn false)))))))
        true)))

    
(defn jm_isNumberFromChar_1 [this p_digit]
  (let [ l_digit (volatile! p_digit)](JR/method
        (if (and (and (and (and (and (and (and (and (and (not (== (JR/c2i @l_digit) (JR/c2i \0))) (not (== (JR/c2i @l_digit) (JR/c2i \1)))) (not (== (JR/c2i @l_digit) (JR/c2i \2)))) (not (== (JR/c2i @l_digit) (JR/c2i \3)))) (not (== (JR/c2i @l_digit) (JR/c2i \4)))) (not (== (JR/c2i @l_digit) (JR/c2i \5)))) (not (== (JR/c2i @l_digit) (JR/c2i \6)))) (not (== (JR/c2i @l_digit) (JR/c2i \7)))) (not (== (JR/c2i @l_digit) (JR/c2i \8)))) (not (== (JR/c2i @l_digit) (JR/c2i \9))))
            (do
            (JR/jreturn false)))
        true)))

    
(defn jm_isValidRequired_3 [this p_value p_min p_max]
  (let [ l_value (volatile! p_value) l_min (volatile! p_min) l_max (volatile! p_max)](JR/method
        (if (or (< (JR/slength @l_value) @l_min) (> (JR/slength @l_value) @l_max))
            (do
            (JR/jreturn false)))
        true)))

    
(defn jm_isValidRequiredNumber_3 [this p_value p_min p_max]
  (let [ l_value (volatile! p_value) l_min (volatile! p_min) l_max (volatile! p_max)](JR/method
        (if (or (or (JR/invoke this :jm_isEmpty_1 @l_value) (< (JR/slength @l_value) @l_min)) (> (JR/slength @l_value) @l_max))
            (do
            (JR/jreturn false)))
        (if (not (JR/invoke this :jm_isNumber_1 @l_value))
            (do
            (JR/jreturn false)))
        true)))

    
(defn jm_isValidNotRequired_3 [this p_value p_min p_max]
  (let [ l_value (volatile! p_value) l_min (volatile! p_min) l_max (volatile! p_max)](JR/method
        (if (> (JR/slength @l_value) 0)
            (do
            (if (or (< (JR/slength @l_value) @l_min) (> (JR/slength @l_value) @l_max))
                (do
                (JR/jreturn false)))))
        true)))

    
(defn jm_isValidNotRequiredNumber_3 [this p_value p_min p_max]
  (let [ l_value (volatile! p_value) l_min (volatile! p_min) l_max (volatile! p_max)](JR/method
        (if (> (JR/slength @l_value) 0)
            (do
            (if (or (or (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_value (JR/fget (JR/fget this :stringUtil) :NULL_STRING)) 0) (< (JR/slength @l_value) @l_min)) (> (JR/slength @l_value) @l_max))
                (do
                (JR/jreturn false)))
            (if (not (JR/invoke this :jm_isNumber_1 @l_value))
                (do
                (JR/jreturn false)))))
        true)))

    
(defn jm_isEmpty_1 [this p_string]
  (let [ l_string (volatile! p_string)]
        (if (and (not (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_string (JR/fget (JR/fget this :stringUtil) :NULL_STRING)) 0)) (not (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_string (JR/fget (JR/fget this :stringUtil) :EMPTY_STRING)) 0)))
            (do
            false)
            (do
            true))))



