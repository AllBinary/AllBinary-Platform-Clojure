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
;; package org.allbinary.logic.communication.http

(ns HttpData)

(JR/register 'HttpData nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (HttpData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EQUALS nil)
  (JR/fset this :PARAM_SEP nil)
  (JR/fset this :URL_PARAM_SEP nil)
  (JR/fset this :URL_LABEL nil)
    (JR/fset this :URL_LABEL "Url: ")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HttpData/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_commonSeps (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/fset this :EQUALS (JR/fget @l_commonSeps :EQUALS))
        (JR/fset this :PARAM_SEP (JR/fget @l_commonSeps :AMPERSAND))
        (JR/fset this :URL_PARAM_SEP (JR/fget @l_commonSeps :QUESTION)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HttpData)] (jinit_0 o) o))



