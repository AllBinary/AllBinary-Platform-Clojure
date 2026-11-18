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
;; package org.allbinary.animation

(ns IndexedAnimationBehaviorFactory)

(JR/register 'IndexedAnimationBehaviorFactory 'AnimationBehaviorFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :frameDelayTime 0)
  (JR/fset this :loopTotal 0)
  this)

    
(defn jinit_2 [this p_loopTotal p_frameDelayTime]
  (let [ l_loopTotal (volatile! p_loopTotal) l_frameDelayTime (volatile! p_frameDelayTime)]
    (AnimationBehaviorFactory/jinit_0 this) (jinitfields this)
        (JR/fset this :loopTotal @l_loopTotal)
        (JR/fset this :frameDelayTime @l_frameDelayTime))
  this)

(defn jnew_2 [p_loopTotal p_frameDelayTime ]
  (let [o (JR/alloc 'IndexedAnimationBehaviorFactory)] (jinit_2 o p_loopTotal p_frameDelayTime) o))

    
(defn jm_getOrCreateInstance_0 [this]
  (let []
        (IndexedAnimationBehavior/jnew_2 (JR/fget this :loopTotal) (JR/fget this :frameDelayTime))))



