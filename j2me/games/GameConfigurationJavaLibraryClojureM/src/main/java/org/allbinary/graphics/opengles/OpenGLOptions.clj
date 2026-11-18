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
;; package org.allbinary.graphics.opengles

(ns OpenGLOptions)

(JR/register 'OpenGLOptions nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLOptions)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let [ l_openGLFeatureFactory (volatile! nil) l_openGLMultipleList (volatile! nil) l_openGLVersionSelectorMultipleList (volatile! nil) l_openGLImageColorMultipleList (volatile! nil)]
        (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget @l_openGLFeatureFactory :OPENGL_OPTIONS))
            (do
            (vreset! l_openGLMultipleList (BasicArrayListD/jnew_0))
            (JR/invoke @l_openGLMultipleList :jm_add_1 (JR/fget @l_openGLFeatureFactory :OPENGL))
            (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getMultipleInstance_0) :jm_add_2 "OpenGL (Complete Restart)" @l_openGLMultipleList)
            (vreset! l_openGLVersionSelectorMultipleList (BasicArrayListD/jnew_0))
            (JR/invoke @l_openGLVersionSelectorMultipleList :jm_add_1 (JR/fget @l_openGLFeatureFactory :OPENGL_AUTO_SELECT))
            (JR/invoke @l_openGLVersionSelectorMultipleList :jm_add_1 (JR/fget @l_openGLFeatureFactory :OPENGL_MINIMUM))
            (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_add_2 "OpenGL Version Selector" @l_openGLVersionSelectorMultipleList)
            (vreset! l_openGLImageColorMultipleList (BasicArrayListD/jnew_0))
            (JR/invoke @l_openGLImageColorMultipleList :jm_add_1 (JR/fget @l_openGLFeatureFactory :IMAGE_COLOR_DEPTH_4444))
            (JR/invoke @l_openGLImageColorMultipleList :jm_add_1 (JR/fget @l_openGLFeatureFactory :IMAGE_COLOR_DEPTH_8888))
            (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_add_2 "OpenGL Image Color RGBA" @l_openGLImageColorMultipleList)))))



