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
;; package org.allbinary.input.motion.button

(ns TouchButtonResourceOpenGLESAnimationInterfaceFactoryInterfaceFactory)

(JR/register 'TouchButtonResourceOpenGLESAnimationInterfaceFactoryInterfaceFactory 'TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory/jinit_1 this "OpenGL TouchButton Animations") (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchButtonResourceOpenGLESAnimationInterfaceFactoryInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        (JR/invoke-super 'TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory this :jm_initImageCache_2 (JR/scall 'OpenGLImageCacheFactory :jm_getInstance_0) @l_level)))

    
(defn jm_isFeature_0 [this]
  (let []
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL))
            (do
            true)
            (do
            false))))



