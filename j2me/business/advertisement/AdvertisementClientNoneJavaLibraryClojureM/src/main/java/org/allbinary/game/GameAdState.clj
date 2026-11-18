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

(ns GameAdState)

(JR/register 'GameAdState 'GameAdStateBase '[VirtualKeyboardEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_adConfiguration]
  (let [ l_adConfiguration (volatile! p_adConfiguration)]
        (GameAdStateBase/jinit_1 this @l_adConfiguration) (jinitfields this)
        (JR/invoke (JR/scall 'VirtualKeyboardEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this))
  this)

(defn jnew_1 [p_adConfiguration ]
  (let [o (JR/alloc 'GameAdState)] (jinit_1 o p_adConfiguration) o))

    
(defn jm_onVirtualKeyboardEvent_1 [this p_virtualKeyboardEvent]
  (let [ l_virtualKeyboardEvent (volatile! p_virtualKeyboardEvent)]
        nil))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/invoke-super 'GameAdStateBase this :jm_onEvent_1 @l_eventObject)))



