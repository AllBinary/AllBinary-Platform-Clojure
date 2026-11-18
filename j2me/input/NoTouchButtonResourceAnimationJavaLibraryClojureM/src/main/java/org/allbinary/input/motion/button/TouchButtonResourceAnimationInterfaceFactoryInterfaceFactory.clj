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

(ns TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory)

(JR/register 'TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory 'BaseResourceAnimationInterfaceFactoryInterfaceFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_createFactory_0 []
  (let [this nil]
        (TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory/jnew_1 "TouchButton Animations")))

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (BaseResourceAnimationInterfaceFactoryInterfaceFactory/jinit_4 this @l_name (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0) (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0) (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0)) (jinitfields this))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory)] (jinit_1 o p_name) o))

    
(defn jm_init_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        (JR/invoke this :jm_initImageCache_2 (JR/scall 'ImageCacheFactory :jm_getInstance_0) @l_level)))

    
(defn jm_initImageCache_2 [this p_imageCache p_level]
  (let [ l_imageCache (volatile! p_imageCache) l_level (volatile! p_level)](JR/method
        (if (JR/invoke this :jm_isInitialized_0)
            (do
            (JR/jreturn)))
        (JR/invoke-super 'BaseResourceAnimationInterfaceFactoryInterfaceFactory this :jm_init_1 @l_level))))

    
(defn jm_isLoadingLevel_1 [this p_level]
  (let [ l_level (volatile! p_level) l_resourceLoadingLevelFactory (volatile! nil)]
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (if (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_TOUCH) :jm_getLevel_0))
            (do
            true)
            (do
            (JR/invoke-super 'BaseResourceAnimationInterfaceFactoryInterfaceFactory this :jm_isLoadingLevel_1 @l_level)))))

    
(defn jm_isFeature_0 [this]
  (let []
        (if (not (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL)))
            (do
            true)
            (do
            false))))



