;; Generated Code Do Not Modify
;; package org.apache.xmlrpc

(ns XmlRpcException)

(JR/register 'XmlRpcException 'java.lang.Exception '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_code p_message]
  (let [ l_code (volatile! p_code) l_message (volatile! p_message)]
        (JR/jsuper-init this 'java.lang.Exception [@l_message]) (jinitfields this))
  this)

(defn jnew_2 [p_code p_message ]
  (let [o (JR/alloc 'XmlRpcException)] (jinit_2 o p_code p_message) o))



