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

(ns AllBinaryGameCanvas)

(JR/register 'AllBinaryGameCanvas 'RunnableCanvas '[AllBinaryGameCanvasInterface GameCanvasRunnableInterface MenuListener IntermissionCompositeInterface IntermissionEnableListenerInterface PopupMenuInterface DisplayChangeEventListener UpdateMyFontInterface])

(def jsv_id (atom 0))
(def jsv_TYPE (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_id [] (JR/ensure-init jclinit-state jclinit) @jsv_id)
(defn jstatic_set_id [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_id v))
(defn jstatic_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_TYPE)
(defn jstatic_set_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_id 0)
    (reset! jsv_TYPE 2)
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColorFactory nil)
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :touchFeatureFactory nil)
  (JR/fset this :openGLFeatureFactory nil)
  (JR/fset this :touchButtonFactory nil)
  (JR/fset this :gameAdStateFactory nil)
  (JR/fset this :gameStrings nil)
  (JR/fset this :gameInputStrings nil)
  (JR/fset this :gameStateFactory nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
  (JR/fset this :gameTickDisplayInfoSingleton nil)
  (JR/fset this :gameRunnable nil)
  (JR/fset this :gamePauseRunnable nil)
  (JR/fset this :formUtil nil)
  (JR/fset this :myFormUtil nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :gameSpecificPaintable nil)
  (JR/fset this :sensorGameUpdateProcessor nil)
  (JR/fset this :endGameInfo nil)
  (JR/fset this :startIntermissionInterface nil)
  (JR/fset this :endLevelIntermissionInterface nil)
  (JR/fset this :gameLayerManager nil)
  (JR/fset this :gameState nil)
  (JR/fset this :gameOver false)
  (JR/fset this :initialized false)
  (JR/fset this :gameStateTimeHelper nil)
  (JR/fset this :highScoresHelper nil)
  (JR/fset this :highScoreSubmitted false)
  (JR/fset this :realHighScoresPaintable nil)
  (JR/fset this :highScoresPaintable nil)
  (JR/fset this :localPlayerGameInputList nil)
  (JR/fset this :isCheating false)
  (JR/fset this :hashtable nil)
  (JR/fset this :isSingleKeyRepeatableProcessing false)
  (JR/fset this :gameInitializationInterfaceFactoryInterface nil)
  (JR/fset this :touchButtonsPaintable nil)
  (JR/fset this :touchPaintable nil)
  (JR/fset this :cheatProcessor nil)
  (JR/fset this :gameInputProcessor nil)
  (JR/fset this :endGameProcessor nil)
  (JR/fset this :realEndGameProcessor nil)
  (JR/fset this :startIntermissionProcessor nil)
  (JR/fset this :realStartIntermissionProcessor nil)
  (JR/fset this :endGamePaintable nil)
  (JR/fset this :endGameStatePaintable nil)
  (JR/fset this :nonBotPaintable nil)
  (JR/fset this :intermissionPaintable nil)
  (JR/fset this :startIntermissionPaintable nil)
  (JR/fset this :mainStateProcessor nil)
  (JR/fset this :processGameProcessor nil)
  (JR/fset this :highScoresFactoryInterface nil)
  (JR/fset this :startLevel 0)
  (JR/fset this :mainMenuInputProcessor nil)
  (JR/fset this :popupMenuInputProcessor nil)
  (JR/fset this :menuInputProcessor nil)
  (JR/fset this :menuForm nil)
  (JR/fset this :formPaintable nil)
  (JR/fset this :openMenuPaintable nil)
  (JR/fset this :menuPaintable nil)
  (JR/fset this :currentTouchInputFactory nil)
  (JR/fset this :colorFillPaintable nil)
  (JR/fset this :baseGameStatistics nil)
  (JR/fset this :primaryPlayerQueue nil)
  (JR/fset this :secondaryPlayerQueue nil)
  (JR/fset this :BUILD_GAME nil)
  (JR/fset this :gameTypeFactory nil)
  (JR/fset this :screenCapture nil)
  (JR/fset this :basicMotionGesturesHandler nil)
  (JR/fset this :gameKeyEventHandler nil)
  (JR/fset this :gameBehavior nil)
  (JR/fset this :menuBehavior nil)
  (JR/fset this :progressPaintable nil)
  (JR/fset this :fontHeightP 0)
  (JR/fset this :gameCanvasStartListener nil)
  (JR/fset this :rawGameInputProcessor nil)
  (JR/fset this :rawInputProcessor nil)
  (JR/fset this :inputProcessor nil)
  (JR/fset this :YIELD_SLEEP 0)
    (JR/fset this :basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :touchFeatureFactory (JR/scall 'TouchFeatureFactory :jm_getInstance_0))
    (JR/fset this :openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
    (JR/fset this :touchButtonFactory (JR/scall 'TouchButtonFactory :jm_getInstance_0))
    (JR/fset this :gameAdStateFactory (JR/scall 'GameAdStateFactory :jm_getInstance_0))
    (JR/fset this :gameStrings (JR/scall 'GameStrings :jm_getInstance_0))
    (JR/fset this :gameInputStrings (JR/scall 'GameInputStrings :jm_getInstance_0))
    (JR/fset this :gameStateFactory (JR/scall 'GameStateFactory :jm_getInstance_0))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
    (JR/fset this :gameTickDisplayInfoSingleton (JR/scall 'GameTickDisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :gameRunnable (GameCanvasRunnable/jnew_1 this))
    (JR/fset this :gamePauseRunnable (GameCanvasPauseRunnable/jnew_1 this))
    (JR/fset this :formUtil (JR/scall 'FormUtil :jm_getInstance_0))
    (JR/fset this :myFormUtil (JR/scall 'MyFormUtil :jm_getInstance_0))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :gameSpecificPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :sensorGameUpdateProcessor (SingleSensorGameUpdateProcessor/jnew_0))
    (JR/fset this :endGameInfo (EndGameInfo/jnew_0))
    (JR/fset this :startIntermissionInterface (Intermission/jnew_0))
    (JR/fset this :endLevelIntermissionInterface (Intermission/jnew_0))
    (JR/fset this :gameLayerManager (JR/scall 'AllBinaryGameLayerManager :jm_getNullInstance_0))
    (JR/fset this :gameState (JR/fget (JR/fget this :gameStateFactory) :NO_GAME_STATE))
    (JR/fset this :gameStateTimeHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :realHighScoresPaintable (HighScoresPaintable/jnew_0))
    (JR/fset this :highScoresPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :localPlayerGameInputList (BasicArrayListD/jnew_0))
    (JR/fset this :hashtable (JR/fget (JR/fget this :stdUtil) :NULL_TABLE))
    (JR/fset this :gameInitializationInterfaceFactoryInterface (JR/sget 'BasicBuildGameInitializerFactory "NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY"))
    (JR/fset this :touchButtonsPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :touchPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :cheatProcessor (JR/scall 'NoPlayerGameInput :jm_getInstance_0))
    (JR/fset this :gameInputProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :endGameProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :realEndGameProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :startIntermissionProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :realStartIntermissionProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :endGamePaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :endGameStatePaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :nonBotPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :intermissionPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :startIntermissionPaintable (JR/scall 'NullInitUpdatePaintable :jm_getInstance_0))
    (JR/fset this :mainStateProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :processGameProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :mainMenuInputProcessor (JR/scall 'NoMenuInputProcessor :jm_getInstance_0))
    (JR/fset this :popupMenuInputProcessor (JR/scall 'NoMenuInputProcessor :jm_getInstance_0))
    (JR/fset this :menuInputProcessor (JR/scall 'NoMenuInputProcessor :jm_getInstance_0))
    (JR/fset this :menuForm (JR/scall 'ScrollSelectionForm :jm_getNullScrollSelectionForm_0))
    (JR/fset this :formPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :openMenuPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :menuPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :currentTouchInputFactory (JR/scall 'NoButtonsTouchInputFactory :jm_getInstance_0))
    (JR/fset this :colorFillPaintable (JR/invoke (JR/scall 'ColorFillPaintableFactory :jm_getInstance_0) :jm_getInstance_2 (JR/fget (JR/fget this :basicColorFactory) :BLACK) true))
    (JR/fset this :baseGameStatistics (JR/scall 'GameStatisticsFactory :jm_getInstance_0))
    (JR/fset this :primaryPlayerQueue (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0))
    (JR/fset this :secondaryPlayerQueue (JR/scall 'SecondaryPlayerQueueFactory :jm_getInstance_0))
    (JR/fset this :BUILD_GAME "buildGame")
    (JR/fset this :gameTypeFactory (JR/scall 'GameTypeFactory :jm_getInstance_0))
    (JR/fset this :screenCapture (JR/scall 'ScreenCaptureFactory :jm_getInstance_0))
    (JR/fset this :basicMotionGesturesHandler (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0))
    (JR/fset this :gameKeyEventHandler (JR/scall 'GameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :progressPaintable (JR/scall 'ProgressCanvasFactory :jm_getLazyInstance_0))
    (JR/fset this :gameCanvasStartListener (JR/sget 'NullDemoPaintable "NULL_DEMO_PAINTABLE"))
    (JR/fset this :rawGameInputProcessor (GameCanvasInputProcessor/jnew_1 this))
    (JR/fset this :rawInputProcessor (FormInputProcessor/jnew_1 this))
    (JR/fset this :inputProcessor (JR/invoke this :jm_getRawGameInputProcessor_0))
    (JR/fset this :YIELD_SLEEP 100)
  this)

    
(defn jinit_5 [this p_commandListener p_gameLayerManager p_highScoresFactoryInterface p_gameInitializationInterfaceFactoryInterface p_buffered]
  (let [ l_commandListener (volatile! p_commandListener) l_gameLayerManager (volatile! p_gameLayerManager) l_highScoresFactoryInterface (volatile! p_highScoresFactoryInterface) l_gameInitializationInterfaceFactoryInterface (volatile! p_gameInitializationInterfaceFactoryInterface) l_buffered (volatile! p_buffered)]
        (RunnableCanvas/jinit_3 this @l_commandListener (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :EMPTY_CHILD_NAME_LIST) true) (jinitfields this)
        (JR/fset this :highScoresHelper (JR/invoke @l_highScoresFactoryInterface :jm_createHighScoresHelper_0))
        (JR/fset this :gameInitializationInterfaceFactoryInterface @l_gameInitializationInterfaceFactoryInterface)
        (JR/invoke this :jm_init_2 @l_gameLayerManager @l_buffered)
        (JR/fset this :highScoresFactoryInterface @l_highScoresFactoryInterface)
        (if (or (JR/eq (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getGameType_0) (JR/fget (JR/fget this :gameTypeFactory) :BOT)) (JR/eq (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getGameType_0) (JR/fget (JR/fget this :gameTypeFactory) :NONE)))
            (do
            (JR/fset this :gameBehavior (JR/scall 'DemoGameBehavior :jm_getInstance_0))
            (JR/fset this :menuBehavior (JR/scall 'BaseMenuBehavior :jm_getInstance_0)))
            (do
            (JR/fset this :gameBehavior (JR/scall 'BaseGameBehavior :jm_getInstance_0))
            (JR/fset this :menuBehavior (JR/invoke this :jm_getInGameMenuBehavior_0))))
        (JR/invoke this :jm_initPopupMenu_0)
        (JR/invoke this :jm_initMenu_0)
        (JR/invoke this :jm_initSpecialPaint_0)
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this))
  this)

(defn jnew_5 [p_commandListener p_gameLayerManager p_highScoresFactoryInterface p_gameInitializationInterfaceFactoryInterface p_buffered ]
  (let [o (JR/alloc 'AllBinaryGameCanvas)] (jinit_5 o p_commandListener p_gameLayerManager p_highScoresFactoryInterface p_gameInitializationInterfaceFactoryInterface p_buffered) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_popupMenuRectangle (volatile! nil) l_basicPopupMenuPaintable (volatile! nil) l_popupMenuInputProcessor (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_append_1 (JR/fget (JR/fget this :canvasStrings) :FD_WIDTH)) :jm_appendint_1 (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font)) :jm_append_1 (JR/fget (JR/fget this :canvasStrings) :FD_HEIGHT)) :jm_appendint_1 (JR/invoke @l_font :jm_getHeight_0))) this (JR/fget (JR/fget this :canvasStrings) :UPDATE_MEASUREMENT))
            (JR/fset this :fontHeightP (JR/invoke @l_font :jm_getHeight_0))
            (JR/invoke (JR/fget this :myFormUtil) :jm_updateMeasurement_1 @l_graphics)
            (vreset! l_popupMenuRectangle (JR/invoke (JR/fget this :myFormUtil) :jm_getPopupMenuRectangle_0))
            (vreset! l_basicPopupMenuPaintable (JR/invoke this :jm_getOpenMenuPaintable_0))
            (JR/invoke @l_basicPopupMenuPaintable :jm_init_1 @l_popupMenuRectangle)
            (if (not (JR/eq (JR/invoke this :jm_getPopupMenuInputProcessor_0) (JR/scall 'NoMenuInputProcessor :jm_getInstance_0)))
                (do
                (vreset! l_popupMenuInputProcessor (JR/invoke this :jm_getPopupMenuInputProcessor_0))
                (JR/invoke @l_popupMenuInputProcessor :jm_init_1 @l_popupMenuRectangle)))
            (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_getInGameMenuBehavior_0 [this]
  (let []
        (JR/scall 'InGameMenuBehavior :jm_getInstance_0)))

    
(defn jm_setCurrentThread_0 [this]
  (let []
        (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            (JR/invoke-super 'RunnableCanvas this :jm_setCurrentThreadFake_0))
            (do
            (JR/invoke-super 'RunnableCanvas this :jm_setCurrentThread_0)))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onDisplayChangeEvent_1 [this p_displayChangeEvent]
  (let [ l_displayChangeEvent (volatile! p_displayChangeEvent) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_append_1 (JR/to-string-of (JR/scall 'DisplayInfoSingleton :jm_getInstance_0)))) this (JR/fget (JR/fget this :canvasStrings) :UPDATE_MEASUREMENT))
            (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
            (JR/invoke (JR/fget this :menuBehavior) :jm_onDisplayChangeEvent_2 this @l_displayChangeEvent))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_updateMenuFromEvent_1 [this p_displayChangeEvent]
  (let [ l_displayChangeEvent (volatile! p_displayChangeEvent) l_formType (volatile! nil) l_rectangle (volatile! nil)]
        (vreset! l_formType (JR/invoke (JR/scall 'FormTypeFactory :jm_getInstance_0) :jm_getFormType_0))
        (vreset! l_rectangle (JR/invoke (JR/fget this :formUtil) :jm_createFormRectangle_0))
        (JR/invoke (JR/fget this :menuForm) :jm_init_2 @l_rectangle @l_formType)
        (if (not (JR/eq (JR/fget this :currentTouchInputFactory) (JR/scall 'NoButtonsTouchInputFactory :jm_getInstance_0)))
            (do
            (JR/invoke (JR/fget this :touchButtonFactory) :jm_toggle_2 (JR/invoke this :jm_isPaused_0) (JR/invoke (JR/fget this :currentTouchInputFactory) :jm_getList_0))))
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_processSleep_0 [this]
  (let []
        (JR/invoke-super 'RunnableCanvas this :jm_processSleep_0)
        (if (JR/scall 'AllBinaryMediaManager :jm_update_0)
            (do
            (if (not (JR/invoke (JR/fget this :primaryPlayerQueue) :jm_process_0))
                (do
                (JR/invoke (JR/fget this :secondaryPlayerQueue) :jm_process_0)))))
        (if (not (== (JR/invoke (JR/fget this :menuInputProcessor) :jm_processInputList_0) (unchecked-int (unchecked-negate (JR/c2i 1)))))
            (do
            (JR/invoke (JR/fget this :runnableCanvasRefreshHelper) :jm_process_0)))))

    
(defn jm_initPopupMenu_0 [this]
  (let [ l_features (volatile! nil) l_popupMenuRectangle (volatile! nil)]
        (if (JR/eq (JR/fget this :popupMenuInputProcessor) (JR/scall 'NoMenuInputProcessor :jm_getInstance_0))
            (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_popupMenuRectangle (JR/invoke (JR/fget this :myFormUtil) :jm_getPopupMenuRectangle_0))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :touchFeatureFactory) :TOUCH_ENABLED))
                (do
                (JR/invoke this :jm_setOpenMenuPaintable_1 (BasicPopupMenuPaintable/jnew_3 @l_popupMenuRectangle (JR/invoke (JR/fget this :gameLayerManager) :jm_getBackgroundBasicColor_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0)))
                (JR/invoke this :jm_setPopupMenuInputProcessor_1 (PopupMenuInputProcessor/jnew_4 (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1))) this @l_popupMenuRectangle)))))
            (do
            nil))))

    
(defn jm_initMenu_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :menuBehavior) :jm_initMenu_1 this))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "initMenu" @l_e)) :else (throw jt)))))))

    
(defn jm_initMenu2_0 [this]
  (let [ l_formType (volatile! nil) l_gameLimitedCommandTextItemArrayFactory (volatile! nil) l_commandTextItemArrayFactory (volatile! nil) l_items (volatile! nil) l_rectangle (volatile! nil) l_scrollSelectionForm (volatile! nil) l_features (volatile! nil)]
        (JR/invoke this :jm_closeMenu_0)
        (vreset! l_formType (JR/invoke (JR/scall 'FormTypeFactory :jm_getInstance_0) :jm_getFormType_0))
        (vreset! l_gameLimitedCommandTextItemArrayFactory (JR/scall 'GameLimitedCommandTextItemArrayFactory :jm_getInstance_0))
        (vreset! l_commandTextItemArrayFactory (JR/invoke @l_gameLimitedCommandTextItemArrayFactory :jm_getCommandTextItemArrayFactory_0))
        (vreset! l_items (JR/invoke @l_commandTextItemArrayFactory :jm_getInstance_3 (JR/invoke this :jm_getCommandStack_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getBackgroundBasicColor_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0)))
        (vreset! l_rectangle (JR/invoke (JR/fget this :formUtil) :jm_createFormRectangle_0))
        (JR/invoke this :jm_setMenuForm_1 (JR/scall 'CommandCurrentSelectionFormFactory :jm_getInstance_8 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) @l_items @l_rectangle @l_formType 25 false (JR/invoke (JR/fget this :gameLayerManager) :jm_getBackgroundBasicColor_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0)))
        (vreset! l_scrollSelectionForm (JR/invoke this :jm_getMenuForm_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :touchFeatureFactory) :TOUCH_ENABLED))
            (do
            (JR/fset this :mainMenuInputProcessor (PopupCommandFormInputProcessor/jnew_5 (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1))) this @l_scrollSelectionForm (JR/invoke this :jm_getPopupMenuInputProcessor_0))))
            (do
            nil))
        (JR/invoke this :jm_setMenuInputProcessor_1 (JR/invoke this :jm_getPopupMenuInputProcessor_0))
        (if (not (JR/eq @l_scrollSelectionForm (JR/scall 'ScrollSelectionFormNoneFactory :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_setFormPaintable_1 (FormPaintable/jnew_1 @l_scrollSelectionForm)))
            (do
            nil))
        (JR/invoke this :jm_closeMenu_0)))

    
(defn jm_updateMenu_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :menuBehavior) :jm_updateMenu_1 this))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "initMenu" @l_e)) :else (throw jt)))))))

    
(defn jm_updateMenu2_0 [this]
  (let [ l_scrollSelectionForm (volatile! nil) l_gameLimitedCommandTextItemArrayFactory (volatile! nil) l_commandTextItemArrayFactory (volatile! nil) l_items (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_formType (volatile! nil) l_rectangle (volatile! nil)]
        (vreset! l_scrollSelectionForm (JR/invoke this :jm_getMenuForm_0))
        (JR/invoke @l_scrollSelectionForm :jm_deleteAll_0)
        (vreset! l_gameLimitedCommandTextItemArrayFactory (JR/scall 'GameLimitedCommandTextItemArrayFactory :jm_getInstance_0))
        (vreset! l_commandTextItemArrayFactory (JR/invoke @l_gameLimitedCommandTextItemArrayFactory :jm_getCommandTextItemArrayFactory_0))
        (vreset! l_items (JR/invoke @l_commandTextItemArrayFactory :jm_getInstance_3 (JR/invoke this :jm_getCommandStack_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getBackgroundBasicColor_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0)))
        (vreset! l_size (JR/alen @l_items))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_scrollSelectionForm :jm_append_1 (JR/aget* @l_items @l_index))))
        (vreset! l_formType (JR/invoke (JR/scall 'FormTypeFactory :jm_getInstance_0) :jm_getFormType_0))
        (vreset! l_rectangle (JR/invoke (JR/fget this :formUtil) :jm_createFormRectangle_0))
        (JR/invoke @l_scrollSelectionForm :jm_init_2 @l_rectangle @l_formType)))

    
(defn jm_pause_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameBehavior) :jm_pause_1 this)
        (JR/invoke this :jm_closeMenu_0)
        (JR/invoke-super 'RunnableCanvas this :jm_pause_0)
        (JR/invoke (JR/fget this :touchButtonFactory) :jm_toggle_2 (JR/invoke this :jm_isPaused_0) (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
        (JR/invoke (JR/fget this :tsUtil) :jm_gc_0)))

    
(defn jm_unPause_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :gameStrings) :UNPAUSE))
        (JR/invoke this :jm_closeMenu_0)
        (JR/invoke (JR/fget this :tsUtil) :jm_gc_0)
        (JR/invoke-super 'RunnableCanvas this :jm_unPause_0)
        (JR/invoke (JR/fget this :touchButtonFactory) :jm_toggle_2 (JR/invoke this :jm_isPaused_0) (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
        (JR/invoke (JR/fget this :gameBehavior) :jm_unPause_1 this)))

    
(defn jm_isPausable_0 [this]
  (let []
        (if (JR/eq (JR/invoke (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0) :jm_getUsedRunnable_0) (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
            (do
            true)
            (do
            false))))

    
(defn jm_popupMenu_0 [this]
  (let []
        (JR/invoke (JR/fget this :menuBehavior) :jm_popupMenu_1 this)))

    
(defn jm_popupMenu2_0 [this]
  (let []
        (JR/invoke (JR/fget this :primaryPlayerQueue) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
        (JR/invoke this :jm_setMenuPaintable_1 (JR/invoke this :jm_getFormPaintable_0))
        (JR/invoke this :jm_setMenuInputProcessor_1 (JR/fget this :mainMenuInputProcessor))
        (JR/invoke (JR/fget this :basicMotionGesturesHandler) :jm_addListenerInterface_1 (JR/fget this :mainMenuInputProcessor))
        (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_addListener_1 (JR/fget this :mainMenuInputProcessor))))

    
(defn jm_toggleMenu_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :gameStrings) :TOGGLE_MENU))
        (if (JR/eq (JR/invoke this :jm_getMenuPaintable_0) (JR/invoke this :jm_getOpenMenuPaintable_0))
            (do
            (JR/invoke this :jm_pause_0)
            (JR/invoke this :jm_updateMenu_0)
            (JR/invoke this :jm_popupMenu_0))
            (if (JR/eq (JR/invoke this :jm_getMenuPaintable_0) (JR/invoke this :jm_getFormPaintable_0))
            (do
            (JR/invoke (JR/fget this :primaryPlayerQueue) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
            (JR/invoke this :jm_unPause_0))))))

    
(defn jm_closeMenu_0 [this]
  (let []
        (JR/invoke (JR/fget this :menuBehavior) :jm_closeMenu_1 this)))

    
(defn jm_closeMenu2_0 [this]
  (let []
        (JR/invoke this :jm_setMenuPaintable_1 (JR/invoke this :jm_getOpenMenuPaintable_0))
        (JR/invoke (JR/fget this :basicMotionGesturesHandler) :jm_removeListener_1 (JR/fget this :mainMenuInputProcessor))
        (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_removeListener_1 (JR/fget this :mainMenuInputProcessor))
        (JR/invoke this :jm_setMenuInputProcessor_1 (JR/invoke this :jm_getPopupMenuInputProcessor_0))))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke (JR/fget this :basicMotionGesturesHandler) :jm_addListenerInterface_1 (JR/fget this :menuInputProcessor))
        (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_addListener_1 (JR/fget this :menuInputProcessor))))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/fget this :basicMotionGesturesHandler) :jm_removeListener_1 (JR/fget this :menuInputProcessor))
        (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_removeListener_1 (JR/fget this :menuInputProcessor))
        (JR/invoke (JR/fget this :primaryPlayerQueue) :jm_clear_0)
        (JR/invoke (JR/fget this :secondaryPlayerQueue) :jm_clear_0)))

    
(defn jm_processorInit_0 [this]
  (let []
        (JR/invoke this :jm_setMainStateProcessor_1 (JR/scall 'Processor :jm_getInstance_0))
        (JR/invoke this :jm_setProcessGameProcessorInit_0)))

    
(defn jm_setProcessGameProcessorInit_0 [this]
  (let []
        (JR/invoke this :jm_setProcessGameProcessor_1 (GameProcessor/jnew_1 this))))

    
(defn jm_initSpecialPaint_0 [this]
  (let []
        (JR/invoke (JR/fget this :menuBehavior) :jm_initSpecialPaint_1 this)))

    
(defn jm_init_2 [this p_gameLayerManager p_buffered]
  (let [ l_gameLayerManager (volatile! p_gameLayerManager) l_buffered (volatile! p_buffered) l_BUFF_MESSAGE (volatile! nil) l_features (volatile! nil)]
        (JR/invoke (JR/fget this :gameStateTimeHelper) :jm_setStartTimeTNT_0)
        (JR/invoke this :jm_setHighScoreSubmitted_1 false)
        (JR/invoke this :jm_setLayerManager_1 @l_gameLayerManager)
        (if (not @l_buffered)
            (do
            (vreset! l_BUFF_MESSAGE "XXX Not Buffering Causes Concurrency Issues XXX")
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 @l_BUFF_MESSAGE this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR)))
            (do
            (JR/jthrow (new java.lang.Exception "Buffering is disabled"))))
        (JR/invoke this :jm_setGameInputProcessor_1 (JR/scall 'Processor :jm_getInstance_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'GameFeatureFactory :jm_getInstance_0) :CHEATING))
            (do
            (JR/fset this :isCheating true)
            (JR/fset this :cheatProcessor (CheatGameInputProcessor/jnew_1 this))
            (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_addListener_1 (JR/fget this :cheatProcessor)))
            (do
            (JR/fset this :isCheating false)
            (JR/fset this :cheatProcessor (JR/scall 'NoPlayerGameInput :jm_getInstance_0))))
        (JR/fset this :realEndGameProcessor (EndGameProcessor/jnew_1 this))
        (JR/invoke this :jm_setEndGameProcessor_1 (JR/scall 'Processor :jm_getInstance_0))
        (JR/fset this :realStartIntermissionProcessor (StartIntermissionProcessor/jnew_1 this))
        (JR/fset this :startIntermissionProcessor (JR/scall 'Processor :jm_getInstance_0))
        (JR/invoke this :jm_setEndGameStatePaintable_1 (EndGamePaintable/jnew_1 this))
        (JR/invoke this :jm_setEndGamePaintable_1 (JR/scall 'NullPaintable :jm_getInstance_0))
        (JR/invoke this :jm_setIntermissionPaintable_1 (JR/scall 'NullPaintable :jm_getInstance_0))
        (JR/invoke (JR/invoke this :jm_getStartIntermissionInterface_0) :jm_setListener_1 this)))

    
(defn jm_notifyIntermission_1 [this p_enable]
  (let [ l_enable (volatile! p_enable)]
        (if @l_enable
            (do
            (JR/fset this :startIntermissionProcessor (JR/fget this :realStartIntermissionProcessor)))
            (do
            (JR/fset this :startIntermissionProcessor (JR/scall 'Processor :jm_getInstance_0))))
        (if @l_enable
            (do
            (JR/invoke this :jm_setIntermissionPaintable_1 (JR/invoke this :jm_getStartIntermissionPaintable_0)))
            (do
            (JR/invoke this :jm_setIntermissionPaintable_1 (JR/scall 'NullPaintable :jm_getInstance_0))))))

    
(defn jm_mediaInit_0 [this]
  (let []
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)))

    
(defn jm_initConfigurable_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_progressCanvas (volatile! nil) l_gameFeatureFactory (volatile! nil) l_changedGameFeatureListener (volatile! nil) l_features (volatile! nil) l_sensorFeatureFactory (volatile! nil) l_resourceLoadingLevelFactory (volatile! nil)]
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Setting Configurables")
        (JR/invoke (JR/scall 'GameInitializationUtil :jm_getInstance_0) :jm_initGame_3 @l_abeClientInformation this (JR/fget this :gameInitializationInterfaceFactoryInterface))
        (vreset! l_gameFeatureFactory (JR/scall 'GameFeatureFactory :jm_getInstance_0))
        (vreset! l_changedGameFeatureListener (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0))
        (if (JR/invoke @l_changedGameFeatureListener :jm_isChangedFeature_1 (JR/fget @l_gameFeatureFactory :SOUND))
            (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Sound Changing To: ") :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_gameFeatureFactory :SOUND)))) this "initConfigurable")
            (JR/invoke this :jm_mediaInit_0)
            (JR/invoke @l_changedGameFeatureListener :jm_remove_1 (JR/fget @l_gameFeatureFactory :SOUND))))
        (vreset! l_sensorFeatureFactory (JR/scall 'SensorFeatureFactory :jm_getInstance_0))
        (if (or (or (JR/invoke @l_changedGameFeatureListener :jm_isChangedFeature_1 (JR/fget @l_sensorFeatureFactory :ORIENTATION_SENSORS)) (JR/invoke @l_changedGameFeatureListener :jm_isChangedFeature_1 (JR/fget @l_sensorFeatureFactory :NO_ORIENTATION))) (JR/invoke @l_changedGameFeatureListener :jm_isChangedFeature_1 (JR/fget @l_sensorFeatureFactory :SIMULATED_ORIENTATION_SENSORS)))
            (do
            (JR/invoke @l_changedGameFeatureListener :jm_remove_1 (JR/fget @l_sensorFeatureFactory :NO_ORIENTATION))
            (JR/invoke @l_changedGameFeatureListener :jm_remove_1 (JR/fget @l_sensorFeatureFactory :ORIENTATION_SENSORS))
            (JR/invoke @l_changedGameFeatureListener :jm_remove_1 (JR/fget @l_sensorFeatureFactory :SIMULATED_ORIENTATION_SENSORS))))
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (JR/invoke this :jm_loadResourceLoadingLevel_1 (JR/fget @l_resourceLoadingLevelFactory :LOAD_GAME))))

    
(defn jm_initApp_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke this :jm_initConfigurable_1 @l_abeClientInformation)
        (JR/invoke this :jm_processorInit_0)
        (JR/invoke (JR/fget this :sensorGameUpdateProcessor) :jm_process_1 (JR/fget this :gameLayerManager))
        (JR/invoke (JR/fget this :sensorGameUpdateProcessor) :jm_sendNotifications_1 (JR/fget this :gameLayerManager))
        (JR/invoke this :jm_initTouch_0)))

    
(defn jm_initTouch_0 [this]
  (let [ l_gameInitializedEvent (volatile! nil) l_resourceLoadingLevelFactory (volatile! nil)]
        (vreset! l_gameInitializedEvent (JR/fget (JR/scall 'GameInitializationUtil :jm_getInstance_0) :EVENT))
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (JR/invoke @l_gameInitializedEvent :jm_setResourceLoadingLevel_1 (JR/fget @l_resourceLoadingLevelFactory :LOAD_TOUCH))
        (JR/invoke (JR/scall 'GameInitializedEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_gameInitializedEvent)
        (JR/invoke (JR/fget this :touchButtonFactory) :jm_defaultList_0)
        (JR/invoke this :jm_updateTouch_0)
        (JR/invoke this :jm_postInitTouch_0)))

    
(defn jm_updateCurrentTouchInputFactory_1 [this p_nextTouchInput]
  (let [ l_nextTouchInput (volatile! p_nextTouchInput)]
        (if (not (JR/eq @l_nextTouchInput (JR/fget this :currentTouchInputFactory)))
            (do
            (JR/fset this :currentTouchInputFactory @l_nextTouchInput)
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/fget this :currentTouchInputFactory)) this (JR/fget (JR/fget this :gameInputStrings) :UDPATE_CURRENT_TOUCH_INPUT_FACTORY))
            (JR/invoke (JR/fget this :touchButtonFactory) :jm_toggle_2 (JR/invoke this :jm_isPaused_0) (JR/invoke (JR/fget this :currentTouchInputFactory) :jm_getList_0))))))

    
(defn jm_updateTouch_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameBehavior) :jm_updateTouch_1 this)))

    
(defn jm_updateTouch2_0 [this]
  (let [ l_features (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :touchFeatureFactory) :AUTO_HIDE_SHOW_SCREEN_BUTTONS))
            (do
            (if (== (unchecked-int (unchecked-subtract (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getCurrentLevel_0) (JR/invoke this :jm_getStartLevel_0))) 1)
                (do
                (JR/invoke this :jm_setTouchPaintableP_1 (JR/scall 'NullPaintable :jm_getInstance_0))))))))

    
(defn jm_postInitTouch_0 [this]
  (let []
        (JR/invoke this :jm_setTouchButtonsPaintable_1 (JR/scall 'TouchButtonsPaintableFactory :jm_getInstance_1 (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0)))
        (JR/invoke this :jm_updateScreenButtonPaintable_0)))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommands_0)
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_addCommands_0 [this]
  (let [ l_gameCommandsFactory (volatile! nil) l_myCommandsFactory (volatile! nil) l_isOverScan (volatile! nil)]
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (vreset! l_myCommandsFactory (JR/scall 'MyCommandsFactory :jm_getInstance_0))
        (if (not (JR/eq (JR/scall 'DebugFactory :jm_getInstance_0) (JR/scall 'NoDebug :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :START_TRACE))))
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :RESTART_COMMAND))
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_myCommandsFactory :PAUSE_COMMAND))
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :QUIT_COMMAND))
        (vreset! l_isOverScan (JR/invoke (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0) :jm_isOverScan_0))
        (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            nil)
            (if (JR/sget 'SWTUtil "isSWT")
            (do
            nil)
            (if (not @l_isOverScan)
            (do
            (if (and (JR/invoke (JR/scall 'TouchScreenFactory :jm_getInstance_0) :jm_isTouch_0) (JR/invoke (InGameFeatures/jnew_0) :jm_isAny_0))
                (do
                (JR/invoke this :jm_addCommand_1 (JR/sget 'InGameOptionsForm "DISPLAY"))))
            (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :SAVE))
            (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :DISPLAY_LOAD_FORM))))))))

    
(defn jm_itemStateChanged_1 [this p_item]
  (let [ l_item (volatile! p_item) l_itemLabel (volatile! nil) l_gameFeatureUtil (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_itemLabel (JR/invoke @l_item :jm_getLabel_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :ITEM_LABEL)) :jm_append_1 @l_itemLabel)) this "itemStateChanged")
            (if (JR/instance-of @l_item 'ChoiceGroup)
                (do
                (vreset! l_gameFeatureUtil (JR/scall 'GameFeatureUtil :jm_getInstance_0))
                (if (JR/invoke @l_gameFeatureUtil :jm_isExclusive_1 @l_itemLabel)
                    (do
                    (JR/invoke @l_gameFeatureUtil :jm_updateExclusiveForChoiceGroup_1 @l_item))
                    (do
                    (JR/invoke @l_gameFeatureUtil :jm_updateMultiple_1 @l_item)))))
            (JR/invoke (JR/fget this :sensorGameUpdateProcessor) :jm_process_1 (JR/fget this :gameLayerManager))
            (JR/invoke this :jm_updateTouch_0)
            (JR/invoke this :jm_updateScreenButtonPaintable_0)
            (JR/invoke (JR/fget this :sensorGameUpdateProcessor) :jm_sendNotifications_1 (JR/fget this :gameLayerManager)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "itemStateChanged" @l_e)) :else (throw jt)))))))

    
(defn jm_updateScreenButtonPaintable_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameBehavior) :jm_updateScreenButtonPaintable_1 this)))

    
(defn jm_updateScreenButtonPaintable2_0 [this]
  (let [ l_features (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :touchFeatureFactory) :AUTO_HIDE_SHOW_SCREEN_BUTTONS))
            (do
            (JR/invoke this :jm_setTouchPaintableP_1 (JR/invoke this :jm_getTouchButtonsPaintable_0))
            (JR/invoke this :jm_setStartLevel_1 (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getCurrentLevel_0)))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :touchFeatureFactory) :SHOW_SCREEN_BUTTONS))
            (do
            (JR/invoke this :jm_setTouchPaintableP_1 (JR/invoke this :jm_getTouchButtonsPaintable_0)))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :touchFeatureFactory) :HIDE_SCREEN_BUTTONS))
            (do
            (JR/invoke this :jm_setTouchPaintableP_1 (JR/scall 'NullPaintable :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_setTouchPaintableP_1 (JR/scall 'NullPaintable :jm_getInstance_0))))))))

    
(defn jm_getLayerManager_0 [this]
  (let []
        (JR/fget this :gameLayerManager)))

    
(defn jm_setLayerManager_1 [this p_layerManager]
  (let [ l_layerManager (volatile! p_layerManager)]
        (JR/fset this :gameLayerManager @l_layerManager)))

    
(defn jm_isGameOver_0 [this]
  (let []
        (JR/fget this :gameOver)))

    
(defn jm_setGameOver_1 [this p_gameOver]
  (let [ l_gameOver (volatile! p_gameOver)]
        (JR/fset this :gameOver @l_gameOver)))

    
(defn jm_processGameOver_0 [this]
  (let []
        (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :gameStrings) :SET_GAME_OVER))
        (JR/invoke this :jm_setGameOver_1 true)
        (JR/invoke this :jm_removePauseCommand_0)
        (JR/invoke this :jm_setGameState_1 (JR/fget (JR/fget this :gameStateFactory) :SHOW_END_RESULT_GAME_STATE))
        (JR/invoke this :jm_setEndGamePaintable_1 (JR/invoke this :jm_getEndGameStatePaintable_0))))

    
(defn jm_isHighScoreSubmitted_0 [this]
  (let []
        (JR/fget this :highScoreSubmitted)))

    
(defn jm_setHighScoreSubmitted_1 [this p_highScoreSubmitted]
  (let [ l_highScoreSubmitted (volatile! p_highScoreSubmitted)]
        (JR/fset this :highScoreSubmitted @l_highScoreSubmitted)
        (if @l_highScoreSubmitted
            (do
            (JR/invoke (JR/fget this :highScoresHelper) :jm_setSelectedHighScores_1 (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "isHighScoreSubmitted: ") :jm_appendboolean_1 @l_highScoreSubmitted)) this "setHighScoreSubmitted")))

    
(defn jm_getGameState_0 [this]
  (let []
        (JR/fget this :gameState)))

    
(defn jm_setGameState_1 [this p_gameState]
  (let [ l_gameState (volatile! p_gameState)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameStrings) :GAME_STATE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_gameState))) this (JR/fget (JR/fget this :gameStrings) :SET_GAME_STATE))
        (JR/fset this :gameState @l_gameState)
        (JR/invoke (JR/fget this :gameStateTimeHelper) :jm_setStartTimeTNT_0)
        (JR/invoke this :jm_updateEndGameProcessor_0)
        (JR/invoke this :jm_updateGameKeyEventProcessor_0)
        (JR/invoke (JR/fget this :gameBehavior) :jm_setGameState_1 this)))

    
(defn jm_updateGameState_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
        (JR/invoke @l_gameAdState :jm_processAdState_2 (JR/fget this :gameState) (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getGameType_0))
        (if (not (JR/eq (JR/fget this :gameState) (JR/fget (JR/fget this :gameStateFactory) :PLAYING_GAME_STATE)))
            (do
            (JR/invoke @l_gameAdState :jm_processPageAdState_0)))))

    
(defn jm_updateGameKeyEventProcessor_0 [this]
  (let []
        (if (or (not (JR/eq (JR/invoke this :jm_getGameState_0) (JR/fget (JR/fget this :gameStateFactory) :PLAYING_GAME_STATE))) (JR/fget this :isCheating))
            (do
            nil)
            (do
            nil))))

    
(defn jm_removeAllGameKeyInputListenersOnBuild_0 [this]
  (let []
        (JR/invoke this :jm_removeAllGameKeyInputListeners_0)))

    
(defn jm_removeAllGameKeyInputListeners_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameBehavior) :jm_removeAllGameKeyInputListeners_1 this)))

    
(defn jm_removeAllGameKeyInputListeners2_0 [this]
  (let [ l_playerGameInput (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Remove PlayerInput Listeners" this "removeAllGameKeyInputListeners")
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_playerGameInput (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_get_1 @l_index))
            (JR/invoke this :jm_removeKeyInputListener_1 @l_playerGameInput)
            (JR/invoke @l_playerGameInput :jm_removeNonAIInputGameKeyEvents_0)))))

    
(defn jm_removeKeyInputListener_1 [this p_playerGameInput]
  (let [ l_playerGameInput (volatile! p_playerGameInput)]
        (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_removeListener_1 @l_playerGameInput)))

    
(defn jm_updateEndGameProcessor_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameBehavior) :jm_updateEndGameProcessor_1 this)))

    
(defn jm_updateEndGameProcessor2_0 [this]
  (let []
        (if (or (JR/eq (JR/invoke this :jm_getGameState_0) (JR/fget (JR/fget this :gameStateFactory) :SHOW_END_RESULT_GAME_STATE)) (JR/eq (JR/invoke this :jm_getGameState_0) (JR/fget (JR/fget this :gameStateFactory) :SHOW_HIGH_SCORE_GAME_STATE)))
            (do
            (JR/invoke this :jm_setEndGameProcessor_1 (JR/fget this :realEndGameProcessor)))
            (do
            (JR/invoke this :jm_setEndGameProcessor_1 (JR/scall 'Processor :jm_getInstance_0))))))

    
(defn jm_buildGameInit_1 [this p_isPortion]
  (let [ l_isPortion (volatile! p_isPortion)]
        nil))

    
(defn jm_cleanupGame_0 [this]
  (let [ l_progressCanvas (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CLEANUP))
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 10 "Cleaning Up")
        (JR/invoke (JR/fget this :primaryPlayerQueue) :jm_clear_0)
        (JR/invoke (JR/fget this :secondaryPlayerQueue) :jm_clear_0)
        (JR/invoke (JR/scall 'GameLevelDisplayChangeEventListenersFactory :jm_getInstance_0) :jm_clear_0)))

    
(defn jm_loadResourceLoadingLevel_1 [this p_resourceLoadingLevel]
  (let [ l_resourceLoadingLevel (volatile! p_resourceLoadingLevel) l_gameInitializedEvent (volatile! nil)]
        (vreset! l_gameInitializedEvent (JR/fget (JR/scall 'GameInitializationUtil :jm_getInstance_0) :EVENT))
        (JR/invoke @l_gameInitializedEvent :jm_setResourceLoadingLevel_1 @l_resourceLoadingLevel)
        (JR/invoke (JR/scall 'GameInitializedEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_gameInitializedEvent)))

    
(defn jm_loadResources_1 [this p_level]
  (let [ l_level (volatile! p_level) l_gameInitializedEvent (volatile! nil)]
        (vreset! l_gameInitializedEvent (JR/fget (JR/scall 'GameInitializationUtil :jm_getInstance_0) :EVENT))
        (JR/invoke @l_gameInitializedEvent :jm_setLevel_1 @l_level)
        (JR/invoke (JR/scall 'GameInitializedEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_gameInitializedEvent)))

    
(defn jm_updateColor_0 [this]
  (let []
        nil))

    
(defn jm_buildGame_1 [this p_portion]
  (let [ l_portion (volatile! p_portion) l_progressCanvas (volatile! nil) l_features (volatile! nil)](JR/method
        (JR/invoke (JR/fget this :screenCapture) :jm_endRecording_0)
        (JR/invoke (JR/fget this :screenCapture) :jm_startRecording_0)
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_portion "Generic Build")
        (JR/invoke this :jm_removeAllGameKeyInputListenersOnBuild_0)
        (JR/invoke this :jm_updateTouch_0)
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_portion "High Scores")
        (JR/invoke (JR/fget this :highScoresFactoryInterface) :jm_fetchHighScores_2 (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) (JR/fget this :highScoresHelper))
        (JR/invoke this :jm_setHighScoresPaintable_1 (JR/scall 'NullPaintable :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_portion "Finishing.")
        (JR/invoke (JR/invoke this :jm_getEndGameInfoP_0) :jm_update_2 (JR/invoke (JR/invoke this :jm_getLayerManager_0) :jm_getGameInfo_0) this)
        (JR/fset this :isSingleKeyRepeatableProcessing (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'InputFeatureFactory :jm_getInstance_0) :SINGLE_KEY_REPEAT_PRESS)))
        (JR/invoke this :jm_setGameOver_1 false)
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_portion "Finishing..")
        (JR/invoke this :jm_updateColor_0)
        (JR/invoke (JR/invoke this :jm_getStartIntermissionPaintable_0) :jm_update_0)
        (if (not (JR/invoke this :jm_isRunningInAnotherThread_0))
            (do
            (JR/jreturn)))
        (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_portion "Finishing...")
        (if (or (JR/invoke this :jm_isMainCanvas_0) (not (JR/invoke this :jm_isInitialized_0)))
            (do
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :LOAD_ONDEMAND))
                (do
                (if (some? (JR/invoke this :jm_getCustomCommandListener_0))
                    (do
                    (JR/invoke @l_progressCanvas :jm_end_0))))
                (do
                (JR/invoke @l_progressCanvas :jm_end_0)))
            (JR/invoke this :jm_setInitialized_1 true)))
        (if (JR/eq (JR/invoke this :jm_getCustomCommandListener_0) (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER"))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Show Game Paintable in DemoCanvas Thread" this (JR/fget this :BUILD_GAME))
            (JR/invoke (JR/fget this :gameCanvasStartListener) :jm_showGamePaintable_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "No GameCanvasStartListener" this (JR/fget this :BUILD_GAME))))
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_setBasicColorP_1 (JR/invoke (JR/fget this :gameLayerManager) :jm_getBackgroundBasicColor_0))
        (JR/invoke (JR/fget this :gameBehavior) :jm_buildGame_1 this))))

    
(defn jm_buildGame2_0 [this]
  (let [ l_playerGameInput (volatile! nil) l_index (volatile! nil)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :ENABLE_PLAYER_GAME_INPUTS)) :jm_appendint_1 (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_size_0))) this (JR/fget this :BUILD_GAME))
        (vreset! l_playerGameInput nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_playerGameInput (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_get_1 @l_index))
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :ENABLE_PLAYER_GAME_INPUT)) :jm_append_1 (JR/to-string-of @l_playerGameInput))) this (JR/fget this :BUILD_GAME))
            (JR/invoke @l_playerGameInput :jm_removeNonAIInputGameKeyEvents_0)
            (JR/invoke this :jm_addKeyInputListener_1 @l_playerGameInput)))))

    
(defn jm_addKeyInputListener_1 [this p_playerGameInput]
  (let [ l_playerGameInput (volatile! p_playerGameInput)]
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_addListenerForPlayer_2 @l_playerGameInput (JR/invoke @l_playerGameInput :jm_getPlayerInputId_0))))

    
(defn jm_setGameCanvasStartListener_1 [this p_gameCanvasStartListener]
  (let [ l_gameCanvasStartListener (volatile! p_gameCanvasStartListener)]
        (JR/fset this :gameCanvasStartListener @l_gameCanvasStartListener)))

    
(defn jm_loadState_0 [this]
  (let [ l_hashtable (volatile! nil) l_levelAsString (volatile! nil) l_level (volatile! nil) l_gameInfo (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :LOAD))
        (vreset! l_hashtable (JR/invoke this :jm_getLoadStateHashtable_0))
        (if (and (some? @l_hashtable) (> (JR/invoke @l_hashtable :jm_size_0) 0))
            (do
            (vreset! l_levelAsString (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'GameInfo "LEVEL_NAME")))
            (vreset! l_level (JR/invoke (JR/s @l_levelAsString) :jm_intValue_0))
            (vreset! l_gameInfo (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0))
            (JR/invoke @l_gameInfo :jm_setCurrentLevel_1 @l_level)))))

    
(defn jm_getLoadStateHashtable_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :START_LABEL)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :hashtable)))) this "getLoadStateHashtable")
        (JR/fget this :hashtable)))

    
(defn jm_setLoadStateHashtable_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :START_LABEL)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_hashtable))) this "setLoadStateHashtable")
        (JR/fset this :hashtable @l_hashtable)))

    
(defn jm_getCurrentStateHashtable_0 [this]
  (let [ l_hashtable (volatile! nil) l_level (volatile! nil)]
        (vreset! l_hashtable (JR/invoke (JR/fget this :stdUtil) :jm_createHashtable_0))
        (vreset! l_level (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getCurrentLevel_0))
        (JR/invoke @l_hashtable :jm_put_2 (JR/to-string-of (JR/sget 'GameInfo "LEVEL_NAME")) (JR/s @l_level))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "End: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_hashtable))) this "getCurrentStateHashtable")
        @l_hashtable))

    
(defn jm_paintGameOver_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)))

    
(defn jm_draw_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0))
        (JR/invoke (JR/fget this :gameSpecificPaintable) :jm_paint_1 @l_graphics)))

    
(defn jm_clear_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_paint_1 @l_graphics)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_nextRefresh_0)
        (JR/invoke this :jm_draw_1 @l_graphics)
        (JR/invoke (JR/fget this :menuPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :progressPaintable) :jm_paint_1 @l_graphics)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_processEndLevelIntermissionGameState_0 [this]
  (let []
        nil))

    
(defn jm_nonBotPaint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :endGamePaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :intermissionPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke this :jm_paintIntermission_1 @l_graphics)
        (JR/invoke (JR/fget this :touchPaintable) :jm_paint_1 @l_graphics)))

    
(defn jm_paintIntermission_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_keyPressed_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/invoke this :jm_keyPressedByDevice_2 @l_keyCode 0)))

    
(defn jm_keyReleased_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/invoke this :jm_keyReleasedByDevice_2 @l_keyCode 0)))

    
(defn jm_keyRepeated_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/invoke this :jm_keyRepeatedByDevice_2 @l_keyCode 0)))

    
(defn jm_keyPressedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (JR/invoke (JR/fget this :inputProcessor) :jm_keyPressedByDevice_2 @l_keyCode @l_deviceId)))

    
(defn jm_keyRepeatedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (if (JR/fget this :isSingleKeyRepeatableProcessing)
            (do
            (JR/invoke (JR/fget this :inputProcessor) :jm_keyPressedByDevice_2 @l_keyCode @l_deviceId)))))

    
(defn jm_keyReleasedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (JR/invoke (JR/fget this :inputProcessor) :jm_keyReleasedByDevice_3 this @l_keyCode @l_deviceId)))

    
(defn jm_handleRawKey_3 [this p_keyCode p_deviceId p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated)]
        nil))

    
(defn jm_endProgress_1 [this p_isProgress]
  (let [ l_isProgress (volatile! p_isProgress) l_portion (volatile! nil) l_myCommandsFactory (volatile! nil) l_progressCanvas (volatile! nil)]
        (vreset! l_portion 30)
        (if (and @l_isProgress (JR/invoke this :jm_isMainCanvas_0))
            (do
            (vreset! l_myCommandsFactory (JR/scall 'MyCommandsFactory :jm_getInstance_0))
            (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (JR/invoke @l_progressCanvas :jm_start_0)
            (JR/invoke (JR/invoke this :jm_getCustomCommandListener_0) :jm_commandAction_2 (JR/fget @l_myCommandsFactory :SET_DISPLAYABLE) @l_progressCanvas)
            (vreset! l_portion 4)))
        @l_portion))

    
(defn jm_processPlayingGame_0 [this]
  (let []
        (JR/invoke (JR/fget this :cheatProcessor) :jm_update_0)
        (JR/invoke (JR/invoke (JR/fget this :sensorGameUpdateProcessor) :jm_getInputSensor_0) :jm_update_0)
        (JR/invoke (JR/fget this :gameInputProcessor) :jm_process_0)
        (JR/invoke (JR/fget this :gameLayerManager) :jm_process_0)
        (JR/invoke (JR/fget this :startIntermissionProcessor) :jm_process_0)))

    
(defn jm_threadInit_0 [this]
  (let []
        nil))

    
(defn jm_processGame_0 [this]
  (let []
        (JR/invoke-super 'RunnableCanvas this :jm_process_0)
        (if (JR/scall 'AllBinaryMediaManager :jm_update_0)
            (do
            (if (not (JR/invoke (JR/fget this :primaryPlayerQueue) :jm_process_0))
                (do
                (JR/invoke (JR/fget this :secondaryPlayerQueue) :jm_process_0)))))
        (JR/invoke (JR/fget this :mainStateProcessor) :jm_process_0)
        (JR/invoke (JR/fget this :menuInputProcessor) :jm_processInputList_0)
        (JR/invoke (JR/fget this :endGameProcessor) :jm_process_0)
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_nextFrame_0)))

    
(defn jm_notifyDonePainting_0 [this]
  (let []
        (locking this
            (JR/invoke (JR/fget this :threadObjectUtil) :jm_notifyObject_1 this))))

    
(defn jm_shouldWait_0 [this]
  (let [ l_features (volatile! nil) l_openGLImageSpecificFactory (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
            (do
            nil)
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL_2D))
            (do
            nil)
            (do
            (if (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL))
                (do
                (vreset! l_openGLImageSpecificFactory (JR/scall 'OpenGLImageSpecificFactory :jm_getInstance_0))
                (JR/jwhile false false (JR/fget @l_openGLImageSpecificFactory :updating)
                    (java.lang.Thread/sleep (JR/fget this :YIELD_SLEEP))))))))))

    
(defn jm_run_0 [this]
  (let [ l_progressCanvas (volatile! nil) l_gameAdState (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Game Thread")
            (JR/invoke this :jm_setCurrentThread_0)
            (JR/invoke this :jm_setRunning_1 true)
            (if (JR/eq (JR/invoke this :jm_getCustomCommandListener_0) (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER"))
                (do
                (java.lang.Thread/sleep (JR/fget this :YIELD_SLEEP))))
            (JR/invoke this :jm_shouldWait_0)
            (JR/invoke this :jm_threadInit_0)
            (if (JR/eq (JR/invoke this :jm_getCustomCommandListener_0) (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER"))
                (do
                (java.lang.Thread/sleep (JR/fget this :YIELD_SLEEP))))
            (JR/invoke this :jm_open_0)
            (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
            (JR/invoke @l_gameAdState :jm_init_0)
            (JR/invoke @l_gameAdState :jm_setGameIsReady_1 true)
            (JR/invoke (JR/fget this :gameBehavior) :jm_run_1 this)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))))

    
(defn jm_run2_0 [this]
  (let [ l_features (volatile! nil) l_currentDisplayableFactory (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (or (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL_AS_GAME_THREAD)) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            (if (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL_AS_GAME_THREAD))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/invoke (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL_AS_GAME_THREAD) :jm_getName_0) this (JR/fget (JR/fget this :commonStrings) :RUN))))
            (if (JR/scall 'J2MEUtil :jm_isHTML_0)
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/scall 'GraphicsStrings :jm_getInstance_0) :HTML) this (JR/fget (JR/fget this :commonStrings) :RUN))))
            (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
            (JR/invoke @l_currentDisplayableFactory :jm_setRunnable_1 (JR/fget this :gameRunnable))
            (JR/invoke @l_currentDisplayableFactory :jm_setDisplayable_1 this)
            (JR/invoke (JR/scall 'OpenGLThreadUtil :jm_getInstance_0) :jm_onResume_0))
            (if (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/invoke (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS) :jm_getName_0) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (JR/invoke (JR/scall 'OpenGLThreadUtil :jm_getInstance_0) :jm_onResume_0)
            (JR/jwhile false false (JR/invoke this :jm_isRunning_0)
                (JR/invoke this :jm_run3_0))
            (JR/invoke this :jm_end_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "this thread" this (JR/fget (JR/fget this :commonStrings) :RUN))
            (JR/jwhile false false (JR/invoke this :jm_isRunning_0)
                (JR/invoke this :jm_run3_0))
            (JR/invoke this :jm_end_0))))))

    
(defn jm_run3_0 [this]
  (let []
        (JR/invoke (JR/fget this :loopTimeHelper) :jm_setStartTime_1 (JR/invoke (JR/fget this :gameTickTimeDelayHelper) :jm_setStartTime_0))
        (JR/invoke (JR/fget this :gameTickDisplayInfoSingleton) :jm_update_0)
        (JR/invoke this :jm_processGame_0)
        (JR/invoke this :jm_processLoopSleep_0)))

    
(defn jm_setRunning_1 [this p_running]
  (let [ l_running (volatile! p_running) l_features (volatile! nil) l_currentDisplayableFactory (volatile! nil) l_e (volatile! nil)]
        (JR/invoke-super 'RunnableCanvas this :jm_setRunning_1 @l_running)
        (try (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (if @l_running
                (do
                nil)
                (do
                (if (or (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/fget this :openGLFeatureFactory) :OPENGL)) (JR/sget 'SWTUtil "isSWT"))
                    (do
                    (if (not (JR/eq (JR/invoke (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) :jm_getGameType_0) (JR/fget (JR/fget this :gameTypeFactory) :BOT)))
                        (do
                        (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
                        (JR/invoke @l_currentDisplayableFactory :jm_clearRunnable_0)))
                    (JR/invoke this :jm_end_0))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget this :SET_RUNNING) @l_e)) :else (throw jt)))))))

    
(defn jm_end_0 [this]
  (let []
        (JR/invoke (JR/fget this :screenCapture) :jm_endRecording_0)
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of (JR/fget this :baseGameStatistics))) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))))
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_init_0)
        (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_removeListener_1 (JR/fget this :cheatProcessor))
        (JR/invoke this :jm_close_0)
        (JR/invoke this :jm_removeAllGameKeyInputListeners_0)
        (JR/invoke this :jm_endGameThread_0)))

    
(defn jm_endGameThread_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_removeListener_1 this)
        (JR/invoke (JR/scall 'GameLevelDisplayChangeEventListenersFactory :jm_getInstance_0) :jm_clear_0)
        (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
        (JR/invoke @l_gameAdState :jm_notPlayingAdState_0)))

    
(defn jm_createHighScore_1 [this p_score]
  (let [ l_score (volatile! p_score) l_gameInfo (volatile! nil)]
        (vreset! l_gameInfo (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0))
        (HighScore/jnew_4 0 "NONE" (GameInfo/jnew_5 (JR/invoke @l_gameInfo :jm_getGameType_0) (JR/invoke @l_gameInfo :jm_getGameMode_0) (JR/fget (JR/scall 'PlayerTypesFactory :jm_getInstance_0) :PLAYER_TYPE_ONE) 0 0) @l_score)))

    
(defn jm_setHighScore_5 [this p_abeClientInformation p_name p_score p_autoSubmit p_isLast]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_name (volatile! p_name) l_score (volatile! p_score) l_autoSubmit (volatile! p_autoSubmit) l_isLast (volatile! p_isLast)]
        (JR/invoke (JR/fget this :gameBehavior) :jm_setHighScore_6 @l_abeClientInformation this @l_name @l_score @l_autoSubmit @l_isLast)))

    
(defn jm_setHighScore2_5 [this p_abeClientInformation p_name p_score p_autoSubmit p_isLast]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_name (volatile! p_name) l_score (volatile! p_score) l_autoSubmit (volatile! p_autoSubmit) l_isLast (volatile! p_isLast) l_highScore (volatile! nil) l_textBox (volatile! nil)]
        (vreset! l_highScore (JR/invoke this :jm_createHighScore_1 @l_score))
        (vreset! l_textBox (HighScoreTextBox/jnew_9 (JR/fget this :highScoresFactoryInterface) (JR/fget this :highScoresHelper) @l_abeClientInformation (JR/invoke (JR/fget this :gameLayerManager) :jm_getGameInfo_0) (JR/invoke this :jm_getCustomCommandListener_0) @l_name @l_highScore (JR/invoke (JR/fget this :gameLayerManager) :jm_getBackgroundBasicColor_0) (JR/invoke (JR/fget this :gameLayerManager) :jm_getForegroundBasicColor_0)))
        (if @l_isLast
            (do
            (JR/invoke (JR/invoke this :jm_getCustomCommandListener_0) :jm_commandAction_2 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :SET_MENU_DISPLAYABLE) @l_textBox)))
        (if @l_autoSubmit
            (do
            (JR/invoke (JR/scall 'SecondaryThreadPool :jm_getInstance_0) :jm_runTask_1 (SaveHighScoreRunnable/jnew_2 @l_isLast @l_textBox))))))

    
(defn jm_getGameStateTimeHelper_0 [this]
  (let []
        (JR/fget this :gameStateTimeHelper)))

    
(defn jm_setInitialized_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :initialized @l_initialized)))

    
(defn jm_isInitialized_0 [this]
  (let []
        (JR/fget this :initialized)))

    
(defn jm_getSourceId_0 [this]
  (let []
        (AllBinaryGameCanvas/jstatic_id)))

    
(defn jm_setProgressPaintable_1 [this p_paintable]
  (let [ l_paintable (volatile! p_paintable)]
        (JR/fset this :progressPaintable @l_paintable)))

    
(defn jm_getStartIntermissionInterface_0 [this]
  (let []
        (JR/fget this :startIntermissionInterface)))

    
(defn jm_getEndLevelIntermissionInterface_0 [this]
  (let []
        (JR/fget this :endLevelIntermissionInterface)))

    
(defn jm_setTouchPaintableP_1 [this p_paintable]
  (let [ l_paintable (volatile! p_paintable)]
        (JR/fset this :touchPaintable @l_paintable)))

    
(defn jm_getTouchPaintableP_0 [this]
  (let []
        (JR/fget this :touchPaintable)))

    
(defn jm_setEndGamePaintable_1 [this p_endGamePaintable]
  (let [ l_endGamePaintable (volatile! p_endGamePaintable)]
        (JR/fset this :endGamePaintable @l_endGamePaintable)))

    
(defn jm_getEndGamePaintable_0 [this]
  (let []
        (JR/fget this :endGamePaintable)))

    
(defn jm_setIntermissionPaintable_1 [this p_intermissionPaintable]
  (let [ l_intermissionPaintable (volatile! p_intermissionPaintable)]
        (JR/fset this :intermissionPaintable @l_intermissionPaintable)))

    
(defn jm_getIntermissionPaintable_0 [this]
  (let []
        (JR/fget this :intermissionPaintable)))

    
(defn jm_getEndGameInfoP_0 [this]
  (let []
        (JR/fget this :endGameInfo)))

    
(defn jm_setHighScoresPaintable_1 [this p_highScoresPaintable]
  (let [ l_highScoresPaintable (volatile! p_highScoresPaintable)]
        (JR/fset this :highScoresPaintable @l_highScoresPaintable)))

    
(defn jm_getHighScoresPaintable_0 [this]
  (let []
        (JR/fget this :highScoresPaintable)))

    
(defn jm_getRealHighScoresPaintable_0 [this]
  (let []
        (JR/fget this :realHighScoresPaintable)))

    
(defn jm_clearPlayerGameInputList_0 [this]
  (let [ l_playerGameInput (volatile! nil) l_index (volatile! nil)]
        (vreset! l_playerGameInput nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_playerGameInput (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_get_1 @l_index))
            (JR/invoke (JR/fget this :gameKeyEventHandler) :jm_removeListener_1 @l_playerGameInput)))
        (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_clear_0)))

    
(defn jm_addPlayerGameInput_1 [this p_playerGameInput]
  (let [ l_playerGameInput (volatile! p_playerGameInput)]
        (JR/invoke (JR/fget this :localPlayerGameInputList) :jm_add_1 @l_playerGameInput)))

    
(defn jm_setMenuInputProcessor_1 [this p_menuInputProcessor]
  (let [ l_menuInputProcessor (volatile! p_menuInputProcessor)]
        (JR/fset this :menuInputProcessor @l_menuInputProcessor)))

    
(defn jm_getMenuInputProcessor_0 [this]
  (let []
        (JR/fget this :menuInputProcessor)))

    
(defn jm_getMenuForm_0 [this]
  (let []
        (JR/fget this :menuForm)))

    
(defn jm_setMenuForm_1 [this p_menuForm]
  (let [ l_menuForm (volatile! p_menuForm)]
        (JR/fset this :menuForm @l_menuForm)))

    
(defn jm_getStartLevel_0 [this]
  (let []
        (JR/fget this :startLevel)))

    
(defn jm_setStartLevel_1 [this p_startLevel]
  (let [ l_startLevel (volatile! p_startLevel)]
        (JR/fset this :startLevel @l_startLevel)))

    
(defn jm_setTouchButtonsPaintable_1 [this p_touchButtonsPaintable]
  (let [ l_touchButtonsPaintable (volatile! p_touchButtonsPaintable)]
        (JR/fset this :touchButtonsPaintable @l_touchButtonsPaintable)))

    
(defn jm_getTouchButtonsPaintable_0 [this]
  (let []
        (JR/fget this :touchButtonsPaintable)))

    
(defn jm_setGameInputProcessor_1 [this p_gameInputProcessor]
  (let [ l_gameInputProcessor (volatile! p_gameInputProcessor)]
        (JR/fset this :gameInputProcessor @l_gameInputProcessor)))

    
(defn jm_getGameInputProcessor_0 [this]
  (let []
        (JR/fget this :gameInputProcessor)))

    
(defn jm_setEndGameProcessor_1 [this p_endGameProcessor]
  (let [ l_endGameProcessor (volatile! p_endGameProcessor)]
        (JR/fset this :endGameProcessor @l_endGameProcessor)))

    
(defn jm_getEndGameProcessor_0 [this]
  (let []
        (JR/fget this :endGameProcessor)))

    
(defn jm_setEndGameStatePaintable_1 [this p_endGameStatePaintable]
  (let [ l_endGameStatePaintable (volatile! p_endGameStatePaintable)]
        (JR/fset this :endGameStatePaintable @l_endGameStatePaintable)))

    
(defn jm_getEndGameStatePaintable_0 [this]
  (let []
        (JR/fget this :endGameStatePaintable)))

    
(defn jm_setNonBotPaintableP_1 [this p_nonBotPaintable]
  (let [ l_nonBotPaintable (volatile! p_nonBotPaintable)]
        (JR/fset this :nonBotPaintable @l_nonBotPaintable)))

    
(defn jm_getNonBotPaintableP_0 [this]
  (let []
        (JR/fget this :nonBotPaintable)))

    
(defn jm_setStartIntermissionPaintable_1 [this p_startIntermissionPaintable]
  (let [ l_startIntermissionPaintable (volatile! p_startIntermissionPaintable)]
        (JR/fset this :startIntermissionPaintable @l_startIntermissionPaintable)))

    
(defn jm_getStartIntermissionPaintable_0 [this]
  (let []
        (JR/fget this :startIntermissionPaintable)))

    
(defn jm_setMainStateProcessor_1 [this p_mainStateProcessor]
  (let [ l_mainStateProcessor (volatile! p_mainStateProcessor)]
        (JR/fset this :mainStateProcessor @l_mainStateProcessor)))

    
(defn jm_getMainStateProcessor_0 [this]
  (let []
        (JR/fget this :mainStateProcessor)))

    
(defn jm_setProcessGameProcessor_1 [this p_processGameProcessor]
  (let [ l_processGameProcessor (volatile! p_processGameProcessor)]
        (JR/fset this :processGameProcessor @l_processGameProcessor)))

    
(defn jm_getProcessGameProcessor_0 [this]
  (let []
        (JR/fget this :processGameProcessor)))

    
(defn jm_setOpenMenuPaintable_1 [this p_openMenuPaintable]
  (let [ l_openMenuPaintable (volatile! p_openMenuPaintable)]
        (JR/fset this :openMenuPaintable @l_openMenuPaintable)))

    
(defn jm_getOpenMenuPaintable_0 [this]
  (let []
        (JR/fget this :openMenuPaintable)))

    
(defn jm_setPopupMenuInputProcessor_1 [this p_popupMenuInputProcessor]
  (let [ l_popupMenuInputProcessor (volatile! p_popupMenuInputProcessor)]
        (JR/fset this :popupMenuInputProcessor @l_popupMenuInputProcessor)))

    
(defn jm_getPopupMenuInputProcessor_0 [this]
  (let []
        (JR/fget this :popupMenuInputProcessor)))

    
(defn jm_getSensorGameUpdateProcessor_0 [this]
  (let []
        (JR/fget this :sensorGameUpdateProcessor)))

    
(defn jm_getRawGameInputProcessor_0 [this]
  (let []
        (JR/fget this :rawGameInputProcessor)))

    
(defn jm_getRawInputProcessor_0 [this]
  (let []
        (JR/fget this :rawInputProcessor)))

    
(defn jm_setInputProcessor_1 [this p_inputProcessor]
  (let [ l_inputProcessor (volatile! p_inputProcessor)]
        (JR/fset this :inputProcessor @l_inputProcessor)))

    
(defn jm_getInputProcessor_0 [this]
  (let []
        (JR/fget this :inputProcessor)))

    
(defn jm_setMenuPaintable_1 [this p_menuPaintable]
  (let [ l_menuPaintable (volatile! p_menuPaintable)]
        (JR/fset this :menuPaintable @l_menuPaintable)))

    
(defn jm_getMenuPaintable_0 [this]
  (let []
        (JR/fget this :menuPaintable)))

    
(defn jm_setFormPaintable_1 [this p_formPaintable]
  (let [ l_formPaintable (volatile! p_formPaintable)]
        (JR/fset this :formPaintable @l_formPaintable)))

    
(defn jm_getFormPaintable_0 [this]
  (let []
        (JR/fget this :formPaintable)))

    
(defn jm_setGameSpecificPaintableP_1 [this p_gameSpecificPaintable]
  (let [ l_gameSpecificPaintable (volatile! p_gameSpecificPaintable)]
        (JR/fset this :gameSpecificPaintable @l_gameSpecificPaintable)))

    
(defn jm_getGameSpecificPaintableP_0 [this]
  (let []
        (JR/fget this :gameSpecificPaintable)))

    
(defn jm_isSingleThread_0 [this]
  (let []
        (or (JR/invoke (JR/scall 'OpenGLFeatureUtil :jm_getInstance_0) :jm_isAnyThreed_0) (JR/sget 'SWTUtil "isSWT"))))

    
(defn jm_isRunningInAnotherThread_0 [this]
  (let [ l_features (volatile! nil) l_openGLFeatureFactory (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isDefault_1 (JR/fget @l_openGLFeatureFactory :OPENGL_AS_GAME_THREAD))
            (do
            true)
            (do
            (JR/invoke this :jm_isRunning_0)))))

    
(defn jm_getType_0 [this]
  (let []
        (AllBinaryGameCanvas/jstatic_TYPE)))

    
(defn jm_getTitle_0 [this]
  (let []
        (JR/invoke-super 'RunnableCanvas this :jm_getTitle_0)))

    
(defn jm_isPaused_0 [this]
  (let []
        (JR/invoke-super 'RunnableCanvas this :jm_isPaused_0)))



