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
;; package org.allbinary.game.state

(ns GameStateFactory)

(JR/register 'GameStateFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :index 0)
  (JR/fset this :NO_GAME_STATE nil)
  (JR/fset this :PLAYING_GAME_STATE nil)
  (JR/fset this :SHOW_END_RESULT_GAME_STATE nil)
  (JR/fset this :SHOW_HIGH_SCORE_GAME_STATE nil)
    (JR/fset this :index 0)
    (JR/fset this :NO_GAME_STATE (JR/invoke this :jm_createGameState_1 "NO_GAME_STATE"))
    (JR/fset this :PLAYING_GAME_STATE (JR/invoke this :jm_createGameState_1 "PLAYING_GAME_STATE"))
    (JR/fset this :SHOW_END_RESULT_GAME_STATE (JR/invoke this :jm_createGameState_1 "SHOW_END_RESULT_GAME_STATE"))
    (JR/fset this :SHOW_HIGH_SCORE_GAME_STATE (JR/invoke this :jm_createGameState_1 "SHOW_HIGH_SCORE_GAME_STATE"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameStateFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameStateFactory/jstatic_set_instance (GameStateFactory/jnew_0))))
        (GameStateFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameStateFactory)] (jinit_0 o) o))

    
(defn jm_createGameState_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (GameState/jnew_2 @l_name (JR/finc this :index 1 :int true))))



