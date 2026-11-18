;; Generated Code Do Not Modify
;; package org.bouncycastle.jce.provider

(ns BouncyCastleProvider)

(JR/register 'BouncyCastleProvider 'java.security.Provider '[])

(def jsv_info (atom nil))
(def jsv_PROVIDER_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_info [] (JR/ensure-init jclinit-state jclinit) @jsv_info)
(defn jstatic_set_info [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_info v))
(defn jstatic_PROVIDER_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_PROVIDER_NAME)
(defn jstatic_set_PROVIDER_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_PROVIDER_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_info "BouncyCastle Security Provider v1.41")
    (reset! jsv_PROVIDER_NAME "BC")
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (JR/jsuper-init this 'java.security.Provider [(BouncyCastleProvider/jstatic_PROVIDER_NAME) 1.41 (BouncyCastleProvider/jstatic_info)]) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BouncyCastleProvider)] (jinit_0 o) o))

    
(defn jm_setParameter_2 [this p_parameterName p_parameter]
  (let [ l_parameterName (volatile! p_parameterName) l_parameter (volatile! p_parameter)]
        nil))



