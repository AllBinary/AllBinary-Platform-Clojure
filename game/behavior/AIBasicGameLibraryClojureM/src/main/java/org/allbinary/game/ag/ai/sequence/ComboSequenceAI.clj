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

(ns ComboSequenceAI)

(JR/register 'ComboSequenceAI 'SequenceAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_3 [this p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput]
  (let [ l_artificialIntelligenceInterface (volatile! p_artificialIntelligenceInterface) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (SequenceAI/jinit_3 this @l_artificialIntelligenceInterface @l_ownerLayerInterface @l_gameInput) (jinitfields this))
  this)

(defn jnew_3 [p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'ComboSequenceAI)] (jinit_3 o p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_artificialIntelligenceInterfaceArray (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_artificialIntelligenceInterfaceArray (JR/invoke this :jm_getArtificialIntelligenceInterface_0))
        (vreset! l_size (JR/alen @l_artificialIntelligenceInterfaceArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke this :jm_setIndex_1 @l_index)
            (JR/invoke-super 'SequenceAI this :jm_processAI_1 @l_allBinaryLayerManager)))))



