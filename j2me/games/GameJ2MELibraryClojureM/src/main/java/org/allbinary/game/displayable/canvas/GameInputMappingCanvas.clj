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

(ns GameInputMappingCanvas)

(JR/register 'GameInputMappingCanvas 'GameCommandCanvas '[InputMappingInterface])

(def jsv_NAME (atom nil))
(def jsv_DISPLAY (atom nil))
(def jsv_DEFAULT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))
(defn jstatic_DISPLAY [] (JR/ensure-init jclinit-state jclinit) @jsv_DISPLAY)
(defn jstatic_set_DISPLAY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DISPLAY v))
(defn jstatic_DEFAULT [] (JR/ensure-init jclinit-state jclinit) @jsv_DEFAULT)
(defn jstatic_set_DEFAULT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DEFAULT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NAME "GameInputMappingCanvas")
    (reset! jsv_DISPLAY (Command/jnew_4 "Controls" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 2))
    (reset! jsv_DEFAULT (Command/jnew_4 "Default" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 2))
    nil))

(defn jinitfields [this]
  (JR/fset this :paintable nil)
  (JR/fset this :helpPaintable nil)
  (JR/fset this :colorFillPaintable nil)
  (JR/fset this :inputMapping nil)
  (JR/fset this :NONE nil)
  (JR/fset this :abeClientInformation nil)
  (JR/fset this :selectedGameKey nil)
  (JR/fset this :selectedInput nil)
  (JR/fset this :inputFactory nil)
    (JR/fset this :NONE (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :NONE))
    (JR/fset this :selectedGameKey (JR/fget this :NONE))
    (JR/fset this :selectedInput (JR/fget this :NONE))
    (JR/fset this :inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_abeClientInformation p_commandListener p_allBinaryGameLayerManager p_helpPaintable]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_commandListener (volatile! p_commandListener) l_allBinaryGameLayerManager (volatile! p_allBinaryGameLayerManager) l_helpPaintable (volatile! p_helpPaintable)]
        (GameCommandCanvas/jinit_4 this @l_commandListener (GameInputMappingCanvas/jstatic_NAME) (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_allBinaryGameLayerManager :jm_getForegroundBasicColor_0)) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (if (nil? @l_helpPaintable)
            (do
            (JR/jthrow (new java.lang.Exception "Help Paintable Exception"))))
        (JR/fset this :abeClientInformation @l_abeClientInformation)
        (JR/fset this :helpPaintable @l_helpPaintable)
        (JR/fset this :inputMapping (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0))
        (JR/fset this :paintable (ProcessPaintable/jnew_0))
        (JR/fset this :colorFillPaintable (JR/invoke (JR/scall 'ColorFillPaintableFactory :jm_getInstance_0) :jm_getInstance_2 (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) false)))
  this)

(defn jnew_4 [p_abeClientInformation p_commandListener p_allBinaryGameLayerManager p_helpPaintable ]
  (let [o (JR/alloc 'GameInputMappingCanvas)] (jinit_4 o p_abeClientInformation p_commandListener p_allBinaryGameLayerManager p_helpPaintable) o))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke-super 'GameCommandCanvas this :jm_close_0)
        (JR/invoke (JR/fget this :paintable) :jm_process_0)
        (JR/fset this :selectedGameKey (JR/fget this :NONE))
        (JR/fset this :selectedInput (JR/fget this :NONE))
        (JR/invoke this :jm_update_0)))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :CLOSE_AND_SHOW_GAME_CANVAS))
        (JR/invoke this :jm_addCommand_1 (GameInputMappingCanvas/jstatic_DEFAULT))
        (JR/invoke this :jm_addCommand_1 (JR/sget 'GameInputMappingInstructionsCanvas "DISPLAY"))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
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
        (JR/invoke this :jm_addGameKey_2 @l_keyCode false)
        (JR/invoke-super 'GameCommandCanvas this :jm_keyPressedByDevice_2 @l_keyCode 0)))

    
(defn jm_addGameKey_2 [this p_keyCode p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_repeated (volatile! p_repeated) l_gameKey (volatile! nil) l_input (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Raw Device Key Code: ") :jm_append_1 (java.lang.Integer/toHexString @l_keyCode))) this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT))
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 this @l_keyCode))
            (vreset! l_input (JR/invoke (JR/fget this :inputFactory) :jm_getInstanceById_1 @l_keyCode))
            (JR/invoke this :jm_processInputMapping_2 @l_gameKey @l_input))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_processInputMapping_2 [this p_gameKey p_input]
  (let [ l_gameKey (volatile! p_gameKey) l_input (volatile! p_input) l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Start Passed GameKey: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_gameKey))
        (JR/invoke @l_stringBuffer :jm_append_1 " Input: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_input))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget (JR/fget this :commonStrings) :PROCESS))
        (if (not (JR/eq (JR/fget this :selectedGameKey) (JR/fget this :NONE)))
            (do
            (JR/invoke this :jm_gameActionCrud_2 @l_gameKey @l_input))
            (do
            (JR/invoke this :jm_setSelectedAction_1 @l_gameKey)))))

    
(defn jm_setSelectedAction_1 [this p_gameKey]
  (let [ l_gameKey (volatile! p_gameKey)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Selected GameKey: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_gameKey))) this "setSelectedAction")
        (JR/fset this :selectedGameKey @l_gameKey)
        (JR/fset this :selectedInput (JR/fget this :NONE))
        (JR/invoke (JR/fget this :helpPaintable) :jm_update_2 (JR/fget this :selectedGameKey) (JR/fget this :selectedInput))
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))

    
(defn jm_gameActionCrud_2 [this p_gameKey p_input]
  (let [ l_gameKey (volatile! p_gameKey) l_input (volatile! p_input) l_stringBuffer (volatile! nil) l_list (volatile! nil) l_isInputAlreadyMappedToSelectedAction (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Start GameKey: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :selectedGameKey)))
        (JR/invoke @l_stringBuffer :jm_append_1 " Input: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :selectedInput)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "gameActionCrud")
        (if (JR/eq (JR/fget this :selectedInput) (JR/fget this :NONE))
            (do
            (vreset! l_list (JR/invoke (JR/invoke (JR/fget this :inputMapping) :jm_getInputMapping_0) :jm_getMappedInput_1 (JR/fget this :selectedGameKey)))
            (vreset! l_isInputAlreadyMappedToSelectedAction (JR/invoke @l_list :jm_contains_1 @l_input))
            (if @l_isInputAlreadyMappedToSelectedAction
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Already Mapped Input: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_input))) this "gameActionCrud")
                (JR/fset this :selectedInput @l_input)
                (JR/invoke (JR/fget this :helpPaintable) :jm_update_2 (JR/fget this :selectedGameKey) (JR/fget this :selectedInput))
                (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this))
                (do
                (JR/invoke this :jm_addNewMapping_2 @l_gameKey @l_input))))
            (if (JR/invoke (JR/fget this :inputMapping) :jm_isDelete_1 @l_input)
            (do
            (JR/invoke this :jm_deleteCurrentMapping_0))
            (do
            (JR/invoke this :jm_setSelectedAction_1 @l_gameKey))))))

    
