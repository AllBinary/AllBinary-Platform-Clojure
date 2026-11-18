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
;; package org.allbinary.canvas

(ns BaseGameStatistics)

(JR/register 'BaseGameStatistics nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :updateDelayHelper nil)
  (JR/fset this :totalRefreshes 0)
  (JR/fset this :totalFrames 0)
  (JR/fset this :gameTickTimeDelayHelper nil)
  (JR/fset this :DEFAULT_SCALE_FACTOR 0)
  (JR/fset this :NOT nil)
  (JR/fset this :EMPTY_STRING nil)
  (JR/fset this :STRING_ARRAY nil)
  (JR/fset this :SPACE_CHAR \u0000)
  (JR/fset this :PLUS_CHAR \u0000)
  (JR/fset this :X_CHAR \u0000)
  (JR/fset this :CHAR_ARRAY nil)
  (JR/fset this :primitiveLongSingleton nil)
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 java.lang.Integer/MAX_VALUE))
    (JR/fset this :updateDelayHelper (TimeDelayHelper/jnew_1 2000))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
    (JR/fset this :DEFAULT_SCALE_FACTOR (JR/fget (JR/scall 'ScaleFactorFactory :jm_getInstance_0) :DEFAULT_SCALE_FACTOR))
    (JR/fset this :NOT "Not enough Time to Calculate")
    (JR/fset this :EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :STRING_ARRAY (JR/afrom "String" 1 [" Total Time: " (JR/fget this :EMPTY_STRING) " Total Frames: " (JR/fget this :EMPTY_STRING) " Frames/10 Sec: " (JR/fget this :EMPTY_STRING) " Total Paints: " (JR/fget this :EMPTY_STRING) " Paints/10 Sec: " (JR/fget this :EMPTY_STRING)]))
    (JR/fset this :SPACE_CHAR \space)
    (JR/fset this :PLUS_CHAR \+)
    (JR/fset this :X_CHAR \X)
    (JR/fset this :CHAR_ARRAY (JR/afrom "CHAR" 2 [(JR/afrom "CHAR" 1 [\F \r \a \m \e \s \/ \1 \0 \space \S \e \c \:]) (JR/afrom "CHAR" 1 [\X \X]) (JR/afrom "CHAR" 1 [\P \a \i \n \t \s \/ \1 \0 \space \S \e \c \:]) (JR/afrom "CHAR" 1 [\X \X])]))
    (JR/fset this :primitiveLongSingleton (JR/scall 'PrimitiveLongSingleton :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BaseGameStatistics)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let []
        (JR/invoke (JR/fget this :timeDelayHelper) :jm_setStartTimeTNT_0)
        (JR/fset this :totalRefreshes 0)
        (JR/fset this :totalFrames 0)))

    
(defn jm_add_1 [this p_string]
  (let [ l_string (volatile! p_string)]
        nil))

    
(defn jm_process_0 [this]
  (let []
        nil))

    
(defn jm_nextFrame_0 [this]
  (let []
        (JR/finc this :totalFrames 1 :long false)))

    
(defn jm_nextRefresh_0 [this]
  (let []
        (JR/finc this :totalRefreshes 1 :long false)))

    
(defn jm_getRefreshRate_0 [this]
  (let [ l_elapsed (volatile! nil) l_time (volatile! nil)]
        (vreset! l_elapsed (JR/invoke (JR/fget this :timeDelayHelper) :jm_getElapsed_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime)))
        (if (> @l_elapsed 1)
            (do
            (vreset! l_time (JR/i16 (JR/ldiv (JR/fget this :totalRefreshes) (JR/lshr @l_elapsed (JR/fget this :DEFAULT_SCALE_FACTOR)))))
            @l_time)
            (do
            0))))

    
(defn jm_getTimeDelayHelper_0 [this]
  (let []
        (JR/fget this :timeDelayHelper)))

    
(defn jm_to2DCharArray_0 [this]
  (let [ l_totalTime (volatile! nil) l_framesPerSec (volatile! nil) l_tens (volatile! nil) l_removeTens (volatile! nil) l_refreshesPerSec (volatile! nil)]
        (vreset! l_totalTime (JR/invoke (JR/fget this :timeDelayHelper) :jm_getElapsed_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime)))
        (vreset! l_totalTime (JR/lshr @l_totalTime (JR/fget this :DEFAULT_SCALE_FACTOR)))
        (if (and (> @l_totalTime 0) (JR/invoke (JR/fget this :updateDelayHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime)))
            (do
            (vreset! l_framesPerSec (JR/i32 (JR/ldiv (JR/fget this :totalFrames) @l_totalTime)))
            (if (< @l_framesPerSec 10)
                (do
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 1) 0 (JR/fget this :SPACE_CHAR))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 1) 1 (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) @l_framesPerSec)))
                (if (< @l_framesPerSec 100)
                (do
                (vreset! l_tens (JR/idiv @l_framesPerSec 10))
                (vreset! l_removeTens (unchecked-int (unchecked-multiply @l_tens 10)))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 1) 0 (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) @l_tens))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 1) 1 (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) (unchecked-int (unchecked-subtract @l_framesPerSec @l_removeTens)))))
                (do
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 1) 0 (JR/fget this :PLUS_CHAR))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 1) 1 (JR/fget this :PLUS_CHAR)))))
            (vreset! l_refreshesPerSec (JR/i32 (JR/ldiv (JR/fget this :totalRefreshes) @l_totalTime)))
            (if (< @l_refreshesPerSec 10)
                (do
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 3) 0 (JR/fget this :X_CHAR))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 3) 1 (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) @l_refreshesPerSec)))
                (if (< @l_refreshesPerSec 100)
                (do
                (vreset! l_tens (JR/idiv @l_refreshesPerSec 10))
                (vreset! l_removeTens (unchecked-int (unchecked-multiply @l_tens 10)))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 3) 0 (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) (JR/idiv @l_refreshesPerSec 10)))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 3) 1 (JR/aget* (JR/fget (JR/fget this :primitiveLongSingleton) :NUMBER_CHAR_ARRAY) (unchecked-int (unchecked-subtract @l_refreshesPerSec @l_removeTens)))))
                (do
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 3) 0 (JR/fget this :PLUS_CHAR))
                (JR/aset* (JR/aget* (JR/fget this :CHAR_ARRAY) 3) 1 (JR/fget this :PLUS_CHAR)))))))
        (JR/fget this :CHAR_ARRAY)))

    
