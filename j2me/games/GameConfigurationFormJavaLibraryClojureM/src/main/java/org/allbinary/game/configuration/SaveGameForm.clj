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

(ns SaveGameForm)

(JR/register 'SaveGameForm 'CommandForm '[])

(def jsv_FORM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_FORM)
(defn jstatic_set_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_FORM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_FORM (JR/scall 'CommandForm :jm_getNullCommandForm_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :meUtil nil)
    (JR/fset this :meUtil (JR/scall 'MIDPUtil :jm_getInstance_0))
  this)

    
(defn jm_createForm_4 [p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor]
  (let [this nil l_commandListener (volatile! p_commandListener) l_title (volatile! p_title) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (SaveGameForm/jstatic_set_FORM (SaveGameForm/jnew_4 @l_commandListener @l_title @l_backgrounBasicColor @l_foregroundBasicColor))
        (SaveGameForm/jstatic_FORM)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SaveGameForm/jstatic_FORM)))

    
(defn jinit_4 [this p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_commandListener (volatile! p_commandListener) l_title (volatile! p_title) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_timeString (volatile! nil)]
        (CommandForm/jinit_4 this @l_commandListener @l_title @l_backgrounBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (vreset! l_timeString (JR/s (JR/invoke (JR/scall 'ABSystemWrapper :jm_getInstance_0) :jm_currentTimeMillis_0)))
        (JR/invoke (JR/fget this :meUtil) :jm_appendItem_2 this (TextField/jnew_4 "Name: " @l_timeString 30 (JR/sget 'TextField "ANY")))
        (JR/invoke this :jm_initCommands_1 @l_commandListener))
  this)

(defn jnew_4 [p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'SaveGameForm)] (jinit_4 o p_commandListener p_title p_backgrounBasicColor p_foregroundBasicColor) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener) l_gameCommandsFactory (volatile! nil)]
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :SAVE))
        (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :CLOSE_AND_SHOW_GAME_CANVAS))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))



