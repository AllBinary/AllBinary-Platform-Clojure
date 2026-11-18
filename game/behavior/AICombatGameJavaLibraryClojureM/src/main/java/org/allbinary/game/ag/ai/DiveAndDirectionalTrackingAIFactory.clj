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

(ns DiveAndDirectionalTrackingAIFactory)

(JR/register 'DiveAndDirectionalTrackingAIFactory nil '[ArtificialIntelligenceInterfaceFactoryInterface])

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
  (let [o (JR/alloc 'DiveAndDirectionalTrackingAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_visitorCanBeNull (volatile! nil) l_hashtable2 (volatile! nil) l_artificialIntelligenceInterface (volatile! nil)]
        (vreset! l_visitorCanBeNull (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'BasicAI "AI_VISITOR")))
        (if (nil? @l_visitorCanBeNull)
            (do
            (vreset! l_visitorCanBeNull (JR/scall 'ThrustAIVisitorFactory :jm_getInstance_0))))
        (vreset! l_hashtable2 (JR/invoke (BasicProbabilityAIDataFactory/jnew_0) :jm_getInstance_0))
        (JR/invoke @l_hashtable2 :jm_put_2 (JR/sget 'BasicAI "AI_VISITOR") (JR/scall 'LastKeyAIVisitorFactory :jm_getInstance_0))
        (vreset! l_artificialIntelligenceInterface (JR/invoke (BasicRandomAIFactory/jnew_0) :jm_getInstance_3 @l_hashtable2 @l_ownerLayerInterface @l_gameInput))
        (DiveAndDirectionalTrackingAI/jnew_4 @l_ownerLayerInterface @l_artificialIntelligenceInterface @l_gameInput @l_visitorCanBeNull)))



