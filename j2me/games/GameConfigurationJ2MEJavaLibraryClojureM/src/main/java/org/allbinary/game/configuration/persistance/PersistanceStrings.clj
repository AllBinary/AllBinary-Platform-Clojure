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

(ns PersistanceStrings)

(JR/register 'PersistanceStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PersistanceStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SAVING nil)
  (JR/fset this :NUMBER_OF_RECORDS nil)
  (JR/fset this :LOADING_ID nil)
  (JR/fset this :LOAD_ALL nil)
  (JR/fset this :DELETING_WITH_ID nil)
  (JR/fset this :CLOSING_RECORDSTORE nil)
  (JR/fset this :NOT_SAVING nil)
  (JR/fset this :ERROR_LOADING nil)
  (JR/fset this :ERROR_LOADING_ID nil)
  (JR/fset this :ID nil)
  (JR/fset this :GAME_ACTION_INPUT nil)
    (JR/fset this :SAVING "Saving: ")
    (JR/fset this :NUMBER_OF_RECORDS "Number of records: ")
    (JR/fset this :LOADING_ID "Loading data with id: ")
    (JR/fset this :LOAD_ALL "loadAll")
    (JR/fset this :DELETING_WITH_ID "Deleting data with id: ")
    (JR/fset this :CLOSING_RECORDSTORE "Closing RecordStore")
    (JR/fset this :NOT_SAVING "Not Saving: ")
    (JR/fset this :ERROR_LOADING "Error Loading gameActionInput: ")
    (JR/fset this :ERROR_LOADING_ID "Error Loading id: ")
    (JR/fset this :ID " id: ")
    (JR/fset this :GAME_ACTION_INPUT " GameActionInput: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PersistanceStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PersistanceStrings/jstatic_instance)))



