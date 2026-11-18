;; Generated Code Do Not Modify
;; package javax.microedition.khronos.egl

(ns EGLConfig)

(JR/register 'EGLConfig nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/jthrow (new java.lang.RuntimeException)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'EGLConfig)] (jinit_0 o) o))



