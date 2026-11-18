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

(ns TimedVectorAnimation)

(JR/register 'TimedVectorAnimation 'VectorAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeElapsedHelper nil)
    (JR/fset this :timeElapsedHelper (TimeDelayHelper/jnew_1 200))
  this)

    
(defn jinit_3 [this p_currentPoints p_basicColor p_animationBehavior]
  (let [ l_currentPoints (volatile! p_currentPoints) l_basicColor (volatile! p_basicColor) l_animationBehavior (volatile! p_animationBehavior)]
        (VectorAnimation/jinit_3 this @l_currentPoints @l_basicColor @l_animationBehavior) (jinitfields this))
  this)

(defn jnew_3 [p_currentPoints p_basicColor p_animationBehavior ]
  (let [o (JR/alloc 'TimedVectorAnimation)] (jinit_3 o p_currentPoints p_basicColor p_animationBehavior) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :timeElapsedHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
            (do
            (JR/invoke-super 'VectorAnimation this :jm_nextFrame_0)))))



