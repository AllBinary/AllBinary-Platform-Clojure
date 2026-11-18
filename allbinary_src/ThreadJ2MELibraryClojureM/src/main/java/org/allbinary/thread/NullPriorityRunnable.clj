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
;; package org.allbinary.thread

(ns NullPriorityRunnable)

(JR/register 'NullPriorityRunnable nil '[PriorityRunnable])

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
  (let [o (JR/alloc 'NullPriorityRunnable)] (jinit_0 o) o))

    
(defn jm_getPriority_0 [this]
  (let []
        0))

    
(defn jm_isDone_0 [this]
  (let []
        true))

    
(defn jm_reset_0 [this]
  (let []
        nil))

    
(defn jm_run_0 [this]
  (let []
        nil))



