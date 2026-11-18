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
;; package org.allbinary.game.ag.ai

(ns NumberOnOwnGroupSequenceAI)

(JR/register 'NumberOnOwnGroupSequenceAI 'SequenceAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :numberOnSameTeam nil)
  this)

    
(defn jinit_4 [this p_numberOnSameTeam p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput]
  (let [ l_numberOnSameTeam (volatile! p_numberOnSameTeam) l_artificialIntelligenceInterface (volatile! p_artificialIntelligenceInterface) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (SequenceAI/jinit_3 this @l_artificialIntelligenceInterface @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :numberOnSameTeam @l_numberOnSameTeam))
  this)

(defn jnew_4 [p_numberOnSameTeam p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'NumberOnOwnGroupSequenceAI)] (jinit_4 o p_numberOnSameTeam p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerInterface (volatile! nil) l_index (volatile! nil) l_size (volatile! nil)]
        (vreset! l_layerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_index (JR/invoke this :jm_getIndex_0))
        (if (> (JR/alen (JR/fget this :numberOnSameTeam)) @l_index)
            (do
            (vreset! l_size (JR/invoke (JR/scall 'GroupLayerManagerListener :jm_getInstance_0) :jm_getGroupSizeFromInterface_1 @l_layerInterface))
            (if (> (JR/invoke (JR/aget* (JR/fget this :numberOnSameTeam) @l_index) :jm_intValue_0) @l_size)
                (do
                (JR/invoke this :jm_next_0)))))
        (JR/invoke-super 'SequenceAI this :jm_processAI_1 @l_allBinaryLayerManager)))



