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
;; package org.allbinary.media.audio

;;BasicPlayerMIDP2
(ns PlayerComposite)

(JR/register 'PlayerComposite nil '[Controllable Player])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :player nil)
  (JR/fset this :timeElapsedHelper nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :timeElapsedHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_player p_repeatTime]
  (let [ l_player (volatile! p_player) l_repeatTime (volatile! p_repeatTime)]
    nil (jinitfields this)
        (JR/fset this :player @l_player)
        (JR/fset (JR/fget this :timeElapsedHelper) :delay @l_repeatTime))
  this)

(defn jnew_2 [p_player p_repeatTime ]
  (let [o (JR/alloc 'PlayerComposite)] (jinit_2 o p_player p_repeatTime) o))

    
(defn jm_addPlayerListener_1 [this p_playerListener]
  (let [ l_playerListener (volatile! p_playerListener)]
        (JR/invoke (JR/fget this :player) :jm_addPlayerListener_1 @l_playerListener)))

    
(defn jm_removePlayerListener_1 [this p_playerListener]
  (let [ l_playerListener (volatile! p_playerListener)]
        (JR/invoke (JR/fget this :player) :jm_removePlayerListener_1 @l_playerListener)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_close_0)))

    
(defn jm_deallocate_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_deallocate_0)))

    
(defn jm_getContentType_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_getContentType_0)))

    
(defn jm_getDuration_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_getDuration_0)))

    
(defn jm_getMediaTime_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_getMediaTime_0)))

    
(defn jm_getTimeBase_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_getTimeBase_0)))

    
(defn jm_setTimeBase_1 [this p_timeBase]
  (let [ l_timeBase (volatile! p_timeBase)]
        (JR/invoke (JR/fget this :player) :jm_setTimeBase_1 @l_timeBase)))

    
(defn jm_prefetch_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :player) :jm_prefetch_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "prefetch" @l_e)) :else (throw jt)))))))

    
(defn jm_realize_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :player) :jm_realize_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "realize" @l_e)) :else (throw jt)))))))

    
(defn jm_getState_0 [this]
  (let []
        (JR/invoke (JR/fget this :player) :jm_getState_0)))

    
(defn jm_setLoopCount_1 [this p_count]
  (let [ l_count (volatile! p_count)]
        (JR/invoke (JR/fget this :player) :jm_setLoopCount_1 @l_count)))

    
(defn jm_setMediaTime_1 [this p_now]
  (let [ l_now (volatile! p_now) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/invoke (JR/fget this :player) :jm_setMediaTime_1 @l_now)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "setMediaTime" @l_e)
            (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1))))) :else (throw jt))))))))

    
(defn jm_start_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (if (JR/invoke (JR/fget this :timeElapsedHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
                (do
                (JR/invoke (JR/fget this :player) :jm_start_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :START_METHOD_NAME) @l_e)) :else (throw jt)))))))

    
(defn jm_stop_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :player) :jm_stop_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "stop" @l_e)) :else (throw jt)))))))

    
(defn jm_getControl_1 [this p_controlType]
  (let [ l_controlType (volatile! p_controlType)]
        (JR/invoke (JR/fget this :player) :jm_getControl_1 @l_controlType)))

    
(defn jm_getControls_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_setVolume_2 [this p_leftVolume p_rightVolume]
  (let [ l_leftVolume (volatile! p_leftVolume) l_rightVolume (volatile! p_rightVolume) l_controllable2 (volatile! nil)]
        (vreset! l_controllable2 (JR/fget this :player))
        (JR/invoke @l_controllable2 :jm_setVolume_2 @l_leftVolume @l_rightVolume)))

    
(defn jm_getPlayerP_0 [this]
  (let []
        (JR/fget this :player)))



