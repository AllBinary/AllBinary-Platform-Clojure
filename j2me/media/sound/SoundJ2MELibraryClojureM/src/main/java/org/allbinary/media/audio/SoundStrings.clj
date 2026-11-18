;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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

(ns SoundStrings)

(JR/register 'SoundStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SoundStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :STOP_ALL nil)
  (JR/fset this :CLOSE_ALL nil)
  (JR/fset this :SOUND nil)
  (JR/fset this :INIT_SOUND nil)
  (JR/fset this :STOPPING_SOUND nil)
  (JR/fset this :CLOSING_SOUND nil)
    (JR/fset this :STOP_ALL "stopAll")
    (JR/fset this :CLOSE_ALL "closeAll")
    (JR/fset this :SOUND " Sound: ")
    (JR/fset this :INIT_SOUND "Initializing Sound: ")
    (JR/fset this :STOPPING_SOUND "Stopping Sound: ")
    (JR/fset this :CLOSING_SOUND "Closing Sound: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SoundStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SoundStrings/jstatic_instance)))



