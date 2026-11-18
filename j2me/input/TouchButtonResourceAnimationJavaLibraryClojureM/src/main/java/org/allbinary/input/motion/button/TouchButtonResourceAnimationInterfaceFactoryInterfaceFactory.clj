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
  (let [ l_imageCache (volatile! p_imageCache) l_level (volatile! p_level) l_portion (volatile! nil) l_loadingString (volatile! nil) l_index (volatile! nil) l_progressCanvas (volatile! nil) l_touchButtonBlankResource (volatile! nil) l_touchButtonGenericActionResource (volatile! nil) l_touchButtonStartResource (volatile! nil) l_touchButtonUpResource (volatile! nil) l_touchButtonDownResource (volatile! nil) l_touchButtonTurnLeftResource (volatile! nil) l_touchButtonTurnRightResource (volatile! nil) l_touchButtonStrafeLeftResource (volatile! nil) l_touchButtonStrafeRightResource (volatile! nil) l_touchButtonBlankResourceImage (volatile! nil) l_touchButtonGenericActionResourceImage (volatile! nil) l_touchButtonStartResourceImage (volatile! nil) l_touchButtonUpResourceImage (volatile! nil) l_touchButtonDownResourceImage (volatile! nil) l_touchButtonTurnLeftResourceImage (volatile! nil) l_touchButtonTurnRightResourceImage (volatile! nil) l_touchButtonStrafeLeftResourceImage (volatile! nil) l_touchButtonStrafeRightResourceImage (volatile! nil) l_nullAnimationFactory (volatile! nil) l_imageCompleteUtil (volatile! nil) l_touchButtonStartHintResource (volatile! nil)](JR/method
        (if (JR/invoke this :jm_isInitialized_0)
            (do
            (JR/jreturn)))
        (vreset! l_portion 140)
        (vreset! l_loadingString (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of this)) :jm_append_1 " Loading: ")))
        (vreset! l_index 0)
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (vreset! l_touchButtonBlankResource (JR/scall 'TouchButtonBlankResource :jm_getInstance_0))
        (vreset! l_touchButtonGenericActionResource (JR/scall 'TouchButtonGenericActionResource :jm_getInstance_0))
        (vreset! l_touchButtonStartResource (JR/scall 'TouchButtonStartResource :jm_getInstance_0))
        (vreset! l_touchButtonUpResource (JR/scall 'TouchButtonUpResource :jm_getInstance_0))
        (vreset! l_touchButtonDownResource (JR/scall 'TouchButtonDownResource :jm_getInstance_0))
        (vreset! l_touchButtonTurnLeftResource (JR/scall 'TouchButtonTurnLeftResource :jm_getInstance_0))
        (vreset! l_touchButtonTurnRightResource (JR/scall 'TouchButtonTurnRightResource :jm_getInstance_0))
        (vreset! l_touchButtonStrafeLeftResource (JR/scall 'TouchButtonStrafeLeftResource :jm_getInstance_0))
        (vreset! l_touchButtonStrafeRightResource (JR/scall 'TouchButtonStrafeRightResource :jm_getInstance_0))
        (vreset! l_touchButtonBlankResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonBlankResource :RESOURCE)))
        (vreset! l_touchButtonGenericActionResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonGenericActionResource :RESOURCE)))
        (vreset! l_touchButtonStartResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonStartResource :RESOURCE)))
        (vreset! l_touchButtonUpResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonUpResource :RESOURCE)))
        (vreset! l_touchButtonDownResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonDownResource :RESOURCE)))
        (vreset! l_touchButtonTurnLeftResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonTurnLeftResource :RESOURCE)))
        (vreset! l_touchButtonTurnRightResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonTurnRightResource :RESOURCE)))
        (vreset! l_touchButtonStrafeLeftResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonStrafeLeftResource :RESOURCE)))
        (vreset! l_touchButtonStrafeRightResourceImage (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget @l_touchButtonStrafeRightResource :RESOURCE)))
        (vreset! l_nullAnimationFactory (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0))
        (if (JR/invoke (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0) :jm_isOverScan_0)
            (do
            (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget (JR/scall 'TouchButtonStartResource :jm_getInstance_0) :HINT))))
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (vreset! l_imageCompleteUtil (JR/scall 'ImageCompleteUtil :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonBlankResourceImage (JR/fget @l_touchButtonBlankResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonBlankResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonBlankResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonBlankResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonGenericActionResourceImage (JR/fget @l_touchButtonGenericActionResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonGenericActionResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonGenericActionResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonGenericActionResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonStartResourceImage (JR/fget @l_touchButtonStartResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStartResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonStartResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonUpResourceImage (JR/fget @l_touchButtonUpResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonUpResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonUpResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonUpResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonDownResourceImage (JR/fget @l_touchButtonDownResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonDownResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonDownResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonDownResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonTurnLeftResourceImage (JR/fget @l_touchButtonTurnLeftResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonTurnLeftResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonTurnLeftResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonTurnLeftResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonTurnRightResourceImage (JR/fget @l_touchButtonTurnRightResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonTurnRightResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonTurnRightResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonTurnRightResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonStrafeLeftResourceImage (JR/fget @l_touchButtonStrafeLeftResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStrafeLeftResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonStrafeLeftResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStrafeLeftResource :HINT) @l_nullAnimationFactory)
        (JR/invoke @l_progressCanvas :jm_addPortion_3 @l_portion @l_loadingString (JR/vinc l_index 1 :int true))
        (JR/invoke @l_imageCompleteUtil :jm_waitForImage_2 @l_touchButtonStrafeRightResourceImage (JR/fget @l_touchButtonStrafeRightResource :RESOURCE))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStrafeRightResource :RESOURCE) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonStrafeRightResourceImage (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0)))
        (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStrafeRightResource :HINT) @l_nullAnimationFactory)
        (if (JR/invoke (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0) :jm_isOverScan_0)
            (do
            (vreset! l_touchButtonStartHintResource (JR/invoke @l_imageCache :jm_getWithKey_1 (JR/fget (JR/scall 'TouchButtonStartResource :jm_getInstance_0) :HINT)))
            (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStartResource :HINT) (JR/scall 'OneRowSpriteIndexedAnimationFactory :jm_createFactory_2 @l_touchButtonStartHintResource (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0))))
            (do
            (JR/invoke this :jm_add_2 (JR/fget @l_touchButtonStartResource :HINT) @l_nullAnimationFactory)))
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



