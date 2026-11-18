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
;; package org.allbinary.logic.communication.log.config.type

(ns LogConfigTypeFactory)

(JR/register 'LogConfigTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LogConfigTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NO_DESCRIPTION nil)
  (JR/fset this :OS nil)
  (JR/fset this :FACTORYERROR nil)
    (JR/fset this :NO_DESCRIPTION "No Description")
    (JR/fset this :OS (LogConfigType/jnew_2 "Operating System" (JR/fget this :NO_DESCRIPTION)))
    (JR/fset this :FACTORYERROR (LogConfigType/jnew_2 "Factory Error" (JR/fget this :NO_DESCRIPTION)))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LogConfigTypeFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_add_1 (JR/fget this :OS))
        (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_add_1 (JR/fget this :FACTORYERROR)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LogConfigTypeFactory)] (jinit_0 o) o))



