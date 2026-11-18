;;
;; AllBinary Open License Version 1
;; Copyright (c) 2011 AllBinary
;; 
;; By agreeing to this license you and any business entity you represent are
;; legally bound to the AllBinary Open License Version 1 legal agreement.
;; 
;; You may obtain the AllBinary Open License Version 1 legal agreement from
;; AllBinary or the root directory of AllBinary's AllBinary Platform repository.
;; 
;; Created By: Travis Berthelot
;;  
;; Generated Code Do Not Modify
;; package org.allbinary.image.opengles

(ns OpenGLImageSpecificFactory)

(JR/register 'OpenGLImageSpecificFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OpenGLImageSpecificFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :imageFactory nil)
  (JR/fset this :updating false)
    (JR/fset this :imageFactory (JR/sget 'OpenGLImageFactory "NULL_OPENGL_IMAGE_FACTORY"))
    (JR/fset this :updating false)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLImageSpecificFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OpenGLImageSpecificFactory/jstatic_instance)))

    
(defn jm_setImageFactory_1 [this p_imageFactory]
  (let [ l_imageFactory (volatile! p_imageFactory)]
        (JR/fset this :imageFactory @l_imageFactory)
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Selected Image Factory: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :imageFactory)))) this "setImageFactory")))

    
(defn jm_getImageFactory_0 [this]
  (let []
        (JR/fget this :imageFactory)))



