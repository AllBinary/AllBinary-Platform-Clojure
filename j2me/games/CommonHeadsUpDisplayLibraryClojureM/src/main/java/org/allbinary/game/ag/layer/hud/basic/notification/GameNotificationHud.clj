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
;; package org.allbinary.game.ag.layer.hud.basic.notification

(ns GameNotificationHud)

(JR/register 'GameNotificationHud 'BasicHud '[GameNotificationListenerInterface])

(def jsv_NULL_GAME_NOTIFICATION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_GAME_NOTIFICATION [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_GAME_NOTIFICATION)
(defn jstatic_set_NULL_GAME_NOTIFICATION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_GAME_NOTIFICATION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_GAME_NOTIFICATION (GameNotificationHud/jnew_4 (JR/fget (JR/scall 'BasicHudFactory :jm_getInstance_0) :TOPCENTER) (JR/fget (JR/scall 'BasicHudFactory :jm_getInstance_0) :HORIZONTAL) 0 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED)))
    nil))

(defn jinitfields [this]
  (JR/fset this :METHOD_NAME nil)
  (JR/fset this :lastGameNotificationEvent nil)
    (JR/fset this :METHOD_NAME "onGameNotificationEvent")
    (JR/fset this :lastGameNotificationEvent (JR/sget 'GameNotification "NULL_GAME_NOTIFICATION_EVENT"))
  this)

    
(defn jinit_4 [this p_location p_direction p_bufferZone p_basicColor]
  (let [ l_location (volatile! p_location) l_direction (volatile! p_direction) l_bufferZone (volatile! p_bufferZone) l_basicColor (volatile! p_basicColor)]
        (BasicHud/jinit_4 this @l_location @l_direction @l_bufferZone @l_basicColor) (jinitfields this))
  this)

(defn jnew_4 [p_location p_direction p_bufferZone p_basicColor ]
  (let [o (JR/alloc 'GameNotificationHud)] (jinit_4 o p_location p_direction p_bufferZone p_basicColor) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onGameNotificationEvent_1 [this p_gameNotificationEvent]
  (let [ l_gameNotificationEvent (volatile! p_gameNotificationEvent)]
        (if (not (JR/eq (JR/fget this :lastGameNotificationEvent) @l_gameNotificationEvent))
            (do
            (JR/fset this :lastGameNotificationEvent @l_gameNotificationEvent)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/invoke @l_gameNotificationEvent :jm_getString_0) this (JR/fget this :METHOD_NAME))))
        (JR/invoke this :jm_add_4 (JR/invoke @l_gameNotificationEvent :jm_getString_0) (JR/invoke @l_gameNotificationEvent :jm_getSeconds_0) (JR/invoke @l_gameNotificationEvent :jm_getBasicColorP_0) (JR/invoke @l_gameNotificationEvent :jm_getPermanent_0))))

    
(defn jm_add_4 [this p_string p_seconds p_basicColor p_permanent]
  (let [ l_string (volatile! p_string) l_seconds (volatile! p_seconds) l_basicColor (volatile! p_basicColor) l_permanent (volatile! p_permanent)]
        nil))

    
(defn jm_processTick_0 [this]
  (let []
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_clear_0 [this]
  (let []
        nil))



