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

(ns IntermissionFactory)

(JR/register 'IntermissionFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (IntermissionFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :START_LEVEL_INTERMISSION_GAME_STATE nil)
  (JR/fset this :WAIT_LEVEL_INTERMISSION_GAME_STATE nil)
  (JR/fset this :SHOW_RESULTS_LEVEL_INTERMISSION_GAME_STATE nil)
  (JR/fset this :SHOW_HIGH_SCORE_LEVEL_INTERMISSION_GAME_STATE nil)
    (JR/fset this :START_LEVEL_INTERMISSION_GAME_STATE (JR/invoke (JR/scall 'GameStateFactory :jm_getInstance_0) :jm_createGameState_1 "START_LEVEL_INTERMISSION_GAME_STATE"))
    (JR/fset this :WAIT_LEVEL_INTERMISSION_GAME_STATE (JR/invoke (JR/scall 'GameStateFactory :jm_getInstance_0) :jm_createGameState_1 "WAIT_LEVEL_INTERMISSION_GAME_STATE"))
    (JR/fset this :SHOW_RESULTS_LEVEL_INTERMISSION_GAME_STATE (JR/invoke (JR/scall 'GameStateFactory :jm_getInstance_0) :jm_createGameState_1 "SHOW_RESULTS_LEVEL_INTERMISSION_GAME_STATE"))
    (JR/fset this :SHOW_HIGH_SCORE_LEVEL_INTERMISSION_GAME_STATE (JR/invoke (JR/scall 'GameStateFactory :jm_getInstance_0) :jm_createGameState_1 "SHOW_HIGH_SCORE_LEVEL_INTERMISSION_GAME_STATE"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'IntermissionFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (IntermissionFactory/jstatic_instance)))



