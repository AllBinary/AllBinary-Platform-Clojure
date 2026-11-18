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
;; package org.allbinary.graphics.paint

(ns StringLocationPaintable)

(JR/register 'StringLocationPaintable 'LocationPaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :value nil)
  this)

    
(defn jinit_1 [this p_value]
  (let [ l_value (volatile! p_value)]
    (LocationPaintable/jinit_0 this) (jinitfields this)
        (JR/fset this :value @l_value))
  this)

(defn jnew_1 [p_value ]
  (let [o (JR/alloc 'StringLocationPaintable)] (jinit_1 o p_value) o))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :value) @l_x @l_y 0)))



