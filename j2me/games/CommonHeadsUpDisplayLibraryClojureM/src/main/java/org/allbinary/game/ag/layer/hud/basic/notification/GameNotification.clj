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

(ns GameNotification)

(JR/register 'GameNotification nil '[])

(def jsv_NULL_GAME_NOTIFICATION_EVENT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_GAME_NOTIFICATION_EVENT [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_GAME_NOTIFICATION_EVENT)
(defn jstatic_set_NULL_GAME_NOTIFICATION_EVENT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_GAME_NOTIFICATION_EVENT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_GAME_NOTIFICATION_EVENT (GameNotificationEvent/jnew_5 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (long 0) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED) (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))
    nil))

(defn jinitfields [this]
  (JR/fset this :stringList nil)
  (JR/fset this :timeList nil)
  (JR/fset this :colorList nil)
    (JR/fset this :stringList (BasicArrayListD/jnew_0))
    (JR/fset this :timeList (BasicArrayListD/jnew_0))
    (JR/fset this :colorList (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameNotification)] (jinit_0 o) o))

    
(defn jm_add_3 [this p_string p_seconds p_basicColor]
  (let [ l_string (volatile! p_string) l_seconds (volatile! p_seconds) l_basicColor (volatile! p_basicColor)]
        (if (not (JR/invoke (JR/fget this :stringList) :jm_contains_1 @l_string))
            (do
            (JR/invoke (JR/fget this :stringList) :jm_add_1 @l_string)
            (JR/invoke (JR/fget this :timeList) :jm_add_1 @l_seconds)
            (JR/invoke (JR/fget this :colorList) :jm_add_1 @l_basicColor)))))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :stringList) :jm_clear_0)
        (JR/invoke (JR/fget this :timeList) :jm_clear_0)
        (JR/invoke (JR/fget this :colorList) :jm_clear_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :stringList) :jm_size_0)))



