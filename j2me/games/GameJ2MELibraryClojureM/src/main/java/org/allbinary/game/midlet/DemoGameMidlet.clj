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
;; package org.allbinary.game.midlet

(ns DemoGameMidlet)

(JR/register 'DemoGameMidlet 'GameMidlet '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_clientInformationFactory]
  (let [ l_clientInformationFactory (volatile! p_clientInformationFactory)]
        (GameMidlet/jinit_1 this @l_clientInformationFactory) (jinitfields this))
  this)

(defn jnew_1 [p_clientInformationFactory ]
  (let [o (JR/alloc 'DemoGameMidlet)] (jinit_1 o p_clientInformationFactory) o))

    
(defn jm_isContinue_0 [this]
  (let [ l_hashtable (volatile! nil)]
        (vreset! l_hashtable (JR/invoke this :jm_getStartStateHashtable_0))
        (if (and (some? @l_hashtable) (> (JR/invoke @l_hashtable :jm_size_0) 0))
            (do
            true)
            (do
            false))))

    
(defn jm_getHighestLevel_0 [this]
  (let []
        1))

    
(defn jm_createDemoGameCanvasRunnableInterface_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this (JR/fget (JR/fget this :commonStrings) :CREATE))
        (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE")))

    
(defn jm_createGameCanvasRunnable_1 [this p_allBinaryGameLayerManager]
  (let [ l_allBinaryGameLayerManager (volatile! p_allBinaryGameLayerManager)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_createGameCanvasRunnableInterface_0 [this]
  (let []
        (JR/invoke this :jm_createGameCanvasRunnable_1 (JR/invoke this :jm_createGameLayerManager_0))))

    
(defn jm_demoSetup_0 [this]
  (let []
        nil))

    
(defn jm_postDemoSetup_0 [this]
  (let []
        nil))

    
(defn jm_setDemo_0 [this]
  (let [ l_progressCanvas (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "setDemo")
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_start_0)
        (JR/invoke (JR/scall 'PrimaryThreadPool :jm_getInstance_0) :jm_runTask_1 (DemoRunnable/jnew_1 this))))

    
(defn jm_createGame_0 [this]
  (let [ l_CREATE_GAME (volatile! nil) l_progressCanvas (volatile! nil) l_hashtable (volatile! nil)]
        (vreset! l_CREATE_GAME "createGame")
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this @l_CREATE_GAME)
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_start_0)
        (vreset! l_hashtable (JR/invoke this :jm_getStartStateHashtable_0))
        (JR/invoke this :jm_setStartStateHashtable_1 (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE))
        (JR/invoke (JR/scall 'PrimaryThreadPool :jm_getInstance_0) :jm_runTask_1 (CreateGameRunnable/jnew_2 this @l_hashtable))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END) this @l_CREATE_GAME)))

    
(defn jm_isReady_0 [this]
  (let []
        true))



