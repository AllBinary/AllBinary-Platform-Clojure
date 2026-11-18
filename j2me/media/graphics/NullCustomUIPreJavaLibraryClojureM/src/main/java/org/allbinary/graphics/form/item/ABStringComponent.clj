;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns ABStringComponent)

(JR/register 'ABStringComponent nil '[])

(def jsv_NULL_STRING_COMPONENT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_STRING_COMPONENT [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_STRING_COMPONENT)
(defn jstatic_set_NULL_STRING_COMPONENT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_STRING_COMPONENT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_STRING_COMPONENT (ABStringComponent/jnew_2 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getBackgroundBasicColor_0 [this]
  (let []
        (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))

    
(defn jinit_2 [this p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
    nil (jinitfields this)
        nil)
  this)

(defn jnew_2 [p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ABStringComponent)] (jinit_2 o p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_getForegroundBasicColor_0 [this]
  (let []
        (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))

    
(defn jm_setForegroundBasicColor_1 [this p_foregroundBasicColor]
  (let [ l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        nil))



