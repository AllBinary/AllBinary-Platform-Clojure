;; Generated Code Do Not Modify
;; package org.allbinary.game.configuration.feature

(ns MultiPlayerGameFeatureFactory)

(JR/register 'MultiPlayerGameFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MultiPlayerGameFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MultiPlayerGameFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MultiPlayerGameFeatureFactory)] (jinit_0 o) o))

    
(defn jm_addCommands_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        nil))



