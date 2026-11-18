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

(ns InGameOptionsForm)

(JR/register 'InGameOptionsForm 'CommandForm '[])

(def jsv_DISPLAY (atom nil))
(def jsv_SAVE (atom nil))
(def jsv_DEFAULT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_DISPLAY [] (JR/ensure-init jclinit-state jclinit) @jsv_DISPLAY)
(defn jstatic_set_DISPLAY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DISPLAY v))
(defn jstatic_SAVE [] (JR/ensure-init jclinit-state jclinit) @jsv_SAVE)
(defn jstatic_set_SAVE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SAVE v))
(defn jstatic_DEFAULT [] (JR/ensure-init jclinit-state jclinit) @jsv_DEFAULT)
(defn jstatic_set_DEFAULT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DEFAULT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_DISPLAY (Command/jnew_4 "Options In Game" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (reset! jsv_SAVE (Command/jnew_4 "Save" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (reset! jsv_DEFAULT (Command/jnew_4 "Default" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_4 [this p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_commandListener (volatile! p_commandListener) l_title (volatile! p_title) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_gameFeatureFormUtil (volatile! nil)]
        (CommandForm/jinit_4 this @l_commandListener @l_title @l_backgrounBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (vreset! l_gameFeatureFormUtil (JR/scall 'GameFeatureFormUtil :jm_getInstance_0))
        (JR/invoke @l_gameFeatureFormUtil :jm_addChoiceGroup_3 this (JR/invoke (JR/scall 'InGameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0) (JR/sget 'Choice "EXCLUSIVE"))
        (JR/invoke @l_gameFeatureFormUtil :jm_addChoiceGroup_3 this (JR/invoke (JR/scall 'InGameFeatureChoiceGroups :jm_getMultipleInstance_0) :jm_get_0) (JR/sget 'Choice "MULTIPLE"))
        (JR/invoke this :jm_initCommands_1 @l_commandListener))
  this)

(defn jnew_4 [p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'InGameOptionsForm)] (jinit_4 o p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :CLOSE_AND_SHOW_GAME_CANVAS))
        (JR/invoke this :jm_addCommand_1 (InGameOptionsForm/jstatic_DEFAULT))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))



