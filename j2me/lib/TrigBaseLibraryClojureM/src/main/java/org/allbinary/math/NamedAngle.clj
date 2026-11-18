;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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

(ns NamedAngle)

(JR/register 'NamedAngle 'Angle '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  this)

    
(defn jinit_2 [this p_angle p_name]
  (let [ l_angle (volatile! p_angle) l_name (volatile! p_name)]
        (Angle/jinit_1 this @l_angle) (jinitfields this)
        (JR/fset this :name @l_name))
  this)

(defn jnew_2 [p_angle p_name ]
  (let [o (JR/alloc 'NamedAngle)] (jinit_2 o p_angle p_name) o))



