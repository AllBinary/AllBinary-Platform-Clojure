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

(ns HorizontalFormProcessor)

(JR/register 'HorizontalFormProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :scrollCurrentSelectionForm nil)
  this)

    
(defn jinit_1 [this p_scrollCurrentSelectionForm]
  (let [ l_scrollCurrentSelectionForm (volatile! p_scrollCurrentSelectionForm)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :scrollCurrentSelectionForm @l_scrollCurrentSelectionForm))
  this)

(defn jnew_1 [p_scrollCurrentSelectionForm ]
  (let [o (JR/alloc 'HorizontalFormProcessor)] (jinit_1 o p_scrollCurrentSelectionForm) o))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/fget this :scrollCurrentSelectionForm) :jm_processHorizontalForm_0)
        (JR/fset (JR/fget this :scrollCurrentSelectionForm) :processor (JR/scall 'Processor :jm_getInstance_0))))



