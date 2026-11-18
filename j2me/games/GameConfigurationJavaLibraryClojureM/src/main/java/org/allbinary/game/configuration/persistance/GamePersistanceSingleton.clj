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
;; package org.allbinary.game.configuration.persistance

(ns GamePersistanceSingleton)

(JR/register 'GamePersistanceSingleton 'KeyValuePersistance '[])

(def jsv_GAME_PERSISTANCE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_GAME_PERSISTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_GAME_PERSISTANCE)
(defn jstatic_set_GAME_PERSISTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_GAME_PERSISTANCE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_GAME_PERSISTANCE (GamePersistanceSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GamePersistanceSingleton/jstatic_GAME_PERSISTANCE)))

    
(defn jinit_0 [this]
  (let []
        (KeyValuePersistance/jinit_1 this (JR/fget (JR/scall 'GamePersistanceStrings :jm_getInstance_0) :SAVED_GAME_RECORD_ID)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GamePersistanceSingleton)] (jinit_0 o) o))



