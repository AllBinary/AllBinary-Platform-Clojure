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
;; package org.allbinary.graphics.displayable

(ns MyCanvas)

(JR/register 'MyCanvas 'Canvas '[DisplayableInterface MyCommandInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :canvasStrings nil)
  (JR/fset this :stringUtil nil)
  (JR/fset this :displayInfo nil)
  (JR/fset this :name nil)
  (JR/fset this :childNameList nil)
  (JR/fset this :commandStack nil)
  (JR/fset this :commandListener nil)
  (JR/fset this :paused false)
  (JR/fset this :touchME nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
    (JR/fset this :stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
    (JR/fset this :displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :commandListener (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER"))
    (JR/fset this :touchME (TouchJ2ME/jnew_0))
  this)

    
(defn jinit_2 [this p_name p_childNameList]
  (let [ l_name (volatile! p_name) l_childNameList (volatile! p_childNameList)]
    (Canvas/jinit_0 this) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/invoke (JR/fget this :displayInfo) :jm_update_2 this (JR/fget (JR/fget this :canvasStrings) :CONSTRUCTOR))
        (JR/fset this :name @l_name)
        (JR/fset this :childNameList @l_childNameList)
        (JR/fset this :commandStack (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createStack_0)))
  this)

(defn jnew_2 [p_name p_childNameList ]
  (let [o (JR/alloc 'MyCanvas)] (jinit_2 o p_name p_childNameList) o))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/invoke-super 'Canvas this :jm_getWidth_0)))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/invoke-super 'Canvas this :jm_getHeight_0)))

    
(defn jm_setFullScreenMode_1 [this p_mode]
  (let [ l_mode (volatile! p_mode)]
        (JR/invoke-super 'Canvas this :jm_setFullScreenMode_1 @l_mode)
        (JR/invoke (JR/fget this :displayInfo) :jm_update_2 this (JR/fget (JR/fget this :canvasStrings) :SET_FULL_SCREEN_MODE))))

    
(defn jm_sizeChanged_2 [this p_w p_h]
  (let [ l_w (volatile! p_w) l_h (volatile! p_h)]
        (JR/invoke (JR/fget this :displayInfo) :jm_update_2 this (JR/fget (JR/fget this :canvasStrings) :SIZE_CHANGED))))

    
(defn jm_getCommandStack_0 [this]
  (let []
        (JR/fget this :commandStack)))

    
(defn jm_isCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        (JR/invoke (JR/fget this :commandStack) :jm_contains_1 @l_command)))

    
(defn jm_addCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        (if (not (JR/invoke (JR/fget this :commandStack) :jm_contains_1 @l_command))
            (do
            (JR/invoke (JR/fget this :commandStack) :jm_push_1 @l_command)
            (JR/invoke-super 'Canvas this :jm_addCommand_1 @l_command)))))

    
(defn jm_removeCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        (JR/invoke (JR/fget this :commandStack) :jm_removeElement_1 @l_command)
        (JR/invoke-super 'Canvas this :jm_removeCommand_1 @l_command)))

    
(defn jm_removeAllCommands_0 [this]
  (let [ l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :commandStack) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke-super 'Canvas this :jm_removeCommand_1 (JR/invoke (JR/fget this :commandStack) :jm_pop_0))))))

    
(defn jm_setCommandListener_1 [this p_l]
  (let [ l_l (volatile! p_l)]
        (JR/invoke-super 'Canvas this :jm_setCommandListener_1 @l_l)
        (JR/fset this :commandListener @l_l)))

    
(defn jm_getCustomCommandListener_0 [this]
  (let []
        (JR/fget this :commandListener)))

    
(defn jm_isPaused_0 [this]
  (let []
        (JR/fget this :paused)))

    
(defn jm_removePauseCommand_0 [this]
  (let []
        (JR/invoke this :jm_removeCommand_1 (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :PAUSE_COMMAND))))

    
(defn jm_pause_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :canvasStrings) :PAUSE))
        (JR/invoke this :jm_removePauseCommand_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :RESUME_COMMAND))
        (JR/invoke this :jm_setPaused_1 true)))

    
(defn jm_unPause_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :canvasStrings) :UN_PAUSE))
        (JR/invoke this :jm_removeCommand_1 (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :RESUME_COMMAND))
        (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :PAUSE_COMMAND))
        (JR/invoke this :jm_setPaused_1 false)))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/fget this :displayInfo) :jm_process_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_draw_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_hasChild_1 [this p_displayable]
  (let [ l_displayable (volatile! p_displayable)]
        (JR/invoke (JR/fget this :childNameList) :jm_contains_1 (JR/fget @l_displayable :name))))

    
(defn jm_destroy_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Destroyed MyCanvas" this "destroy")))

    
(defn jm_setPaused_1 [this p_isPaused]
  (let [ l_isPaused (volatile! p_isPaused)]
        (JR/fset this :paused @l_isPaused)))

    
(defn jm_keyPressedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        nil))

    
(defn jm_keyRepeatedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        nil))

    
(defn jm_keyReleasedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        nil))

    
(defn jm_pointerDragged_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :touchME) :jm_pointerDragged_2 @l_x @l_y)))

    
(defn jm_pointerPressed_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :touchME) :jm_pointerPressed_2 @l_x @l_y)))

    
(defn jm_pointerReleased_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :touchME) :jm_pointerReleased_2 @l_x @l_y)))

    
(defn jm_nextSong_3 [this p_nextSongSound p_leftVolume p_rightVolume]
  (let [ l_nextSongSound (volatile! p_nextSongSound) l_leftVolume (volatile! p_leftVolume) l_rightVolume (volatile! p_rightVolume)]
        nil))



