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

(ns GameInfoCopyFactory)

(JR/register 'GameInfoCopyFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameInfoCopyFactory)] (jinit_0 o) o))

    
(defn jm_getInstanceMaxLevel_2 [p_gameInfo p_maxLevel]
  (let [this nil l_gameInfo (volatile! p_gameInfo) l_maxLevel (volatile! p_maxLevel)]
        (GameInfo/jnew_5 (JR/invoke @l_gameInfo :jm_getGameType_0) (JR/invoke @l_gameInfo :jm_getGameMode_0) (JR/invoke @l_gameInfo :jm_getPlayerType_0) @l_maxLevel (JR/invoke @l_gameInfo :jm_getCurrentLevel_0))))

    
(defn jm_getInstance_1 [p_gameInfo]
  (let [this nil l_gameInfo (volatile! p_gameInfo)]
        (GameInfo/jnew_5 (JR/invoke @l_gameInfo :jm_getGameType_0) (JR/invoke @l_gameInfo :jm_getGameMode_0) (JR/invoke @l_gameInfo :jm_getPlayerType_0) (JR/invoke @l_gameInfo :jm_getHighestLevel_0) (JR/invoke @l_gameInfo :jm_getCurrentLevel_0))))



