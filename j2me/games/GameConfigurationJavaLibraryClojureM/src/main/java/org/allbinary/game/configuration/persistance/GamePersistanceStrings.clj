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

(ns GamePersistanceStrings)

(JR/register 'GamePersistanceStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GamePersistanceStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SAVED_GAME_RECORD_ID nil)
  (JR/fset this :SAVED_GAME_CONFIGURATION_RECORD_ID nil)
  (JR/fset this :DEFAULT_INPUT_MAPPING_RECORD_ID nil)
  (JR/fset this :SAVED_INPUT_CONFIGURATION_RECORD_ID nil)
    (JR/fset this :SAVED_GAME_RECORD_ID "_SG")
    (JR/fset this :SAVED_GAME_CONFIGURATION_RECORD_ID "_SGC")
    (JR/fset this :DEFAULT_INPUT_MAPPING_RECORD_ID "_DIM")
    (JR/fset this :SAVED_INPUT_CONFIGURATION_RECORD_ID "_SIC")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GamePersistanceStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GamePersistanceStrings/jstatic_instance)))



