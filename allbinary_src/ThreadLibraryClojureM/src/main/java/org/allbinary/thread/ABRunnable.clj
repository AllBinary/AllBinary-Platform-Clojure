;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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

(ns ABRunnable)

(JR/register 'ABRunnable nil '[RunnableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :running false)
    (JR/fset this :running false)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ABRunnable)] (jinit_0 o) o))

    
(defn jm_setThread_1 [this p_thread]
  (let [ l_thread (volatile! p_thread)]
        nil))

    
(defn jm_isRunning_0 [this]
  (let []
        (JR/fget this :running)))

    
(defn jm_setRunning_1 [this p_running]
  (let [ l_running (volatile! p_running)]
        (JR/fset this :running @l_running)))

    
(defn jm_run_0 [this]
  (let []
        nil))

    
(defn jm_getType_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))



