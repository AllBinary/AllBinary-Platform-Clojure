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

;;NotDeviceSpecificMIDP2JavaLibrary
(ns AllBinaryMediaManager)

(JR/register 'AllBinaryMediaManager nil '[])

(def jsv_THIS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_THIS [] (JR/ensure-init jclinit-state jclinit) @jsv_THIS)
(defn jstatic_set_THIS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_THIS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_THIS "AllBinaryMediaManagerNoMIPD2")
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

    
(defn jm_createPlayer_1 [p_resource]
  (let [this nil l_resource (volatile! p_resource) l_inputStream (volatile! nil)]
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'GameFeatureFactory :jm_getInstance_0) :SOUND))
            (do
            (if (== (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_compareTo_2 @l_resource (JR/sget 'Manager "TONE_DEVICE_LOCATOR")) 0)
                (do
                (JR/scall 'Manager :jm_createPlayer_1 @l_resource))
                (do
                (vreset! l_inputStream (JR/invoke (JR/scall 'ResourceUtil :jm_getInstance_0) :jm_getResourceAsStream_1 @l_resource))
                (JR/invoke (JR/scall 'MIDPUtil :jm_getInstance_0) :jm_createPlayerFromInputStream_2 @l_inputStream (JR/invoke (JR/fget (JR/scall 'AudioContentTypeDataFactory :jm_getInstance_0) :MIME_AUDIO_WAV) :jm_getName_0)))))
            (do
            (JR/sget 'NoPlayer "NO_PLAYER")))))

    
(defn jm_playTone_3 [p_frequency p_time p_volume]
  (let [this nil l_frequency (volatile! p_frequency) l_time (volatile! p_time) l_volume (volatile! p_volume)]
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'GameFeatureFactory :jm_getInstance_0) :SOUND))
            (do
            (JR/scall 'Manager :jm_playTone_3 @l_frequency @l_time @l_volume)))))



