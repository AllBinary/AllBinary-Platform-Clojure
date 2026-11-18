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
;; package org.allbinary.game.midlet

(ns DemoGameMidletStateFactory)

(JR/register 'DemoGameMidletStateFactory nil '[])

(def jsv_STATE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_STATE [] (JR/ensure-init jclinit-state jclinit) @jsv_STATE)
(defn jstatic_set_STATE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_STATE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_STATE (DemoGameMidletStateFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NONE nil)
  (JR/fset this :START_DEMO nil)
  (JR/fset this :START_GAME nil)
  (JR/fset this :START_INPUT_MAPPING nil)
    (JR/fset this :NONE (DemoGameMidletState/jnew_0))
    (JR/fset this :START_DEMO (DemoGameMidletState/jnew_0))
    (JR/fset this :START_GAME (DemoGameMidletState/jnew_0))
    (JR/fset this :START_INPUT_MAPPING (DemoGameMidletState/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DemoGameMidletStateFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DemoGameMidletStateFactory/jstatic_STATE)))



