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

(ns SequenceAI)

(JR/register 'SequenceAI 'ArrayAI '[])

(def jsv_SEQUENCE_AI (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SEQUENCE_AI [] (JR/ensure-init jclinit-state jclinit) @jsv_SEQUENCE_AI)
(defn jstatic_set_SEQUENCE_AI [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SEQUENCE_AI v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SEQUENCE_AI "Sequence AI")
    nil))

(defn jinitfields [this]
  (JR/fset this :index 0)
  this)

    
(defn jinit_3 [this p_artificialIntelligenceInterfaceArray p_ownerLayerInterface p_gameInput]
  (let [ l_artificialIntelligenceInterfaceArray (volatile! p_artificialIntelligenceInterfaceArray) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (ArrayAI/jinit_3 this @l_artificialIntelligenceInterfaceArray @l_ownerLayerInterface @l_gameInput) (jinitfields this))
  this)

(defn jnew_3 [p_artificialIntelligenceInterfaceArray p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'SequenceAI)] (jinit_3 o p_artificialIntelligenceInterfaceArray p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/invoke (JR/aget* (JR/invoke this :jm_getArtificialIntelligenceInterface_0) (JR/fget this :index)) :jm_processAI_1 @l_allBinaryLayerManager)))

    
(defn jm_next_0 [this]
  (let [ l_artificialIntelligenceInterface (volatile! nil) l_artificialIntelligenceTransitionInterface (volatile! nil)]
        (JR/finc this :index 1 :int false)
        (vreset! l_artificialIntelligenceInterface (JR/invoke this :jm_getSelectedArtificialIntelligenceInterface_0))
        (if (== (JR/invoke @l_artificialIntelligenceInterface :jm_getId_0) (JR/sget 'ArtificialIntelligence "AI_ID"))
            (do
            (vreset! l_artificialIntelligenceTransitionInterface @l_artificialIntelligenceInterface)
            (JR/invoke @l_artificialIntelligenceTransitionInterface :jm_transition_0)))))

    
(defn jm_getIndex_0 [this]
  (let []
        (JR/fget this :index)))

    
(defn jm_setIndex_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/fset this :index @l_index)))

    
(defn jm_getSelectedArtificialIntelligenceInterface_0 [this]
  (let []
        (JR/aget* (JR/invoke this :jm_getArtificialIntelligenceInterface_0) (JR/fget this :index))))

    
(defn jm_getName_0 [this]
  (let []
        (SequenceAI/jstatic_SEQUENCE_AI)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of this))
        (JR/invoke @l_stringBuffer :jm_append_1 " Selected AI: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke this :jm_getSelectedArtificialIntelligenceInterface_0)))
        (JR/to-string-of @l_stringBuffer)))



