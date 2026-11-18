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
;; package org.allbinary.bounds

(ns LayerBounds)

(JR/register 'LayerBounds nil '[BoundsChangeEventListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :rectangle nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_rectangle]
  (let [ l_rectangle (volatile! p_rectangle)]
    nil (jinitfields this)
        (JR/fset this :rectangle @l_rectangle))
  this)

(defn jnew_1 [p_rectangle ]
  (let [o (JR/alloc 'LayerBounds)] (jinit_1 o p_rectangle) o))

    
(defn jm_getRectangleP_0 [this]
  (let []
        (JR/fget this :rectangle)))

    
(defn jm_visit_1 [this p_boundsVisitorInterface]
  (let [ l_boundsVisitorInterface (volatile! p_boundsVisitorInterface)]
        nil))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onBoundsChangeEvent_1 [this p_boundsChangeEvent]
  (let [ l_boundsChangeEvent (volatile! p_boundsChangeEvent)]
        (JR/fset this :rectangle (JR/invoke @l_boundsChangeEvent :jm_getRectangle_0))))



