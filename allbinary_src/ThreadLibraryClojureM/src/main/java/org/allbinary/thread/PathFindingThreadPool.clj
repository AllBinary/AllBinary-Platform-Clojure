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
;; package org.allbinary.thread

;;This is mainly for network communications.
(ns PathFindingThreadPool)

(JR/register 'PathFindingThreadPool 'ThreadPool '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PathFindingThreadPool/jnew_3 "PathFinding" 1 1))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PathFindingThreadPool/jstatic_instance)))

    
(defn jinit_3 [this p_poolName p_numThreads p_priority]
  (let [ l_poolName (volatile! p_poolName) l_numThreads (volatile! p_numThreads) l_priority (volatile! p_priority)]
        (ThreadPool/jinit_3 this @l_poolName @l_numThreads (JR/sget 'ThreadPool "NORMAL_PRIORITY")) (jinitfields this))
  this)

(defn jnew_3 [p_poolName p_numThreads p_priority ]
  (let [o (JR/alloc 'PathFindingThreadPool)] (jinit_3 o p_poolName p_numThreads p_priority) o))

    
(defn jm_runTaskWithPriority_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        (JR/invoke-super 'ThreadPool this :jm_runTaskWithPriority_1 @l_task)))

    
(defn jm_runTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        (JR/invoke-super 'ThreadPool this :jm_runTask_1 @l_task)))

    
(defn jm_startTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        nil))

    
(defn jm_completedTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        nil))



