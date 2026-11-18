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
;; package org.allbinary.logic.util.event

(ns EventStrings)

(JR/register 'EventStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (EventStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :PERFORMANCE_MESSAGE nil)
  (JR/fset this :TOTAL_LISTENERS nil)
  (JR/fset this :LISTENER_LABEL nil)
  (JR/fset this :FIRE_EVENT nil)
    (JR/fset this :PERFORMANCE_MESSAGE "Use Custom onEvent Methods for needed optimization")
    (JR/fset this :TOTAL_LISTENERS "Total Listeners: ")
    (JR/fset this :LISTENER_LABEL " Listener: ")
    (JR/fset this :FIRE_EVENT "fireEvent")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'EventStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (EventStrings/jstatic_instance)))



