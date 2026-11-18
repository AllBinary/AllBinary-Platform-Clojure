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
;; package org.allbinary.game.tracking

(ns TrackingEventHandler)

(JR/register 'TrackingEventHandler 'BasicEventHandler '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TrackingEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TrackingEventHandler/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TrackingEventHandler)] (jinit_0 o) o))

    
(defn jm_process_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface) l_trackingEventListenerInterface (volatile! nil)]
        (vreset! l_trackingEventListenerInterface @l_eventListenerInterface)
        (JR/invoke @l_trackingEventListenerInterface :jm_onMovement_1 @l_eventObject)))



