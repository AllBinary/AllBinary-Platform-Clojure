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

(ns XYOscillateVelocityMovement)

(JR/register 'XYOscillateVelocityMovement 'BasicConstantVelocityMovement '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :oscillateMin 0)
  (JR/fset this :oscillateMax 0)
  (JR/fset this :oscillate 0)
  (JR/fset this :oscillatePositive false)
  this)

    
(defn jinit_3 [this p_speedBasicDecimal p_oscillateMin p_oscillateMax]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal) l_oscillateMin (volatile! p_oscillateMin) l_oscillateMax (volatile! p_oscillateMax)]
        (BasicConstantVelocityMovement/jinit_2 this @l_speedBasicDecimal (VelocityProperties/jnew_2 (JR/i32 (JR/invoke @l_speedBasicDecimal :jm_getUnscaled_0)) (JR/i32 (JR/invoke @l_speedBasicDecimal :jm_getUnscaled_0)))) (jinitfields this)
        (JR/fset this :oscillateMin @l_oscillateMin)
        (JR/fset this :oscillateMax @l_oscillateMax))
  this)

(defn jnew_3 [p_speedBasicDecimal p_oscillateMin p_oscillateMax ]
  (let [o (JR/alloc 'XYOscillateVelocityMovement)] (jinit_3 o p_speedBasicDecimal p_oscillateMin p_oscillateMax) o))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        (JR/invoke-super 'BasicConstantVelocityMovement this :jm_process_1 @l_layer)
        (if (< (JR/fget this :oscillate) (JR/fget this :oscillateMin))
            (do
            (JR/fset this :oscillatePositive true)
            (JR/invoke (JR/invoke (JR/invoke this :jm_getVelocityProperties_0) :jm_getVelocityYBasicDecimalP_0) :jm_addint_1 3000))
            (if (> (JR/fget this :oscillate) (JR/fget this :oscillateMax))
            (do
            (JR/fset this :oscillatePositive false)
            (JR/invoke (JR/invoke (JR/invoke this :jm_getVelocityProperties_0) :jm_getVelocityYBasicDecimalP_0) :jm_subtractint_1 3000))))
        (if (JR/fget this :oscillatePositive)
            (do
            (JR/finc this :oscillate 1 :int false)
            (JR/invoke (JR/invoke (JR/invoke this :jm_getVelocityProperties_0) :jm_getVelocityXBasicDecimalP_0) :jm_addint_1 5000))
            (do
            (JR/finc this :oscillate -1 :int false)
            (JR/invoke (JR/invoke (JR/invoke this :jm_getVelocityProperties_0) :jm_getVelocityXBasicDecimalP_0) :jm_subtractint_1 5000)))))



