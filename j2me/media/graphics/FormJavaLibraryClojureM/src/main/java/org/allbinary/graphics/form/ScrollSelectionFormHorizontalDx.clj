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

(ns ScrollSelectionFormHorizontalDx)

(JR/register 'ScrollSelectionFormHorizontalDx 'ItemIndexDx '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :scrollSelectionForm nil)
  this)

    
(defn jinit_1 [this p_scrollSelectionForm]
  (let [ l_scrollSelectionForm (volatile! p_scrollSelectionForm)]
    (ItemIndexDx/jinit_0 this) (jinitfields this)
        (JR/fset this :scrollSelectionForm @l_scrollSelectionForm))
  this)

(defn jnew_1 [p_scrollSelectionForm ]
  (let [o (JR/alloc 'ScrollSelectionFormHorizontalDx)] (jinit_1 o p_scrollSelectionForm) o))

    
(defn jm_getDx_4 [this p_index p_item p_dx p_dy]
  (let [ l_index (volatile! p_index) l_item (volatile! p_item) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/invoke (JR/fget this :scrollSelectionForm) :jm_getSelectedIndexForPointHorizontalDx_4 @l_index @l_item @l_dx @l_dy)))



