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
;; package org.allbinary.graphics.canvas.transition.progress

(ns ProgressPaintable)

(JR/register 'ProgressPaintable 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :progressCanvas nil)
  this)

    
(defn jinit_1 [this p_progressCanvas]
  (let [ l_progressCanvas (volatile! p_progressCanvas)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :progressCanvas @l_progressCanvas))
  this)

(defn jnew_1 [p_progressCanvas ]
  (let [o (JR/alloc 'ProgressPaintable)] (jinit_1 o p_progressCanvas) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :progressCanvas) :jm_paint2_1 @l_graphics)))



