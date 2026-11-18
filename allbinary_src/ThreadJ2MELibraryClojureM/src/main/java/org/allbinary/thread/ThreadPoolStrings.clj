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

(ns ThreadPoolStrings)

(JR/register 'ThreadPoolStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ThreadPoolStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ADD_TASK nil)
  (JR/fset this :START_TASK nil)
  (JR/fset this :COMPLETE_TASK nil)
    (JR/fset this :ADD_TASK "addTask")
    (JR/fset this :START_TASK "Started Task: ")
    (JR/fset this :COMPLETE_TASK "Completed Task: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThreadPoolStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ThreadPoolStrings/jstatic_instance)))



