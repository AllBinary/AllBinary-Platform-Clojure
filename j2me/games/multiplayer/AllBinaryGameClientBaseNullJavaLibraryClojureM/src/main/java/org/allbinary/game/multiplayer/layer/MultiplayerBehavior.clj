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
;; package org.allbinary.game.multiplayer.layer

(ns MultiplayerBehavior)

(JR/register 'MultiplayerBehavior nil '[])

(def jsv_NULL_MULTIPLAYER_BEHAVIOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_MULTIPLAYER_BEHAVIOR [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_MULTIPLAYER_BEHAVIOR)
(defn jstatic_set_NULL_MULTIPLAYER_BEHAVIOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_MULTIPLAYER_BEHAVIOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_MULTIPLAYER_BEHAVIOR (MultiplayerBehavior/jnew_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_username]
  (let [ l_username (volatile! p_username)]
    nil (jinitfields this)
        nil)
  this)

(defn jnew_1 [p_username ]
  (let [o (JR/alloc 'MultiplayerBehavior)] (jinit_1 o p_username) o))

    
(defn jm_startTick_0 [this]
  (let []
        nil))

    
(defn jm_endTick_0 [this]
  (let []
        nil))

    
(defn jm_getApproximateElapsed_0 [this]
  (let []
        0))



