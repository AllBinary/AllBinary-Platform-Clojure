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
;; package org.allbinary.animation.transition

(ns RunAtEndAnimationListener)

(JR/register 'RunAtEndAnimationListener nil '[AnimationListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :runnable nil)
  this)

    
(defn jinit_1 [this p_runnable]
  (let [ l_runnable (volatile! p_runnable)]
    nil (jinitfields this)
        (JR/fset this :runnable @l_runnable))
  this)

(defn jnew_1 [p_runnable ]
  (let [o (JR/alloc 'RunAtEndAnimationListener)] (jinit_1 o p_runnable) o))

    
(defn jm_onPlatformAnimationStart_0 [this]
  (let []
        nil))

    
(defn jm_onPlatformAnimationEnd_0 [this]
  (let []
        nil))

    
(defn jm_onPlatformAnimationRepeat_0 [this]
  (let []
        nil))



