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

(ns ThreadUtil)

(JR/register 'ThreadUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ThreadUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :JOIN nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :JOIN "join")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThreadUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ThreadUtil/jstatic_instance)))

    
(defn jm_isRunning_1 [this p_thread]
  (let [ l_thread (volatile! p_thread)]
        (if (and (some? @l_thread) (JR/invoke @l_thread :jm_isAlive_0))
            (do
            true)
            (do
            false))))

    
(defn jm_join_1 [this p_thread]
  (let [ l_thread (volatile! p_thread)]
        (if (JR/invoke (ThreadUtil/jm_getInstance_0) :jm_isRunning_1 @l_thread)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Waiting for Thread To Join/End" this (JR/fget this :JOIN))
            (JR/invoke @l_thread :jm_join_0)))))



