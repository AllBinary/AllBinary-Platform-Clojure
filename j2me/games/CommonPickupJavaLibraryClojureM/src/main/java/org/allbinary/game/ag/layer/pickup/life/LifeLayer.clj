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
;; package org.allbinary.game.ag.layer.pickup.life

(ns LifeLayer)

(JR/register 'LifeLayer 'AllBinaryLayer '[LifeVisitorInterface])

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
  (let [o (JR/alloc 'LifeLayer)] (jinit_0 o) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_visit_1 [this p_lifeInterface]
  (let [ l_lifeInterface (volatile! p_lifeInterface)]
        (JR/invoke @l_lifeInterface :jm_add_1 (JR/i16 1))))



