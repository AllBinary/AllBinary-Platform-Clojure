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

(ns AnimationEventHandler)

(JR/register 'AnimationEventHandler 'BasicEventHandler '[])

(def jsv_eventHandler (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_eventHandler [] (JR/ensure-init jclinit-state jclinit) @jsv_eventHandler)
(defn jstatic_set_eventHandler [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_eventHandler v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_eventHandler (AnimationEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AnimationEventHandler)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnimationEventHandler/jstatic_eventHandler)))



