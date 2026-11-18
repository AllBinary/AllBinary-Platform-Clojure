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
;; package org.allbinary.game.displayable.canvas

(ns PopupCommandFormInputProcessor)

(JR/register 'PopupCommandFormInputProcessor 'CommandFormInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_5 [this p_gameKeyEventList p_playerInputId p_gameCanvas p_form p_popupMenuInputProcessor]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_playerInputId (volatile! p_playerInputId) l_gameCanvas (volatile! p_gameCanvas) l_form (volatile! p_form) l_popupMenuInputProcessor (volatile! p_popupMenuInputProcessor)]
        (CommandFormInputProcessor/jinit_4 this @l_gameKeyEventList @l_playerInputId @l_gameCanvas @l_form) (jinitfields this))
  this)

(defn jnew_5 [p_gameKeyEventList p_playerInputId p_gameCanvas p_form p_popupMenuInputProcessor ]
  (let [o (JR/alloc 'PopupCommandFormInputProcessor)] (jinit_5 o p_gameKeyEventList p_playerInputId p_gameCanvas p_form p_popupMenuInputProcessor) o))

    
(defn jm_processInput_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (JR/invoke-super 'CommandFormInputProcessor this :jm_processInput_1 @l_key)))

    
(defn jm_processMotionInput_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent)]
        (JR/invoke-super 'CommandFormInputProcessor this :jm_processMotionInput_1 @l_motionGestureEvent)))



