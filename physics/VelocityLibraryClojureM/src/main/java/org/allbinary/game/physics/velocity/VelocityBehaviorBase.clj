;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.game.physics.velocity

(ns VelocityBehaviorBase)

(JR/register 'VelocityBehaviorBase nil '[])

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
  (let [o (JR/alloc 'VelocityBehaviorBase)] (jinit_0 o) o))

    
(defn jm_reduce_3 [this p_velocityProperties p_nominator p_denominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator) l_denominator (volatile! p_denominator)]
        nil))

    
(defn jm_reduceX_3 [this p_velocityProperties p_nominator p_denominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator) l_denominator (volatile! p_denominator)]
        nil))

    
(defn jm_reduceY_3 [this p_velocityProperties p_nominator p_denominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator) l_denominator (volatile! p_denominator)]
        nil))



