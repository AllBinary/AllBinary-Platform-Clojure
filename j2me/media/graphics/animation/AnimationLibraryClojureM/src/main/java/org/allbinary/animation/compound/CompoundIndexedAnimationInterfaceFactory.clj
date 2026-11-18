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
;; package org.allbinary.animation.compound

(ns CompoundIndexedAnimationInterfaceFactory)

(JR/register 'CompoundIndexedAnimationInterfaceFactory 'CompoundAnimationInterfaceFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_basicAnimationInterfaceFactoryInterfaceArray p_animationBehaviorFactory]
  (let [ l_basicAnimationInterfaceFactoryInterfaceArray (volatile! p_basicAnimationInterfaceFactoryInterfaceArray) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (CompoundAnimationInterfaceFactory/jinit_2 this @l_basicAnimationInterfaceFactoryInterfaceArray @l_animationBehaviorFactory) (jinitfields this))
  this)

(defn jnew_2 [p_basicAnimationInterfaceFactoryInterfaceArray p_animationBehaviorFactory ]
  (let [o (JR/alloc 'CompoundIndexedAnimationInterfaceFactory)] (jinit_2 o p_basicAnimationInterfaceFactoryInterfaceArray p_animationBehaviorFactory) o))

    
(defn jm_createArray_1 [this p_size]
  (let [ l_size (volatile! p_size)]
        (JR/anew "Object" 1 @l_size)))

    
(defn jm_createAnimation_1 [this p_animationArray]
  (let [ l_animationArray (volatile! p_animationArray)]
        (CompoundIndexedAnimation/jnew_2 @l_animationArray (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))



