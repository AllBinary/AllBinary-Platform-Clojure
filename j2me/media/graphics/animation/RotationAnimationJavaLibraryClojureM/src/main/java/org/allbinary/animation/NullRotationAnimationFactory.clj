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

(ns NullRotationAnimationFactory)

(JR/register 'NullRotationAnimationFactory nil '[AnimationInterfaceFactoryInterface ProceduralAnimationInterfaceFactoryInterface])

(def jsv_NULL_ROTATION_ANIMATION_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ROTATION_ANIMATION_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ROTATION_ANIMATION_FACTORY)
(defn jstatic_set_NULL_ROTATION_ANIMATION_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ROTATION_ANIMATION_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ROTATION_ANIMATION_FACTORY (NullRotationAnimationFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_ROTATION_ANIMATION_ARRAY nil)
  (JR/fset this :NULL_ANIMATION nil)
    (JR/fset this :NULL_ROTATION_ANIMATION_ARRAY (JR/anew "Object" 1 0))
    (JR/fset this :NULL_ANIMATION (NullRotationAnimation2/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NullRotationAnimationFactory)] (jinit_0 o) o))

    
(defn jm_getFactoryInstance_0 []
  (let [this nil]
        (NullRotationAnimationFactory/jstatic_NULL_ROTATION_ANIMATION_FACTORY)))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (JR/fget this :NULL_ANIMATION)))

    
(defn jm_getInstanceAnimation_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/fget this :NULL_ANIMATION)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



