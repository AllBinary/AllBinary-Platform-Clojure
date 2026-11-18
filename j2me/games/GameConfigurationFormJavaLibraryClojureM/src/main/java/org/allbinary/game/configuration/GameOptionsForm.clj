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

(ns GameOptionsForm)

(JR/register 'GameOptionsForm 'CommandForm '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :meUtil nil)
    (JR/fset this :meUtil (JR/scall 'MIDPUtil :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_commandListener (volatile! p_commandListener) l_title (volatile! p_title) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_gameFeatureFormUtil (volatile! nil)]
        (CommandForm/jinit_4 this @l_commandListener @l_title @l_backgrounBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/invoke this :jm_addConfiguration_0)
        (vreset! l_gameFeatureFormUtil (JR/scall 'GameFeatureFormUtil :jm_getInstance_0))
        (JR/invoke @l_gameFeatureFormUtil :jm_addChoiceGroup_3 this (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0) (JR/sget 'Choice "EXCLUSIVE"))
        (JR/invoke @l_gameFeatureFormUtil :jm_addChoiceGroup_3 this (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getMultipleInstance_0) :jm_get_0) (JR/sget 'Choice "MULTIPLE"))
        (JR/invoke this :jm_initCommands_1 @l_commandListener)
        (JR/invoke this :jm_setItemStateListener_1 (GameFeatureItemStateListener/jnew_1 this))
        (JR/invoke this :jm_addTextFieldsIfSimulated_0))
  this)

(defn jnew_4 [p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'GameOptionsForm)] (jinit_4 o p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor) o))

    
(defn jm_closeClientInformation_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke-super 'CommandForm this :jm_close_0)
        (JR/invoke this :jm_save_1 @l_abeClientInformation)))

    
(defn jm_addTextFieldsIfSimulated_0 [this]
  (let [ l_key (volatile! nil) l_hashtable (volatile! nil) l_listCanBeNull (volatile! nil) l_list (volatile! nil)]
        (vreset! l_key (JR/fget (JR/scall 'OrientationData :jm_getInstance_0) :ORIENTATION_SENSOR_INPUT))
        (vreset! l_hashtable (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0))
        (if (some? @l_hashtable)
            (do
            (vreset! l_listCanBeNull (JR/invoke @l_hashtable :jm_get_1 @l_key))
            (if (some? @l_listCanBeNull)
                (do
                (vreset! l_list @l_listCanBeNull)
                (if (JR/invoke @l_list :jm_contains_1 (JR/fget (JR/scall 'SensorFeatureFactory :jm_getInstance_0) :SIMULATED_ORIENTATION_SENSORS))
                    (do
                    (JR/invoke this :jm_addTextFields_0)))))))))

    
(defn jm_addTextFields_0 [this]
  (let [ l_hashtable (volatile! nil) l_size (volatile! nil) l_objectArray (volatile! nil) l_gameConfigurationTextInput (volatile! nil) l_textField (volatile! nil) l_index (volatile! nil)]
        (vreset! l_hashtable (JR/scall 'GameConfigurationTextInput :jm_getHashtable_0))
        (vreset! l_size (JR/invoke @l_hashtable :jm_size_0))
        (vreset! l_objectArray (JR/invoke (JR/scall 'HashtableUtil :jm_getInstance_0) :jm_getKeysAsArray_1 @l_hashtable))
        (vreset! l_gameConfigurationTextInput nil)
        (vreset! l_textField nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameConfigurationTextInput (JR/invoke @l_hashtable :jm_get_1 (JR/aget* @l_objectArray @l_index)))
            (vreset! l_textField (TextField/jnew_4 (JR/invoke @l_gameConfigurationTextInput :jm_getLabel_0) (JR/invoke @l_gameConfigurationTextInput :jm_getText_0) 30 (JR/sget 'TextField "ANY")))
            (JR/invoke (JR/fget this :meUtil) :jm_appendItem_2 this @l_textField)))))

    
(defn jm_addConfiguration_0 [this]
  (let [ l_METHOD_NAME (volatile! nil) l_NAME (volatile! nil) l_list (volatile! nil) l_GAUGE_CHANGE (volatile! nil) l_stringMaker (volatile! nil) l_size (volatile! nil) l_gameConfiguration (volatile! nil) l_gauge (volatile! nil) l_index (volatile! nil)]
        (vreset! l_METHOD_NAME "addConfiguration")
        (vreset! l_NAME "Name: ")
        (vreset! l_list (JR/invoke (JR/scall 'GameConfigurationSingleton :jm_getInstance_0) :jm_getOptionsBasicArrayList_0))
        (vreset! l_GAUGE_CHANGE (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :GAUGE_CHANGE))
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_gameConfiguration nil)
        (vreset! l_gauge nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameConfiguration (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_NAME) :jm_append_1 (JR/to-string-of @l_gameConfiguration))) this @l_METHOD_NAME)
            (vreset! l_gauge (GameConfigurationGauge/jnew_1 @l_gameConfiguration))
            (JR/invoke @l_gauge :jm_setDefaultCommand_1 @l_GAUGE_CHANGE)
            (JR/invoke @l_gauge :jm_setItemCommandListener_1 (GameFeatureItemCommandListener/jnew_1 this))
            (JR/invoke (JR/fget this :meUtil) :jm_appendItem_2 this @l_gauge)))))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener) l_gameCommandsFactory (volatile! nil)]
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :CLOSE_OPTIONS))
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :DEFAULT_OPTIONS))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_save_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_size (volatile! nil) l_item (volatile! nil) l_index (volatile! nil) l_hashtable (volatile! nil) l_SCALE (volatile! nil) l_keyValuePersistance (volatile! nil) l_list (volatile! nil) l_size2 (volatile! nil) l_integer (volatile! nil)]
        (vreset! l_size (JR/invoke this :jm_size_0))
        (vreset! l_item nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_item (JR/invoke this :jm_get_1 @l_index))
            (if (JR/instance-of @l_item 'GameConfigurationGauge)
                (do
                (JR/invoke (JR/scall 'GameConfigurationUtil :jm_getInstance_0) :jm_update_1 @l_item))
                (if (JR/instance-of @l_item 'TextField)
                (do
                (JR/scall 'GameConfigurationTextInput :jm_update_1 @l_item))))))
        (JR/invoke (JR/scall 'GameConfigurationUtil :jm_getInstance_0) :jm_updateCompetitionValue_0)
        (vreset! l_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
        (vreset! l_SCALE (JR/fget (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :SCALE))
        (JR/invoke @l_hashtable :jm_put_2 (JR/invoke @l_SCALE :jm_getName_0) (JR/s (JR/invoke (JR/invoke @l_SCALE :jm_getValue_0) :jm_intValue_0)))
        (vreset! l_keyValuePersistance (JR/scall 'GameConfigurationPersistanceSingleton :jm_getInstance_0))
        (JR/invoke @l_keyValuePersistance :jm_clear_0)
        (JR/invoke @l_keyValuePersistance :jm_loadAll_1 @l_abeClientInformation)
        (vreset! l_list (JR/invoke @l_keyValuePersistance :jm_getIds_0))
        (JR/invoke @l_keyValuePersistance :jm_save_2 @l_abeClientInformation @l_hashtable)
        (vreset! l_size2 (JR/invoke @l_list :jm_size_0))
        (vreset! l_integer nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
            (vreset! l_integer (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_keyValuePersistance :jm_delete_2 @l_abeClientInformation (JR/invoke @l_integer :jm_intValue_0))))))



