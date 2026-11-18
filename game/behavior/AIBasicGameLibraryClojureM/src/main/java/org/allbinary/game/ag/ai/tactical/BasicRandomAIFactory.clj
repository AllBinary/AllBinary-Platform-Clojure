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
;; package org.allbinary.game.ag.ai.tactical

(ns BasicRandomAIFactory)

(JR/register 'BasicRandomAIFactory nil '[ArtificialIntelligenceInterfaceFactoryInterface])

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
  (let [o (JR/alloc 'BasicRandomAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_visitor (volatile! nil) l_inputProbability (volatile! nil)]
        (vreset! l_visitor (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'BasicAI "AI_VISITOR")))
        (if (nil? @l_visitor)
            (do
            (JR/jthrow (new java.lang.Exception "No Visitor Provided"))))
        (vreset! l_inputProbability (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'InputProbability "INPUT_PROBABILITY")))
        (BasicRandomAI/jnew_4 @l_ownerLayerInterface @l_gameInput @l_inputProbability @l_visitor)))



