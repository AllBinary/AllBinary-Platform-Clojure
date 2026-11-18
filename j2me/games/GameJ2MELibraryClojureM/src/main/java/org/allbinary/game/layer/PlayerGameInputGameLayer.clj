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
;; package org.allbinary.game.layer

(ns PlayerGameInputGameLayer)

(JR/register 'PlayerGameInputGameLayer 'AllBinaryGameLayer '[PlayerGameInputCompositeInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :playerGameInput nil)
  this)

    
(defn jinit_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId) l_canvasStrings (volatile! nil)]
        (AllBinaryGameLayer/jinit_3 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 0 0) (StaticViewPosition/jnew_3 0 0 0)) (jinitfields this)
        (JR/fset this :playerGameInput (PlayerGameInput/jnew_3 (JR/invoke this :jm_getGameKeyEventList_0) (BasicArrayListD/jnew_0) @l_playerInputId))
        (vreset! l_canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Danger Danger Danger: Should Not Be Called Except For Testing Input" this (JR/fget @l_canvasStrings :PAINT)))
  this)

(defn jnew_1 [p_playerInputId ]
  (let [o (JR/alloc 'PlayerGameInputGameLayer)] (jinit_1 o p_playerInputId) o))

    
(defn jm_getPlayerGameInput_0 [this]
  (let []
        (JR/fget this :playerGameInput)))

    
(defn jm_initInputProcessors_0 [this]
  (let []
        nil))

    
(defn jm_processInput_1 [this p_myManager]
  (let [ l_myManager (volatile! p_myManager)]
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



