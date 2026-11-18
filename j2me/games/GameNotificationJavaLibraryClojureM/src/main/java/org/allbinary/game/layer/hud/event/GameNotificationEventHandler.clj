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
;; package org.allbinary.game.layer.hud.event

(ns GameNotificationEventHandler)

(JR/register 'GameNotificationEventHandler 'BasicEventHandler '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameNotificationEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :enabled false)
    (JR/fset this :enabled true)
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameNotificationEventHandler)] (jinit_0 o) o))

    
(defn jm_removeAllListeners_0 [this]
  (let [ l_eventListenerInterface (volatile! nil) l_list (volatile! nil)]
        (vreset! l_eventListenerInterface (JR/sget 'NullEventListener "NULL_EVENT_LISTENER"))
        (vreset! l_list (JR/fget this :eventListenerInterfaceList))
        (if (> (JR/invoke @l_list :jm_size_0) 0)
            (do
            (vreset! l_eventListenerInterface (JR/aget* (JR/fget @l_list :objectArray) 0))))
        (JR/invoke-super 'BasicEventHandler this :jm_removeAllListeners_0)
        (if (not (JR/eq @l_eventListenerInterface (JR/sget 'NullEventListener "NULL_EVENT_LISTENER")))
            (do
            (JR/invoke this :jm_addListenerInterface_1 @l_eventListenerInterface)))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameNotificationEventHandler/jstatic_instance)))

    
(defn jm_process_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface) l_gameNotificationListenerInterface (volatile! nil)](JR/method
        (if (not (JR/fget this :enabled))
            (do
            (JR/jreturn)))
        (vreset! l_gameNotificationListenerInterface @l_eventListenerInterface)
        (JR/invoke @l_gameNotificationListenerInterface :jm_onGameNotificationEvent_1 @l_eventObject))))



