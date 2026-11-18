;; 
;; To change this license header, choose License Headers in Project Properties. 
;; To change this template file, choose Tools | Templates 
;; and open the template in the editor.  
;; Generated Code Do Not Modify
;; package org.allbinary.game.multiplayer.layer

(ns RemoteInfo)

(JR/register 'RemoteInfo nil '[])

(def jsv_NEW_PLAYER_ID (atom 0))
(def jsv_REMOTE_INFO (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NEW_PLAYER_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_NEW_PLAYER_ID)
(defn jstatic_set_NEW_PLAYER_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NEW_PLAYER_ID v))
(defn jstatic_REMOTE_INFO [] (JR/ensure-init jclinit-state jclinit) @jsv_REMOTE_INFO)
(defn jstatic_set_REMOTE_INFO [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_REMOTE_INFO v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NEW_PLAYER_ID 0)
    (reset! jsv_REMOTE_INFO (RemoteInfo/jnew_4 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1))) (RemoteInfo/jstatic_NEW_PLAYER_ID)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_4 [this p_username p_actorSessionId p_playerInputId p_id]
  (let [ l_username (volatile! p_username) l_actorSessionId (volatile! p_actorSessionId) l_playerInputId (volatile! p_playerInputId) l_id (volatile! p_id)]
    nil (jinitfields this)
        nil)
  this)

(defn jnew_4 [p_username p_actorSessionId p_playerInputId p_id ]
  (let [o (JR/alloc 'RemoteInfo)] (jinit_4 o p_username p_actorSessionId p_playerInputId p_id) o))



