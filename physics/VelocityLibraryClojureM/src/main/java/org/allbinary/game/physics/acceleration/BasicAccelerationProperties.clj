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
;; package org.allbinary.game.physics.acceleration

(ns BasicAccelerationProperties)

(JR/register 'BasicAccelerationProperties nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :forward 0)
  (JR/fset this :reverse 0)
  this)

    
(defn jinit_2 [this p_forward p_reverse]
  (let [ l_forward (volatile! p_forward) l_reverse (volatile! p_reverse)]
    nil (jinitfields this)
        (JR/invoke this :jm_setForward_1 @l_forward)
        (JR/invoke this :jm_setReverse_1 @l_reverse))
  this)

(defn jnew_2 [p_forward p_reverse ]
  (let [o (JR/alloc 'BasicAccelerationProperties)] (jinit_2 o p_forward p_reverse) o))

    
(defn jm_setReverse_1 [this p_reverse]
  (let [ l_reverse (volatile! p_reverse)]
        (JR/fset this :reverse @l_reverse)))

    
(defn jm_getReverse_0 [this]
  (let []
        (JR/fget this :reverse)))

    
(defn jm_setForward_1 [this p_forward]
  (let [ l_forward (volatile! p_forward)]
        (JR/fset this :forward @l_forward)))

    
(defn jm_getForward_0 [this]
  (let []
        (JR/fget this :forward)))



