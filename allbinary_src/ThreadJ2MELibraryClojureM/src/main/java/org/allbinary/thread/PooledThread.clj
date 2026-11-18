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

(ns PooledThread)

(JR/register 'PooledThread 'java.lang.Thread '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :threadObjectUtil nil)
  (JR/fset this :threadPool nil)
  (JR/fset this :INTERRUPT_EXCEPTION nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :threadObjectUtil (JR/scall 'ThreadObjectUtil :jm_getInstance_0))
    (JR/fset this :INTERRUPT_EXCEPTION "Exit InterruptedException")
  this)

    
(defn jinit_1 [this p_threadPool]
  (let [ l_threadPool (volatile! p_threadPool)]
        (JR/jsuper-init this 'java.lang.Thread [(JR/invoke @l_threadPool :jm_createName_0)]) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :threadPool @l_threadPool))
  this)

(defn jnew_1 [p_threadPool ]
  (let [o (JR/alloc 'PooledThread)] (jinit_1 o p_threadPool) o))

    
(defn jm_run_0 [this]
  (let [ l_task2 (volatile! nil) l_logUtil (volatile! nil) l_ex (volatile! nil) l_e (volatile! nil)]
        (JR/invoke (JR/fget this :threadPool) :jm_threadStarted_0)
        (JR/jwhile true false true
            (vreset! l_task2 (JR/fget (JR/fget this :threadObjectUtil) :NULL_PRIORITY_RUNNABLE))
            (try (do
                (vreset! l_task2 (JR/invoke (JR/fget this :threadPool) :jm_getTask_0))
                (JR/fset (JR/fget this :threadPool) :runningTask true)
                (JR/invoke (JR/fget this :threadPool) :jm_startTask_1 @l_task2))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.InterruptedException) (do (vreset! l_ex je)
                (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
                (JR/invoke @l_logUtil :jm_putF_3 (JR/fget this :INTERRUPT_EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN))
                (JR/jbreak)) :else (throw jt)))))
            (if (JR/eq @l_task2 (JR/fget (JR/fget this :threadObjectUtil) :NULL_PRIORITY_RUNNABLE))
                (do
                (JR/jbreak)))
            (try (do
                (JR/invoke @l_task2 :jm_run_0)
                (JR/invoke (JR/fget this :threadPool) :jm_completedTask_1 @l_task2)
                (JR/fset (JR/fget this :threadPool) :runningTask false))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
                (JR/invoke @l_logUtil :jm_put_4 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_task2))) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt))))))
        (JR/invoke (JR/fget this :threadPool) :jm_threadStopped_0)))



