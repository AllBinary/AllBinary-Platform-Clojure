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

(ns GameInfo)

(JR/register 'GameInfo nil '[])

(def jsv_NONE (atom nil))
(def jsv_LEVEL_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NONE [] (JR/ensure-init jclinit-state jclinit) @jsv_NONE)
(defn jstatic_set_NONE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NONE v))
(defn jstatic_LEVEL_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_LEVEL_NAME)
(defn jstatic_set_LEVEL_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_LEVEL_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NONE (GameInfo/jnew_5 (JR/fget (JR/scall 'GameTypeFactory :jm_getInstance_0) :NONE) (JR/sget 'GameMode "NONE") (JR/fget (JR/scall 'PlayerTypesFactory :jm_getInstance_0) :PLAYER_TYPE_ONE) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1)))))
    (reset! jsv_LEVEL_NAME "LEVEL")
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :gameInfoData nil)
  (JR/fset this :gameType nil)
  (JR/fset this :gameMode nil)
  (JR/fset this :playerType nil)
  (JR/fset this :highestLevel 0)
  (JR/fset this :currentLevel 0)
  (JR/fset this :NEW_LEVEL nil)
  (JR/fset this :SET_CURRENT_LEVEL nil)
  (JR/fset this :NEXT_GAME_LEVEL nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :gameInfoData (JR/scall 'GameInfoData :jm_getInstance_0))
    (JR/fset this :NEW_LEVEL "New Level: ")
    (JR/fset this :SET_CURRENT_LEVEL "setCurrentLevel")
    (JR/fset this :NEXT_GAME_LEVEL "nextGameLevel")
  this)

    
(defn jinit_5 [this p_gameType p_gameMode p_playerType p_highestLevel p_currentLevel]
  (let [ l_gameType (volatile! p_gameType) l_gameMode (volatile! p_gameMode) l_playerType (volatile! p_playerType) l_highestLevel (volatile! p_highestLevel) l_currentLevel (volatile! p_currentLevel)]
    nil (jinitfields this)
        (JR/fset this :gameType @l_gameType)
        (JR/fset this :gameMode @l_gameMode)
        (JR/invoke this :jm_setHighestLevel_1 @l_highestLevel)
        (JR/fset this :currentLevel @l_currentLevel)
        (JR/fset this :playerType @l_playerType))
  this)

(defn jnew_5 [p_gameType p_gameMode p_playerType p_highestLevel p_currentLevel ]
  (let [o (JR/alloc 'GameInfo)] (jinit_5 o p_gameType p_gameMode p_playerType p_highestLevel p_currentLevel) o))

    
(defn jm_getGameType_0 [this]
  (let []
        (JR/fget this :gameType)))

    
(defn jm_getGameMode_0 [this]
  (let []
        (JR/fget this :gameMode)))

    
(defn jm_getPlayerType_0 [this]
  (let []
        (JR/fget this :playerType)))

    
(defn jm_getHighestLevel_0 [this]
  (let []
        (JR/fget this :highestLevel)))

    
(defn jm_setHighestLevel_1 [this p_highestLevel]
  (let [ l_highestLevel (volatile! p_highestLevel)]
        (JR/fset this :highestLevel @l_highestLevel)))

    
(defn jm_getCurrentLevel_0 [this]
  (let []
        (JR/fget this :currentLevel)))

    
(defn jm_setCurrentLevel_1 [this p_currentLevel]
  (let [ l_currentLevel (volatile! p_currentLevel)]
        (JR/fset this :currentLevel @l_currentLevel)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :NEW_LEVEL)) :jm_appendint_1 (JR/invoke this :jm_getCurrentLevel_0))) this (JR/fget this :SET_CURRENT_LEVEL))))

    
(defn jm_nextGameLevel_0 [this]
  (let []
        (if (< (JR/invoke this :jm_getCurrentLevel_0) (JR/invoke this :jm_getHighestLevel_0))
            (do
            (JR/finc this :currentLevel 1 :int false)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :NEXT)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)) :jm_append_1 (JR/fget this :NEW_LEVEL)) :jm_appendint_1 (JR/invoke this :jm_getCurrentLevel_0))) this (JR/fget this :NEXT_GAME_LEVEL))))

    
(defn jm_previousGameLevel_0 [this]
  (let []
        (if (> (JR/invoke this :jm_getCurrentLevel_0) 1)
            (do
            (JR/finc this :currentLevel -1 :int false)))))

    
(defn jm_isLastLevel_0 [this]
  (let []
        (if (>= (JR/invoke this :jm_getCurrentLevel_0) (JR/invoke this :jm_getHighestLevel_0))
            (do
            true)
            (do
            false))))

    
(defn jm_toHashtable_0 [this]
  (let [ l_hashtable (volatile! nil)]
        (vreset! l_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
        (JR/invoke @l_hashtable :jm_put_2 (JR/fget (JR/fget this :gameInfoData) :GAME_TYPE) (JR/to-string-of (JR/invoke this :jm_getGameType_0)))
        (JR/invoke @l_hashtable :jm_put_2 (JR/fget (JR/fget this :gameInfoData) :GAME_MODE) (JR/to-string-of (JR/fget this :gameMode)))
        (JR/invoke @l_hashtable :jm_put_2 (JR/fget (JR/fget this :gameInfoData) :PLAYER_TYPE) (JR/to-string-of (JR/fget this :playerType)))
        (JR/invoke @l_hashtable :jm_put_2 (JR/fget (JR/fget this :gameInfoData) :HIGHEST_LEVEL) (JR/s (JR/invoke this :jm_getHighestLevel_0)))
        (JR/invoke @l_hashtable :jm_put_2 (JR/fget (JR/fget this :gameInfoData) :CURRENT_LEVEL) (JR/s (JR/fget this :currentLevel)))
        @l_hashtable))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_commonSeps (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :gameInfoData) :GAME_TYPE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :EQUALS))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/invoke this :jm_getGameType_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :gameInfoData) :GAME_MODE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :EQUALS))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :gameMode)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :gameInfoData) :PLAYER_TYPE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :EQUALS))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :playerType)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :gameInfoData) :HIGHEST_LEVEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getHighestLevel_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :gameInfoData) :CURRENT_LEVEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :currentLevel))
        (JR/to-string-of @l_stringBuffer)))



