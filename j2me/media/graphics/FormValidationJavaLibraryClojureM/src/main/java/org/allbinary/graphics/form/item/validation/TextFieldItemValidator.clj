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

(ns TextFieldItemValidator)

(JR/register 'TextFieldItemValidator 'ValidatorBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :textFieldItem nil)
  (JR/fset this :min 0)
  (JR/fset this :max 0)
  (JR/fset this :allowOnEmpty false)
  this)

    
(defn jinit_4 [this p_textFieldItem p_min p_max p_allowOnEmpty]
  (let [ l_textFieldItem (volatile! p_textFieldItem) l_min (volatile! p_min) l_max (volatile! p_max) l_allowOnEmpty (volatile! p_allowOnEmpty)]
    (ValidatorBase/jinit_0 this) (jinitfields this)
        (JR/fset this :textFieldItem @l_textFieldItem)
        (JR/fset this :min @l_min)
        (JR/fset this :max @l_max)
        (JR/fset this :allowOnEmpty @l_allowOnEmpty))
  this)

(defn jnew_4 [p_textFieldItem p_min p_max p_allowOnEmpty ]
  (let [o (JR/alloc 'TextFieldItemValidator)] (jinit_4 o p_textFieldItem p_min p_max p_allowOnEmpty) o))

    
(defn jm_isValid_0 [this]
  (let [ l_booleanFactory (volatile! nil) l_result (volatile! nil) l_string (volatile! nil) l_textLength (volatile! nil)]
        (vreset! l_booleanFactory (JR/scall 'BooleanFactory :jm_getInstance_0))
        (vreset! l_result (JR/fget @l_booleanFactory :TRUE))
        (vreset! l_string (JR/invoke (JR/fget this :textFieldItem) :jm_getString_0))
        (vreset! l_textLength (JR/slength @l_string))
        (if (or (and (== @l_textLength 0) (JR/fget this :allowOnEmpty)) (and (> @l_textLength (JR/fget this :min)) (< @l_textLength (JR/fget this :max))))
            (do
            nil)
            (do
            (if (< @l_textLength (JR/fget this :min))
                (do
                (vreset! l_result (JR/fget @l_booleanFactory :FALSE)))
                (if (> @l_textLength (JR/fget this :max))
                (do
                (vreset! l_result (JR/fget @l_booleanFactory :FALSE)))))))
        @l_result))

    
(defn jm_toList_0 [this]
  (let [ l_list (volatile! nil) l_string (volatile! nil) l_textLength (volatile! nil) l_label (volatile! nil) l_name (volatile! nil)]
        (vreset! l_list (BasicArrayListD/jnew_0))
        (vreset! l_string (JR/invoke (JR/fget this :textFieldItem) :jm_getString_0))
        (vreset! l_textLength (JR/slength @l_string))
        (if (and (> @l_textLength (JR/fget this :min)) (< @l_textLength (JR/fget this :max)))
            (do
            nil)
            (do
            (vreset! l_label (JR/invoke (JR/fget this :textFieldItem) :jm_getLabel_0))
            (vreset! l_name (JR/invoke @l_label :jm_substring_2 0 (unchecked-int (unchecked-subtract (JR/slength @l_label) 2))))
            (if (< @l_textLength (JR/fget this :min))
                (do
                (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_name) :jm_append_1 " is to short"))))
                (if (> @l_textLength (JR/fget this :max))
                (do
                (JR/invoke @l_list :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_name) :jm_append_1 " is to long"))))))))
        @l_list))



