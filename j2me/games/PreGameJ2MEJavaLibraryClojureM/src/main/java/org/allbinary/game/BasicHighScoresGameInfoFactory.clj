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

(ns BasicHighScoresGameInfoFactory)

(JR/register 'BasicHighScoresGameInfoFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (BasicHighScoresGameInfoFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :MULTI_PLAYER_SERVER nil)
  (JR/fset this :SINGLE_PLAYER_SERVER nil)
    (JR/fset this :MULTI_PLAYER_SERVER (GameInfo/jnew_5 (JR/fget (JR/scall 'GameTypeFactory :jm_getInstance_0) :MULTI_PLAYER) (JR/sget 'GameMode "SERVER") (JR/fget (JR/scall 'PlayerTypesFactory :jm_getInstance_0) :PLAYER_TYPE_ONE) 0 0))
    (JR/fset this :SINGLE_PLAYER_SERVER (GameInfo/jnew_5 (JR/fget (JR/scall 'GameTypeFactory :jm_getInstance_0) :SINGLE_PLAYER) (JR/sget 'GameMode "SERVER") (JR/fget (JR/scall 'PlayerTypesFactory :jm_getInstance_0) :PLAYER_TYPE_ONE) 0 0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicHighScoresGameInfoFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicHighScoresGameInfoFactory/jstatic_SINGLETON)))



