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
;; package org.allbinary.game.ag.ai.sequence

(ns NumberLayersSequenceAIFactory)

(JR/register 'NumberLayersSequenceAIFactory nil '[])

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
  (let [o (JR/alloc 'NumberLayersSequenceAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_4 [this p_numberOfEnemiesLeft p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput]
  (let [ l_numberOfEnemiesLeft (volatile! p_numberOfEnemiesLeft) l_artificialIntelligenceInterface (volatile! p_artificialIntelligenceInterface) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (NumberLayersSequenceAI/jnew_4 @l_numberOfEnemiesLeft @l_artificialIntelligenceInterface @l_ownerLayerInterface @l_gameInput)))



