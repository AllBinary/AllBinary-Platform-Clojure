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
;; package org.allbinary.canvas

(ns SpecialMessageUtil)

(JR/register 'SpecialMessageUtil nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (SpecialMessageUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SpecialMessageUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SpecialMessageUtil/jstatic_SINGLETON)))

    
(defn jm_get_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/scall 'Memory :jm_getInfo_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/scall 'GameStatisticsFactory :jm_getInstance_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 " Option: ")
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL_AUTO_SELECT))
            (do
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL_AUTO_SELECT) :jm_getName_0)))
            (do
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL_MINIMUM) :jm_getName_0))))
        (JR/to-string-of @l_stringBuffer)))



