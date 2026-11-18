;; Generated Code Do Not Modify
;; package org.allbinary.thread

(ns ThreadObjectUtil)

(JR/register 'ThreadObjectUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ThreadObjectUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_PRIORITY_RUNNABLE nil)
    (JR/fset this :NULL_PRIORITY_RUNNABLE (NullPriorityRunnable/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThreadObjectUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ThreadObjectUtil/jstatic_instance)))

    
(defn jm_notifyObject_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke @l_anyType :jm_notify_0)))

    
(defn jm_waitObject_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke @l_anyType :jm_wait_0)))

    
(defn jm_waitObjectFor_2 [this p_anyType p_delay]
  (let [ l_anyType (volatile! p_anyType) l_delay (volatile! p_delay)]
        (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_waitFor_2 @l_anyType @l_delay)))

    
(defn jm_processThread_1 [this p_runnable]
  (let [ l_runnable (volatile! p_runnable) l_thread (volatile! nil)]
        (vreset! l_thread (new java.lang.Thread @l_runnable))
        (JR/invoke @l_thread :jm_start_0)))



