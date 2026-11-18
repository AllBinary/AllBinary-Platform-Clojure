;; Generated Code Do Not Modify
;; package org.allbinary.logic.util.cache

(ns PoolTypeFactory)

(JR/register 'PoolTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PoolTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :VECTOR_POOL nil)
    (JR/fset this :VECTOR_POOL (PoolType/jnew_1 (JR/fget (JR/scall 'CacheTypeFactory :jm_getInstance_0) :NO_CACHE)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PoolTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PoolTypeFactory/jstatic_instance)))



