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
;; package org.allbinary.animation

(ns NullRotationAnimation2)

(JR/register 'NullRotationAnimation2 'NullRotationAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (NullRotationAnimation/jinit_3 this (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :QUARTER_TOTAL_ANGLE)) (JR/scall 'CircularIndexUtil :jm_createInstance_1 4) (IndexedAnimationBehavior/jnew_2 1 250)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NullRotationAnimation2)] (jinit_0 o) o))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))



