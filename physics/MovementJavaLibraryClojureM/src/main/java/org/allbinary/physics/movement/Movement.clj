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
;; package org.allbinary.physics.movement

(ns Movement)

(JR/register 'Movement nil '[MovementInterface])

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
  (let [o (JR/alloc 'Movement)] (jinit_0 o) o))

    
(defn jm_init_3 [this p_speedBasicDecimal p_angle p_otherAngle]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        nil))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        nil))

    
(defn jm_stop_0 [this]
  (let []
        nil))



