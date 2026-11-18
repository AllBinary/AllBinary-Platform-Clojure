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

(ns FormPaintable)

(JR/register 'FormPaintable 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :form nil)
  this)

    
(defn jinit_1 [this p_form]
  (let [ l_form (volatile! p_form)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :form @l_form))
  this)

(defn jnew_1 [p_form ]
  (let [o (JR/alloc 'FormPaintable)] (jinit_1 o p_form) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :form) :jm_paint_1 @l_graphics)))

    
(defn jm_getForm_0 [this]
  (let []
        (JR/fget this :form)))



