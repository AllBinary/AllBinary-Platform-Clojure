;; Generated Code Do Not Modify
;; package org.allbinary.graphics.opengles

(ns OpenGLProcessor)

(JR/register 'OpenGLProcessor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLProcessor)] (jinit_0 o) o))

    
(defn jm_process_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        nil))



