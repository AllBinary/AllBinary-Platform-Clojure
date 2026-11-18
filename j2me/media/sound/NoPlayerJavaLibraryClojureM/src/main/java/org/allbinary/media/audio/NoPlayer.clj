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

(ns NoPlayer)

(JR/register 'NoPlayer 'BasicPlayer '[])

(def jsv_NO_PLAYER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_PLAYER [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_PLAYER)
(defn jstatic_set_NO_PLAYER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_PLAYER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_PLAYER (NoPlayer/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicPlayer/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoPlayer)] (jinit_0 o) o))

    
(defn jm_close_0 [this]
  (let []
        nil))

    
(defn jm_getContentType_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))

    
(defn jm_getControl_1 [this p_controlType]
  (let [ l_controlType (volatile! p_controlType)]
        (NullControl/jnew_0)))

    
(defn jm_getControls_0 [this]
  (let []
        (JR/anew "Object" 1 0)))



