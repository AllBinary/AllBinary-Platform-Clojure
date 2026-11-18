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
;; package org.allbinary.input

;;TouchJ2MENone
(ns TouchJ2ME)

(JR/register 'TouchJ2ME nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchJ2ME)] (jinit_0 o) o))

    
(defn jm_pointerDragged_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_pointerPressed_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_pointerReleased_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))



