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
;; package org.allbinary.game.input

(ns GameInputStrings)

(JR/register 'GameInputStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameInputStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :PROCESS_INPUT nil)
  (JR/fset this :KEY_PRESSED nil)
  (JR/fset this :KEY_RELEASED nil)
  (JR/fset this :KEY_REPEATED nil)
  (JR/fset this :ON_PRESS_GAME_KEY nil)
  (JR/fset this :ON_DOWN_GAME_KEY nil)
  (JR/fset this :ON_UP_GAME_KEY nil)
  (JR/fset this :NO_KEY nil)
  (JR/fset this :ADD_KEY_EVENT nil)
  (JR/fset this :REMOVE_KEY_EVENT nil)
  (JR/fset this :STRAFE_LEFT nil)
  (JR/fset this :STRAFE_RIGHT nil)
  (JR/fset this :PROCESS_MOTION_INPUT nil)
  (JR/fset this :UDPATE_CURRENT_TOUCH_INPUT_FACTORY nil)
  (JR/fset this :ENABLE_PLAYER_GAME_INPUTS nil)
  (JR/fset this :ENABLE_PLAYER_GAME_INPUT nil)
    (JR/fset this :PROCESS_INPUT "processInput")
    (JR/fset this :KEY_PRESSED "keyPressed")
    (JR/fset this :KEY_RELEASED "keyReleased")
    (JR/fset this :KEY_REPEATED "keyRepeated")
    (JR/fset this :ON_PRESS_GAME_KEY "onPressGameKeyEvent")
    (JR/fset this :ON_DOWN_GAME_KEY "onDownGameKeyEvent")
    (JR/fset this :ON_UP_GAME_KEY "onUpGameKeyEvent")
    (JR/fset this :NO_KEY "Key Code Not Mapped For Game: ")
    (JR/fset this :ADD_KEY_EVENT "addGameKeyEvent")
    (JR/fset this :REMOVE_KEY_EVENT "removeGameKeyEvent")
    (JR/fset this :STRAFE_LEFT "strafeLeft")
    (JR/fset this :STRAFE_RIGHT "strafeRight")
    (JR/fset this :PROCESS_MOTION_INPUT "processMotionInput")
    (JR/fset this :UDPATE_CURRENT_TOUCH_INPUT_FACTORY "updateCurrentTouchInputFactory")
    (JR/fset this :ENABLE_PLAYER_GAME_INPUTS "Enabling PlayerGameInputs: ")
    (JR/fset this :ENABLE_PLAYER_GAME_INPUT "Enabling PlayerGameInput: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameInputStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameInputStrings/jstatic_instance)))



