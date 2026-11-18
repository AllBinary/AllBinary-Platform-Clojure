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
;; package org.allbinary.graphics.form.item.validation

(ns NumberTextFieldItemValidator)

(JR/register 'NumberTextFieldItemValidator 'ValidatorBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :textFieldItem nil)
  (JR/fset this :min 0)
  (JR/fset this :max 0)
  (JR/fset this :maxChars 0)
  this)

    
(defn jinit_4 [this p_textFieldItem p_maxChars p_min p_max]
  (let [ l_textFieldItem (volatile! p_textFieldItem) l_maxChars (volatile! p_maxChars) l_min (volatile! p_min) l_max (volatile! p_max)]
    (ValidatorBase/jinit_0 this) (jinitfields this)
        (JR/fset this :textFieldItem @l_textFieldItem)
        (JR/fset this :min @l_min)
        (JR/fset this :max @l_max)
        (JR/fset this :maxChars @l_maxChars))
  this)

(defn jnew_4 [p_textFieldItem p_maxChars p_min p_max ]
  (let [o (JR/alloc 'NumberTextFieldItemValidator)] (jinit_4 o p_textFieldItem p_maxChars p_min p_max) o))

    
(defn jm_isNumberValid_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE)))

    
(defn jm_toNumberVector_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (BasicArrayListD/jnew_0)))

    
(defn jm_isValid_0 [this]
  (let [ l_result (volatile! nil) l_string (volatile! nil) l_textLength (volatile! nil) l_e (volatile! nil)]
        (vreset! l_result (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE))
        (vreset! l_string (JR/invoke (JR/fget this :textFieldItem) :jm_getString_0))
        (vreset! l_textLength (JR/slength @l_string))
        (if (and (> @l_textLength 0) (< @l_textLength (JR/fget this :maxChars)))
            (do
            (try (do
                (java.lang.Integer/parseInt (JR/invoke (JR/fget this :textFieldItem) :jm_getString_0)))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.NumberFormatException) (do (vreset! l_e je)
                (vreset! l_result (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE))) :else (throw jt))))))
            (do
            (if (< @l_textLength 1)
                (do
                (vreset! l_result (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))
                (if (> @l_textLength (JR/fget this :maxChars))
                (do
                (vreset! l_result (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))))))
        @l_result))

    
(defn jm_toList_0 [this]
  (let [ l_list (volatile! nil) l_string (volatile! nil) l_textLength (volatile! nil) l_label (volatile! nil) l_name (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_stringMaker (volatile! nil) l_number (volatile! nil) l_e (volatile! nil)]
        (vreset! l_list (BasicArrayListD/jnew_0))
        (vreset! l_string (JR/invoke (JR/fget this :textFieldItem) :jm_getString_0))
        (vreset! l_textLength (JR/slength @l_string))
        (vreset! l_label (JR/invoke (JR/fget this :textFieldItem) :jm_getLabel_0))
        (vreset! l_name (JR/invoke @l_label :jm_substring_2 0 (unchecked-int (unchecked-subtract (JR/slength @l_label) 2))))
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (if (and (> @l_textLength 0) (< @l_textLength (JR/fget this :maxChars)))
            (do
            (try (do
                (vreset! l_number (JR/invoke @l_smallIntegerSingletonFactory :jm_createInstance_1 (java.lang.Integer/parseInt (JR/invoke (JR/fget this :textFieldItem) :jm_getString_0))))
                (if (> (JR/invoke @l_number :jm_intValue_0) (JR/fget this :min))
                    (do
                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                    (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_name) :jm_append_1 " is to small"))))
                    (if (> (JR/invoke @l_number :jm_intValue_0) (JR/fget this :max))
                    (do
                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                    (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_name) :jm_append_1 " is to large")))))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.NumberFormatException) (do (vreset! l_e je)
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_name) :jm_append_1 " is not a number")))) :else (throw jt))))))
            (do
            (if (< @l_textLength 1)
                (do
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_name) :jm_append_1 " is to short"))))
                (if (> @l_textLength (JR/fget this :maxChars))
                (do
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_name) :jm_append_1 " is to long"))))))))
        @l_list))



