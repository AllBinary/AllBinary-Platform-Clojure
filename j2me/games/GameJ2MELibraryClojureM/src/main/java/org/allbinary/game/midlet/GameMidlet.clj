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

(ns GameMidlet)

(JR/register 'GameMidlet 'ProgressMidlet '[CommandListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :enumerationUtil nil)
  (JR/fset this :basicColorFactory nil)
  (JR/fset this :features nil)
  (JR/fset this :midletStrings nil)
  (JR/fset this :myCommandsFactory nil)
  (JR/fset this :gameStrings nil)
  (JR/fset this :gameAdStateFactory nil)
  (JR/fset this :gameStateFactory nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :DISPLAYABLE nil)
  (JR/fset this :COMMAND_NAME nil)
  (JR/fset this :NO_COMMAND nil)
  (JR/fset this :NO_DISPLAYABLE nil)
  (JR/fset this :COMMAND_ACTION nil)
  (JR/fset this :PAUSE_APP_BACKGROUND nil)
  (JR/fset this :UN_PAUSE_APP_BACKGROUND nil)
  (JR/fset this :aboutCommandProcessor nil)
  (JR/fset this :webCommandProcessor nil)
  (JR/fset this :gameMidletStateFactory nil)
  (JR/fset this :gameStartTimeHelper nil)
  (JR/fset this :fullScreenUtil nil)
  (JR/fset this :debugInterface nil)
  (JR/fset this :allbinaryGameCanvasRunnableInterface nil)
  (JR/fset this :thread nil)
  (JR/fset this :loadGameForm nil)
  (JR/fset this :isFullScreen false)
  (JR/fset this :resized false)
  (JR/fset this :startedBefore false)
    (JR/fset this :enumerationUtil (JR/scall 'EnumerationUtil :jm_getInstance_0))
    (JR/fset this :basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
    (JR/fset this :features (JR/scall 'Features :jm_getInstance_0))
    (JR/fset this :midletStrings (JR/scall 'MidletStrings :jm_getInstance_0))
    (JR/fset this :myCommandsFactory (JR/scall 'MyCommandsFactory :jm_getInstance_0))
    (JR/fset this :gameStrings (JR/scall 'GameStrings :jm_getInstance_0))
    (JR/fset this :gameAdStateFactory (JR/scall 'GameAdStateFactory :jm_getInstance_0))
    (JR/fset this :gameStateFactory (JR/scall 'GameStateFactory :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :DISPLAYABLE " Displayable: ")
    (JR/fset this :COMMAND_NAME "command Name/Label: ")
    (JR/fset this :NO_COMMAND "No Command")
    (JR/fset this :NO_DISPLAYABLE "No Displayable")
    (JR/fset this :COMMAND_ACTION (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "GameMidlet::") :jm_append_1 (JR/fget (JR/fget this :midletStrings) :COMMAND_ACTION))))
    (JR/fset this :PAUSE_APP_BACKGROUND "pauseAppBackground")
    (JR/fset this :UN_PAUSE_APP_BACKGROUND "unPauseAppBackground")
    (JR/fset this :aboutCommandProcessor (JR/scall 'AboutCommandProcessor :jm_getInstance_0))
    (JR/fset this :webCommandProcessor (JR/scall 'WebCommandProcessor :jm_getInstance_0))
    (JR/fset this :gameMidletStateFactory (JR/scall 'GameMidletStateFactory :jm_getInstance_0))
    (JR/fset this :gameStartTimeHelper (TimeDelayHelper/jnew_1 240))
    (JR/fset this :fullScreenUtil (JR/scall 'FullScreenUtil :jm_getInstance_0))
    (JR/fset this :allbinaryGameCanvasRunnableInterface (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE"))
    (JR/fset this :thread (JR/sget 'NullThread "NULL_THREAD"))
    (JR/fset this :startedBefore false)
  this)

    
(defn jinit_1 [this p_clientInformationFactory]
  (let [ l_clientInformationFactory (volatile! p_clientInformationFactory) l_progressCanvas (volatile! nil)]
        (ProgressMidlet/jinit_1 this @l_clientInformationFactory) (jinitfields this)
        (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_initWithRange_2 (unchecked-int 0x291) 6)
        (JR/fset this :loadGameForm (JR/scall 'CommandForm :jm_getNullCommandForm_0))
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_init_1 this)
        (JR/invoke (JR/scall 'GameFeatureEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0))
        (JR/invoke (JR/scall 'GamePersistanceSingleton :jm_getInstance_0) :jm_clear_0)
        (JR/fset this :debugInterface (JR/scall 'DebugFactory :jm_getInstance_0))
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_1 [p_clientInformationFactory ]
  (let [o (JR/alloc 'GameMidlet)] (jinit_1 o p_clientInformationFactory) o))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_setDemo_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_createGame_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_mediaShutdown_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_stopAll_0 [this]
  (let []
        nil))

    
(defn jm_pauseApp_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (JR/invoke this :jm_pauseAppBackground_1 true)
        (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
        (JR/invoke (JR/invoke @l_gameAdState :jm_getAdvertisements_0) :jm_stopAll_0)))

    
(defn jm_pauseAppBackground_1 [this p_background]
  (let [ l_background (volatile! p_background)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget this :PAUSE_APP_BACKGROUND))
        (if (not (JR/eq (JR/fget this :allbinaryGameCanvasRunnableInterface) (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE")))
            (do
            (JR/invoke (JR/fget this :allbinaryGameCanvasRunnableInterface) :jm_pause_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "<<<<<< Null" this (JR/fget this :PAUSE_APP_BACKGROUND))))
        (JR/invoke (JR/scall 'AllBinarySensorManager :jm_getInstance_0) :jm_shutdown_0)))

    
(defn jm_unPauseApp_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (JR/invoke this :jm_unPauseAppBackground_1 true)
        (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
        (JR/invoke (JR/invoke @l_gameAdState :jm_getAdvertisements_0) :jm_startAll_0)))

    
(defn jm_unPauseAppBackground_1 [this p_background]
  (let [ l_background (volatile! p_background) l_gameCanvasRunnableInterface (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget this :UN_PAUSE_APP_BACKGROUND))
        (JR/invoke (JR/scall 'AllBinarySensorManager :jm_getInstance_0) :jm_init_0)
        (vreset! l_gameCanvasRunnableInterface (JR/fget this :allbinaryGameCanvasRunnableInterface))
        (if (not (JR/eq @l_gameCanvasRunnableInterface (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE")))
            (do
            (JR/invoke @l_gameCanvasRunnableInterface :jm_unPause_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "<<<<<< Null" this (JR/fget this :UN_PAUSE_APP_BACKGROUND))))))

    
(defn jm_destroyAppInRunnable_2 [this p_unconditional p_isProgress]
  (let [ l_unconditional (volatile! p_unconditional) l_isProgress (volatile! p_isProgress) l_progressCanvas (volatile! nil)]
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (if @l_isProgress
            (do
            (JR/invoke @l_progressCanvas :jm_start_0)
            (JR/invoke this :jm_commandAction_2 (JR/fget (JR/fget this :myCommandsFactory) :SET_DISPLAYABLE) @l_progressCanvas)))
        (JR/invoke this :jm_destroyApp_1 @l_unconditional)
        (if @l_isProgress
            (do
            (JR/invoke @l_progressCanvas :jm_end_0)))))

    
(defn jm_destroyApp_1 [this p_unconditional]
  (let [ l_unconditional (volatile! p_unconditional) l_METHOD_NAME (volatile! nil) l_gameAdState (volatile! nil) l_e (volatile! nil)]
        (vreset! l_METHOD_NAME "GameMidlet::destroyApp")
        (try (do
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/scall 'GameStatisticsFactory :jm_getInstance_0)) this @l_METHOD_NAME)
            (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
            (JR/invoke (JR/invoke @l_gameAdState :jm_getAdvertisements_0) :jm_stopAll_0)
            (if (not (JR/invoke this :jm_isDestroyed_0))
                (do
                (JR/invoke this :jm_stopGameCanvasRunnableInterface_0)
                (JR/invoke this :jm_setGameCanvasRunnableInterface_1 (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE"))
                (JR/invoke this :jm_mediaShutdown_0))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Midlet Managment Error: Midlet Should Only Be Destroyed Once" this @l_METHOD_NAME)))
            (JR/invoke-super 'ProgressMidlet this :jm_destroyApp_1 true)
            (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :commonStrings) :END) this @l_METHOD_NAME))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this @l_METHOD_NAME @l_e)) :else (throw jt)))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END) this @l_METHOD_NAME)))

    
(defn jm_startApp_0 [this]
  (let [ l_gameAdState (volatile! nil) l_START_APP (volatile! nil) l_gameCanvasRunnableInterface (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
            (JR/invoke (JR/invoke @l_gameAdState :jm_getAdvertisements_0) :jm_startAll_0)
            (vreset! l_START_APP "startApp")
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this @l_START_APP)
            (vreset! l_gameCanvasRunnableInterface (JR/fget this :allbinaryGameCanvasRunnableInterface))
            (if (JR/eq @l_gameCanvasRunnableInterface (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE"))
                (do
                (JR/invoke (JR/fget this :gameMidletStateFactory) :jm_setCurrentGameState_1 (JR/fget (JR/fget this :gameStateFactory) :NO_GAME_STATE))
                (JR/invoke this :jm_setDemo_0))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "GameCanvasRunnableInterface is available" this @l_START_APP)
                (if (JR/eq @l_gameCanvasRunnableInterface (JR/invoke this :jm_getCurrentDisplayable_0))
                    (do
                    (JR/invoke this :jm_unPauseAppBackground_1 false))
                    (do
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "GameCanvasRunnableInterface is not current displayable" this @l_START_APP))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "startApp" @l_e)
            (JR/invoke this :jm_destroyApp_1 false)
            (JR/invoke this :jm_notifyDestroyed_0)) :else (throw jt)))))))

    
(defn jm_commandAction_2 [this p_command p_displayable]
  (let [ l_command (volatile! p_command) l_displayable (volatile! p_displayable) l_displayableAsString (volatile! nil) l_label (volatile! nil) l_gameCommandsFactory (volatile! nil) l_allbinaryGameCanvasRunnableInterface (volatile! nil) l_gameCanvasRunnableInterface (volatile! nil) l_mainFeatureFactory (volatile! nil) l_isFullScreen (volatile! nil) l_virtualKeyboardEventHandler (volatile! nil) l_highScoreTextBox (volatile! nil) l_keyValuePersistance (volatile! nil) l_loadGameForm (volatile! nil) l_index (volatile! nil) l_menuListener (volatile! nil) l_layerManager (volatile! nil) l_stringBuffer (volatile! nil) l_inGameOptionsForm (volatile! nil) l_progressCanvas (volatile! nil) l_inGameOptionsFormFactory (volatile! nil) l_tempDisplayable (volatile! nil) l_gameInputMappingCanvas (volatile! nil) l_highScoresCanvas (volatile! nil) l_gameCanvas (volatile! nil) l_inApplicationPurchaseFactory (volatile! nil) l_list (volatile! nil) l_lockableFeature (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_displayableAsString (JR/fget this :NO_DISPLAYABLE))
            (if (some? @l_displayable)
                (do
                (vreset! l_displayableAsString (JR/to-string-of @l_displayable))))
            (vreset! l_label (JR/fget this :NO_COMMAND))
            (if (some? @l_command)
                (do
                (vreset! l_label (JR/invoke @l_command :jm_getLabel_0))))
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :COMMAND_NAME)) :jm_append_1 @l_label) :jm_append_1 (JR/fget this :DISPLAYABLE)) :jm_append_1 @l_displayableAsString)) this (JR/fget this :COMMAND_ACTION))
            (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
            (vreset! l_allbinaryGameCanvasRunnableInterface (JR/fget this :allbinaryGameCanvasRunnableInterface))
            (vreset! l_gameCanvasRunnableInterface @l_allbinaryGameCanvasRunnableInterface)
            (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :SHOW_GAME_CANVAS))
                (do
                (if (and (not (JR/eq (JR/invoke (JR/invoke this :jm_getDisplay_0) :jm_getCurrent_0) @l_gameCanvasRunnableInterface)) (not (== (JR/invoke @l_allbinaryGameCanvasRunnableInterface :jm_getType_0) (JR/invoke (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE") :jm_getType_0))))
                    (do
                    (JR/invoke this :jm_setDisplay_1 @l_gameCanvasRunnableInterface)))
                (JR/invoke this :jm_unPauseAppBackground_1 false))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :CLOSE_AND_SHOW_GAME_CANVAS))
                (do
                (vreset! l_menuListener @l_displayable)
                (JR/invoke @l_menuListener :jm_close_0)
                (JR/invoke this :jm_setDisplay_1 @l_gameCanvasRunnableInterface)
                (JR/invoke this :jm_unPauseAppBackground_1 false))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :EXIT_COMMAND))
                (do
                (if (== (JR/invoke (JR/invoke (JR/scall 'GameMidletEventHandler :jm_getInstance_0) :jm_getEventListenerInterfaceListP_0) :jm_size_0) 0)
                    (do
                    (JR/invoke this :jm_exitProgress_1 true)))
                (JR/invoke (JR/scall 'GameMidletEventHandler :jm_getInstance_0) :jm_fireEvent_1 (DemoGameMidletEvent/jnew_2 this (JR/fget (JR/scall 'DemoGameMidletStateFactory :jm_getInstance_0) :NONE))))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :EXIT_WITHOUT_PROGRESS_COMMAND))
                (do
                (JR/invoke this :jm_exitProgress_1 false))
                (if (or (or (JR/eq @l_command (JR/fget @l_gameCommandsFactory :START_COMMAND)) (JR/eq @l_command (JR/fget @l_gameCommandsFactory :RESTART_COMMAND))) (JR/eq @l_command (JR/fget @l_gameCommandsFactory :CONTINUE_COMMAND)))
                (do
                (if (or (not (JR/eq (JR/invoke (JR/fget this :gameMidletStateFactory) :jm_getCurrentGameState_0) (JR/fget (JR/fget this :gameStateFactory) :PLAYING_GAME_STATE))) (JR/eq @l_command (JR/fget @l_gameCommandsFactory :RESTART_COMMAND)))
                    (do
                    (if (JR/invoke (JR/fget this :gameStartTimeHelper) :jm_isTimeTNT_0)
                        (do
                        (if (and (JR/eq @l_command (JR/fget @l_gameCommandsFactory :START_COMMAND)) (JR/invoke this :jm_isDemoLoading_0))
                            (do
                            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Trying to Start Game Before Loading Complete" this (JR/fget (JR/fget this :midletStrings) :COMMAND_ACTION)))
                            (do
                            (JR/fset this :startedBefore true)
                            (JR/invoke this :jm_createGame_0)
                            (JR/invoke (JR/fget this :gameMidletStateFactory) :jm_setCurrentGameState_1 (JR/fget (JR/fget this :gameStateFactory) :PLAYING_GAME_STATE)))))
                        (do
                        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Starting Game Too Often" this (JR/fget (JR/fget this :midletStrings) :COMMAND_ACTION)))))
                    (do
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Already in playing state" this (JR/fget this :COMMAND_ACTION)))))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :BUY_COMMAND))
                (do
                (vreset! l_inApplicationPurchaseFactory (JR/scall 'InApplicationPurchaseFactory :jm_getInstance_0))
                (vreset! l_list (JR/invoke (JR/scall 'LockableFeatureFactory :jm_getInstance_0) :jm_getList_0))
                (vreset! l_lockableFeature (JR/invoke @l_list :jm_get_1 0))
                (if (and (> (JR/invoke @l_list :jm_size_0) 0) (not (JR/invoke @l_inApplicationPurchaseFactory :jm_isPurchased_1 @l_lockableFeature)))
                    (do
                    (JR/invoke @l_inApplicationPurchaseFactory :jm_purchase_1 @l_lockableFeature))
                    (do
                    (JR/invoke (JR/scall 'TextNotificationUtil :jm_getInstance_0) :jm_fireSuccess_1 "Already Purchased"))))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :QUIT_COMMAND))
                (do
                (if (JR/invoke (JR/fget this :gameStartTimeHelper) :jm_isTimeTNT_0)
                    (do
                    (if (JR/instance-of @l_displayable 'HighScoreTextBox)
                        (do
                        (vreset! l_menuListener @l_displayable)
                        (JR/invoke @l_menuListener :jm_close_0)))
                    (JR/invoke this :jm_stopGameCanvasRunnableInterface_0)
                    (JR/invoke (JR/fget this :gameMidletStateFactory) :jm_setCurrentGameState_1 (JR/fget (JR/fget this :gameStateFactory) :NO_GAME_STATE))
                    (JR/invoke this :jm_setDemo_0))))
                (if (JR/eq @l_command (JR/fget (JR/fget this :myCommandsFactory) :RESUME_COMMAND))
                (do
                (JR/invoke this :jm_unPauseAppBackground_1 false))
                (if (JR/eq @l_command (JR/fget (JR/fget this :myCommandsFactory) :PAUSE_COMMAND))
                (do
                (JR/invoke this :jm_pauseAppBackground_1 false))
                (if (JR/eq @l_command (JR/fget (JR/fget this :myCommandsFactory) :SET_DISPLAYABLE))
                (do
                (JR/invoke this :jm_pauseAppBackground_1 false)
                (JR/invoke this :jm_setDisplay_1 @l_displayable))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE))
                (do
                (JR/invoke this :jm_pauseAppBackground_1 false)
                (vreset! l_menuListener @l_displayable)
                (JR/invoke @l_menuListener :jm_open_0)
                (JR/invoke this :jm_setDisplay_1 @l_displayable))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :START_TRACE))
                (do
                (JR/invoke (JR/fget this :debugInterface) :jm_start_0)
                (vreset! l_gameCanvas @l_allbinaryGameCanvasRunnableInterface)
                (JR/invoke @l_gameCanvas :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :STOP_TRACE))
                (JR/invoke @l_gameCanvas :jm_removeCommand_1 (JR/fget @l_gameCommandsFactory :START_TRACE)))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :STOP_TRACE))
                (do
                (JR/invoke this :jm_pauseAppBackground_1 false)
                (JR/invoke (JR/fget this :debugInterface) :jm_stop_0)
                (JR/invoke this :jm_unPauseAppBackground_1 false)
                (vreset! l_gameCanvas @l_allbinaryGameCanvasRunnableInterface)
                (JR/invoke @l_gameCanvas :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :START_TRACE))
                (JR/invoke @l_gameCanvas :jm_removeCommand_1 (JR/fget @l_gameCommandsFactory :STOP_TRACE)))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :DEFAULT_OPTIONS))
                (do
                (vreset! l_tempDisplayable @l_displayable)
                (if (JR/instance-of @l_tempDisplayable 'GameOptionsForm)
                    (do
                    (JR/invoke (JR/scall 'GameFeatureFormUtil :jm_getInstance_0) :jm_setDefault_1 @l_tempDisplayable))))
                (if (JR/eq @l_command (JR/sget 'GameInputMappingInstructionsCanvas "DISPLAY"))
                (do
                (vreset! l_tempDisplayable @l_displayable)
                (if (JR/instance-of @l_tempDisplayable 'GameInputMappingCanvas)
                    (do
                    (vreset! l_gameInputMappingCanvas @l_tempDisplayable)
                    (JR/invoke @l_gameInputMappingCanvas :jm_update_0)))
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) (JR/invoke this :jm_getInputMappingInstructionsCanvas_0)))
                (if (JR/invoke (JR/scall 'HighScoreCommandsFactory :jm_getInstance_0) :jm_isHighScoreCommand_1 @l_command)
                (do
                (vreset! l_tempDisplayable @l_displayable)
                (if (JR/instance-of @l_tempDisplayable 'HighScoresCanvas)
                    (do
                    (vreset! l_highScoresCanvas @l_tempDisplayable)
                    (JR/invoke @l_highScoresCanvas :jm_updateCommand_1 @l_command))))
                (if (JR/eq @l_command (JR/fget (JR/scall 'HighScoreCommands :jm_getInstance_0) :DISPLAY))
                (do
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) (JR/invoke this :jm_createHighScoresCanvas_0)))
                (if (JR/eq @l_command (JR/sget 'GameInputMappingInstructionsCanvas "CLOSE"))
                (do
                (vreset! l_menuListener @l_displayable)
                (JR/invoke @l_menuListener :jm_close_0)
                (JR/invoke this :jm_commandAction_2 (JR/sget 'GameInputMappingCanvas "DISPLAY") (JR/sget 'NullCanvas "NULL_CANVAS")))
                (if (JR/eq @l_command (JR/sget 'GameInputMappingCanvas "DISPLAY"))
                (do
                (if (JR/scall 'J2MEUtil :jm_isHTML_0)
                    (do
                    (JR/invoke this :jm_pauseAppBackground_1 false)))
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) (JR/invoke this :jm_getInputMappingCanvas_0)))
                (if (JR/eq @l_command (JR/sget 'GameInputMappingCanvas "DEFAULT"))
                (do
                (vreset! l_tempDisplayable @l_displayable)
                (if (JR/instance-of @l_tempDisplayable 'GameInputMappingCanvas)
                    (do
                    (vreset! l_gameInputMappingCanvas @l_tempDisplayable)
                    (JR/invoke @l_gameInputMappingCanvas :jm_setDefault_0))))
                (if (JR/eq @l_command (JR/sget 'InGameOptionsForm "DISPLAY"))
                (do
                (JR/invoke this :jm_pauseAppBackground_1 false)
                (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
                (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "In Game Options")
                (vreset! l_layerManager (JR/invoke this :jm_createGameLayerManager_0))
                (vreset! l_inGameOptionsFormFactory (JR/scall 'InGameOptionsFormFactory :jm_getInstance_0))
                (JR/invoke @l_inGameOptionsFormFactory :jm_init_5 this (InGameFeatures/jnew_0) "Options In Game" (JR/invoke @l_layerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_layerManager :jm_getForegroundBasicColor_0))
                (vreset! l_inGameOptionsForm (JR/invoke @l_inGameOptionsFormFactory :jm_get_0))
                (JR/invoke @l_inGameOptionsForm :jm_setItemStateListener_1 @l_allbinaryGameCanvasRunnableInterface)
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) @l_inGameOptionsForm))
                (if (JR/eq @l_command (JR/sget 'InGameOptionsForm "DEFAULT"))
                (do
                (vreset! l_inGameOptionsForm (JR/invoke (JR/scall 'InGameOptionsFormFactory :jm_getInstance_0) :jm_get_0))
                (JR/invoke (JR/scall 'GameFeatureFormUtil :jm_getInstance_0) :jm_setDefault_1 @l_inGameOptionsForm))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :DISPLAY_OPTIONS))
                (do
                (JR/scall 'AllBinaryMediaManager :jm_setMuted_1 true)
                (JR/invoke this :jm_stopAll_0)
                (vreset! l_mainFeatureFactory (JR/scall 'MainFeatureFactory :jm_getInstance_0))
                (JR/fset this :isFullScreen (JR/invoke (JR/fget this :features) :jm_isFeature_1 (JR/fget @l_mainFeatureFactory :FULL_SCREEN)))
                (JR/invoke (JR/scall 'ResizableListenerHandler :jm_getInstance_0) :jm_fireEvent_1 true)
                (JR/invoke this :jm_setResized_1 false)
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) (JR/invoke this :jm_getGameOptionsForm_0)))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :CLOSE_OPTIONS))
                (do
                (JR/invoke (JR/scall 'ResizableListenerHandler :jm_getInstance_0) :jm_fireEvent_1 false)
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :CLOSE_AND_SHOW_GAME_CANVAS) @l_displayable)
                (vreset! l_stringBuffer (StringMaker/jnew_0))
                (JR/invoke @l_stringBuffer :jm_append_1 "Close isFullScreen/change: ")
                (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/fget this :isFullScreen))
                (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke (JR/fget this :fullScreenUtil) :jm_isScreenChange_1 (JR/fget this :isFullScreen)))
                (JR/invoke @l_stringBuffer :jm_append_1 " isResized: ")
                (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isResized_0))
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of @l_stringBuffer) this (JR/fget this :COMMAND_ACTION))
                (if (or (JR/invoke this :jm_isResized_0) (JR/invoke (JR/fget this :fullScreenUtil) :jm_isScreenChange_1 (JR/fget this :isFullScreen)))
                    (do
                    (JR/invoke this :jm_updateFullScreen_0)))
                (JR/scall 'AllBinaryMediaManager :jm_setMuted_1 false))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :DISPLAY_LOAD_FORM))
                (do
                (JR/invoke this :jm_pauseAppBackground_1 false)
                (vreset! l_keyValuePersistance (JR/scall 'GamePersistanceSingleton :jm_getInstance_0))
                (JR/invoke @l_keyValuePersistance :jm_clear_0)
                (JR/invoke @l_keyValuePersistance :jm_loadAll_1 (JR/fget this :abeClientInformation))
                (if (JR/eq (JR/invoke this :jm_getLoadGameForm_0) (JR/scall 'CommandForm :jm_getNullCommandForm_0))
                    (do
                    (vreset! l_layerManager (JR/invoke this :jm_createGameLayerManager_0))
                    (JR/invoke this :jm_setLoadGameForm_1 (LoadGameForm/jnew_4 this "Load Game" (JR/invoke @l_layerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_layerManager :jm_getForegroundBasicColor_0))))
                    (do
                    (JR/invoke (JR/invoke this :jm_getLoadGameForm_0) :jm_update_0)))
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) (JR/invoke this :jm_getLoadGameForm_0)))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :LOAD_FILE))
                (do
                (vreset! l_loadGameForm (JR/invoke this :jm_getLoadGameForm_0))
                (vreset! l_index (JR/invoke @l_loadGameForm :jm_getSelectedId_0))
                (if (not (== @l_index (unchecked-int (unchecked-negate (JR/c2i 1)))))
                    (do
                    (vreset! l_keyValuePersistance (JR/scall 'GamePersistanceSingleton :jm_getInstance_0))
                    (JR/invoke this :jm_setStartStateHashtable_1 (JR/invoke @l_keyValuePersistance :jm_get_1 @l_index))
                    (vreset! l_menuListener (JR/invoke this :jm_getLoadGameForm_0))
                    (JR/invoke @l_menuListener :jm_close_0)
                    (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0)) this (JR/fget this :COMMAND_ACTION))
                    (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :START_COMMAND) (JR/sget 'NullCanvas "NULL_CANVAS"))
                    (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0)) this (JR/fget this :COMMAND_ACTION)))))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :DELETE_FILE))
                (do
                (vreset! l_loadGameForm (JR/invoke this :jm_getLoadGameForm_0))
                (vreset! l_index (JR/invoke @l_loadGameForm :jm_getSelectedText_0))
                (if (not (== @l_index (unchecked-int (unchecked-negate (JR/c2i 1)))))
                    (do
                    (vreset! l_keyValuePersistance (JR/scall 'GamePersistanceSingleton :jm_getInstance_0))
                    (JR/invoke @l_keyValuePersistance :jm_delete_2 (JR/fget this :abeClientInformation) @l_index)
                    (JR/invoke @l_keyValuePersistance :jm_clear_0)
                    (JR/invoke @l_keyValuePersistance :jm_loadAllSize_2 (JR/fget this :abeClientInformation) 1)
                    (JR/invoke (JR/invoke this :jm_getLoadGameForm_0) :jm_update_0))))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :SAVE))
                (do
                (vreset! l_keyValuePersistance (JR/scall 'GamePersistanceSingleton :jm_getInstance_0))
                (JR/invoke this :jm_pauseAppBackground_1 false)
                (JR/invoke @l_keyValuePersistance :jm_save_2 (JR/fget this :abeClientInformation) (JR/invoke this :jm_getCurrentStateHashtable_0))
                (JR/invoke this :jm_unPauseAppBackground_1 false))
                (if (JR/eq @l_command (JR/sget 'HighScoreUtil "SUBMIT_TEXTBOX_COMMAND"))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Submitted Score" this (JR/fget this :COMMAND_ACTION))
                (if (JR/instance-of @l_displayable 'HighScoreTextBox)
                    (do
                    (vreset! l_highScoreTextBox @l_displayable)
                    (JR/fset @l_highScoreTextBox :submitted true)))
                (JR/invoke @l_allbinaryGameCanvasRunnableInterface :jm_setHighScoreSubmitted_1 true)
                (JR/invoke this :jm_commandAction_2 (JR/fget @l_gameCommandsFactory :CLOSE_AND_SHOW_GAME_CANVAS) @l_displayable))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :DISPLAY_ABOUT))
                (do
                (JR/invoke (JR/fget this :aboutCommandProcessor) :jm_process_3 this (JR/fget @l_gameCommandsFactory :SET_MENU_DISPLAYABLE) (JR/invoke this :jm_getAboutCanvas_0)))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :OPEN_WEB_URL))
                (do
                (JR/invoke (JR/fget this :webCommandProcessor) :jm_process_3 this (JR/fget @l_gameCommandsFactory :OPEN_WEB_URL) (JR/sget 'NullCanvas "NULL_CANVAS")))
                (if (JR/eq @l_command (JR/fget @l_gameCommandsFactory :TOGGLE_KEYBOARD))
                (do
                (vreset! l_virtualKeyboardEventHandler (JR/scall 'VirtualKeyboardEventHandler :jm_getInstance_0))
                (JR/invoke @l_virtualKeyboardEventHandler :jm_fireEvent_1 (JR/fget @l_virtualKeyboardEventHandler :SHOW_EVENT)))
                (if (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 (JR/invoke @l_command :jm_getLabel_0) (JR/invoke (JR/fget @l_gameCommandsFactory :TOGGLE_FULLSCREEN) :jm_getLabel_0)) 0)
                (do
                (vreset! l_mainFeatureFactory (JR/scall 'MainFeatureFactory :jm_getInstance_0))
                (vreset! l_isFullScreen (JR/invoke (JR/fget this :features) :jm_isFeature_1 (JR/fget @l_mainFeatureFactory :FULL_SCREEN)))
                (if @l_isFullScreen
                    (do
                    (JR/invoke (JR/fget this :features) :jm_removeDefault_1 (JR/fget @l_mainFeatureFactory :FULL_SCREEN)))
                    (do
                    (JR/invoke (JR/fget this :features) :jm_addDefault_1 (JR/fget @l_mainFeatureFactory :FULL_SCREEN))))
                (JR/invoke this :jm_updateFullScreen_0))))))))))))))))))))))))))))))))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL)) :jm_append_1 (JR/invoke @l_command :jm_getLabel_0))) this (JR/fget (JR/fget this :midletStrings) :COMMAND_ACTION) @l_e)
            (if (not (JR/eq @l_command (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :EXIT_COMMAND)))
                (do
                (JR/invoke this :jm_exitProgress_1 false)))) :else (throw jt)))))))

    
(defn jm_updateFullScreen_0 [this]
  (let [ l_mainFeatureFactory (volatile! nil) l_isFullScreen (volatile! nil) l_displayable (volatile! nil) l_canvas (volatile! nil)]
        (vreset! l_mainFeatureFactory (JR/scall 'MainFeatureFactory :jm_getInstance_0))
        (vreset! l_isFullScreen (JR/invoke (JR/fget this :features) :jm_isFeature_1 (JR/fget @l_mainFeatureFactory :FULL_SCREEN)))
        (vreset! l_displayable (JR/invoke (JR/invoke this :jm_getDisplay_0) :jm_getCurrent_0))
        (if (JR/instance-of @l_displayable 'Canvas)
            (do
            (vreset! l_canvas @l_displayable)
            (JR/invoke @l_canvas :jm_setFullScreenMode_1 @l_isFullScreen)))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_getInputMappingInstructionsCanvas_0 [this]
  (let []
        (GameInputMappingInstructionsCanvas/jnew_2 this (JR/invoke this :jm_createGameLayerManager_0))))

    
(defn jm_getInputMappingCanvas_0 [this]
  (let []
        (GameInputMappingCanvas/jnew_4 (JR/fget this :abeClientInformation) this (JR/invoke this :jm_createGameLayerManager_0) (JR/invoke this :jm_getHelpPaintable_0))))

    
(defn jm_getAboutCanvas_0 [this]
  (let []
        (BasicPaintablesCanvas/jnew_4 this (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :ABOUT) (JR/invoke this :jm_createGameLayerManager_0) (JR/fget (JR/scall 'AboutPaintableFactory :jm_getInstance_0) :paintableArray))))

    
(defn jm_getHelpPaintable_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_createHighScoresCanvas_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_startGameCanvasRunnableInterface_0 [this]
  (let [ l_threadFactoryUtil (volatile! nil)]
        (vreset! l_threadFactoryUtil (JR/scall 'ThreadFactoryUtil :jm_getInstance_0))
        (JR/fset this :thread (JR/invoke @l_threadFactoryUtil :jm_getInstanceGameCanvasRunnable_1 (JR/fget this :allbinaryGameCanvasRunnableInterface)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Thread Priority: ") :jm_appendint_1 (JR/i32 (JR/invoke (JR/fget this :thread) :jm_getPriority_0)))) this "startGameCanvasRunnableInterface")
        (JR/invoke (JR/fget this :allbinaryGameCanvasRunnableInterface) :jm_setThread_1 (JR/fget this :thread))
        (JR/invoke @l_threadFactoryUtil :jm_start_1 (JR/fget this :thread))))

    
(defn jm_stopGameCanvasRunnableInterface_0 [this]
  (let [ l_gameCanvasRunnableInterface (volatile! nil) l_progressCanvas (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :gameStrings) :STOP_GAME_CANVAS_RUNNABLE_INTERFACE))
        (JR/invoke (JR/scall 'GameNotificationEventHandler :jm_getInstance_0) :jm_removeAllListeners_0)
        (JR/invoke (JR/scall 'ColorChangeEventHandler :jm_getInstance_0) :jm_removeAllListeners_0)
        (JR/scall 'GameEventHandlerUtil :jm_removeAllListeners_0)
        (vreset! l_gameCanvasRunnableInterface (JR/fget this :allbinaryGameCanvasRunnableInterface))
        (if (not (JR/eq @l_gameCanvasRunnableInterface (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE")))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Set Running False: ") :jm_append_1 (JR/to-string-of @l_gameCanvasRunnableInterface))) this (JR/fget (JR/fget this :gameStrings) :STOP_GAME_CANVAS_RUNNABLE_INTERFACE))
            (JR/invoke @l_gameCanvasRunnableInterface :jm_setRunning_1 false))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "StopGame - Could Not Stop" this (JR/fget (JR/fget this :gameStrings) :STOP_GAME_CANVAS_RUNNABLE_INTERFACE))))
        (JR/invoke (JR/scall 'ThreadUtil :jm_getInstance_0) :jm_join_1 (JR/fget this :thread))
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (if (JR/invoke (JR/fget this :features) :jm_isFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :LOAD_ALL))
            (do
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Stopped Game Runnable"))
            (do
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Stopped Main Runnable")))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END) this (JR/fget (JR/fget this :gameStrings) :STOP_GAME_CANVAS_RUNNABLE_INTERFACE))))

    
(defn jm_getGameCanvasRunnableInterface_0 [this]
  (let []
        (JR/fget this :allbinaryGameCanvasRunnableInterface)))

    
(defn jm_setGameCanvasRunnableInterface_1 [this p_gameCanvasRunnableInterface]
  (let [ l_gameCanvasRunnableInterface (volatile! p_gameCanvasRunnableInterface)]
        (JR/fset this :allbinaryGameCanvasRunnableInterface @l_gameCanvasRunnableInterface)))

    
(defn jm_createGameLayerManager_0 [this]
  (let [ l_gameInfo (volatile! nil)]
        (vreset! l_gameInfo (GameInfo/jnew_5 (JR/fget (JR/scall 'GameTypeFactory :jm_getInstance_0) :SINGLE_PLAYER) (JR/sget 'GameMode "SERVER") (JR/fget (JR/scall 'PlayerTypesFactory :jm_getInstance_0) :PLAYER_TYPE_ONE) 1 1))
        (AllBinaryGameLayerManager/jnew_3 (JR/fget (JR/fget this :basicColorFactory) :BLACK) (JR/fget (JR/fget this :basicColorFactory) :WHITE) @l_gameInfo)))

    
(defn jm_getGameOptionsForm_0 [this]
  (let [ l_layerManager (volatile! nil)]
        (vreset! l_layerManager (JR/invoke this :jm_createGameLayerManager_0))
        (JR/invoke (JR/scall 'GameOptionsFormFactory :jm_getInstance_0) :jm_init_4 this "Game Options" (JR/invoke @l_layerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_layerManager :jm_getForegroundBasicColor_0))))

    
(defn jm_save_0 [this]
  (let [ l_hashtable (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :SAVE))
        (vreset! l_hashtable (JR/invoke this :jm_getCurrentStateHashtable_0))
        (JR/invoke (JR/scall 'GamePersistanceSingleton :jm_getInstance_0) :jm_save_2 (JR/fget this :abeClientInformation) @l_hashtable)))

    
(defn jm_getCurrentStateHashtable_0 [this]
  (let [ l_hashtable (volatile! nil) l_currentHashtable (volatile! nil) l_enumeration (volatile! nil) l_key (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "getCurrentStateHashtable")
        (vreset! l_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
        (if (not (JR/eq (JR/fget this :allbinaryGameCanvasRunnableInterface) (JR/sget 'NullGameCanvasRunnable "NULL_GAME_CANVAS_RUNNABLE")))
            (do
            (vreset! l_currentHashtable (JR/invoke (JR/fget this :allbinaryGameCanvasRunnableInterface) :jm_getCurrentStateHashtable_0))
            (vreset! l_enumeration (JR/invoke @l_currentHashtable :jm_keys_0))
            (vreset! l_key nil)
            (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
                (vreset! l_key (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration))
                (JR/invoke @l_hashtable :jm_put_2 @l_key (JR/invoke @l_currentHashtable :jm_get_1 @l_key)))))
        @l_hashtable))

    
(defn jm_setLoadGameForm_1 [this p_loadGameForm]
  (let [ l_loadGameForm (volatile! p_loadGameForm)]
        (JR/fset this :loadGameForm @l_loadGameForm)))

    
(defn jm_getLoadGameForm_0 [this]
  (let []
        (JR/fget this :loadGameForm)))

    
(defn jm_setResized_1 [this p_resized]
  (let [ l_resized (volatile! p_resized)]
        (JR/fset this :resized @l_resized)))

    
(defn jm_isResized_0 [this]
  (let []
        (JR/fget this :resized)))

    
(defn jm_isDemoLoading_0 [this]
  (let [ l_displayable (volatile! nil) l_demoCanvas (volatile! nil)](JR/method
        (if (JR/fget this :startedBefore)
            (do
            (JR/jreturn false)))
        (vreset! l_displayable (JR/invoke (JR/invoke this :jm_getDisplay_0) :jm_getCurrent_0))
        (if (JR/instance-of @l_displayable 'DemoCanvas)
            (do
            (vreset! l_demoCanvas @l_displayable)
            (if (JR/invoke @l_demoCanvas :jm_isDemoLoading_0)
                (do
                (JR/jreturn true)))))
        false)))



