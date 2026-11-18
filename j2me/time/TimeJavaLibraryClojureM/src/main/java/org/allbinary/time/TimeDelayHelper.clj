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
;; package org.allbinary.time

(ns TimeDelayHelper)

(JR/register 'TimeDelayHelper nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :startTime 0)
  (JR/fset this :elapsedTimeAtPause 0)
  (JR/fset this :delay 0)
    (JR/fset this :startTime (unchecked-int (unchecked-negate (JR/c2i 1))))
    (JR/fset this :elapsedTimeAtPause java.lang.Long/MIN_VALUE)
  this)

    
(defn jinit_1 [this p_delay]
  (let [ l_delay (volatile! p_delay)]
    nil (jinitfields this)
        (JR/fset this :delay @l_delay)
        (JR/invoke this :jm_setStartTimeTNT_0))
  this)

(defn jnew_1 [p_delay ]
  (let [o (JR/alloc 'TimeDelayHelper)] (jinit_1 o p_delay) o))

    
(defn jm_isTimeTNT_0 [this]
  (let [ l_currentTime (volatile! nil)](JR/method
        (vreset! l_currentTime (java.lang.System/currentTimeMillis))
        (if (> (unchecked-subtract @l_currentTime (JR/fget this :startTime)) (JR/fget this :delay))
            (do
            (JR/fset this :startTime @l_currentTime)
            (JR/jreturn true)))
        false)))

    
(defn jm_isTimeSinceTNT_1 [this p_delay]
  (let [ l_delay (volatile! p_delay) l_currentTime (volatile! nil)](JR/method
        (vreset! l_currentTime (java.lang.System/currentTimeMillis))
        (if (> (unchecked-subtract @l_currentTime (JR/fget this :startTime)) @l_delay)
            (do
            (JR/fset this :startTime @l_currentTime)
            (JR/jreturn true)))
        false)))

    
(defn jm_isTime_1 [this p_currentTime]
  (let [ l_currentTime (volatile! p_currentTime)](JR/method
        (if (> (unchecked-subtract @l_currentTime (JR/fget this :startTime)) (JR/fget this :delay))
            (do
            (JR/fset this :startTime @l_currentTime)
            (JR/jreturn true)))
        false)))

    
(defn jm_isTimeWithoutReset_1 [this p_currentTime]
  (let [ l_currentTime (volatile! p_currentTime)](JR/method
        (if (> (unchecked-subtract @l_currentTime (JR/fget this :startTime)) (JR/fget this :delay))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isTimeSince_2 [this p_delay p_currentTime]
  (let [ l_delay (volatile! p_delay) l_currentTime (volatile! p_currentTime)](JR/method
        (if (> (unchecked-subtract @l_currentTime (JR/fget this :startTime)) (JR/fget this :delay))
            (do
            (JR/fset this :startTime @l_currentTime)
            (JR/jreturn true)))
        false)))

    
(defn jm_getElapsedTNT_0 [this]
  (let []
        (unchecked-subtract (java.lang.System/currentTimeMillis) (JR/fget this :startTime))))

    
(defn jm_getElapsed_1 [this p_currentTime]
  (let [ l_currentTime (volatile! p_currentTime)]
        (unchecked-subtract @l_currentTime (JR/fget this :startTime))))

    
(defn jm_isElapsed_2 [this p_currentTime p_time]
  (let [ l_currentTime (volatile! p_currentTime) l_time (volatile! p_time)]
        (if (> (JR/invoke this :jm_getElapsed_1 @l_currentTime) @l_time)
            (do
            true)
            (do
            false))))

    
(defn jm_isElapsedTNT_1 [this p_time]
  (let [ l_time (volatile! p_time)]
        (if (> (JR/invoke this :jm_getElapsedTNT_0) @l_time)
            (do
            true)
            (do
            false))))

    
(defn jm_setStartTime_1 [this p_startTime]
  (let [ l_startTime (volatile! p_startTime)]
        (JR/fset this :startTime @l_startTime)))

    
(defn jm_getStartTime_0 [this]
  (let []
        (JR/fget this :startTime)))

    
(defn jm_setStartTimeTNT_0 [this]
  (let []
        (JR/fset this :startTime (java.lang.System/currentTimeMillis))))

    
(defn jm_pause_0 [this]
  (let []
        (JR/fset this :elapsedTimeAtPause (JR/invoke this :jm_getElapsedTNT_0))
        (JR/fset this :startTime java.lang.Long/MAX_VALUE)))

    
(defn jm_resume_0 [this]
  (let [](JR/method
        (if (not (== (JR/fget this :elapsedTimeAtPause) java.lang.Long/MIN_VALUE))
            (do
            (JR/fset this :startTime (unchecked-add (java.lang.System/currentTimeMillis) (JR/fget this :elapsedTimeAtPause)))
            (JR/fset this :elapsedTimeAtPause java.lang.Long/MIN_VALUE)
            (JR/invoke this :jm_setStartTimeTNT_0)
            (JR/jreturn true)))
        false)))

    
(defn jm_toStringAt_1 [this p_currentTime]
  (let [ l_currentTime (volatile! p_currentTime) l_elapsed (volatile! nil) l_commonLabels (volatile! nil) l_elapsedAsString (volatile! nil)]
        (vreset! l_elapsed (JR/invoke this :jm_getElapsed_1 @l_currentTime))
        (if (> @l_elapsed 0)
            (do
            (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
            (vreset! l_elapsedAsString (JR/s @l_elapsed))
            (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget @l_commonLabels :START)) :jm_appendlong_1 (JR/fget this :startTime)) :jm_append_1 (JR/fget @l_commonLabels :CURRENT)) :jm_appendlong_1 @l_currentTime) :jm_append_1 (JR/fget @l_commonLabels :ELAPSED)) :jm_append_1 @l_elapsedAsString)))
            (do
            (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))))

    
(defn jm_toString_0 [this]
  (let [ l_currentTime (volatile! nil) l_elapsed (volatile! nil) l_commonLabels (volatile! nil) l_elapsedAsString (volatile! nil)]
        (vreset! l_currentTime (java.lang.System/currentTimeMillis))
        (vreset! l_elapsed (JR/invoke this :jm_getElapsed_1 @l_currentTime))
        (if (> @l_elapsed 0)
            (do
            (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
            (vreset! l_elapsedAsString (JR/s @l_elapsed))
            (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget @l_commonLabels :START)) :jm_appendlong_1 (JR/fget this :startTime)) :jm_append_1 (JR/fget @l_commonLabels :CURRENT)) :jm_appendlong_1 @l_currentTime) :jm_append_1 (JR/fget @l_commonLabels :ELAPSED)) :jm_append_1 @l_elapsedAsString)))
            (do
            (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))))



