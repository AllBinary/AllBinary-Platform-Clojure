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
;; package org.allbinary.graphics.form

(ns FormType)

(JR/register 'FormType nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  this)

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
    nil (jinitfields this)
        (JR/fset this :name @l_name))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'FormType)] (jinit_1 o p_name) o))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :name)))



