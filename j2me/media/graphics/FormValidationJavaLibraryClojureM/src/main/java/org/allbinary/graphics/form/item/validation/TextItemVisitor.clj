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

(ns TextItemVisitor)

(JR/register 'TextItemVisitor 'Visitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (Visitor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TextItemVisitor)] (jinit_0 o) o))

    
(defn jm_visit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_value (volatile! nil)]
        (vreset! l_value @l_anyType)
        (if (< (JR/slength @l_value) 2)
            (do
            (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE))
            (do
            (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))))



