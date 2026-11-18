;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.time

(ns GameTickTimeDelayHelper)

(JR/register 'GameTickTimeDelayHelper nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeDelta 0)
  (JR/fset this :startTime 0)
  (JR/fset this :lastStartTime 0)
  this)

    
(defn jinit_1 [this p_startTime]
  (let [ l_startTime (volatile! p_startTime)]
    nil (jinitfields this)
        (JR/fset this :startTime @l_startTime)
        (JR/fset this :lastStartTime 0))
  this)

(defn jnew_1 [p_startTime ]
  (let [o (JR/alloc 'GameTickTimeDelayHelper)] (jinit_1 o p_startTime) o))

    
(defn jm_setStartTime_0 [this]
  (let []
        (JR/fset this :startTime (java.lang.System/currentTimeMillis))
        (JR/fget this :startTime)))

    
(defn jm_loop_0 [this]
  (let []
        (if (== (JR/fget this :lastStartTime) java.lang.Long/MIN_VALUE)
            (do
            (JR/fset this :timeDelta 0))
            (do
            (JR/fset this :timeDelta (unchecked-subtract (java.lang.System/currentTimeMillis) (JR/fget this :lastStartTime)))))))

    
(defn jm_getTimeFromStart_0 [this]
  (let []
        (unchecked-subtract (JR/fget this :startTime) (JR/fget this :lastStartTime))))



