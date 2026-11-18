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
;; package org.allbinary.audio

(ns AudioContentTypeDataFactory)

(JR/register 'AudioContentTypeDataFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AudioContentTypeDataFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :MIME_AUDIO_TONE nil)
  (JR/fset this :MIME_AUDIO_AMR nil)
  (JR/fset this :MIME_AUDIO_AMR_WB nil)
  (JR/fset this :MIME_AUDIO_WAV nil)
  (JR/fset this :MIME_AUDIO_MIDI nil)
  (JR/fset this :MIME_AUDIO_SP_MIDI nil)
    (JR/fset this :MIME_AUDIO_TONE (AudioContentTypeData/jnew_1 "audio/x-tone-seq"))
    (JR/fset this :MIME_AUDIO_AMR (AudioContentTypeData/jnew_1 "audio/amr"))
    (JR/fset this :MIME_AUDIO_AMR_WB (AudioContentTypeData/jnew_1 "audio/amr-wb"))
    (JR/fset this :MIME_AUDIO_WAV (AudioContentTypeData/jnew_1 "audio/x-wav"))
    (JR/fset this :MIME_AUDIO_MIDI (AudioContentTypeData/jnew_1 "audio/midi"))
    (JR/fset this :MIME_AUDIO_SP_MIDI (AudioContentTypeData/jnew_1 "audio/sp-midi"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AudioContentTypeDataFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AudioContentTypeDataFactory)] (jinit_0 o) o))



