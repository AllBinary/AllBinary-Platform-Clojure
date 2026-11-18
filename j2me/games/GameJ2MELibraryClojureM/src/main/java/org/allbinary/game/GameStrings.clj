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
;; package org.allbinary.game

(ns GameStrings)

(JR/register 'GameStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :PROCESS_TICK nil)
  (JR/fset this :ON_GAME_INITIALIZED nil)
  (JR/fset this :UPDATESURFACE nil)
  (JR/fset this :ON_SET_DISPLAYABLE nil)
  (JR/fset this :UNPAUSE nil)
  (JR/fset this :TOGGLE_MENU nil)
  (JR/fset this :SET_GAME_OVER nil)
  (JR/fset this :GAME_STATE nil)
  (JR/fset this :SET_GAME_STATE nil)
  (JR/fset this :STOP_GAME_CANVAS_RUNNABLE_INTERFACE nil)
    (JR/fset this :PROCESS_TICK "processTick")
    (JR/fset this :ON_GAME_INITIALIZED "onGameInitialized")
    (JR/fset this :UPDATESURFACE "updateSurface")
    (JR/fset this :ON_SET_DISPLAYABLE "onSetDisplayable")
    (JR/fset this :UNPAUSE "unPause")
    (JR/fset this :TOGGLE_MENU "toggleMenu")
    (JR/fset this :SET_GAME_OVER "setGameOver")
    (JR/fset this :GAME_STATE "Game State: ")
    (JR/fset this :SET_GAME_STATE "setGameState")
    (JR/fset this :STOP_GAME_CANVAS_RUNNABLE_INTERFACE "stopGameCanvasRunnableInterface")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameStrings/jstatic_instance)))



