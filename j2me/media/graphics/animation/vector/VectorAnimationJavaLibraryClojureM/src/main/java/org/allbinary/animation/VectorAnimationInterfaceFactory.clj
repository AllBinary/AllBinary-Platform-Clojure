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

(ns VectorAnimationInterfaceFactory)

(JR/register 'VectorAnimationInterfaceFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :currentPoints nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :animationBehaviorFactory nil)
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE))
  this)

    
(defn jinit_3 [this p_currentPoints p_basicColor p_animationBehaviorFactory]
  (let [ l_currentPoints (volatile! p_currentPoints) l_basicColor (volatile! p_basicColor) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (JR/fset this :currentPoints @l_currentPoints)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory))
  this)

(defn jnew_3 [p_currentPoints p_basicColor p_animationBehaviorFactory ]
  (let [o (JR/alloc 'VectorAnimationInterfaceFactory)] (jinit_3 o p_currentPoints p_basicColor p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (VectorAnimation/jnew_3 (JR/fget this :currentPoints) (JR/invoke this :jm_getBasicColorP_0) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



