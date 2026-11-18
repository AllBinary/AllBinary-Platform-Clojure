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

;;NotDeviceSpecificNoMediaMIDP1Library
(ns AllBinaryMediaManager)

(JR/register 'AllBinaryMediaManager nil '[])

(def jsv_THIS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_THIS [] (JR/ensure-init jclinit-state jclinit) @jsv_THIS)
(defn jstatic_set_THIS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_THIS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_THIS "AllBinaryMediaManagerNoMediaMIDP1")
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryMediaManager)] (jinit_0 o) o))

    
(defn jm_isMuted_0 []
  (let [this nil]
        false))

    
(defn jm_setMuted_1 [p_aMuted]
  (let [this nil l_aMuted (volatile! p_aMuted)]
        nil))

    
(defn jm_update_0 []
  (let [this nil]
        true))

    
(defn jm_init_1 [p_soundsFactoryInterface]
  (let [this nil l_soundsFactoryInterface (volatile! p_soundsFactoryInterface) l_logUtil (volatile! nil) l_commonString (volatile! nil)]
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (vreset! l_commonString (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke @l_logUtil :jm_putF_3 (JR/fget @l_commonString :START) (AllBinaryMediaManager/jstatic_THIS) (JR/fget @l_commonString :INIT))
        (JR/invoke (JR/scall 'ProgressCanvasFactory :jm_getInstance_0) :jm_addNormalPortion_2 50 "Media Manager")
        (JR/invoke (Sounds/jnew_1 @l_soundsFactoryInterface) :jm_init_0)))

    
(defn jm_shutdown_1 [p_soundsFactoryInterface]
  (let [this nil l_soundsFactoryInterface (volatile! p_soundsFactoryInterface)]
        (JR/invoke (Sounds/jnew_1 @l_soundsFactoryInterface) :jm_stopAll_0)
        (JR/invoke (Sounds/jnew_1 @l_soundsFactoryInterface) :jm_closeAll_0)
        (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_gc_0)))

    
(defn jm_createPlayerFromInputStream_2 [p_stream p_type]
  (let [this nil l_stream (volatile! p_stream) l_type (volatile! p_type) l_logUtil (volatile! nil) l_commonString (volatile! nil)]
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (vreset! l_commonString (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke @l_logUtil :jm_putF_3 (JR/fget @l_commonString :START) (AllBinaryMediaManager/jstatic_THIS) "creatPlayer(InputStream)")
        (JR/sget 'NoPlayer "NO_PLAYER")))

    
(defn jm_createPlayer_1 [p_locator]
  (let [this nil l_locator (volatile! p_locator) l_logUtil (volatile! nil) l_commonString (volatile! nil)]
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (vreset! l_commonString (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke @l_logUtil :jm_putF_3 (JR/fget @l_commonString :START) (AllBinaryMediaManager/jstatic_THIS) "creatPlayer(locator)")
        (JR/sget 'NoPlayer "NO_PLAYER")))

    
(defn jm_playTone_3 [p_frequency p_time p_volume]
  (let [this nil l_frequency (volatile! p_frequency) l_time (volatile! p_time) l_volume (volatile! p_volume)]
        nil))

    
(defn jm_getSupportedContentTypes_1 [p_protocol]
  (let [this nil l_protocol (volatile! p_protocol)]
        (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0)))

    
(defn jm_getSupportedProtocols_1 [p_content_type]
  (let [this nil l_content_type (volatile! p_content_type)]
        (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0)))



