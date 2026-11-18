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
;; package org.allbinary.game.physics

(ns FrictionProperties)

(JR/register 'FrictionProperties nil '[])

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
  (let [o (JR/alloc 'FrictionProperties)] (jinit_0 o) o))

    
(defn jm_friction_2 [this p_velocityProperties p_nominator]
  (let [ l_velocityProperties (volatile! p_velocityProperties) l_nominator (volatile! p_nominator)]
        (JR/invoke (JR/sget 'DragVelocityBehavior "instance") :jm_reduce_3 @l_velocityProperties @l_nominator (JR/scall 'FrictionData :jm_getFrictionDenominator_0))))



