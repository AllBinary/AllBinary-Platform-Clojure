;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.game.displayable.canvas

(ns NullGameCanvasRunnable)

(JR/register 'NullGameCanvasRunnable nil '[GameCanvasRunnableInterface])

(def jsv_NULL_GAME_CANVAS_RUNNABLE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_GAME_CANVAS_RUNNABLE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_GAME_CANVAS_RUNNABLE)
(defn jstatic_set_NULL_GAME_CANVAS_RUNNABLE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_GAME_CANVAS_RUNNABLE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_GAME_CANVAS_RUNNABLE (NullGameCanvasRunnable/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :gameStateFactory nil)
    (JR/fset this :gameStateFactory (JR/scall 'GameStateFactory :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullGameCanvasRunnable)] (jinit_0 o) o))

    
(defn jm_getTitle_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_isInitialized_0 [this]
  (let []
        false))

    
(defn jm_isPaused_0 [this]
  (let []
        false))

    
(defn jm_unPause_0 [this]
  (let []
        nil))

    
(defn jm_pause_0 [this]
  (let []
        nil))

    
(defn jm_isHighScoreSubmitted_0 [this]
  (let []
        false))

    
(defn jm_setHighScoreSubmitted_1 [this p_highScoreSubmitted]
  (let [ l_highScoreSubmitted (volatile! p_highScoreSubmitted)]
        nil))

    
(defn jm_processGameOver_0 [this]
  (let []
        nil))

    
(defn jm_isGameOver_0 [this]
  (let []
        false))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        nil))

    
(defn jm_getCurrentStateHashtable_0 [this]
  (let []
        (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE)))

    
(defn jm_getLoadStateHashtable_0 [this]
  (let []
        (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE)))

    
(defn jm_setLoadStateHashtable_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable)]
        nil))

    
(defn jm_getType_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_setGameState_1 [this p_gameState]
  (let [ l_gameState (volatile! p_gameState)]
        nil))

    
(defn jm_getGameState_0 [this]
  (let []
        (JR/fget (JR/fget this :gameStateFactory) :NO_GAME_STATE)))

    
(defn jm_itemStateChanged_1 [this p_item]
  (let [ l_item (volatile! p_item)]
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_isRunning_0 [this]
  (let []
        false))

    
(defn jm_setRunning_1 [this p_isRunning]
  (let [ l_isRunning (volatile! p_isRunning)]
        nil))

    
(defn jm_setThread_1 [this p_thread]
  (let [ l_thread (volatile! p_thread)]
        nil))

    
(defn jm_run_0 [this]
  (let []
        nil))



