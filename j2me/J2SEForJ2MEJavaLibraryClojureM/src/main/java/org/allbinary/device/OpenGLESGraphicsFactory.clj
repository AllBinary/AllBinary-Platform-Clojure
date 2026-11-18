;; Generated Code Do Not Modify
;; package org.allbinary.device

(ns OpenGLESGraphicsFactory)

(JR/register 'OpenGLESGraphicsFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESGraphicsFactory)] (jinit_0 o) o))

    
(defn jm_getOpenGLESGraphicsInstance_0 [this]
  (let []
        (JR/scall 'OpenGLESNullGraphicsFactory :jm_getInstance_0)))



