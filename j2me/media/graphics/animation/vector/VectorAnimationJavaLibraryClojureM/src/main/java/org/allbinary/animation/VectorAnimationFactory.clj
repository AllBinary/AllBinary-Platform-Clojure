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

(ns VectorAnimationFactory)

(JR/register 'VectorAnimationFactory nil '[VectorAnimationFactoryInterface])

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
  (let [o (JR/alloc 'VectorAnimationFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_2 [this p_points p_basicColor]
  (let [ l_points (volatile! p_points) l_basicColor (volatile! p_basicColor)]
        (VectorAnimation/jnew_3 @l_points @l_basicColor (JR/scall 'AnimationBehavior :jm_getInstance_0))))



