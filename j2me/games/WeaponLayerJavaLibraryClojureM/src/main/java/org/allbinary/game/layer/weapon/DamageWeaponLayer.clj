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
;; package org.allbinary.game.layer.weapon

(ns DamageWeaponLayer)

(JR/register 'DamageWeaponLayer 'WeaponLayer '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_11 [this p_name p_remoteInfo p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition p_username p_actorSessionId p_id p_multiPlayerType]
  (let [ l_name (volatile! p_name) l_remoteInfo (volatile! p_remoteInfo) l_movement (volatile! p_movement) l_animationInterface (volatile! p_animationInterface) l_destroyedAnimationInterface (volatile! p_destroyedAnimationInterface) l_rectangle (volatile! p_rectangle) l_viewPosition (volatile! p_viewPosition) l_username (volatile! p_username) l_actorSessionId (volatile! p_actorSessionId) l_id (volatile! p_id) l_multiPlayerType (volatile! p_multiPlayerType)]
        (WeaponLayer/jinit_8 this @l_name @l_remoteInfo @l_multiPlayerType @l_movement @l_animationInterface @l_destroyedAnimationInterface @l_rectangle @l_viewPosition) (jinitfields this)
        (JR/invoke this :jm_setCollidableInferface_1 (CollidableDamageWeaponBehavior/jnew_1 true)))
  this)

(defn jnew_11 [p_name p_remoteInfo p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition p_username p_actorSessionId p_id p_multiPlayerType ]
  (let [o (JR/alloc 'DamageWeaponLayer)] (jinit_11 o p_name p_remoteInfo p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition p_username p_actorSessionId p_id p_multiPlayerType) o))



