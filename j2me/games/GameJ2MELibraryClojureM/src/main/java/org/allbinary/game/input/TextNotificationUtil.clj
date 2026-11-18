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

(ns TextNotificationUtil)

(JR/register 'TextNotificationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TextNotificationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :TWO nil)
  (JR/fset this :FALSE nil)
  (JR/fset this :gameNotificationEventHandler nil)
    (JR/fset this :TWO (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 2))
    (JR/fset this :FALSE (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE))
    (JR/fset this :gameNotificationEventHandler (JR/scall 'GameNotificationEventHandler :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TextNotificationUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TextNotificationUtil/jstatic_instance)))

    
(defn jm_fireError_1 [this p_message]
  (let [ l_message (volatile! p_message)]
        (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'ErrorSound :jm_getInstance_0))
        (JR/invoke this :jm_fire_1 @l_message)))

    
(defn jm_fireNew_1 [this p_message]
  (let [ l_message (volatile! p_message)]
        (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
        (JR/invoke this :jm_fire_1 @l_message)))

    
(defn jm_fireSuccess_1 [this p_message]
  (let [ l_message (volatile! p_message)]
        (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'SelectSound :jm_getInstance_0))
        (JR/invoke this :jm_fire_1 @l_message)))

    
(defn jm_fire_1 [this p_message]
  (let [ l_message (volatile! p_message) l_gameNotificationEvent (volatile! nil)]
        (vreset! l_gameNotificationEvent (GameNotificationEvent/jnew_5 this @l_message (JR/fget this :TWO) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED) (JR/fget this :FALSE)))
        (JR/invoke (JR/fget this :gameNotificationEventHandler) :jm_fireEvent_1 @l_gameNotificationEvent)))



