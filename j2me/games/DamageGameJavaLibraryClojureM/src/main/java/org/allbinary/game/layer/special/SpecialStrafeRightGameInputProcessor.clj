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
;; package org.allbinary.game.layer.special

(ns SpecialStrafeRightGameInputProcessor)

(JR/register 'SpecialStrafeRightGameInputProcessor 'SpecialGameInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_collidableDestroyableDamageableLayer]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer)]
        (SpecialGameInputProcessor/jinit_1 this @l_collidableDestroyableDamageableLayer) (jinitfields this))
  this)

(defn jnew_1 [p_collidableDestroyableDamageableLayer ]
  (let [o (JR/alloc 'SpecialStrafeRightGameInputProcessor)] (jinit_1 o p_collidableDestroyableDamageableLayer) o))

    
(defn jm_processEvent_2 [this p_allbinaryLayerManager p_gameKeyEvent]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke (JR/fget this :collidableDestroyableDamageableLayer) :jm_strafeRight_0)))



