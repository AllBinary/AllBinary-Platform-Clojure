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
;; package org.apache.xmlrpc

(ns NullXmlRpcHandler)

(JR/register 'NullXmlRpcHandler nil '[XmlRpcHandler])

(def jsv_NULL_XML_RPC_HANDLER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_XML_RPC_HANDLER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_XML_RPC_HANDLER)
(defn jstatic_set_NULL_XML_RPC_HANDLER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_XML_RPC_HANDLER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_XML_RPC_HANDLER (NullXmlRpcHandler/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullXmlRpcHandler)] (jinit_0 o) o))

    
(defn jm_execute_2 [this p_method p_params]
  (let [ l_method (volatile! p_method) l_params (volatile! p_params)]
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))



