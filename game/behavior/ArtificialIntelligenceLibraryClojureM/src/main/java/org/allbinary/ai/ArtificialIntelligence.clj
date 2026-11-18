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
;; package org.allbinary.ai

(ns ArtificialIntelligence)

(JR/register 'ArtificialIntelligence nil '[ArtificialIntelligenceInterface])

(def jsv_AI_ID (atom 0))
(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_AI_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_AI_ID)
(defn jstatic_set_AI_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_AI_ID v))
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_AI_ID 2)
    (reset! jsv_instance (ArtificialIntelligence/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ArtificialIntelligence/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ArtificialIntelligence)] (jinit_0 o) o))

    
(defn jm_processAI_1 [this p_layerManager]
  (let [ l_layerManager (volatile! p_layerManager)]
        nil))

    
(defn jm_getId_0 [this]
  (let []
        1))



