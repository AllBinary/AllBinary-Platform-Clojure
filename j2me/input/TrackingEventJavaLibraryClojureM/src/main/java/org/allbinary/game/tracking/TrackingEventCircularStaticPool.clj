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

(ns TrackingEventCircularStaticPool)

(JR/register 'TrackingEventCircularStaticPool nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TrackingEventCircularStaticPool/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EVENT_POOL nil)
    (JR/fset this :EVENT_POOL (AllBinaryEventCircularPool/jnew_1 20))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TrackingEventCircularStaticPool)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TrackingEventCircularStaticPool/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let []
        (JR/invoke (JR/fget this :EVENT_POOL) :jm_initAllBinaryEventCircularPool_1 (TrackingEventFactory/jnew_0))))

    
(defn jm_getNextInstance_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_trackingEvent (volatile! nil)]
        (vreset! l_trackingEvent (JR/invoke (JR/fget this :EVENT_POOL) :jm_getNextInstance_0))
        (JR/invoke @l_trackingEvent :jm_setLayerInterfaceForCircularStaticPool_1 @l_layerInterface)
        @l_trackingEvent))



