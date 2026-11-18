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
;; package org.allbinary.game.init

(ns BaseGameInitialization)

(JR/register 'BaseGameInitialization nil '[GameInitializationInterface])

(def jsv_NULL_BASE_GAME_INITIALIZATION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_BASE_GAME_INITIALIZATION [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_BASE_GAME_INITIALIZATION)
(defn jstatic_set_NULL_BASE_GAME_INITIALIZATION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_BASE_GAME_INITIALIZATION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_BASE_GAME_INITIALIZATION (BaseGameInitialization/jnew_2 (JR/anew "Object" 1 0) 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :resourceInitializationArray nil)
  (JR/fset this :portion 0)
  (JR/fset this :initialized false)
  (JR/fset this :EARLY_RESOURCES 0)
  (JR/fset this :GAME_RESOURCES 0)
  (JR/fset this :EARLY_CHANGABLE_RESOURCES 0)
  (JR/fset this :GAME_CHANGABLE_RESOURCES 0)
  (JR/fset this :gameInitialized false)
  (JR/fset this :allLoaded false)
    (JR/fset this :EARLY_RESOURCES 0)
    (JR/fset this :GAME_RESOURCES 1)
    (JR/fset this :EARLY_CHANGABLE_RESOURCES 2)
    (JR/fset this :GAME_CHANGABLE_RESOURCES 3)
  this)

    
(defn jinit_2 [this p_resourceInitializationArray p_portion]
  (let [ l_resourceInitializationArray (volatile! p_resourceInitializationArray) l_portion (volatile! p_portion)]
    nil (jinitfields this)
        (JR/fset this :resourceInitializationArray @l_resourceInitializationArray)
        (JR/fset this :portion @l_portion))
  this)

(defn jnew_2 [p_resourceInitializationArray p_portion ]
  (let [o (JR/alloc 'BaseGameInitialization)] (jinit_2 o p_resourceInitializationArray p_portion) o))

    
(defn jm_initKey_1 [this p_portion]
  (let [ l_portion (volatile! p_portion)]
        nil))

    
(defn jm_initKeyMapping_2 [this p_abeClientInformation p_portion]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_portion (volatile! p_portion)]
        (if (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_isChangedFeature_1 (JR/fget (JR/scall 'InputFeatureFactory :jm_getInstance_0) :INPUT_MAPPING))
            (do
            (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_init_1 @l_abeClientInformation)
            (JR/invoke (JR/scall 'ProgressCanvasFactory :jm_getInstance_0) :jm_addNormalPortion_2 50 "Game Keys")
            (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_remove_1 (JR/fget (JR/scall 'InputFeatureFactory :jm_getInstance_0) :INPUT_MAPPING))))))

    
(defn jm_init_3 [this p_abeClientInformation p_commandListener p_level]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_commandListener (volatile! p_commandListener) l_level (volatile! p_level) l_resourceLoadingLevelFactory (volatile! nil) l_localPortion (volatile! nil) l_progressCanvas (volatile! nil)]
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (if (and (not (JR/invoke this :jm_isInitialized_0)) (or (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL) :jm_getLevel_0)) (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_EARLY) :jm_getLevel_0))))
            (do
            (vreset! l_localPortion 40)
            (if (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_EARLY) :jm_getLevel_0))
                (do
                (vreset! l_localPortion 8)))
            (JR/invoke this :jm_setInitialized_1 true)
            (JR/invoke this :jm_initKey_1 (JR/invoke this :jm_getPortion_0))
            (JR/invoke this :jm_initKeyMapping_2 @l_abeClientInformation (JR/invoke this :jm_getPortion_0))
            (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_init_0)
            (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_localPortion "Game Key Events")
            (JR/invoke (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :jm_init_1 (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_getInputMapping_0))
            (JR/scall 'CancelTouchButtonInputFactory :jm_getInstance_0)
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_localPortion "Touch Input")
            (JR/invoke (JR/scall 'CompleteMotionGestureInputToGameMotionGestureInput :jm_getInstance_0) :jm_init_0)
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_localPortion "Motion Input")
            (JR/scall 'GameFeatureImageCacheFactory :jm_init_0)
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 @l_localPortion "Image Cache")
            (JR/invoke (JR/aget* (JR/fget this :resourceInitializationArray) (JR/fget this :EARLY_RESOURCES)) :jm_init_0)))))

    
(defn jm_resourceInitialization_1 [this p_level]
  (let [ l_level (volatile! p_level) l_resourceLoadingLevelFactory (volatile! nil)]
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (if (and (JR/invoke this :jm_resourceAnimationChange_0) (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_EARLY) :jm_getLevel_0)))
            (do
            (JR/invoke this :jm_clearResources_0)
            (JR/invoke (JR/aget* (JR/fget this :resourceInitializationArray) (JR/fget this :EARLY_CHANGABLE_RESOURCES)) :jm_init_0)))
        (if (and (JR/invoke this :jm_resourceAnimationChange_0) (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL) :jm_getLevel_0)))
            (do
            (if (JR/fget this :allLoaded)
                (do
                (JR/invoke this :jm_clearResources_0)))
            (if (== (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_getList_0) :jm_size_0) 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :resourceInitializationArray) (JR/fget this :EARLY_CHANGABLE_RESOURCES)) :jm_init_0)))
            (JR/invoke (JR/aget* (JR/fget this :resourceInitializationArray) (JR/fget this :GAME_CHANGABLE_RESOURCES)) :jm_init_0)
            (JR/fset this :allLoaded true)))))

    
(defn jm_resourceAnimationChange_0 [this]
  (let [ l_changedGameFeatureListener (volatile! nil) l_gameConfigurationCentral (volatile! nil)](JR/method
        (vreset! l_changedGameFeatureListener (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0))
        (vreset! l_gameConfigurationCentral (JR/scall 'GameConfigurationCentral :jm_getInstance_0))
        (if (JR/invoke @l_changedGameFeatureListener :jm_isChangedGameConfiguration_1 (JR/fget @l_gameConfigurationCentral :SCALE))
            (do
            (JR/jreturn true)))
        (if (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_isChangedFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :STATIC))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_clearResources_0 [this]
  (let [ l_featuredAnimationInterfaceFactoryInterfaceFactory (volatile! nil)]
        (JR/fset this :allLoaded false)
        (JR/scall 'GameFeatureImageCacheFactory :jm_releaseAll_0)
        (vreset! l_featuredAnimationInterfaceFactoryInterfaceFactory (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0))
        (JR/invoke @l_featuredAnimationInterfaceFactoryInterfaceFactory :jm_clear_0)
        (JR/invoke (JR/scall 'FeaturedResourceRelativeRelationshipFactory :jm_getInstance_0) :jm_clear_0)))

    
(defn jm_setGameInitialized_1 [this p_gameInitialized]
  (let [ l_gameInitialized (volatile! p_gameInitialized)]
        (JR/fset this :gameInitialized @l_gameInitialized)))

    
(defn jm_isGameInitialized_0 [this]
  (let []
        (JR/fget this :gameInitialized)))

    
(defn jm_getPortion_0 [this]
  (let []
        (JR/fget this :portion)))

    
(defn jm_setInitialized_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :initialized @l_initialized)))

    
(defn jm_isInitialized_0 [this]
  (let []
        (JR/fget this :initialized)))



