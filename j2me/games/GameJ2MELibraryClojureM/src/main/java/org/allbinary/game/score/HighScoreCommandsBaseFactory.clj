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
;; package org.allbinary.game.score

(ns HighScoreCommandsBaseFactory)

(JR/register 'HighScoreCommandsBaseFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :HIGH_SCORE_COMMANDS nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_HIGH_SCORE_COMMANDS]
  (let [ l_HIGH_SCORE_COMMANDS (volatile! p_HIGH_SCORE_COMMANDS)]
    nil (jinitfields this)
        (JR/fset this :HIGH_SCORE_COMMANDS @l_HIGH_SCORE_COMMANDS))
  this)

(defn jnew_1 [p_HIGH_SCORE_COMMANDS ]
  (let [o (JR/alloc 'HighScoreCommandsBaseFactory)] (jinit_1 o p_HIGH_SCORE_COMMANDS) o))

    
(defn jm_isHighScoreCommand_1 [this p_command]
  (let [ l_command (volatile! p_command) l_index (volatile! nil)](JR/method
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :HIGH_SCORE_COMMANDS)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (JR/eq @l_command (JR/aget* (JR/fget this :HIGH_SCORE_COMMANDS) @l_index))
                (do
                (JR/jreturn true)))))
        false)))

    
(defn jm_getIndex_1 [this p_command]
  (let [ l_command (volatile! p_command) l_index (volatile! nil)](JR/method
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :HIGH_SCORE_COMMANDS)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (JR/eq @l_command (JR/aget* (JR/fget this :HIGH_SCORE_COMMANDS) @l_index))
                (do
                (JR/jreturn @l_index)))))
        (JR/jthrow (new java.lang.Exception "No Such Command")))))



