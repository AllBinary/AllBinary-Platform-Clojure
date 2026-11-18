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

(ns ThreadPool)

(JR/register 'ThreadPool nil '[])

(def jsv_ROOT_NAME (atom nil))
(def jsv_NORMAL_PRIORITY (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_ROOT_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_ROOT_NAME)
(defn jstatic_set_ROOT_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ROOT_NAME v))
(defn jstatic_NORMAL_PRIORITY [] (JR/ensure-init jclinit-state jclinit) @jsv_NORMAL_PRIORITY)
(defn jstatic_set_NORMAL_PRIORITY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NORMAL_PRIORITY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_ROOT_NAME "-PooledThread-")
    (reset! jsv_NORMAL_PRIORITY java.lang.Thread/NORM_PRIORITY)
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :NULL_RUNNABLE nil)
  (JR/fset this :threadPoolStrings nil)
  (JR/fset this :threadObjectUtil nil)
  (JR/fset this :poolName nil)
  (JR/fset this :priority 0)
  (JR/fset this :isAlive false)
  (JR/fset this :taskQueue nil)
  (JR/fset this :threadID 0)
  (JR/fset this :numThreads 0)
  (JR/fset this :runningTask false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :NULL_RUNNABLE (JR/scall 'NullRunnable :jm_getInstance_0))
    (JR/fset this :threadPoolStrings (JR/scall 'ThreadPoolStrings :jm_getInstance_0))
    (JR/fset this :threadObjectUtil (JR/scall 'ThreadObjectUtil :jm_getInstance_0))
    (JR/fset this :isAlive false)
    (JR/fset this :taskQueue (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
  this)

    
(defn jinit_3 [this p_poolName p_numThreads p_priority]
  (let [ l_poolName (volatile! p_poolName) l_numThreads (volatile! p_numThreads) l_priority (volatile! p_priority)]
    nil (jinitfields this)
        (JR/fset this :poolName @l_poolName)
        (JR/fset this :priority @l_priority)
        (JR/fset this :numThreads @l_numThreads))
  this)

(defn jnew_3 [p_poolName p_numThreads p_priority ]
  (let [o (JR/alloc 'ThreadPool)] (jinit_3 o p_poolName p_numThreads p_priority) o))

    
(defn jm_init_0 [this]
  (let [ l_pooledThread (volatile! nil) l_i (volatile! nil)]
        (if (not (JR/fget this :isAlive))
            (do
            (JR/fset this :isAlive true)
            (JR/fset this :taskQueue (BasicArrayListD/jnew_0))
            (vreset! l_pooledThread nil)
            (do (vreset! l_i 0)
                (JR/jfor false false (< @l_i (JR/fget this :numThreads)) (do (JR/vinc l_i 1 :int false))
                (vreset! l_pooledThread (PooledThread/jnew_1 this))
                (JR/invoke @l_pooledThread :jm_setPriority_1 (JR/fget this :priority))
                (JR/invoke @l_pooledThread :jm_start_0)))))))

    
(defn jm_runAPriorityTask_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_runTaskWithPriority_1 [this p_task]
  (let [ l_task (volatile! p_task) l_size (volatile! nil) l_runnable (volatile! nil) l_lowerPriorityRunnable (volatile! nil) l_index (volatile! nil)]
        (locking this
            (if (not (JR/fget this :isAlive))
                (do
                (JR/invoke this :jm_init_0)))
            (if (some? @l_task)
                (do
                (vreset! l_size (JR/invoke (JR/fget this :taskQueue) :jm_size_0))
                (vreset! l_runnable nil)
                (vreset! l_lowerPriorityRunnable (JR/fget (JR/fget this :threadObjectUtil) :NULL_PRIORITY_RUNNABLE))
                (do (vreset! l_index 0)
                    (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                    (vreset! l_runnable (JR/invoke (JR/fget this :taskQueue) :jm_get_1 @l_index))
                    (if (> (JR/invoke @l_runnable :jm_getPriority_0) (JR/invoke @l_task :jm_getPriority_0))
                        (do
                        (vreset! l_lowerPriorityRunnable @l_runnable)
                        (JR/jbreak)))))
                (if (JR/eq @l_lowerPriorityRunnable (JR/fget (JR/fget this :threadObjectUtil) :NULL_PRIORITY_RUNNABLE))
                    (do
                    (JR/invoke (JR/fget this :taskQueue) :jm_add_1 @l_task))
                    (do
                    (vreset! l_index (JR/invoke (JR/fget this :taskQueue) :jm_indexOf_1 @l_lowerPriorityRunnable))
                    (JR/invoke (JR/fget this :taskQueue) :jm_addAt_2 @l_index @l_task)))
                (JR/invoke this :jm_notify_0))))))

    
(defn jm_runTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        (locking this
            (if (not (JR/fget this :isAlive))
                (do
                (JR/invoke this :jm_init_0)))
            (if (some? @l_task)
                (do
                (JR/invoke (JR/fget this :taskQueue) :jm_add_1 @l_task)
                (JR/invoke this :jm_notify_0))))))

    
(defn jm_getTask_0 [this]
  (let [ l_runnable (volatile! nil)](JR/method
        (locking this
            (JR/jwhile false false (== (JR/invoke (JR/fget this :taskQueue) :jm_size_0) 0)
                (if (not (JR/fget this :isAlive))
                    (do
                    (JR/jreturn (JR/fget this :NULL_RUNNABLE))))
                (JR/invoke this :jm_wait_0))
            (vreset! l_runnable (JR/invoke (JR/fget this :taskQueue) :jm_removeAt_1 0))
            (JR/jreturn @l_runnable)))))

    
(defn jm_clear_0 [this]
  (let []
        (locking this
            (if (JR/fget this :isAlive)
                (do
                (JR/invoke (JR/fget this :taskQueue) :jm_clear_0))))))

    
(defn jm_close_0 [this]
  (let []
        (locking this
            (if (JR/fget this :isAlive)
                (do
                (JR/fset this :isAlive false)
                (JR/invoke (JR/fget this :taskQueue) :jm_clear_0))))))

    
(defn jm_join_0 [this]
  (let []
        (locking this
            (JR/fset this :isAlive false)
            (JR/invoke (JR/fget this :taskQueue) :jm_clear_0)
            (JR/invoke this :jm_notifyAll_0))))

    
(defn jm_isBusy_0 [this]
  (let [](JR/method
        (if (not (JR/fget this :isAlive))
            (do
            (JR/jreturn false)))
        (if (> (JR/invoke (JR/fget this :taskQueue) :jm_size_0) 0)
            (do
            (JR/jreturn true)))
        (if (JR/fget this :runningTask)
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_threadStarted_0 [this]
  (let []
        nil))

    
(defn jm_threadStopped_0 [this]
  (let []
        (if (== (JR/fget this :numThreads) 1)
            (do
            (JR/fset this :isAlive false)
            (JR/invoke (JR/fget this :taskQueue) :jm_clear_0)))))

    
(defn jm_startTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        nil))

    
(defn jm_completedTask_1 [this p_task]
  (let [ l_task (volatile! p_task)]
        nil))

    
(defn jm_createName_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :poolName)) :jm_append_1 (ThreadPool/jstatic_ROOT_NAME)) :jm_appendint_1 (JR/finc this :threadID 1 :int true)))))



