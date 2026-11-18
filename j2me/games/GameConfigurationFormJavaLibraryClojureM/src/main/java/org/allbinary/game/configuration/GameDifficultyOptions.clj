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
;; package org.allbinary.game.configuration

(ns GameDifficultyOptions)

(JR/register 'GameDifficultyOptions 'CommandForm '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :meUtil nil)
  (JR/fset this :list nil)
    (JR/fset this :meUtil (JR/scall 'MIDPUtil :jm_getInstance_0))
  this)

    
(defn jinit_5 [this p_commandListener p_title p_list p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_commandListener (volatile! p_commandListener) l_title (volatile! p_title) l_list (volatile! p_list) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_gameDifficultyFactory (volatile! nil)]
        (CommandForm/jinit_4 this @l_commandListener @l_title @l_backgrounBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :list @l_list)
        (JR/invoke this :jm_update_0)
        (JR/invoke this :jm_initCommands_1 @l_commandListener)
        (vreset! l_gameDifficultyFactory (JR/scall 'GameDifficultyFactory :jm_getInstance_0))
        (JR/invoke this :jm_setSelectedId_1 (JR/invoke @l_gameDifficultyFactory :jm_getLevel_0)))
  this)

(defn jnew_5 [p_commandListener p_title p_list p_backgrounBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'GameDifficultyOptions)] (jinit_5 o p_commandListener p_title p_list p_backgrounBasicColor p_foregroundBasicColor) o))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke-super 'CommandForm this :jm_open_0)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke-super 'CommandForm this :jm_close_0)
        (JR/invoke this :jm_save_0)))

    
(defn jm_save_0 [this]
  (let [ l_gameDifficultyFactory (volatile! nil)]
        (vreset! l_gameDifficultyFactory (JR/scall 'GameDifficultyFactory :jm_getInstance_0))
        (JR/invoke @l_gameDifficultyFactory :jm_setLevel_1 (JR/invoke this :jm_getSelectedId_0))))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener) l_gameCommandsFactory (volatile! nil)]
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :CLOSE_AND_SHOW_GAME_CANVAS))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke this :jm_deleteAll_0)
        (JR/invoke this :jm_add_3 (JR/fget this :list) "Difficulty" (JR/sget 'Choice "EXCLUSIVE"))
        (JR/invoke-super 'CommandForm this :jm_update_0)))

    
(defn jm_add_3 [this p_list p_name p_option]
  (let [ l_list (volatile! p_list) l_name (volatile! p_name) l_option (volatile! p_option) l_choiceGroup (volatile! nil)]
        (vreset! l_choiceGroup (JR/invoke this :jm_getChoiceGroup_3 @l_list @l_name @l_option))
        (if (> (JR/invoke @l_list :jm_size_0) 0)
            (do
            (JR/invoke @l_choiceGroup :jm_setSelectedIndex_2 0 true)))
        (JR/invoke (JR/fget this :meUtil) :jm_appendItem_2 this @l_choiceGroup)))

    
(defn jm_getChoiceGroup_3 [this p_list p_name p_option]
  (let [ l_list (volatile! p_list) l_name (volatile! p_name) l_option (volatile! p_option) l_METHOD_NAME (volatile! nil) l_NAME (volatile! nil) l_choiceGroup (volatile! nil) l_size (volatile! nil) l_anyType (volatile! nil) l_index (volatile! nil)]
        (vreset! l_METHOD_NAME "addChoiceGroup")
        (vreset! l_NAME "Adding Choice: ")
        (vreset! l_choiceGroup (ChoiceGroup/jnew_4 @l_name @l_option (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0) (JR/sget 'NullImage "NULL_IMAGE_ARRAY")))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_anyType nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_anyType (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_NAME) :jm_append_1 (JR/to-string-of @l_anyType))) this @l_METHOD_NAME)
            (JR/invoke @l_choiceGroup :jm_append_2 (JR/to-string-of @l_anyType) (JR/sget 'NullImage "NULL_IMAGE"))))
        @l_choiceGroup))

    
(defn jm_setSelectedId_1 [this p_id]
  (let [ l_id (volatile! p_id) l_choiceGroup (volatile! nil)]
        (vreset! l_choiceGroup (JR/invoke this :jm_get_1 0))
        (JR/invoke @l_choiceGroup :jm_setSelectedIndex_2 @l_id true)))

    
(defn jm_getSelectedId_0 [this]
  (let [ l_choiceGroup (volatile! nil)]
        (vreset! l_choiceGroup (JR/invoke this :jm_get_1 0))
        (JR/invoke @l_choiceGroup :jm_getSelectedIndex_0)))

    
(defn jm_getSelectedText_0 [this]
  (let [ l_choiceGroup (volatile! nil) l_value (volatile! nil)]
        (vreset! l_choiceGroup (JR/invoke this :jm_get_1 0))
        (vreset! l_value (JR/invoke (JR/s (JR/invoke @l_choiceGroup :jm_getString_1 (JR/invoke @l_choiceGroup :jm_getSelectedIndex_0))) :jm_intValue_0))
        @l_value))



