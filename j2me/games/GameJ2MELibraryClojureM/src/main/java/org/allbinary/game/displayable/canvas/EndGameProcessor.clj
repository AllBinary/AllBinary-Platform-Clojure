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

(ns EndGameProcessor)

(JR/register 'EndGameProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gameStateFactory nil)
  (JR/fset this :gameCanvas nil)
  (JR/fset this :WAIT 0)
    (JR/fset this :gameStateFactory (JR/scall 'GameStateFactory :jm_getInstance_0))
    (JR/fset this :WAIT 5000)
  this)

    
(defn jinit_1 [this p_gameCanvas]
  (let [ l_gameCanvas (volatile! p_gameCanvas)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :gameCanvas @l_gameCanvas))
  this)

(defn jnew_1 [p_gameCanvas ]
  (let [o (JR/alloc 'EndGameProcessor)] (jinit_1 o p_gameCanvas) o))

    
(defn jm_process_0 [this]
  (let [ l_highScoresBase (volatile! nil) l_highScores (volatile! nil)]
        (if (JR/invoke (JR/fget this :gameCanvas) :jm_isHighScoreSubmitted_0)
            (do
            (if (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getGameStateTimeHelper_0) :jm_isElapsedTNT_1 (JR/fget this :WAIT))
                (do
                (if (JR/eq (JR/invoke (JR/fget this :gameCanvas) :jm_getGameState_0) (JR/fget (JR/fget this :gameStateFactory) :SHOW_END_RESULT_GAME_STATE))
                    (do
                    (vreset! l_highScoresBase (JR/fget (JR/fget this :gameCanvas) :highScoresHelper))
                    (vreset! l_highScores (JR/invoke @l_highScoresBase :jm_getSelectedHighScores_0))
                    (if (not (JR/eq @l_highScores (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0)))
                        (do
                        (JR/invoke @l_highScoresBase :jm_selectHighScores_0)
                        (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getRealHighScoresPaintable_0) :jm_setHighScores_1 @l_highScores)
                        (JR/invoke (JR/fget this :gameCanvas) :jm_setGameState_1 (JR/fget (JR/fget this :gameStateFactory) :SHOW_HIGH_SCORE_GAME_STATE))
                        (JR/invoke (JR/fget this :gameCanvas) :jm_setHighScoresPaintable_1 (JR/invoke (JR/fget this :gameCanvas) :jm_getRealHighScoresPaintable_0)))))
                    (if (JR/eq (JR/invoke (JR/fget this :gameCanvas) :jm_getGameState_0) (JR/fget (JR/fget this :gameStateFactory) :SHOW_HIGH_SCORE_GAME_STATE))
                    (do
                    (JR/invoke (JR/fget this :gameCanvas) :jm_setGameState_1 (JR/fget (JR/fget this :gameStateFactory) :SHOW_END_RESULT_GAME_STATE))
                    (JR/invoke (JR/fget this :gameCanvas) :jm_setHighScoresPaintable_1 (JR/scall 'NullPaintable :jm_getInstance_0)))))))))))



