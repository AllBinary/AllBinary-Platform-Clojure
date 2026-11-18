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
;; package org.allbinary.logic.system.security.licensing

(ns LockedFeatureNotificationUtil)

(JR/register 'LockedFeatureNotificationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LockedFeatureNotificationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :gameNotificationEvent nil)
    (JR/fset this :gameNotificationEvent (GameNotificationEvent/jnew_5 this (JR/fget (JR/scall 'LicenseStrings :jm_getInstance_0) :LOCKED) (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 3) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED) (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LockedFeatureNotificationUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LockedFeatureNotificationUtil/jstatic_instance)))

    
(defn jm_fire_0 [this]
  (let []
        (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'ErrorSound :jm_getInstance_0))
        (JR/invoke (JR/scall 'GameNotificationEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :gameNotificationEvent))))

    
(defn jm_fireWithColor_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke (JR/scall 'PrimaryPlayerQueueFactory :jm_getInstance_0) :jm_add_1 (JR/scall 'ErrorSound :jm_getInstance_0))
        (JR/invoke (JR/fget this :gameNotificationEvent) :jm_setBasicColorP_1 @l_basicColor)
        (JR/invoke (JR/scall 'GameNotificationEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :gameNotificationEvent))))



