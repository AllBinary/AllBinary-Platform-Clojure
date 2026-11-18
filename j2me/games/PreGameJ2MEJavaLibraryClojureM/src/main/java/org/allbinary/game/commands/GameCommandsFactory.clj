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
;; package org.allbinary.game.commands

(ns GameCommandsFactory)

(JR/register 'GameCommandsFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :TOGGLE_FULLSCREEN nil)
  (JR/fset this :TOGGLE_KEYBOARD nil)
  (JR/fset this :SET_MENU_DISPLAYABLE nil)
  (JR/fset this :APPLICATION_UPDATE nil)
  (JR/fset this :DISPLAY_ABOUT nil)
  (JR/fset this :OPEN_WEB_URL nil)
  (JR/fset this :CLOSE_OPTIONS nil)
  (JR/fset this :DISPLAY_OPTIONS nil)
  (JR/fset this :START_TRACE nil)
  (JR/fset this :STOP_TRACE nil)
  (JR/fset this :DEFAULT_OPTIONS nil)
  (JR/fset this :SHOW_GAME_CANVAS nil)
  (JR/fset this :CLOSE_AND_SHOW_GAME_CANVAS nil)
  (JR/fset this :QUIT_COMMAND nil)
  (JR/fset this :RESTART_COMMAND nil)
  (JR/fset this :DISPLAY_SAVE_FORM nil)
  (JR/fset this :SAVE nil)
  (JR/fset this :DISPLAY_LOAD_FORM nil)
  (JR/fset this :LOAD_FILE nil)
  (JR/fset this :DELETE_FILE nil)
  (JR/fset this :EXIT_COMMAND nil)
  (JR/fset this :EXIT_WITHOUT_PROGRESS_COMMAND nil)
  (JR/fset this :START_COMMAND nil)
  (JR/fset this :CONTINUE_COMMAND nil)
  (JR/fset this :SELECT_COMMAND nil)
  (JR/fset this :FEATURE_UPDATE nil)
  (JR/fset this :BUY_COMMAND nil)
    (JR/fset this :TOGGLE_FULLSCREEN (Command/jnew_4 "Toggle FullScreen" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :TOGGLE_KEYBOARD (Command/jnew_4 "Keyboard" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :SET_MENU_DISPLAYABLE (Command/jnew_4 "Set Menu Displayable" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :APPLICATION_UPDATE (Command/jnew_4 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :UPDATE) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :DISPLAY_ABOUT (Command/jnew_4 (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :ABOUT) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 2))
    (JR/fset this :OPEN_WEB_URL (Command/jnew_4 "Open Web URL" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 2))
    (JR/fset this :CLOSE_OPTIONS (Command/jnew_4 "Back" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :DISPLAY_OPTIONS (Command/jnew_4 (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :OPTIONS) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 2))
    (JR/fset this :START_TRACE (Command/jnew_4 "Start Trace" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :STOP_TRACE (Command/jnew_4 "Stop Trace" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :DEFAULT_OPTIONS (Command/jnew_4 "Default" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :SHOW_GAME_CANVAS (Command/jnew_4 "Back to Game" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :CLOSE_AND_SHOW_GAME_CANVAS (Command/jnew_4 "Back" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :QUIT_COMMAND (Command/jnew_4 "Quit" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "STOP") 1))
    (JR/fset this :RESTART_COMMAND (Command/jnew_4 "Restart" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 0))
    (JR/fset this :DISPLAY_SAVE_FORM (Command/jnew_4 "Save To" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 3))
    (JR/fset this :SAVE (Command/jnew_4 "Save" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 3))
    (JR/fset this :DISPLAY_LOAD_FORM (Command/jnew_4 "Load" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 3))
    (JR/fset this :LOAD_FILE (Command/jnew_4 "Load File" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 3))
    (JR/fset this :DELETE_FILE (Command/jnew_4 "Delete File" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :EXIT_COMMAND (Command/jnew_4 "Exit" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "EXIT") 2))
    (JR/fset this :EXIT_WITHOUT_PROGRESS_COMMAND (Command/jnew_4 "Exit Without Progress" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "EXIT") 2))
    (JR/fset this :START_COMMAND (Command/jnew_4 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :START) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :CONTINUE_COMMAND (Command/jnew_4 "Continue" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :SELECT_COMMAND (Command/jnew_4 "Select" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :FEATURE_UPDATE (Command/jnew_4 "Feature Update" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
    (JR/fset this :BUY_COMMAND (Command/jnew_4 "BUY" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 1))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameCommandsFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameCommandsFactory/jstatic_set_instance (GameCommandsFactory/jnew_0))))
        (GameCommandsFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameCommandsFactory)] (jinit_0 o) o))



