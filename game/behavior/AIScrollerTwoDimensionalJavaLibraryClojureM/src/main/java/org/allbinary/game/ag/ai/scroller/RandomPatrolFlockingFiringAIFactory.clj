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
;; package org.allbinary.game.ag.ai.scroller

(ns RandomPatrolFlockingFiringAIFactory)

(JR/register 'RandomPatrolFlockingFiringAIFactory nil '[ArtificialIntelligenceInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'RandomPatrolFlockingFiringAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_artificialIntelligenceInterface (volatile! nil)]
        (vreset! l_artificialIntelligenceInterface (JR/anew "Object" 1 2))
        (JR/aset* @l_artificialIntelligenceInterface 0 (RandomPatrolAI/jnew_3 @l_hashtable @l_ownerLayerInterface @l_gameInput))
        (JR/aset* @l_artificialIntelligenceInterface 1 (TimedFireAI/jnew_3 1800 @l_ownerLayerInterface @l_gameInput))
        (ArrayAI/jnew_3 @l_artificialIntelligenceInterface @l_ownerLayerInterface @l_gameInput)))



