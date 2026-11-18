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

(ns RotationAnimationFactory)

(JR/register 'RotationAnimationFactory nil '[AnimationInterfaceFactoryInterface ProceduralAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :totalAngle 0)
  (JR/fset this :angleIncrement 0)
  this)

    
(defn jm_createFactory_0 []
  (let [this nil l_totalAngle (volatile! nil)]
        (vreset! l_totalAngle (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE))
        (RotationAnimationFactory/jnew_2 @l_totalAngle (JR/i16 (JR/idiv @l_totalAngle (JR/invoke (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :jm_getGameControlFidelity_0))))))

    
(defn jinit_2 [this p_totalAngle p_angleIncrement]
  (let [ l_totalAngle (volatile! p_totalAngle) l_angleIncrement (volatile! p_angleIncrement)]
    nil (jinitfields this)
        (JR/fset this :totalAngle @l_totalAngle)
        (JR/fset this :angleIncrement @l_angleIncrement))
  this)

(defn jnew_2 [p_totalAngle p_angleIncrement ]
  (let [o (JR/alloc 'RotationAnimationFactory)] (jinit_2 o p_totalAngle p_angleIncrement) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (JR/scall 'NullRotationAnimation :jm_createTotalAngle_3 (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget this :angleIncrement)) (JR/fget this :totalAngle) (JR/scall 'AnimationBehavior :jm_getInstance_0))))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/scall 'NullRotationAnimation :jm_createTotalAngle_3 (JR/scall 'AngleInfo :jm_getInstance_1 (JR/fget this :angleIncrement)) (JR/fget this :totalAngle) (JR/scall 'AnimationBehavior :jm_getInstance_0))))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



