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
;; package org.allbinary.game

(ns PlayerTypesFactory)

(JR/register 'PlayerTypesFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (PlayerTypesFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :PLAYER_TYPE_ONE nil)
  (JR/fset this :PLAYER_TYPE_TWO nil)
  (JR/fset this :PLAYER_TYPE_THREE nil)
    (JR/fset this :PLAYER_TYPE_ONE (PlayerType/jnew_2 "Player Type One" 0))
    (JR/fset this :PLAYER_TYPE_TWO (PlayerType/jnew_2 "Player Type Two" 1))
    (JR/fset this :PLAYER_TYPE_THREE (PlayerType/jnew_2 "Player Type Three" 2))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlayerTypesFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PlayerTypesFactory/jstatic_SINGLETON)))



