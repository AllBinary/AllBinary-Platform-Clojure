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
;; package org.allbinary.game.displayable.canvas

(ns EndGameInfo)

(JR/register 'EndGameInfo nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :NORMAL_GAME_OVER_WIN nil)
  (JR/fset this :TEASER_DEMO_GAME_END_LAST_LEVEL nil)
  (JR/fset this :TEASER_DEMO_GAME_END nil)
  (JR/fset this :gameOverStr nil)
  (JR/fset this :winStr nil)
    (JR/fset this :NORMAL_GAME_OVER_WIN "You Won")
    (JR/fset this :TEASER_DEMO_GAME_END_LAST_LEVEL "End of Demo.")
    (JR/fset this :TEASER_DEMO_GAME_END "Demo Game Over.")
    (JR/fset this :gameOverStr (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :winStr (JR/fget this :gameOverStr))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'EndGameInfo)] (jinit_0 o) o))

    
(defn jm_update_2 [this p_gameInfo p_myCanvas]
  (let [ l_gameInfo (volatile! p_gameInfo) l_myCanvas (volatile! p_myCanvas)]
        (if (JR/invoke @l_gameInfo :jm_isLastLevel_0)
            (do
            (JR/invoke this :jm_setWinStr_1 (JR/fget this :TEASER_DEMO_GAME_END_LAST_LEVEL))
            (JR/invoke this :jm_setGameOverStr_1 (JR/fget this :TEASER_DEMO_GAME_END_LAST_LEVEL)))
            (do
            (JR/invoke this :jm_setWinStr_1 (JR/fget this :NORMAL_GAME_OVER_WIN))
            (JR/invoke this :jm_setGameOverStr_1 (JR/fget this :TEASER_DEMO_GAME_END))))))

    
(defn jm_getGameOverStr_0 [this]
  (let []
        (JR/fget this :gameOverStr)))

    
(defn jm_setGameOverStr_1 [this p_gameOverStr]
  (let [ l_gameOverStr (volatile! p_gameOverStr)]
        (JR/fset this :gameOverStr @l_gameOverStr)))

    
(defn jm_getWinStr_0 [this]
  (let []
        (JR/fget this :winStr)))

    
(defn jm_setWinStr_1 [this p_winStr]
  (let [ l_winStr (volatile! p_winStr)]
        (JR/fset this :winStr @l_winStr)))



