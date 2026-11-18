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
;; package org.allbinary.emulator.swt

(ns SWTRunnableProcessor)

(JR/register 'SWTRunnableProcessor 'SWTProcessor '[])

(def jsv_instanceR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceR [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceR)
(defn jstatic_set_instanceR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceR (SWTRunnableProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SWTRunnableProcessor/jstatic_instanceR)))

    
(defn jinit_0 [this]
  (let []
    (SWTProcessor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SWTRunnableProcessor)] (jinit_0 o) o))

    
(defn jm_process_1 [this p_display]
  (let [ l_display (volatile! p_display)]
        (JR/invoke (JR/fget this :runnable) :jm_run_0)))



