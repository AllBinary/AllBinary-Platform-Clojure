;; Generated Code Do Not Modify
;; package org.allbinary.game.midlet

(ns GameMidletStateFactory)

(JR/register 'GameMidletStateFactory nil '[])

(def jsv_INSTANCE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_INSTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_INSTANCE)
(defn jstatic_set_INSTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INSTANCE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_INSTANCE (GameMidletStateFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :currentGameState nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :currentGameState (JR/fget (JR/scall 'GameStateFactory :jm_getInstance_0) :NO_GAME_STATE))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameMidletStateFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameMidletStateFactory/jstatic_INSTANCE)))

    
(defn jm_getCurrentGameState_0 [this]
  (let []
        (JR/fget this :currentGameState)))

    
(defn jm_setCurrentGameState_1 [this p_currentGameState]
  (let [ l_currentGameState (volatile! p_currentGameState)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :CURRENT)) :jm_append_1 " GameState: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_currentGameState))) this "setCurrentGameState")
        (JR/fset this :currentGameState @l_currentGameState)))