(defn jm_toStringArray_0 [this]
  (let [ l_totalTime (volatile! nil) l_string (volatile! nil)]
        (vreset! l_totalTime (JR/invoke (JR/fget this :timeDelayHelper) :jm_getElapsed_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime)))
        (vreset! l_totalTime (JR/ldiv @l_totalTime 10000))
        (if (> @l_totalTime 0)
            (do
            (JR/aset* (JR/fget this :STRING_ARRAY) 1 (JR/s @l_totalTime))
            (JR/aset* (JR/fget this :STRING_ARRAY) 3 (JR/s (JR/fget this :totalFrames)))
            (JR/aset* (JR/fget this :STRING_ARRAY) 5 (JR/s (JR/ldiv (JR/fget this :totalFrames) @l_totalTime)))
            (JR/aset* (JR/fget this :STRING_ARRAY) 7 (JR/s (JR/fget this :totalRefreshes)))
            (JR/aset* (JR/fget this :STRING_ARRAY) 9 (JR/s (JR/ldiv (JR/fget this :totalRefreshes) @l_totalTime))))
            (do
            (vreset! l_string (JR/fget this :EMPTY_STRING))
            (JR/aset* (JR/fget this :STRING_ARRAY) 1 @l_string)
            (JR/aset* (JR/fget this :STRING_ARRAY) 3 @l_string)
            (JR/aset* (JR/fget this :STRING_ARRAY) 5 @l_string)
            (JR/aset* (JR/fget this :STRING_ARRAY) 7 @l_string)
            (JR/aset* (JR/fget this :STRING_ARRAY) 9 @l_string)))
        (JR/fget this :STRING_ARRAY)))

    
(defn jm_toStringAt_1 [this p_totalTime]
  (let [ l_totalTime (volatile! p_totalTime) l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/aget* (JR/fget this :STRING_ARRAY) 0))
        (JR/invoke @l_stringBuffer :jm_appendlong_1 @l_totalTime)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/aget* (JR/fget this :STRING_ARRAY) 2))
        (JR/invoke @l_stringBuffer :jm_appendlong_1 (JR/fget this :totalFrames))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/aget* (JR/fget this :STRING_ARRAY) 4))
        (JR/invoke @l_stringBuffer :jm_appendlong_1 (JR/ldiv (JR/fget this :totalFrames) @l_totalTime))
        (if (> (JR/fget this :totalRefreshes) 0)
            (do
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/aget* (JR/fget this :STRING_ARRAY) 6))
            (JR/invoke @l_stringBuffer :jm_appendlong_1 (JR/fget this :totalRefreshes))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/aget* (JR/fget this :STRING_ARRAY) 8))
            (JR/invoke @l_stringBuffer :jm_appendlong_1 (JR/ldiv (JR/fget this :totalRefreshes) @l_totalTime))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_toString_0 [this]
  (let [ l_totalTime (volatile! nil)]
        (vreset! l_totalTime (JR/invoke (JR/fget this :timeDelayHelper) :jm_getElapsed_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime)))
        (vreset! l_totalTime (JR/ldiv @l_totalTime 1000))
        (if (> @l_totalTime 0)
            (do
            (JR/invoke this :jm_toStringAt_1 @l_totalTime))
            (do
            (JR/fget this :NOT)))))



