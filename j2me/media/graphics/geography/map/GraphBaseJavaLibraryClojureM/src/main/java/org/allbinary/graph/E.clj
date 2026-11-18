;; Generated Code Do Not Modify
;; package org.allbinary.graph

(ns E)

(JR/register 'E nil '[])

(def jsv_e (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_e [] (JR/ensure-init jclinit-state jclinit) @jsv_e)
(defn jstatic_set_e [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_e v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_e (E/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'E)] (jinit_0 o) o))

    
(defn jm_newInstance_0 [this]
  (let []
        (E/jstatic_e)))



