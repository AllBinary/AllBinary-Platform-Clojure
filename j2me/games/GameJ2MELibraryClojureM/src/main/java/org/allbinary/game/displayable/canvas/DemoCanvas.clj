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

(ns DemoCanvas)

(JR/register 'DemoCanvas 'RunnableCanvas '[GameCanvasRunnableInterface MenuListener DisplayChangeEventListener DemoPaintableInterface])

(def jsv_id (atom 0))
(def jsv_BOT_GAME_STATS (atom nil))
(def jsv_TYPE (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_id [] (JR/ensure-init jclinit-state jclinit) @jsv_id)
(defn jstatic_set_id [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_id v))
(defn jstatic_BOT_GAME_STATS [] (JR/ensure-init jclinit-state jclinit) @jsv_BOT_GAME_STATS)
(defn jstatic_set_BOT_GAME_STATS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_BOT_GAME_STATS v))
(defn jstatic_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_TYPE)
(defn jstatic_set_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_id 0)
    (reset! jsv_BOT_GAME_STATS "Bot Game Statistics: ")
    (reset! jsv_TYPE 3)
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColorFactory nil)
  (JR/fset this :myCommandsFactory nil)
  (JR/fset this :gameAdStateFactory nil)
  (JR/fset this :gameInputStrings nil)
  (JR/fset this :gameStateFactory nil)
  (JR/fset this :threadFactoryUtil nil)
  (JR/fset this :formUtil nil)
  (JR/fset this :fullscreenPaintable nil)
  (JR/fset this :basicGameDemoPaintable nil)
  (JR/fset this :specialAnimationInterface nil)
  (JR/fset this :paintedSpecialAnimationInterface nil)
  (JR/fset this :fullScreenUtil nil)
  (JR/fset this :gameCanvas nil)
  (JR/fset this :highScoresHelper nil)
  (JR/fset this :realHighScoresPaintable nil)
  (JR/fset this :highScoresPaintable nil)
  (JR/fset this :state 0)
  (JR/fset this :canvasThread nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :abeClientInformation nil)
  (JR/fset this :highScoresFactoryInterface nil)
  (JR/fset this :menuInputProcessor nil)
  (JR/fset this :menuForm nil)
  (JR/fset this :gameInitializationInterfaceFactoryInterface nil)
  (JR/fset this :initialized false)
  (JR/fset this :demoGameRunnable nil)
  (JR/fset this :defaultPaintableInterface nil)
  (JR/fset this :paintableInterface nil)
  (JR/fset this :overlayPaintable nil)
  (JR/fset this :progressPaintable nil)
  (JR/fset this :tempWait 0)
  (JR/fset this :inputToGameKeyMapping nil)
  (JR/fset this :gameRunnable nil)
  (JR/fset this :isSingleKeyRepeatableProcessing false)
  (JR/fset this :NONE nil)
  (JR/fset this :gameKeyEventFactory nil)
  (JR/fset this :lastKeyNotMapped 0)
  (JR/fset this :SET_STATE nil)
  (JR/fset this :baseGameStatistics nil)
    (JR/fset this :basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
    (JR/fset this :myCommandsFactory (JR/scall 'MyCommandsFactory :jm_getInstance_0))
    (JR/fset this :gameAdStateFactory (JR/scall 'GameAdStateFactory :jm_getInstance_0))
    (JR/fset this :gameInputStrings (JR/scall 'GameInputStrings :jm_getInstance_0))
    (JR/fset this :gameStateFactory (JR/scall 'GameStateFactory :jm_getInstance_0))
    (JR/fset this :threadFactoryUtil (JR/scall 'ThreadFactoryUtil :jm_getInstance_0))
    (JR/fset this :formUtil (JR/scall 'FormUtil :jm_getInstance_0))
    (JR/fset this :fullscreenPaintable (JR/fget (JR/scall 'FullScreenPaintableFactory :jm_getInstance_0) :paintable))
    (JR/fset this :basicGameDemoPaintable (JR/scall 'StatePaintableFactory :jm_getInstance_0))
    (JR/fset this :specialAnimationInterface (JR/scall 'SpecialAnimation :jm_getInstance_0))
    (JR/fset this :paintedSpecialAnimationInterface (JR/scall 'SpecialAnimation :jm_getInstance_0))
    (JR/fset this :fullScreenUtil (JR/scall 'FullScreenUtil :jm_getInstance_0))
    (JR/fset this :gameCanvas (JR/scall 'NullGameCanvas :jm_getInstance_0))
    (JR/fset this :highScoresHelper (HighScoresHelper/jnew_0))
    (JR/fset this :realHighScoresPaintable (HighScoresPaintable/jnew_0))
    (JR/fset this :highScoresPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :state 0)
    (JR/fset this :canvasThread (JR/sget 'NullThread "NULL_THREAD"))
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 6000))
    (JR/fset this :basicColor (JR/fget (JR/fget this :basicColorFactory) :RED))
    (JR/fset this :menuInputProcessor (JR/scall 'NoMenuInputProcessor :jm_getInstance_0))
    (JR/fset this :menuForm (JR/scall 'ScrollSelectionForm :jm_getNullScrollSelectionForm_0))
    (JR/fset this :defaultPaintableInterface (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :paintableInterface (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :progressPaintable (JR/scall 'ProgressCanvasFactory :jm_getLazyInstance_0))
    (JR/fset this :tempWait (JR/fget (JR/scall 'NullWaitGameRunnable :jm_getInstance_0) :WAIT))
    (JR/fset this :inputToGameKeyMapping (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_getInputMapping_0))
    (JR/fset this :gameRunnable (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
    (JR/fset this :isSingleKeyRepeatableProcessing (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'InputFeatureFactory :jm_getInstance_0) :SINGLE_KEY_REPEAT_PRESS)))
    (JR/fset this :NONE (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :NONE))
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
    (JR/fset this :lastKeyNotMapped (unchecked-int (unchecked-negate (JR/c2i 1))))
    (JR/fset this :SET_STATE "setState")
    (JR/fset this :baseGameStatistics (JR/scall 'GameStatisticsFactory :jm_getInstance_0))
  this)

    
(defn jinit_7 [this p_abeClientInformation p_commandListener p_highScoresFactoryInterface p_paintable p_overlayPaintable p_gameInitializationInterfaceFactoryInterface p_isContinue]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_commandListener (volatile! p_commandListener) l_highScoresFactoryInterface (volatile! p_highScoresFactoryInterface) l_paintable (volatile! p_paintable) l_overlayPaintable (volatile! p_overlayPaintable) l_gameInitializationInterfaceFactoryInterface (volatile! p_gameInitializationInterfaceFactoryInterface) l_isContinue (volatile! p_isContinue)]
        (RunnableCanvas/jinit_3 this @l_commandListener (JR/fget (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0) :DEFAULT_CHILD_NAME_LIST) true) (jinitfields this)
        (JR/fset this :abeClientInformation @l_abeClientInformation)
        (JR/invoke this :jm_setWait_1 (JR/fget (JR/scall 'NullWaitGameRunnable :jm_getInstance_0) :WAIT))
        (JR/fset this :gameInitializationInterfaceFactoryInterface @l_gameInitializationInterfaceFactoryInterface)
        (JR/invoke (JR/scall 'GameInitializationUtil :jm_getInstance_0) :jm_initDemo_3 @l_abeClientInformation this @l_gameInitializationInterfaceFactoryInterface)
        (JR/invoke (JR/scall 'ResizableListenerHandler :jm_getInstance_0) :jm_fireEvent_1 false)
        (JR/fset this :overlayPaintable @l_overlayPaintable)
        (JR/fset this :highScoresFactoryInterface @l_highScoresFactoryInterface)
        (JR/invoke this :jm_setDefaultPaintableInterface_1 @l_paintable)
        (JR/invoke this :jm_setPaintableInterface_1 (JR/invoke this :jm_getDefaultPaintableInterface_0))
        (if @l_isContinue
            (do
            (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :CONTINUE_COMMAND))))
        (if (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_isChangedFeature_1 (JR/fget (JR/scall 'GameFeatureFactory :jm_getInstance_0) :SOUND))
            (do
            (JR/invoke this :jm_mediaInit_0)))
        (JR/fset this :demoGameRunnable (DemoGameStartupRunnable/jnew_1 this))
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this))
  this)

(defn jnew_7 [p_abeClientInformation p_commandListener p_highScoresFactoryInterface p_paintable p_overlayPaintable p_gameInitializationInterfaceFactoryInterface p_isContinue ]
  (let [o (JR/alloc 'DemoCanvas)] (jinit_7 o p_abeClientInformation p_commandListener p_highScoresFactoryInterface p_paintable p_overlayPaintable p_gameInitializationInterfaceFactoryInterface p_isContinue) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onDisplayChangeEvent_1 [this p_displayChangeEvent]
  (let [ l_displayChangeEvent (volatile! p_displayChangeEvent) l_scrollSelectionForm (volatile! nil) l_formType (volatile! nil) l_rectangle (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :START_LABEL)) :jm_append_1 (JR/to-string-of (JR/fget this :displayInfo)))) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT))
            (vreset! l_scrollSelectionForm (JR/invoke this :jm_getMenuForm_0))
            (if (some? @l_scrollSelectionForm)
                (do
                (vreset! l_formType (JR/invoke (JR/scall 'FormTypeFactory :jm_getInstance_0) :jm_getFormType_0))
                (vreset! l_rectangle (JR/invoke (JR/fget this :formUtil) :jm_createFormRectangle_0))
                (JR/invoke @l_scrollSelectionForm :jm_init_2 @l_rectangle @l_formType)))
            (JR/invoke (JR/fget this :overlayPaintable) :jm_init_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_getCustomCommands_0 [this]
  (let [ l_gameCommandsFactory (volatile! nil) l_commandList (volatile! nil) l_inApplicationPurchaseFactory (volatile! nil) l_list (volatile! nil) l_isOverScan (volatile! nil) l_e (volatile! nil) l_commandArray (volatile! nil)]
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            (vreset! l_commandArray (JR/afrom "Object" 1 [(JR/fget @l_gameCommandsFactory :START_COMMAND) (JR/fget (JR/scall 'HighScoreCommands :jm_getInstance_0) :DISPLAY) (JR/sget 'GameInputMappingCanvas "DISPLAY") (JR/fget @l_gameCommandsFactory :DISPLAY_ABOUT)]))
            @l_commandArray)
            (do
            (vreset! l_commandList (BasicArrayListD/jnew_0))
            (JR/invoke @l_commandList :jm_add_1 (JR/fget @l_gameCommandsFactory :START_COMMAND))
            (vreset! l_inApplicationPurchaseFactory (JR/scall 'InApplicationPurchaseFactory :jm_getInstance_0))
            (if (JR/invoke @l_inApplicationPurchaseFactory :jm_isEnabled_0)
                (do
                (vreset! l_list (JR/invoke (JR/scall 'LockableFeatureFactory :jm_getInstance_0) :jm_getList_0))
                (if (and (> (JR/invoke @l_list :jm_size_0) 0) (not (JR/invoke @l_inApplicationPurchaseFactory :jm_isPurchased_1 (JR/invoke @l_list :jm_get_1 0))))
                    (do
                    (JR/invoke @l_commandList :jm_add_1 (JR/fget @l_gameCommandsFactory :BUY_COMMAND))))))
            (JR/invoke @l_commandList :jm_add_1 (JR/fget (JR/scall 'HighScoreCommands :jm_getInstance_0) :DISPLAY))
            (try (do
                (vreset! l_isOverScan (JR/invoke (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0) :jm_isOverScan_0))
                (if (JR/sget 'SWTUtil "isSWT")
                    (do
                    (JR/invoke @l_commandList :jm_add_1 (JR/sget 'GameInputMappingCanvas "DISPLAY")))
                    (if (not @l_isOverScan)
                    (do
                    (JR/invoke @l_commandList :jm_add_1 (JR/fget @l_gameCommandsFactory :DISPLAY_OPTIONS))
                    (JR/invoke @l_commandList :jm_add_1 (JR/fget @l_gameCommandsFactory :DISPLAY_LOAD_FORM))
                    (JR/invoke @l_commandList :jm_add_1 (JR/sget 'GameInputMappingCanvas "DISPLAY"))))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                nil) :else (throw jt)))))
            (JR/invoke @l_commandList :jm_add_1 (JR/fget @l_gameCommandsFactory :DISPLAY_ABOUT))
            (vreset! l_commandArray (JR/invoke @l_commandList :jm_toArray_0))
            @l_commandArray))))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener) l_commandArray (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke this :jm_removeAllCommands_0)
        (vreset! l_commandArray (JR/invoke this :jm_getCustomCommands_0))
        (vreset! l_size (JR/alen @l_commandArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke this :jm_addCommand_1 (JR/aget* @l_commandArray @l_index))))
        (JR/scall 'CustomGameMenuUtil :jm_add_1 this)
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_initPostPaint_0 [this]
  (let []
        nil))

    
(defn jm_mediaInit_0 [this]
  (let []
        (JR/scall 'AllBinaryMediaManager :jm_init_1 (JR/scall 'EarlySoundsFactory :jm_getInstance_0))))

    
(defn jm_itemStateChanged_1 [this p_item]
  (let [ l_item (volatile! p_item)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)))

    
(defn jm_initMenu_0 [this]
  (let [ l_commandTextItemArrayFactory (volatile! nil) l_items (volatile! nil) l_formType (volatile! nil) l_rectangle (volatile! nil) l_scrollSelectionForm (volatile! nil) l_formType2 (volatile! nil) l_rectangle2 (volatile! nil)]
        (JR/invoke this :jm_close_0)
        (vreset! l_commandTextItemArrayFactory (JR/invoke (JR/scall 'DemoLimitedCommandTextItemArrayFactory :jm_getInstance_0) :jm_getCommandTextItemArrayFactory_0))
        (vreset! l_items (JR/invoke @l_commandTextItemArrayFactory :jm_getInstance_3 (JR/invoke this :jm_getCommandStack_0) (JR/fget (JR/fget this :basicColorFactory) :BLACK) (JR/fget (JR/fget this :basicColorFactory) :WHITE)))
        (vreset! l_formType (JR/invoke (JR/scall 'FormTypeFactory :jm_getInstance_0) :jm_getFormType_0))
        (vreset! l_rectangle (JR/invoke (JR/fget this :formUtil) :jm_createFormRectangle_0))
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :START_LABEL)) :jm_append_1 (JR/to-string-of (JR/fget this :displayInfo)))) this "initMenu")
        (vreset! l_scrollSelectionForm (JR/scall 'CommandCurrentSelectionFormFactory :jm_getInstance_8 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) @l_items @l_rectangle @l_formType 15 true (JR/fget (JR/fget this :basicColorFactory) :BLACK) (JR/fget (JR/fget this :basicColorFactory) :WHITE)))
        (JR/invoke this :jm_setMenuForm_1 @l_scrollSelectionForm)
        (vreset! l_formType2 (JR/invoke (JR/scall 'FormTypeFactory :jm_getInstance_0) :jm_getFormType_0))
        (vreset! l_rectangle2 (JR/invoke (JR/fget this :formUtil) :jm_createFormRectangle_0))
        (JR/invoke @l_scrollSelectionForm :jm_init_2 @l_rectangle2 @l_formType2)
        (if (not (JR/eq (JR/invoke this :jm_getMenuForm_0) (JR/scall 'ScrollSelectionFormNoneFactory :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_setMenuInputProcessor_1 (CommandFormInputProcessor/jnew_4 (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1))) this (JR/invoke this :jm_getMenuForm_0)))))
        (JR/invoke this :jm_open_0)))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0) :jm_addListenerInterface_1 (JR/invoke this :jm_getMenuInputProcessor_0))
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_addListener_1 (JR/invoke this :jm_getMenuInputProcessor_0))))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0) :jm_removeListener_1 (JR/invoke this :jm_getMenuInputProcessor_0))
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_removeListener_1 (JR/invoke this :jm_getMenuInputProcessor_0))))

    
(defn jm_getSourceId_0 [this]
  (let []
        (DemoCanvas/jstatic_id)))

    
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
        (JR/invoke this :jm_addGameKeyEvent_2 @l_keyCode false)))

    
(defn jm_keyReleasedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (JR/invoke this :jm_removeGameKeyEvent_2 @l_keyCode false)))

    
(defn jm_keyRepeatedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (if (JR/fget this :isSingleKeyRepeatableProcessing)
            (do
            (JR/invoke this :jm_addGameKeyEvent_2 @l_keyCode true)))))

    
(defn jm_addGameKeyEvent_2 [this p_keyCode p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_repeated (volatile! p_repeated) l_gameKey (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 this @l_keyCode))
            (if (not (JR/eq @l_gameKey (JR/fget this :NONE)))
                (do
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 this @l_gameKey))
                (JR/invoke (JR/scall 'DownGameKeyEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_gameKeyEvent))
                (do
                (if (not (== (JR/fget this :lastKeyNotMapped) @l_keyCode))
                    (do
                    (JR/fset this :lastKeyNotMapped @l_keyCode)
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :NO_KEY)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT)))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_removeGameKeyEvent_2 [this p_keyCode p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_repeated (volatile! p_repeated) l_gameKey (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 this @l_keyCode))
            (if (not (JR/eq @l_gameKey (JR/fget this :NONE)))
                (do
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 this @l_gameKey))
                (JR/invoke (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0) :jm_fireEvent_1 @l_gameKeyEvent))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :NO_KEY)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :REMOVE_KEY_EVENT)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :REMOVE_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_pause_0 [this]
  (let []
        (JR/invoke this :jm_close_0)
        (JR/invoke this :jm_setPaused_1 true)
        (JR/fset this :gameRunnable (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
        (JR/invoke (JR/fget this :gameCanvas) :jm_pause_0)))

    
(defn jm_unPause_0 [this]
  (let []
        (JR/invoke this :jm_open_0)
        (JR/invoke (JR/fget this :gameCanvas) :jm_unPause_0)
        (JR/fset this :gameRunnable (JR/fget (JR/fget this :gameCanvas) :gameRunnable))
        (JR/invoke this :jm_setPaused_1 false)))

    
(defn jm_isPausable_0 [this]
  (let []
        (if (JR/eq (JR/invoke (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0) :jm_getUsedRunnable_0) (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
            (do
            true)
            (do
            false))))

    
(defn jm_isGameOver_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)) :jm_append_1 " since not a game")) this "isGameOver")
        false))

    
(defn jm_setLoadStateHashtable_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Trying to continue a demo lol - only continue a game canvas not the demo" this "setLoadStateHashtable")))

    
(defn jm_getLoadStateHashtable_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Trying to continue a demo lol - only continue a game canvas not the demo" this "getLoadStateHashtable")
        (JR/fget (JR/fget this :stdUtil) :NULL_TABLE)))

    
(defn jm_getCurrentStateHashtable_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Trying to save the AI lol" this "getCurrentStateHashtable")
        (JR/fget (JR/fget this :stdUtil) :NULL_TABLE)))

    
(defn jm_setHighScoreSubmitted_1 [this p_isNotUsed]
  (let [ l_isNotUsed (volatile! p_isNotUsed)]
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :paintableInterface) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :paintedSpecialAnimationInterface) :jm_paintXY_3 @l_graphics 0 0)
        (JR/invoke (JR/fget this :highScoresPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/invoke this :jm_getBasicGameDemoPaintable_0) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :overlayPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :fullscreenPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :progressPaintable) :jm_paint_1 @l_graphics)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :paintableInterface) :jm_paintThreed_1 @l_graphics)
        (JR/invoke (JR/fget this :paintedSpecialAnimationInterface) :jm_paintThreedXYZ_4 @l_graphics 0 0 0)))

    
(defn jm_processGameOver_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Not Implemented since not a game" this "setGameOver")))

    
(defn jm_demoStateChange_0 [this]
  (let [ l_newState (volatile! nil) l_highScores (volatile! nil)]
        (vreset! l_newState (unchecked-int (unchecked-add (JR/fget this :state) 1)))
        (if (> @l_newState 2)
            (do
            (vreset! l_newState 0))
            (if (== @l_newState 2)
            (do
            (if (not (JR/invoke (JR/fget this :highScoresHelper) :jm_isAnyHighScores_0))
                (do
                (vreset! l_newState 0))
                (do
                (vreset! l_highScores (JR/invoke (JR/fget this :highScoresHelper) :jm_getNextHighScores_0))
                (if (JR/eq @l_highScores (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0))
                    (do
                    (vreset! l_newState 0))
                    (do
                    (JR/invoke (JR/invoke this :jm_getRealHighScoresPaintable_0) :jm_setHighScores_1 @l_highScores))))))))
        (JR/invoke this :jm_setState_1 @l_newState)
        (JR/invoke this :jm_updateDemoState_0)))

    
(defn jm_updateDemoState_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_createInstance_1 (JR/fget this :state))) this (JR/fget this :SET_STATE))
        (JR/invoke (JR/invoke this :jm_getBasicGameDemoPaintable_0) :jm_setState_1 (JR/fget this :state))
        (if (== (JR/fget this :state) 0)
            (do
            (JR/fset this :highScoresPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
            (JR/fset this :paintedSpecialAnimationInterface (JR/invoke this :jm_getSpecialAnimationInterface_0))
            (if (and (not (JR/invoke (JR/fget this :demoGameRunnable) :jm_isRunning_0)) (JR/invoke (JR/fget this :gameCanvas) :jm_isInitialized_0))
                (do
                (JR/invoke (JR/invoke this :jm_getSpecialAnimationInterface_0) :jm_reset_0))))
            (if (== (JR/fget this :state) 1)
            (do
            (JR/fset this :paintedSpecialAnimationInterface (JR/scall 'SpecialAnimation :jm_getInstance_0)))
            (if (== (JR/fget this :state) 2)
            (do
            (JR/fset this :highScoresPaintable (JR/invoke this :jm_getRealHighScoresPaintable_0))))))
        (vreset! l_gameAdState (JR/invoke (JR/fget this :gameAdStateFactory) :jm_getCurrentInstance_0))
        (JR/invoke @l_gameAdState :jm_processPageAdState_0)))

    
(defn jm_getNextRandom_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_createGameLayerManager_1 [this p_randomValue]
  (let [ l_randomValue (volatile! p_randomValue)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_createRunnable_1 [this p_randomLevel]
  (let [ l_randomLevel (volatile! p_randomLevel)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_create_0 [this]
  (let [ l_randomLevel (volatile! nil) l_gameInfo (volatile! nil)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :commonStrings) :START) this "create")
        (JR/fset this :highScoresPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
        (vreset! l_randomLevel (JR/invoke this :jm_getNextRandom_0))
        (JR/fset this :gameCanvas (JR/invoke this :jm_createRunnable_1 @l_randomLevel))
        (JR/fset this :basicColor (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getLayerManager_0) :jm_getForegroundBasicColor_0))
        (JR/invoke (JR/invoke this :jm_getRealHighScoresPaintable_0) :jm_setBasicColorP_1 (JR/fget this :basicColor))
        (JR/invoke (JR/fget this :gameCanvas) :jm_setGameCanvasStartListener_1 this)
        (vreset! l_gameInfo (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getLayerManager_0) :jm_getGameInfo_0))
        (JR/invoke (JR/invoke this :jm_getHighScoresFactoryInterface_0) :jm_fetchHighScores_2 @l_gameInfo (JR/fget this :highScoresHelper))))

    
(defn jm_start_0 [this]
  (let [ l_gameCanvas (volatile! nil)]
        (vreset! l_gameCanvas (JR/fget this :gameCanvas))
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Game Thread in DemoCanvas: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_gameCanvas))) this (JR/fget (JR/fget this :commonStrings) :START))
        (JR/fset this :canvasThread (JR/invoke (JR/fget this :threadFactoryUtil) :jm_getInstanceGameCanvasRunnable_1 @l_gameCanvas))
        (JR/invoke (JR/fget this :gameCanvas) :jm_setThread_1 (JR/fget this :canvasThread))
        (JR/invoke (JR/fget this :threadFactoryUtil) :jm_start_1 (JR/fget this :canvasThread))
        (if (== (JR/invoke this :jm_getWait_0) (JR/fget (JR/scall 'NullWaitGameRunnable :jm_getInstance_0) :WAIT))
            (do
            (JR/invoke this :jm_setWait_1 (JR/invoke this :jm_getTempWait_0))))))

    
(defn jm_preDemoProcess_0 [this]
  (let []
        (if (or (not (JR/invoke (JR/fget this :gameCanvas) :jm_isInitialized_0)) (JR/eq (JR/invoke (JR/fget this :gameCanvas) :jm_getTitle_0) (JR/sget 'NullGameCanvas "NO_GAME")))
            (do
            (if (JR/scall 'AllBinaryMediaManager :jm_update_0)
                (do
                (if (not (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_process_0))
                    (do
                    (JR/invoke (JR/scall 'SecondaryPlayerQueueFactory :jm_getInstance_0) :jm_process_0)))))))
        (JR/invoke (JR/fget this :overlayPaintable) :jm_update_0)))

    
(defn jm_process_0 [this]
  (let [ l_indexedAnimationBehavior (volatile! nil) l_demoGameMidlet (volatile! nil) l_thread (volatile! nil) l_randomLevel (volatile! nil) l_gameInfo (volatile! nil)]
        (JR/invoke-super 'RunnableCanvas this :jm_process_0)
        (JR/invoke (JR/invoke this :jm_getMenuInputProcessor_0) :jm_processInputList_0)
        (JR/invoke this :jm_preDemoProcess_0)
        (if (== (JR/fget this :state) 0)
            (do
            (vreset! l_indexedAnimationBehavior (JR/invoke (JR/invoke this :jm_getSpecialAnimationInterface_0) :jm_getAnimationBehavior_0))
            (if (< (JR/fget @l_indexedAnimationBehavior :loopIndex) 1)
                (do
                (JR/invoke (JR/fget this :timeDelayHelper) :jm_setStartTimeTNT_0)))
            (vreset! l_demoGameMidlet (JR/invoke this :jm_getCustomCommandListener_0))
            (if (and (not (JR/eq (JR/fget this :gameCanvas) (JR/scall 'NullGameCanvas :jm_getInstance_0))) (JR/invoke (JR/fget this :gameCanvas) :jm_isGameOver_0))
                (do
                (JR/invoke this :jm_stopGameDemo_0)
                (vreset! l_randomLevel (JR/invoke this :jm_getNextRandom_0))
                (vreset! l_gameInfo (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getLayerManager_0) :jm_getGameInfo_0))
                (JR/invoke @l_gameInfo :jm_setCurrentLevel_1 @l_randomLevel)
                (JR/invoke (JR/fget this :gameCanvas) :jm_setGameOver_1 false)
                (JR/invoke this :jm_start_0))
                (if (and (JR/eq (JR/fget this :gameCanvas) (JR/scall 'NullGameCanvas :jm_getInstance_0)) (JR/invoke @l_demoGameMidlet :jm_isReady_0))
                (do
                (if (not (JR/invoke (JR/fget this :demoGameRunnable) :jm_isRunning_0))
                    (do
                    (JR/invoke this :jm_startDemoGame_0)
                    (JR/invoke (JR/fget this :demoGameRunnable) :jm_setRunning_1 true)
                    (vreset! l_thread (JR/invoke (JR/fget this :threadFactoryUtil) :jm_getInstanceForRunnable_1 (JR/fget this :demoGameRunnable)))
                    (JR/invoke (JR/fget this :demoGameRunnable) :jm_setThread_1 @l_thread)
                    (JR/invoke (JR/fget this :threadFactoryUtil) :jm_start_1 @l_thread))))))))))

    
(defn jm_startDemoGame_0 [this]
  (let []
        (JR/scall 'DemoCanvasProgressUtil :jm_showProgress_1 this)))

    
(defn jm_stopGameDemo_0 [this]
  (let []
        (if (not (JR/eq (JR/fget this :gameCanvas) (JR/scall 'NullGameCanvas :jm_getInstance_0)))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Set Running False" this "stopGameDemo")
            (JR/invoke (JR/fget this :gameCanvas) :jm_setRunning_1 false)))
        (JR/invoke (JR/scall 'ThreadUtil :jm_getInstance_0) :jm_join_1 (JR/fget this :canvasThread))))

    
(defn jm_showGamePaintable_0 [this]
  (let [ l_METHOD_NAME (volatile! nil) l_isDefault (volatile! nil)]
        (vreset! l_METHOD_NAME "showGamePaintable")
        (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :commonStrings) :START) this @l_METHOD_NAME)
        (vreset! l_isDefault (JR/scall 'J2MEUtil :jm_isHTML_0))
        (if (and (and (not (JR/eq (JR/fget this :gameCanvas) (JR/scall 'NullGameCanvas :jm_getInstance_0))) (or (or (JR/invoke (JR/fget this :gameCanvas) :jm_isRunning_0) @l_isDefault) (JR/sget 'SWTUtil "isSWT"))) (not (JR/eq (JR/invoke (JR/fget this :gameCanvas) :jm_getType_0) (JR/sget 'NullGameCanvas "TYPE"))))
            (do
            (JR/fset this :gameRunnable (JR/fget (JR/fget this :gameCanvas) :gameRunnable))
            (JR/scall 'PreLogUtil :jm_put_3 "Showing Game" this @l_METHOD_NAME)
            (JR/invoke this :jm_setPaintableInterface_1 (JR/fget this :gameCanvas)))
            (do
            (JR/fset this :gameRunnable (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_put_3 "Not Showing Game" this @l_METHOD_NAME)
            (JR/invoke this :jm_setPaintableInterface_1 (JR/invoke this :jm_getDefaultPaintableInterface_0))))))

    
(defn jm_isReadyForStateChange_0 [this]
  (let []
        (and (not (JR/invoke (JR/fget this :demoGameRunnable) :jm_isRunning_0)) (JR/invoke (JR/fget this :gameCanvas) :jm_isInitialized_0))))

    
(defn jm_processGame_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameRunnable) :jm_run_0)
        (if (and (not (JR/invoke (JR/fget this :specialAnimationInterface) :jm_isComplete_0)) (JR/invoke this :jm_isReadyForStateChange_0))
            (do
            (JR/invoke (JR/fget this :specialAnimationInterface) :jm_nextFrame_0)))
        (if (and (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTimeTNT_0) (JR/invoke this :jm_isReadyForStateChange_0))
            (do
            (JR/invoke this :jm_demoStateChange_0))
            (do
            (JR/invoke this :jm_process_0)))))

    
(defn jm_run_0 [this]
  (let [ l_progressCanvas (volatile! nil) l_features (volatile! nil) l_openGLFeatureFactory (volatile! nil) l_demoGameRunnable (volatile! nil) l_currentDisplayableFactory (volatile! nil) l_e (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
        (try (do
            (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Demo Thread")
            (JR/invoke this :jm_setCurrentThread_0)
            (JR/invoke this :jm_setRunning_1 true)
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :LOAD_ONDEMAND))
                (do
                (JR/invoke @l_progressCanvas :jm_end_0))
                (do
                (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Demo Thread Running")))
            (JR/invoke (JR/fget this :fullScreenUtil) :jm_initOnRun_2 this (JR/invoke this :jm_getCustomCommandListener_0))
            (JR/invoke this :jm_initMenu_0)
            (JR/invoke this :jm_initPostPaint_0)
            (JR/invoke this :jm_updateDemoState_0)
            (if (JR/invoke @l_features :jm_isDefault_1 (JR/fget @l_openGLFeatureFactory :OPENGL_AS_GAME_THREAD))
                (do
                (JR/jwhile false false (or (JR/eq (JR/fget this :gameCanvas) (JR/scall 'NullGameCanvas :jm_getInstance_0)) (not (JR/invoke (JR/fget this :gameCanvas) :jm_isInitialized_0)))
                    (JR/invoke (JR/fget this :loopTimeHelper) :jm_setStartTimeTNT_0)
                    (JR/invoke this :jm_processGame_0)
                    (JR/invoke this :jm_processLoopSleep_0))
                (vreset! l_demoGameRunnable (DemoGameRunnable/jnew_1 this))
                (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
                (JR/invoke @l_currentDisplayableFactory :jm_setRunnable_1 @l_demoGameRunnable)
                (JR/invoke @l_currentDisplayableFactory :jm_setMyCanvas_1 this)
                (JR/invoke (JR/scall 'OpenGLThreadUtil :jm_getInstance_0) :jm_onResume_0)))
            (if (or (JR/invoke @l_features :jm_isDefault_1 (JR/fget @l_openGLFeatureFactory :OPENGL_AS_GAME_THREAD)) (JR/scall 'J2MEUtil :jm_isHTML_0))
                (do
                (vreset! l_demoGameRunnable (DemoGameRunnable/jnew_1 this))
                (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
                (JR/invoke @l_currentDisplayableFactory :jm_setRunnable_1 @l_demoGameRunnable)
                (JR/invoke @l_currentDisplayableFactory :jm_setMyCanvas_1 this))
                (do
                (JR/jwhile false false (JR/invoke this :jm_isRunning_0)
                    (JR/invoke this :jm_run3_0))
                (JR/invoke this :jm_end_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))))

    
(defn jm_run3_0 [this]
  (let []
        (JR/invoke (JR/fget this :loopTimeHelper) :jm_setStartTimeTNT_0)
        (JR/invoke this :jm_processGame_0)
        (JR/invoke this :jm_processLoopSleep_0)))

    
(defn jm_setRunning_1 [this p_running]
  (let [ l_running (volatile! p_running) l_features (volatile! nil) l_openGLFeatureFactory (volatile! nil) l_currentDisplayableFactory (volatile! nil) l_e (volatile! nil)]
        (JR/invoke-super 'RunnableCanvas this :jm_setRunning_1 @l_running)
        (try (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
            (if @l_running
                (do
                nil)
                (do
                (if (or (or (JR/invoke @l_features :jm_isDefault_1 (JR/fget @l_openGLFeatureFactory :OPENGL)) (JR/scall 'J2MEUtil :jm_isHTML_0)) (JR/sget 'SWTUtil "isSWT"))
                    (do
                    (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
                    (JR/invoke @l_currentDisplayableFactory :jm_clearRunnable_0)
                    (JR/invoke this :jm_end_0))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget this :SET_RUNNING) @l_e)) :else (throw jt)))))))

    
(defn jm_end_0 [this]
  (let [ l_progressCanvas (volatile! nil) l_features (volatile! nil)]
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_add_1 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (DemoCanvas/jstatic_BOT_GAME_STATS)) :jm_append_1 (JR/to-string-of (JR/fget this :baseGameStatistics))) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))))
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_init_0)
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :LOAD_ONDEMAND))
            (do
            (JR/invoke @l_progressCanvas :jm_start_0)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Demo End" this (JR/fget (JR/fget this :commonStrings) :RUN))
        (JR/invoke this :jm_close_0)
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_removeListener_1 this)
        (JR/invoke this :jm_stopGameDemo_0)))

    
(defn jm_setGameState_1 [this p_gameState]
  (let [ l_gameState (volatile! p_gameState)]
        nil))

    
(defn jm_getGameState_0 [this]
  (let []
        (JR/fget (JR/fget this :gameStateFactory) :PLAYING_GAME_STATE)))

    
(defn jm_getGameCanvasRunnableInterface_0 [this]
  (let []
        (JR/fget this :gameCanvas)))

    
(defn jm_isDemoLoading_0 [this]
  (let [ l_gameCanvas (volatile! nil)](JR/method
        (vreset! l_gameCanvas (JR/fget this :gameCanvas))
        (if (JR/eq @l_gameCanvas (JR/scall 'NullGameCanvas :jm_getInstance_0))
            (do
            (JR/jreturn true))
            (if (JR/invoke @l_gameCanvas :jm_isInitialized_0)
            (do
            (JR/jreturn false))))
        true)))

    
(defn jm_getState_0 [this]
  (let []
        (JR/fget this :state)))

    
(defn jm_setState_1 [this p_state]
  (let [ l_state (volatile! p_state)]
        (JR/fset this :state @l_state)))

    
(defn jm_isHighScoreSubmitted_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Wow the AI got a high score!" this "isHighScoreSubmitted")
        false))

    
(defn jm_getRealHighScoresPaintable_0 [this]
  (let []
        (JR/fget this :realHighScoresPaintable)))

    
(defn jm_setSpecialAnimationInterface_1 [this p_specialAnimationInterface]
  (let [ l_specialAnimationInterface (volatile! p_specialAnimationInterface)]
        (JR/invoke @l_specialAnimationInterface :jm_setFrame_1 0)
        (JR/fset this :specialAnimationInterface @l_specialAnimationInterface)))

    
(defn jm_getSpecialAnimationInterface_0 [this]
  (let []
        (JR/fget this :specialAnimationInterface)))

    
(defn jm_setPaintableInterface_1 [this p_paintableInterface]
  (let [ l_paintableInterface (volatile! p_paintableInterface)]
        (JR/fset this :paintableInterface @l_paintableInterface)))

    
(defn jm_getPaintableInterface_0 [this]
  (let []
        (JR/fget this :paintableInterface)))

    
(defn jm_setDefaultPaintableInterface_1 [this p_defaultPaintableInterface]
  (let [ l_defaultPaintableInterface (volatile! p_defaultPaintableInterface)]
        (JR/fset this :defaultPaintableInterface @l_defaultPaintableInterface)))

    
(defn jm_getDefaultPaintableInterface_0 [this]
  (let []
        (JR/fget this :defaultPaintableInterface)))

    
(defn jm_getHighScoresFactoryInterface_0 [this]
  (let []
        (JR/fget this :highScoresFactoryInterface)))

    
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

    
(defn jm_isInitialized_0 [this]
  (let []
        (JR/fget this :initialized)))

    
(defn jm_getOverlayPaintable_0 [this]
  (let []
        (JR/fget this :overlayPaintable)))

    
(defn jm_setBasicGameDemoPaintable_1 [this p_basicGameDemoPaintable]
  (let [ l_basicGameDemoPaintable (volatile! p_basicGameDemoPaintable)]
        (JR/fset this :basicGameDemoPaintable @l_basicGameDemoPaintable)))

    
(defn jm_getBasicGameDemoPaintable_0 [this]
  (let []
        (JR/fget this :basicGameDemoPaintable)))

    
(defn jm_setTempWait_1 [this p_tempWait]
  (let [ l_tempWait (volatile! p_tempWait)]
        (JR/fset this :tempWait @l_tempWait)))

    
(defn jm_getTempWait_0 [this]
  (let []
        (JR/fget this :tempWait)))

    
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

    
(defn jm_getGameInitializationInterfaceFactoryInterface_0 [this]
  (let []
        (JR/fget this :gameInitializationInterfaceFactoryInterface)))

    
(defn jm_getType_0 [this]
  (let []
        (DemoCanvas/jstatic_TYPE)))

    
(defn jm_getTitle_0 [this]
  (let []
        (JR/invoke-super 'RunnableCanvas this :jm_getTitle_0)))

    
(defn jm_isPaused_0 [this]
  (let []
        (JR/invoke-super 'RunnableCanvas this :jm_isPaused_0)))



