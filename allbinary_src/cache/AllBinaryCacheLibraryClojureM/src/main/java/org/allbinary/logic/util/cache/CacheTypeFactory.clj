;; Generated Code Do Not Modify
;; package org.allbinary.logic.util.cache

(ns CacheTypeFactory)

(JR/register 'CacheTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CacheTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NO_CACHE nil)
  (JR/fset this :CACHE nil)
  (JR/fset this :SET nil)
  (JR/fset this :CACHE_VECTOR nil)
    (JR/fset this :NO_CACHE (CacheType/jnew_2 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    (JR/fset this :CACHE (CacheType/jnew_2 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    (JR/fset this :SET (CacheType/jnew_2 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) "Set"))
    (JR/fset this :CACHE_VECTOR (CacheType/jnew_2 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CacheTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CacheTypeFactory/jstatic_instance)))



