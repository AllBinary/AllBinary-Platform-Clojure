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

(ns TimeUtil)

(JR/register 'TimeUtil nil '[])

(def jsv_instance (atom nil))
(def jsv_calendar (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))
(defn jstatic_calendar [] (JR/ensure-init jclinit-state jclinit) @jsv_calendar)
(defn jstatic_set_calendar [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_calendar v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TimeUtil/jnew_0))
    (reset! jsv_calendar (java.util.Calendar/getInstance))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TimeUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TimeUtil/jstatic_instance)))

    
(defn jm_setCalendar_5 [this p_calendar p_yearString p_monthString p_dayString p_hourString]
  (let [ l_calendar (volatile! p_calendar) l_yearString (volatile! p_yearString) l_monthString (volatile! p_monthString) l_dayString (volatile! p_dayString) l_hourString (volatile! p_hourString) l_year (volatile! nil) l_month (volatile! nil) l_day (volatile! nil) l_hour (volatile! nil)]
        (vreset! l_year (JR/invoke (long @l_yearString) :jm_intValue_0))
        (vreset! l_month (JR/invoke (long @l_monthString) :jm_intValue_0))
        (vreset! l_day (JR/invoke (long @l_dayString) :jm_intValue_0))
        (vreset! l_hour (JR/invoke (long @l_hourString) :jm_intValue_0))
        (JR/invoke @l_calendar :jm_set_5 @l_year @l_month @l_day @l_hour 0)))

    
(defn jm_setCalendarWithTime_7 [this p_calendar p_yearString p_monthString p_dayString p_hourString p_minuteString p_secondString]
  (let [ l_calendar (volatile! p_calendar) l_yearString (volatile! p_yearString) l_monthString (volatile! p_monthString) l_dayString (volatile! p_dayString) l_hourString (volatile! p_hourString) l_minuteString (volatile! p_minuteString) l_secondString (volatile! p_secondString) l_year (volatile! nil) l_month (volatile! nil) l_day (volatile! nil) l_hour (volatile! nil) l_minute (volatile! nil) l_second (volatile! nil)]
        (vreset! l_year (JR/invoke (long @l_yearString) :jm_intValue_0))
        (vreset! l_month (JR/invoke (long @l_monthString) :jm_intValue_0))
        (vreset! l_day (JR/invoke (long @l_dayString) :jm_intValue_0))
        (vreset! l_hour (JR/invoke (long @l_hourString) :jm_intValue_0))
        (vreset! l_minute (JR/invoke (long @l_minuteString) :jm_intValue_0))
        (vreset! l_second (JR/invoke (long @l_secondString) :jm_intValue_0))
        (JR/invoke @l_calendar :jm_set_6 @l_year @l_month @l_day @l_hour @l_minute @l_second)))

    
(defn jm_setExpirationCalendar_7 [this p_calendar p_yearsString p_monthsString p_daysString p_hoursString p_minutesString p_secondsString]
  (let [ l_calendar (volatile! p_calendar) l_yearsString (volatile! p_yearsString) l_monthsString (volatile! p_monthsString) l_daysString (volatile! p_daysString) l_hoursString (volatile! p_hoursString) l_minutesString (volatile! p_minutesString) l_secondsString (volatile! p_secondsString) l_year (volatile! nil) l_month (volatile! nil) l_day (volatile! nil) l_hour (volatile! nil) l_minute (volatile! nil) l_second (volatile! nil)]
        (vreset! l_year (+ (JR/invoke @l_calendar :jm_get_1 java.util.Calendar/YEAR) (JR/invoke (long @l_yearsString) :jm_intValue_0)))
        (vreset! l_month (+ (JR/invoke @l_calendar :jm_get_1 java.util.Calendar/MONTH) (JR/invoke (long @l_monthsString) :jm_intValue_0)))
        (vreset! l_day (+ (JR/invoke @l_calendar :jm_get_1 java.util.Calendar/DAY_OF_MONTH) (JR/invoke (long @l_daysString) :jm_intValue_0)))
        (vreset! l_hour (+ (JR/invoke @l_calendar :jm_get_1 java.util.Calendar/HOUR) (JR/invoke (long @l_hoursString) :jm_intValue_0)))
        (vreset! l_minute (+ (JR/invoke @l_calendar :jm_get_1 java.util.Calendar/MINUTE) (JR/invoke (long @l_minutesString) :jm_intValue_0)))
        (vreset! l_second (+ (JR/invoke @l_calendar :jm_get_1 java.util.Calendar/SECOND) (JR/invoke (long @l_secondsString) :jm_intValue_0)))
        (JR/invoke @l_calendar :jm_set_6 @l_year @l_month @l_day @l_hour @l_minute @l_second)))

    
(defn jm_getTotalTime_6 [this p_yearString p_monthString p_dayString p_hourString p_minuteString p_secondString]
  (let [ l_yearString (volatile! p_yearString) l_monthString (volatile! p_monthString) l_dayString (volatile! p_dayString) l_hourString (volatile! p_hourString) l_minuteString (volatile! p_minuteString) l_secondString (volatile! p_secondString) l_time (volatile! nil) l_timeDelta (volatile! nil)]
        (vreset! l_time (JR/invoke (TimeUtil/jstatic_calendar) :jm_getTimeInMillis_0))
        (JR/invoke this :jm_setExpirationCalendar_7 (TimeUtil/jstatic_calendar) @l_yearString @l_monthString @l_dayString @l_hourString @l_minuteString @l_secondString)
        (vreset! l_timeDelta (JR/invoke (TimeUtil/jstatic_calendar) :jm_getTimeInMillis_0))
        (unchecked-subtract @l_timeDelta @l_time)))



