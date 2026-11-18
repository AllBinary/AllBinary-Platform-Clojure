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

(ns NullAIFactory)

(JR/register 'NullAIFactory nil '[ArtificialIntelligenceInterfaceFactoryInterface])

(def jsv_NULL_AI (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_AI [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_AI)
(defn jstatic_set_NULL_AI [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_AI v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_AI (NullAI/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (NullAIFactory/jstatic_NULL_AI)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NullAIFactory/jstatic_NULL_AI)))



