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

(ns DiveAndDirectionalTrackingAICompositeVisitorFactory)

(JR/register 'DiveAndDirectionalTrackingAICompositeVisitorFactory nil '[])

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
  (let [o (JR/alloc 'DiveAndDirectionalTrackingAICompositeVisitorFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_diveBombAI]
  (let [ l_diveBombAI (volatile! p_diveBombAI)]
        (JR/scall 'Visitor :jm_getInstance_0)))



