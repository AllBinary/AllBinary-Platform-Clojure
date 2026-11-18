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

(ns GameCommandCanvas)

(JR/register 'GameCommandCanvas 'MyCanvas '[MenuListener DisplayChangeEventListener UpdateMyFontInterface])

(def jsv_id (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_id [] (JR/ensure-init jclinit-state jclinit) @jsv_id)
(defn jstatic_set_id [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_id v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_id 0)
    nil))

(defn jinitfields [this]
  (JR/fset this :repaintProcessor nil)
  (JR/fset this :gameInputStrings nil)
  (JR/fset this :foregroundBasicColor nil)
  (JR/fset this :backgroundBasicColor nil)
  (JR/fset this :inputToGameKeyMapping nil)
  (JR/fset this :gameKeyFactory nil)
  (JR/fset this :gameKeyEventFactory nil)
  (JR/fset this :downGameKeyEventHandler nil)
  (JR/fset this :upGameKeyEventHandler nil)
  (JR/fset this :repaintBehavior nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :foregroundColor 0)
  (JR/fset this :backgroundColor 0)
  (JR/fset this :menuInputProcessor nil)
  (JR/fset this :menuPaintable nil)
  (JR/fset this :menuForm nil)
  (JR/fset this :isSingleKeyRepeatableProcessing false)
  (JR/fset this :fontHeight 0)
    (JR/fset this :repaintProcessor (JR/invoke (JR/scall 'ScreenRepaintProcessorFactory :jm_getInstance_0) :jm_create_1 this))
    (JR/fset this :gameInputStrings (JR/scall 'GameInputStrings :jm_getInstance_0))
    (JR/fset this :inputToGameKeyMapping (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_getInputMapping_0))
    (JR/fset this :gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
    (JR/fset this :downGameKeyEventHandler (JR/scall 'DownGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :upGameKeyEventHandler (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :menuInputProcessor (JR/scall 'NoMenuInputProcessor :jm_getInstance_0))
    (JR/fset this :menuPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :menuForm (JR/scall 'PaintableForm :jm_getNullPaintableForm_0))
    (JR/fset this :isSingleKeyRepeatableProcessing (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'InputFeatureFactory :jm_getInstance_0) :SINGLE_KEY_REPEAT_PRESS)))
    (JR/fset this :fontHeight 0)
  this)

    
(defn jinit_4 [this p_cmdListener p_name p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_cmdListener (volatile! p_cmdListener) l_name (volatile! p_name) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_e (volatile! nil)]
        (MyCanvas/jinit_2 this @l_name (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :EMPTY_CHILD_NAME_LIST)) (jinitfields this)
        (JR/fset this :repaintBehavior (JR/scall 'RepaintBehavior :jm_getInstance_0))
        (JR/fset this :foregroundBasicColor @l_foregroundBasicColor)
        (JR/fset this :backgroundBasicColor @l_backgroundBasicColor)
        (JR/fset this :foregroundColor (JR/invoke (JR/fget this :foregroundBasicColor) :jm_intValue_0))
        (JR/fset this :backgroundColor (JR/invoke (JR/fget this :backgroundBasicColor) :jm_intValue_0))
        (JR/invoke this :jm_initCommands_1 @l_cmdListener)
        (if (not (JR/eq @l_cmdListener (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER")))
            (do
            (try (do
                (JR/invoke this :jm_initMenu_0)
                (JR/invoke (JR/fget this :repaintProcessor) :jm_process_0))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/jthrow (new java.lang.RuntimeException))) :else (throw jt))))))))
  this)

(defn jnew_4 [p_cmdListener p_name p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'GameCommandCanvas)] (jinit_4 o p_cmdListener p_name p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_rectangle (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_append_1 (JR/fget (JR/fget this :canvasStrings) :FD_WIDTH)) :jm_appendint_1 (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font)) :jm_append_1 (JR/fget (JR/fget this :canvasStrings) :FD_HEIGHT)) :jm_appendint_1 (JR/invoke @l_font :jm_getHeight_0))) this (JR/fget (JR/fget this :canvasStrings) :UPDATE_MEASUREMENT))
            (JR/fset this :fontHeight (JR/invoke @l_font :jm_getHeight_0))
            (vreset! l_rectangle (JR/invoke this :jm_createRectangle_1 (JR/invoke (JR/fget this :menuForm) :jm_size_0)))
            (JR/invoke (JR/fget this :menuForm) :jm_init_2 @l_rectangle (JR/fget (JR/scall 'FormTypeFactory :jm_getInstance_0) :VERTICAL_CENTER_FORM))
            (JR/invoke this :jm_update_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT) @l_e)) :else (throw jt)))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onDisplayChangeEvent_1 [this p_displayChangeEvent]
  (let [ l_displayChangeEvent (volatile! p_displayChangeEvent)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_append_1 (JR/to-string-of (JR/scall 'DisplayInfoSingleton :jm_getInstance_0)))) this (JR/fget (JR/fget this :canvasStrings) :ON_DISPLAY_CHANGE_EVENT))
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :CLOSE_AND_SHOW_GAME_CANVAS))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_initMenu_0 [this]
  (let [ l_form (volatile! nil)]
        (vreset! l_form (JR/invoke this :jm_createForm_0))
        (JR/fset this :menuForm @l_form)
        (if (not (JR/eq @l_form (JR/scall 'ScrollSelectionFormNoneFactory :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_setMenuInputProcessor_1 (ImmediateCommandFormInputProcessor/jnew_4 (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1))) this @l_form))
            (JR/fset this :menuPaintable (FormPaintable/jnew_1 @l_form))))
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))

    
(defn jm_createForm_0 [this]
  (let [ l_items (volatile! nil) l_rectangle (volatile! nil)]
        (vreset! l_items (JR/invoke (CommandTextItemArrayFactory/jnew_1 (AllCommandsVisitor/jnew_0)) :jm_getInstance_3 (JR/invoke this :jm_getCommandStack_0) (JR/fget this :backgroundBasicColor) (JR/fget this :foregroundBasicColor)))
        (vreset! l_rectangle (JR/invoke this :jm_createRectangle_1 (JR/alen @l_items)))
        (JR/scall 'CommandCurrentSelectionFormFactory :jm_getInstance_8 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) @l_items @l_rectangle (JR/fget (JR/scall 'FormTypeFactory :jm_getInstance_0) :VERTICAL_CENTER_FORM) 15 false (JR/fget this :backgroundBasicColor) (JR/fget this :foregroundBasicColor))))

    
(defn jm_createRectangle_1 [this p_size]
  (let [ l_size (volatile! p_size) l_height (volatile! nil) l_startY (volatile! nil) l_pointFactory (volatile! nil) l_rectangle (volatile! nil)]
        (vreset! l_height (unchecked-int (unchecked-multiply @l_size (JR/fget this :fontHeight))))
        (vreset! l_startY (unchecked-int (unchecked-subtract (JR/idiv (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :displayInfo) :jm_getLastHeight_0) 2)) 3) @l_height)))
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_rectangle (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 30 @l_startY) (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) 30)) @l_startY))
        @l_rectangle))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "open")
        (JR/invoke (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0) :jm_addListenerInterface_1 (JR/invoke this :jm_getMenuInputProcessor_0))
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_addListener_1 (JR/invoke this :jm_getMenuInputProcessor_0))
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CLOSE))
        (JR/invoke (JR/scall 'BasicMotionGesturesHandler :jm_getInstance_0) :jm_removeListener_1 (JR/invoke this :jm_getMenuInputProcessor_0))
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_removeListener_1 (JR/invoke this :jm_getMenuInputProcessor_0))
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_removeListener_1 this)))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke (JR/fget this :repaintProcessor) :jm_process_0)))

    
(defn jm_getSourceId_0 [this]
  (let []
        (GameCommandCanvas/jstatic_id)))

    
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
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :KEY_PRESSED))
        (JR/invoke this :jm_addGameKeyEvent_3 @l_keyCode 0 false)))

    
