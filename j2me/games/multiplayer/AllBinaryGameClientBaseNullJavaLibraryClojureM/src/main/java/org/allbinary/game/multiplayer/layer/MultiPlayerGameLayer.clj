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

(ns MultiPlayerGameLayer)

(JR/register 'MultiPlayerGameLayer 'CollidableDestroyableDamageableLayer '[MultiPlayerGameLayerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_5 [this p_remoteInfo p_groupInterface p_name p_layerInfo p_viewPosition]
  (let [ l_remoteInfo (volatile! p_remoteInfo) l_groupInterface (volatile! p_groupInterface) l_name (volatile! p_name) l_layerInfo (volatile! p_layerInfo) l_viewPosition (volatile! p_viewPosition)]
        (CollidableDestroyableDamageableLayer/jinit_4 this @l_groupInterface @l_name @l_layerInfo @l_viewPosition) (jinitfields this))
  this)

(defn jnew_5 [p_remoteInfo p_groupInterface p_name p_layerInfo p_viewPosition ]
  (let [o (JR/alloc 'MultiPlayerGameLayer)] (jinit_5 o p_remoteInfo p_groupInterface p_name p_layerInfo p_viewPosition) o))

    
(defn jm_getMultiplayerBehavior_0 [this]
  (let []
        (JR/sget 'MultiplayerBehavior "NULL_MULTIPLAYER_BEHAVIOR")))

    
(defn jm_setPingInfo_1 [this p_show]
  (let [ l_show (volatile! p_show)]
        nil))

    
(defn jm_setFiring_1 [this p_firing]
  (let [ l_firing (volatile! p_firing)]
        nil))

    
(defn jm_getFiring_0 [this]
  (let []
        0))



