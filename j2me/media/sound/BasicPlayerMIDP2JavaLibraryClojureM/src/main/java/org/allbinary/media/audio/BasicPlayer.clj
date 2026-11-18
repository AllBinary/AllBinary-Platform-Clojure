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

;;BasicPlayerMIDP2JavaLibrary
(ns BasicPlayer)

(JR/register 'BasicPlayer nil '[Player TimeBaseInterface Controllable2])

(def jsv_CONTROL_TYPE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_CONTROL_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_CONTROL_TYPE)
(defn jstatic_set_CONTROL_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_CONTROL_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_CONTROL_TYPE "ToneControl")
    nil))

(defn jinitfields [this]
  (JR/fset this :listenersList nil)
  (JR/fset this :timeBase nil)
  (JR/fset this :stateP 0)
  (JR/fset this :loopCountP 0)
    (JR/fset this :listenersList (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/invoke this :jm_setLoopCount_1 0)
        (JR/invoke this :jm_setState_1 (JR/sget 'Player "UNREALIZED")))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicPlayer)] (jinit_0 o) o))

    
(defn jm_getContentType_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_getControl_1 [this p_controlType]
  (let [ l_controlType (volatile! p_controlType)]
        (NullControl/jnew_0)))

    
(defn jm_getControls_0 [this]
  (let []
        (JR/anew "Object" 1 0)))

    
(defn jm_close_0 [this]
  (let []
        nil))

    
(defn jm_addPlayerListener_1 [this p_playerListener]
  (let [ l_playerListener (volatile! p_playerListener)]
        (if (not (JR/invoke (JR/fget this :listenersList) :jm_contains_1 @l_playerListener))
            (do
            (JR/invoke (JR/fget this :listenersList) :jm_add_1 @l_playerListener)))))

    
(defn jm_removePlayerListener_1 [this p_playerListener]
  (let [ l_playerListener (volatile! p_playerListener)]
        (JR/invoke (JR/fget this :listenersList) :jm_remove_1 @l_playerListener)))

    
(defn jm_getState_0 [this]
  (let []
        (JR/fget this :stateP)))

    
(defn jm_setState_1 [this p_state]
  (let [ l_state (volatile! p_state)]
        (JR/fset this :stateP @l_state)))

    
(defn jm_getDuration_0 [this]
  (let []
        0))

    
(defn jm_getMediaTime_0 [this]
  (let []
        0))

    
(defn jm_getTimeBase_0 [this]
  (let []
        (JR/fget this :timeBase)))

    
(defn jm_setTimeBase_1 [this p_timeBase]
  (let [ l_timeBase (volatile! p_timeBase)]
        (JR/fset this :timeBase @l_timeBase)))

    
(defn jm_deallocate_0 [this]
  (let []
        nil))

    
(defn jm_prefetch_0 [this]
  (let []
        nil))

    
(defn jm_realize_0 [this]
  (let []
        nil))

    
(defn jm_setLoopCount_1 [this p_count]
  (let [ l_count (volatile! p_count)]
        (JR/fset this :loopCountP @l_count)))

    
(defn jm_getLoopCount_0 [this]
  (let []
        (JR/fget this :loopCountP)))

    
(defn jm_setMediaTime_1 [this p_now]
  (let [ l_now (volatile! p_now)]
        0))

    
(defn jm_start_0 [this]
  (let []
        (JR/invoke this :jm_setState_1 (JR/sget 'Player "STARTED"))))

    
(defn jm_stop_0 [this]
  (let []
        (JR/invoke this :jm_setState_1 (JR/sget 'Player "PREFETCHED"))))

    
(defn jm_setVolume_2 [this p_leftVolume p_rightVolume]
  (let [ l_leftVolume (volatile! p_leftVolume) l_rightVolume (volatile! p_rightVolume)]
        nil))



