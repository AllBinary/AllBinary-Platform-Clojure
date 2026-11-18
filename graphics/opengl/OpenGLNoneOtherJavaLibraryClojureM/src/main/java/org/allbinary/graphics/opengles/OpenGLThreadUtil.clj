;; Generated Code Do Not Modify
;; package org.allbinary.graphics.opengles

(ns OpenGLThreadUtil)

(JR/register 'OpenGLThreadUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLThreadUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLThreadUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLThreadUtil/jstatic_instance)))

    
(defn jm_set_1 [this p_glSurfaceView]
  (let [ l_glSurfaceView (volatile! p_glSurfaceView)]
        nil))

    
(defn jm_onPause_0 [this]
  (let []
        nil))

    
(defn jm_onResume_0 [this]
  (let []
        nil))



