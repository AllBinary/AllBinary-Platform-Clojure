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

(ns SingletonAnimationInterfaceFactory)

(JR/register 'SingletonAnimationInterfaceFactory nil '[AnimationInterfaceFactoryInterface ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  this)

    
(defn jinit_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
    nil (jinitfields this)
        (JR/fset this :animationInterface @l_animationInterface))
  this)

(defn jnew_1 [p_animationInterface ]
  (let [o (JR/alloc 'SingletonAnimationInterfaceFactory)] (jinit_1 o p_animationInterface) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (JR/fget this :animationInterface)))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/fget this :animationInterface)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



