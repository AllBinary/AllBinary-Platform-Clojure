;; Generated Code Do Not Modify
;; package org.allbinary.graphics

(ns OpenGLBitmapFactory)

(JR/register 'OpenGLBitmapFactory 'PlatformBitmapBaseFactory '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLBitmapFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ARGB_8888 nil)
    (JR/fset this :ARGB_8888 (OpenGLBitmapConfig/jnew_1 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))
  this)

(defn jinit_0 [this]
  (PlatformBitmapBaseFactory/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLBitmapFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLBitmapFactory/jstatic_instance)))

    
(defn jm_createBitmap_3 [this p_width p_height p_config]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_config (volatile! p_config)]
        (OpenGLBitmap/jnew_1 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))))

    
(defn jm_decodeStream_1 [this p_inputStream]
  (let [ l_inputStream (volatile! p_inputStream)]
        (OpenGLBitmap/jnew_1 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))))

    
(defn jm_createBitmap_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        (OpenGLBitmap/jnew_1 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))))



