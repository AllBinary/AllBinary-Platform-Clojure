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
;; package org.allbinary.math

(ns Angle)

(JR/register 'Angle nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :value 0)
  this)

    
(defn jinit_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
    nil (jinitfields this)
        (JR/fset this :value @l_angle))
  this)

(defn jnew_1 [p_angle ]
  (let [o (JR/alloc 'Angle)] (jinit_1 o p_angle) o))

    
(defn jm_getValue_0 [this]
  (let []
        (JR/fget this :value)))



