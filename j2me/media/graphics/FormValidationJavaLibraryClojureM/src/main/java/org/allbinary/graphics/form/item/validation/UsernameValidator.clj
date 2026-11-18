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

(ns UsernameValidator)

(JR/register 'UsernameValidator 'TextFieldItemValidator '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_4 [this p_textFieldItem p_min p_max p_allowOnEmpty]
  (let [ l_textFieldItem (volatile! p_textFieldItem) l_min (volatile! p_min) l_max (volatile! p_max) l_allowOnEmpty (volatile! p_allowOnEmpty)]
        (TextFieldItemValidator/jinit_4 this @l_textFieldItem @l_min @l_max @l_allowOnEmpty) (jinitfields this))
  this)

(defn jnew_4 [p_textFieldItem p_min p_max p_allowOnEmpty ]
  (let [o (JR/alloc 'UsernameValidator)] (jinit_4 o p_textFieldItem p_min p_max p_allowOnEmpty) o))



