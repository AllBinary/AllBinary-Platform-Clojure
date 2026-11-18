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
;; package org.allbinary.media.audio

(ns NoSound)

(JR/register 'NoSound 'Sound '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (NoSound/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoSound/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
        (Sound/jinit_1 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)) (jinitfields this)
        (JR/invoke this :jm_setPlayerP_1 (JR/sget 'NoPlayer "NO_PLAYER")))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoSound)] (jinit_0 o) o))



