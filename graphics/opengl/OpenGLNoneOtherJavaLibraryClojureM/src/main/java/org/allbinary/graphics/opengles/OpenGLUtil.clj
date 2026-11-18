;; Generated Code Do Not Modify
;; package org.allbinary.graphics.opengles

(ns OpenGLUtil)

(JR/register 'OpenGLUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLUtil/jstatic_instance)))

    
(defn jm_addImage_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        @l_image))

    
(defn jm_clear_0 [this]
  (let []
        nil))

    
(defn jm_addRunnable_1 [this p_runnable]
  (let [ l_runnable (volatile! p_runnable)]
        nil))



