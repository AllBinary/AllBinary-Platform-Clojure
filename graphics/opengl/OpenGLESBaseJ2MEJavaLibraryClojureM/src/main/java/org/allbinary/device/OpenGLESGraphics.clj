;; Generated Code Do Not Modify
;; package org.allbinary.device

(ns OpenGLESGraphics)

(JR/register 'OpenGLESGraphics nil '[OpenGLSurfaceChangedInterface GraphicsInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :gl nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :gl (JR/sget 'NullGL10 "NULL_GL10"))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLESGraphics)] (jinit_0 o) o))

    
(defn jm_updateGL_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        nil))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        nil))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_update_0 [this]
  (let []
        nil))

    
(defn jm_setOrthoginalMode_0 [this]
  (let []
        nil))

    
(defn jm_setCameraMode_0 [this]
  (let []
        nil))

    
(defn jm_getGlP_0 [this]
  (let []
        (JR/fget this :gl)))

    
(defn jm_setFontDebug_2 [this p_font p_fontDebug]
  (let [ l_font (volatile! p_font) l_fontDebug (volatile! p_fontDebug)]
        (JR/jthrow (new java.lang.RuntimeException))))



