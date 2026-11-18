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
;; package org.allbinary.logic.java.exception

;;ActualPlatform
(ns ExceptionUtil)

(JR/register 'ExceptionUtil nil '[])

(def jsv_instance (atom nil))
(def jsv_PRETEND_EXCEPTION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))
(defn jstatic_PRETEND_EXCEPTION [] (JR/ensure-init jclinit-state jclinit) @jsv_PRETEND_EXCEPTION)
(defn jstatic_set_PRETEND_EXCEPTION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_PRETEND_EXCEPTION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ExceptionUtil/jnew_0))
    (reset! jsv_PRETEND_EXCEPTION (new java.lang.Exception "Not Really An Exception"))
    nil))

(defn jinitfields [this]
  (JR/fset this :NONE nil)
    (JR/fset this :NONE "No Stack Trace")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ExceptionUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ExceptionUtil)] (jinit_0 o) o))

    
(defn jm_getStackTrace_1 [this p_e]
  (let [ l_e (volatile! p_e)]
        (JR/invoke @l_e :jm_printStackTrace_0)
        (JR/fget this :NONE)))



