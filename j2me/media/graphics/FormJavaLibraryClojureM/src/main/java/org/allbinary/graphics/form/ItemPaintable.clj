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

(ns ItemPaintable)

(JR/register 'ItemPaintable nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ItemPaintable)] (jinit_0 o) o))

    
(defn jm_paint_4 [this p_graphics p_currentIndex p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_currentIndex (volatile! p_currentIndex) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))