(defn jm_addNewMapping_2 [this p_gameKey p_input]
  (let [ l_gameKey (volatile! p_gameKey) l_input (volatile! p_input) l_METHOD_NAME (volatile! nil) l_isInputAlreadyMapped (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_METHOD_NAME "addNewMapping")
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this @l_METHOD_NAME)
        (vreset! l_isInputAlreadyMapped (JR/invoke (JR/invoke (JR/fget this :inputMapping) :jm_getInputMapping_0) :jm_isMapped_1 @l_input))
        (if (and (not @l_isInputAlreadyMapped) (not (JR/invoke (JR/fget this :inputMapping) :jm_isSystemInput_1 @l_input)))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "Add Key Mapping : GameKey: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :selectedGameKey)))
            (JR/invoke @l_stringBuffer :jm_append_1 " Input: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :selectedInput)))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
            (JR/invoke (JR/invoke (JR/fget this :inputMapping) :jm_getInputMapping_0) :jm_add_2 (JR/fget this :selectedGameKey) @l_input)
            (JR/fset this :selectedInput @l_input)
            (JR/invoke this :jm_update_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Unable to add Mapping since one already exists or is MENU, HOME, or BACK key and setting selected action to what it is already mapped to" this @l_METHOD_NAME)
            (JR/invoke this :jm_setSelectedAction_1 @l_gameKey)))))

    
(defn jm_deleteCurrentMapping_0 [this]
  (let [ l_METHOD_NAME (volatile! nil) l_list (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_METHOD_NAME "deleteCurrentMapping")
        (vreset! l_list (JR/invoke (JR/invoke (JR/fget this :inputMapping) :jm_getInputMapping_0) :jm_getMappedInput_1 (JR/fget this :selectedGameKey)))
        (if (> (JR/invoke @l_list :jm_size_0) 1)
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "Start GameKey: ")
            (JR/invoke @l_stringBuffer :jm_append_1 "Remove Key Mapping: GameKey: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :selectedGameKey)))
            (JR/invoke @l_stringBuffer :jm_append_1 " Input: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :selectedInput)))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
            (JR/invoke (JR/invoke (JR/fget this :inputMapping) :jm_getInputMapping_0) :jm_remove_2 (JR/fget this :selectedGameKey) (JR/fget this :selectedInput))
            (JR/fset this :selectedInput (JR/fget this :NONE))
            (JR/invoke this :jm_update_0))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Can't Remove Last Key Mapping" this @l_METHOD_NAME)))))

    
(defn jm_setDefault_0 [this]
  (let []
        (JR/invoke (JR/fget this :inputMapping) :jm_setDefault_1 (JR/fget this :abeClientInformation))
        (JR/invoke (JR/fget this :helpPaintable) :jm_update_2 (JR/fget this :NONE) (JR/fget this :NONE))
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke (JR/fget this :inputMapping) :jm_update_1 (JR/fget this :abeClientInformation))
        (JR/invoke (JR/fget this :helpPaintable) :jm_update_2 (JR/fget this :selectedGameKey) (JR/fget this :selectedInput))
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :helpPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :paintable) :jm_paint_1 @l_graphics)
        (JR/invoke-super 'GameCommandCanvas this :jm_paint_1 @l_graphics)))



