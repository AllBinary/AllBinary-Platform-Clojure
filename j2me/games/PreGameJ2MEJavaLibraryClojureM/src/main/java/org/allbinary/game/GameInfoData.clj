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

(ns GameInfoData)

(JR/register 'GameInfoData nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameInfoData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :GAME_TYPE nil)
  (JR/fset this :GAME_MODE nil)
  (JR/fset this :PLAYER_TYPE nil)
  (JR/fset this :HIGHEST_LEVEL nil)
  (JR/fset this :CURRENT_LEVEL nil)
  (JR/fset this :SOFTWARE_INFORMATION nil)
    (JR/fset this :GAME_TYPE "GAME_TYPE")
    (JR/fset this :GAME_MODE "GAME_MODE")
    (JR/fset this :PLAYER_TYPE "PLAYER_TYPE")
    (JR/fset this :HIGHEST_LEVEL "HIGHEST_LEVEL")
    (JR/fset this :CURRENT_LEVEL "CURRENT_LEVEL")
    (JR/fset this :SOFTWARE_INFORMATION "SOFTWARE_INFORMATION")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameInfoData/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameInfoData)] (jinit_0 o) o))



