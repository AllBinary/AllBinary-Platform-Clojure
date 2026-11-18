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

(ns MultipleScrollSelectionFormRectPaintable)

(JR/register 'MultipleScrollSelectionFormRectPaintable 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :multipleScrollSelectionForm nil)
  this)

    
(defn jinit_1 [this p_multipleScrollSelectionForm]
  (let [ l_multipleScrollSelectionForm (volatile! p_multipleScrollSelectionForm)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :multipleScrollSelectionForm @l_multipleScrollSelectionForm))
  this)

(defn jnew_1 [p_multipleScrollSelectionForm ]
  (let [o (JR/alloc 'MultipleScrollSelectionFormRectPaintable)] (jinit_1 o p_multipleScrollSelectionForm) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :multipleScrollSelectionForm) :jm_fillRect_1 @l_graphics)))



