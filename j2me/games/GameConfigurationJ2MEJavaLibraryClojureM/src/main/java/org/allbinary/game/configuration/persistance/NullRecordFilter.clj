;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.game.configuration.persistance

(ns NullRecordFilter)

(JR/register 'NullRecordFilter nil '[RecordFilter])

(def jsv_NULL_RECORD_FILTER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_RECORD_FILTER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_RECORD_FILTER)
(defn jstatic_set_NULL_RECORD_FILTER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_RECORD_FILTER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_RECORD_FILTER (NullRecordFilter/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullRecordFilter)] (jinit_0 o) o))

    
(defn jm_matches_1 [this p_candidate]
  (let [ l_candidate (volatile! p_candidate)]
        true))



