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
;; package org.allbinary.game.score

(ns HighScoresCanvasInputProcessor)

(JR/register 'HighScoresCanvasInputProcessor 'PlayerGameInput '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :highScoresCanvas nil)
  this)

    
(defn jinit_1 [this p_highScoresCanvas]
  (let [ l_highScoresCanvas (volatile! p_highScoresCanvas)]
        (PlayerGameInput/jinit_3 this (BasicArrayListD/jnew_0) (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1)))) (jinitfields this)
        (JR/fset this :highScoresCanvas @l_highScoresCanvas))
  this)

(defn jnew_1 [p_highScoresCanvas ]
  (let [o (JR/alloc 'HighScoresCanvasInputProcessor)] (jinit_1 o p_highScoresCanvas) o))

    
(defn jm_open_0 [this]
  (let []
        nil))

    
(defn jm_close_0 [this]
  (let []
        nil))

    
(defn jm_onPressGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke-super 'PlayerGameInput this :jm_onPressGameKeyEvent_1 @l_gameKeyEvent)
        (JR/invoke this :jm_update_0)))

    
(defn jm_onDownGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke-super 'PlayerGameInput this :jm_onDownGameKeyEvent_1 @l_gameKeyEvent)
        (JR/invoke this :jm_update_0)))

    
(defn jm_onUpGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke-super 'PlayerGameInput this :jm_onUpGameKeyEvent_1 @l_gameKeyEvent)
        (JR/invoke this :jm_update_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getHighScoresCanvas_0 [this]
  (let []
        (JR/fget this :highScoresCanvas)))



