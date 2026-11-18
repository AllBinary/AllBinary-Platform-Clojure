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

(ns GameInputMappingInstructionsCanvas)

(JR/register 'GameInputMappingInstructionsCanvas 'GameCommandCanvas '[])

(def jsv_DISPLAY (atom nil))
(def jsv_CLOSE (atom nil))
(def jsv_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_DISPLAY [] (JR/ensure-init jclinit-state jclinit) @jsv_DISPLAY)
(defn jstatic_set_DISPLAY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DISPLAY v))
(defn jstatic_CLOSE [] (JR/ensure-init jclinit-state jclinit) @jsv_CLOSE)
(defn jstatic_set_CLOSE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_CLOSE v))
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_DISPLAY (Command/jnew_4 "Help" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (reset! jsv_CLOSE (Command/jnew_4 "Close" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (reset! jsv_NAME "GameInputMappingInstructionsCanvas")
    nil))

(defn jinitfields [this]
  (JR/fset this :drawStringUtil nil)
  (JR/fset this :TITLE nil)
  (JR/fset this :instructions nil)
  (JR/fset this :colorFillPaintable nil)
  (JR/fset this :anchor 0)
    (JR/fset this :drawStringUtil (JR/scall 'DrawStringUtil :jm_getInstance_0))
    (JR/fset this :TITLE "Input Instructions")
    (JR/fset this :instructions (JR/afrom "String" 1 ["Add Input Mapping:" "1. Select the desired action by generating a currently defined input for a given action." "(Example: Press the '1' key to select the Fire action)" "2. Make the newly desired input for the selected action." "(Example: Press 'f' to add it to the selected action)" "Note: If the input is already mapped to another action then it will not be added. You" "will need to deleted from the other action before adding it to another." "Warning: Not all keys map for a given platform and show as Unknown." (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) "Remove Input Mapping:" "1. Select the desired action by generating a currently defined input for a given action." "(Example: Press the key '1' to select the Fire action)" "2. Select a mapped input for the selected action." "(Example: Press the key '1' to select the '1' key input for the selected Fire action)" "3. Press the Delete Key."]))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_2 [this p_commandListener p_allBinaryGameLayerManager]
  (let [ l_commandListener (volatile! p_commandListener) l_allBinaryGameLayerManager (volatile! p_allBinaryGameLayerManager)]
        (GameCommandCanvas/jinit_4 this @l_commandListener (GameInputMappingInstructionsCanvas/jstatic_NAME) (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_allBinaryGameLayerManager :jm_getForegroundBasicColor_0)) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :colorFillPaintable (JR/invoke (JR/scall 'ColorFillPaintableFactory :jm_getInstance_0) :jm_getInstance_2 (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) false)))
  this)

(defn jnew_2 [p_commandListener p_allBinaryGameLayerManager ]
  (let [o (JR/alloc 'GameInputMappingInstructionsCanvas)] (jinit_2 o p_commandListener p_allBinaryGameLayerManager) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (GameInputMappingInstructionsCanvas/jstatic_CLOSE))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_halfWidth (volatile! nil) l_beginWidth (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_paint_1 @l_graphics)
        (vreset! l_halfWidth (JR/invoke (JR/fget this :displayInfo) :jm_getLastHalfWidth_0))
        (vreset! l_beginWidth (JR/ishr (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/fget this :TITLE)) 1))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :foregroundColor))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :TITLE) (unchecked-int (unchecked-subtract @l_halfWidth @l_beginWidth)) (JR/fget this :fontHeight) (JR/fget this :anchor))
        (JR/invoke (JR/fget this :drawStringUtil) :jm_drawCenterStrings_6 @l_graphics (JR/fget this :instructions) (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) (JR/fget this :fontHeight) @l_halfWidth (* 3 (JR/fget this :fontHeight)))
        (JR/invoke-super 'GameCommandCanvas this :jm_paint_1 @l_graphics)))



