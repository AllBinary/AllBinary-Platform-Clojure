;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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

(ns NullPlayerGameInputComposite)

(JR/register 'NullPlayerGameInputComposite nil '[PlayerGameInputCompositeInterface])

(def jsv_NULL_PLAYER_GAME_INPUT_COMPOSITE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PLAYER_GAME_INPUT_COMPOSITE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PLAYER_GAME_INPUT_COMPOSITE)
(defn jstatic_set_NULL_PLAYER_GAME_INPUT_COMPOSITE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PLAYER_GAME_INPUT_COMPOSITE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PLAYER_GAME_INPUT_COMPOSITE (NullPlayerGameInputComposite/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullPlayerGameInputComposite)] (jinit_0 o) o))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_processInput_1 [this p_layerManager]
  (let [ l_layerManager (volatile! p_layerManager)]
        nil))

    
(defn jm_initInputProcessors_0 [this]
  (let []
        nil))

    
(defn jm_getPlayerGameInput_0 [this]
  (let []
        (JR/scall 'NoPlayerGameInput :jm_getInstance_0)))



