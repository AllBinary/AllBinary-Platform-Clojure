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
;; package org.allbinary.game.ag.layer.pickup.health

(ns HealLayer)

(JR/register 'HealLayer 'AllBinaryLayer '[HealthVisitorInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (AllBinaryLayer/jinit_3 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 0 0) (JR/scall 'ViewPosition :jm_getInstanceD_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HealLayer)] (jinit_0 o) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_visit_1 [this p_healthInterface]
  (let [ l_healthInterface (volatile! p_healthInterface)]
        (if (JR/invoke @l_healthInterface :jm_isAlive_0)
            (do
            (JR/invoke @l_healthInterface :jm_healMax_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Heal attempt on dead: Does not currently occur" this "visit")))))



