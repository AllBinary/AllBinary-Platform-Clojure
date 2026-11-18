;; Generated Code Do Not Modify
;; package org.allbinary.graphics.opengles.shader

(ns OpenGLObject3dProcessor)

(JR/register 'OpenGLObject3dProcessor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLObject3dProcessor)] (jinit_0 o) o))

    
(defn jm_process_2 [this p_gl p_object3d]
  (let [ l_gl (volatile! p_gl) l_object3d (volatile! p_object3d)]
        nil))

    
(defn jm_process_3 [this p_gl p_object3d p_index]
  (let [ l_gl (volatile! p_gl) l_object3d (volatile! p_object3d) l_index (volatile! p_index)]
        nil))