(defn jm_keyReleasedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (JR/invoke this :jm_removeGameKeyEvent_3 @l_keyCode @l_deviceId false)))

    
(defn jm_keyRepeatedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (if (JR/fget this :isSingleKeyRepeatableProcessing)
            (do
            (JR/invoke this :jm_addGameKeyEvent_3 @l_keyCode @l_deviceId true)))))

    
(defn jm_addGameKeyEvent_3 [this p_keyCode p_deviceId p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated) l_gameKey (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 this @l_keyCode))
            (if (not (JR/eq @l_gameKey (JR/fget (JR/fget this :gameKeyFactory) :NONE)))
                (do
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 this @l_gameKey))
                (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
                (JR/invoke (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :NO_KEY)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_removeGameKeyEvent_3 [this p_keyCode p_deviceId p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated) l_gameKey (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 this @l_keyCode))
            (if (not (JR/eq @l_gameKey (JR/fget (JR/fget this :gameKeyFactory) :NONE)))
                (do
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 this @l_gameKey))
                (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
                (JR/invoke (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :NO_KEY)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :REMOVE_KEY_EVENT)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :REMOVE_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :menuPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :repaintBehavior) :jm_repaint_1 this)))

    
(defn jm_setMenuInputProcessor_1 [this p_menuInputProcessor]
  (let [ l_menuInputProcessor (volatile! p_menuInputProcessor)]
        (JR/fset this :menuInputProcessor @l_menuInputProcessor)))

    
(defn jm_getMenuInputProcessor_0 [this]
  (let []
        (JR/fget this :menuInputProcessor)))



