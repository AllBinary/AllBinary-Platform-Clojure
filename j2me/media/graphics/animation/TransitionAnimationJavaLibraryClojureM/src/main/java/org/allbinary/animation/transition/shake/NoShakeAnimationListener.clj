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
;; package org.allbinary.animation.transition.shake

(ns NoShakeAnimationListener)

(JR/register 'NoShakeAnimationListener 'ShakeAnimationListener '[])

(def jsv_NO_SHAKE_ANIMATION_LISTENER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_SHAKE_ANIMATION_LISTENER [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_SHAKE_ANIMATION_LISTENER)
(defn jstatic_set_NO_SHAKE_ANIMATION_LISTENER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_SHAKE_ANIMATION_LISTENER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_SHAKE_ANIMATION_LISTENER (NoShakeAnimationListener/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (ShakeAnimationListener/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NoShakeAnimationListener)] (jinit_0 o) o))



