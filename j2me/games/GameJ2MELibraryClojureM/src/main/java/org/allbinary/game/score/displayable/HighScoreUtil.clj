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
;; package org.allbinary.game.score.displayable

(ns HighScoreUtil)

(JR/register 'HighScoreUtil nil '[HighScoresResultsListener])

(def jsv_SUBMIT_TEXTBOX_COMMAND (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SUBMIT_TEXTBOX_COMMAND [] (JR/ensure-init jclinit-state jclinit) @jsv_SUBMIT_TEXTBOX_COMMAND)
(defn jstatic_set_SUBMIT_TEXTBOX_COMMAND [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SUBMIT_TEXTBOX_COMMAND v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SUBMIT_TEXTBOX_COMMAND (Command/jnew_4 "Submit" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :highScoresFactoryInterface nil)
  (JR/fset this :highScoresArray nil)
  (JR/fset this :highScore nil)
  (JR/fset this :abeClientInformation nil)
  (JR/fset this :gameInfo nil)
  (JR/fset this :highScoresHelper nil)
  (JR/fset this :firstTime false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :firstTime true)
  this)

    
(defn jinit_7 [this p_highScoresFactoryInterface p_highScoresHelper p_abeClientInformation p_gameInfo p_cmdListener p_name p_highScore]
  (let [ l_highScoresFactoryInterface (volatile! p_highScoresFactoryInterface) l_highScoresHelper (volatile! p_highScoresHelper) l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_cmdListener (volatile! p_cmdListener) l_name (volatile! p_name) l_highScore (volatile! p_highScore)]
    nil (jinitfields this)
        (JR/fset this :highScoresFactoryInterface @l_highScoresFactoryInterface)
        (JR/fset this :highScoresHelper @l_highScoresHelper)
        (JR/fset this :highScoresArray (JR/invoke (JR/fget this :highScoresHelper) :jm_getHighScoresArray_0))
        (JR/fset this :highScore @l_highScore)
        (JR/fset this :abeClientInformation @l_abeClientInformation)
        (JR/fset this :gameInfo @l_gameInfo))
  this)

(defn jnew_7 [p_highScoresFactoryInterface p_highScoresHelper p_abeClientInformation p_gameInfo p_cmdListener p_name p_highScore ]
  (let [o (JR/alloc 'HighScoreUtil)] (jinit_7 o p_highScoresFactoryInterface p_highScoresHelper p_abeClientInformation p_gameInfo p_cmdListener p_name p_highScore) o))

    
(defn jm_setHighScoresArray_1 [this p_highScoresArray]
  (let [ l_highScoresArray (volatile! p_highScoresArray)]
        (JR/fset this :highScoresArray @l_highScoresArray)
        (JR/fset this :firstTime false)
        (JR/invoke this :jm_saveHighScore_0)))

    
(defn jm_update_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/invoke (JR/scall 'HighScoreNamePersistanceSingleton :jm_getInstance_0) :jm_save_3 (JR/fget this :abeClientInformation) (JR/fget this :gameInfo) @l_name)
        (JR/invoke (JR/fget this :highScore) :jm_setName_1 @l_name)))

    
(defn jm_saveHighScore_0 [this]
  (let [ l_size (volatile! nil) l_highScores (volatile! nil) l_highScoresAsString (volatile! nil) l_index (volatile! nil)](JR/method
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :highScore)))) this "saveHighScore")
        (vreset! l_size (JR/alen (JR/fget this :highScoresArray)))
        (if (and (JR/fget this :firstTime) (== @l_size 0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Games canvas did not give us any HighScores" this "saveHighScore")
            (JR/invoke (JR/fget this :highScoresFactoryInterface) :jm_fetchHighScores_2 (JR/fget this :gameInfo) this)
            (JR/jreturn)))
        (vreset! l_highScores nil)
        (vreset! l_highScoresAsString nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_highScores (JR/aget* (JR/fget this :highScoresArray) @l_index))
            (JR/invoke @l_highScores :jm_addHighScore_1 (JR/fget this :highScore))
            (vreset! l_highScoresAsString (JR/to-string-of @l_highScores))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Added/Adding Score: ") :jm_append_1 @l_highScoresAsString)) this "saveHighScore")))
        (JR/invoke (JR/fget this :highScoresHelper) :jm_setHighScoresArray_1 (JR/fget this :highScoresArray)))))

    
(defn jm_submit_1 [this p_myCanvas]
  (let [ l_myCanvas (volatile! p_myCanvas) l_commandListener (volatile! nil)]
        (vreset! l_commandListener (JR/invoke @l_myCanvas :jm_getCustomCommandListener_0))
        (JR/invoke @l_commandListener :jm_commandAction_2 (HighScoreUtil/jstatic_SUBMIT_TEXTBOX_COMMAND) @l_myCanvas)))



