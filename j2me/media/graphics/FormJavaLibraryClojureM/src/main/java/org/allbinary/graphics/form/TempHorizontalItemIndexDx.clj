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

(ns TempHorizontalItemIndexDx)

(JR/register 'TempHorizontalItemIndexDx 'ItemIndexDx '[])

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
    (ItemIndexDx/jinit_0 this) (jinitfields this)
        (JR/fset this :scrollCurrentSelectionForm @l_scrollCurrentSelectionForm))
  this)

(defn jnew_1 [p_scrollCurrentSelectionForm ]
  (let [o (JR/alloc 'TempHorizontalItemIndexDx)] (jinit_1 o p_scrollCurrentSelectionForm) o))

    
(defn jm_getDx_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/invoke (JR/fget this :scrollCurrentSelectionForm) :jm_getXTempHorizontalForm_4 @l_index @l_item @l_dx @l_dy)))



