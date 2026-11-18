;; Generated Code Do Not Modify
;; package org.apache.xmlrpc

(ns XmlRpcClient)

(JR/register 'XmlRpcClient nil '[XmlRpcHandler])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :url nil)
  this)

    
(defn jinit_1 [this p_url]
  (let [ l_url (volatile! p_url)]
    nil (jinitfields this)
        (JR/fset this :url (new java.net.URL @l_url)))
  this)

(defn jnew_1 [p_url ]
  (let [o (JR/alloc 'XmlRpcClient)] (jinit_1 o p_url) o))

    
(defn jm_getURL_0 [this]
  (let []
        (JR/fget this :url)))

    
(defn jm_setBasicAuthentication_2 [this p_user p_password]
  (let [ l_user (volatile! p_user) l_password (volatile! p_password)]
        nil))

    
(defn jm_execute_2 [this p_method p_params]
  (let [ l_method (volatile! p_method) l_params (volatile! p_params)]
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))

    
(defn jm_executeWithCrypt_3 [this p_method p_params p_cryptInterface]
  (let [ l_method (volatile! p_method) l_params (volatile! p_params) l_cryptInterface (volatile! p_cryptInterface)]
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))



