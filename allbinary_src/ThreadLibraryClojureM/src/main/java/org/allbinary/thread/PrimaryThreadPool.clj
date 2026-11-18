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

(ns PrimaryThreadPool)

(JR/register 'PrimaryThreadPool 'ThreadPool '[])

(def jsv_THREAD_POOL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_THREAD_POOL [] (JR/ensure-init jclinit-state jclinit) @jsv_THREAD_POOL)
(defn jstatic_set_THREAD_POOL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_THREAD_POOL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_THREAD_POOL (ThreadPool/jnew_3 "Primary" 1 (JR/sget 'ThreadPool "NORMAL_PRIORITY")))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PrimaryThreadPool/jstatic_THREAD_POOL)))

    
(defn jinit_3 [this p_poolName p_numThreads p_priority]
  (let [ l_poolName (volatile! p_poolName) l_numThreads (volatile! p_numThreads) l_priority (volatile! p_priority)]
        (ThreadPool/jinit_3 this @l_poolName @l_numThreads @l_priority) (jinitfields this))
  this)

(defn jnew_3 [p_poolName p_numThreads p_priority ]
  (let [o (JR/alloc 'PrimaryThreadPool)] (jinit_3 o p_poolName p_numThreads p_priority) o))

    
(defn jm_runTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_task)) :jm_appendlong_1 (java.lang.System/currentTimeMillis))) this (JR/fget (JR/fget this :threadPoolStrings) :ADD_TASK))
        (JR/invoke-super 'ThreadPool this :jm_runTask_1 @l_task)))

    
(defn jm_startTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :threadPoolStrings) :START_TASK)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_task))) this (JR/fget (JR/fget this :commonStrings) :RUN))))

    
(defn jm_completedTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :threadPoolStrings) :COMPLETE_TASK)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_task))) this (JR/fget (JR/fget this :commonStrings) :RUN))))



