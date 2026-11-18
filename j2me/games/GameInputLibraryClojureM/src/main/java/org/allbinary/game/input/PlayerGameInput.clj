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

(ns PlayerGameInput)

(JR/register 'PlayerGameInput 'GameInput '[GameKeyEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gameInputStrings nil)
  (JR/fset this :playerInputId 0)
    (JR/fset this :gameInputStrings (JR/scall 'GameInputStrings :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_gameKeyEventList p_removalGameKeyEventList p_playerInputId]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_removalGameKeyEventList (volatile! p_removalGameKeyEventList) l_playerInputId (volatile! p_playerInputId)]
        (GameInput/jinit_2 this @l_gameKeyEventList @l_removalGameKeyEventList) (jinitfields this)
        (JR/fset this :playerInputId @l_playerInputId))
  this)

(defn jnew_3 [p_gameKeyEventList p_removalGameKeyEventList p_playerInputId ]
  (let [o (JR/alloc 'PlayerGameInput)] (jinit_3 o p_gameKeyEventList p_removalGameKeyEventList p_playerInputId) o))

    
(defn jm_onPressGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke this :jm_add_1 @l_gameKeyEvent)
        (JR/invoke this :jm_addForRemoval_1 @l_gameKeyEvent)))

    
(defn jm_onDownGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke this :jm_add_1 @l_gameKeyEvent)))

    
(defn jm_onDownKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke this :jm_add_1 @l_gameKeyEvent)
        (JR/invoke this :jm_addForRemoval_1 @l_gameKeyEvent)))

    
(defn jm_onDownKey_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/to-string-of @l_gameKeyEvent))) this (JR/fget (JR/fget this :gameInputStrings) :ON_DOWN_GAME_KEY))))

    
(defn jm_onUpGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke this :jm_addForRemoval_1 @l_gameKeyEvent)))

    
(defn jm_onUpKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_getPlayerInputId_0 [this]
  (let []
        (JR/fget this :playerInputId)))



