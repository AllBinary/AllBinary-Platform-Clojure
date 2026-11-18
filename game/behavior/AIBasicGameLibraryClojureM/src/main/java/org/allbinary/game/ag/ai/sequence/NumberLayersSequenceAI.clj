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

(ns NumberLayersSequenceAI)

(JR/register 'NumberLayersSequenceAI 'SequenceAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :numberOfLayersLeft 0)
  this)

    
(defn jinit_4 [this p_numberOfEnemiesLeft p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput]
  (let [ l_numberOfEnemiesLeft (volatile! p_numberOfEnemiesLeft) l_artificialIntelligenceInterface (volatile! p_artificialIntelligenceInterface) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (SequenceAI/jinit_3 this @l_artificialIntelligenceInterface @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :numberOfLayersLeft @l_numberOfEnemiesLeft))
  this)

(defn jnew_4 [p_numberOfEnemiesLeft p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'NumberLayersSequenceAI)] (jinit_4 o p_numberOfEnemiesLeft p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (if (== (JR/invoke this :jm_getIndex_0) 0)
            (do
            (if (< (JR/invoke @l_allBinaryLayerManager :jm_getSize_0) (JR/fget this :numberOfLayersLeft))
                (do
                (JR/invoke this :jm_setIndex_1 1)))))
        (JR/invoke-super 'SequenceAI this :jm_processAI_1 @l_allBinaryLayerManager)))



