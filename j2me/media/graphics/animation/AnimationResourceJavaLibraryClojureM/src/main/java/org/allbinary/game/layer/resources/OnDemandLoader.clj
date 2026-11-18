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
;; package org.allbinary.game.layer.resources

(ns OnDemandLoader)

(JR/register 'OnDemandLoader nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :onDemandResourcesFactory nil)
  (JR/fset this :gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory nil)
  (JR/fset this :resourceAnimationInterfaceFactoryInterfaceFactory nil)
  this)

    
(defn jinit_3 [this p_onDemandResourcesFactory p_gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory p_resourceAnimationInterfaceFactoryInterfaceFactory]
  (let [ l_onDemandResourcesFactory (volatile! p_onDemandResourcesFactory) l_gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory (volatile! p_gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory) l_resourceAnimationInterfaceFactoryInterfaceFactory (volatile! p_resourceAnimationInterfaceFactoryInterfaceFactory)]
    nil (jinitfields this)
        (JR/fset this :onDemandResourcesFactory @l_onDemandResourcesFactory)
        (JR/fset this :gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory @l_gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory)
        (JR/fset this :resourceAnimationInterfaceFactoryInterfaceFactory @l_resourceAnimationInterfaceFactoryInterfaceFactory))
  this)

(defn jnew_3 [p_onDemandResourcesFactory p_gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory p_resourceAnimationInterfaceFactoryInterfaceFactory ]
  (let [o (JR/alloc 'OnDemandLoader)] (jinit_3 o p_onDemandResourcesFactory p_gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory p_resourceAnimationInterfaceFactoryInterfaceFactory) o))

    
(defn jm_init_3 [this p_imageCache p_level p_loadingString]
  (let [ l_imageCache (volatile! p_imageCache) l_level (volatile! p_level) l_loadingString (volatile! p_loadingString) l_resourceLoadingLevelFactory (volatile! nil) l_layerPlacementInterfaceBasicArrayListFactoryInterface (volatile! nil)](JR/method
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :LOAD_ALL))
            (do
            (if (JR/invoke (JR/fget this :resourceAnimationInterfaceFactoryInterfaceFactory) :jm_isInitialized_0)
                (do
                (JR/jreturn)))
            (JR/invoke this :jm_initAll_2 @l_imageCache @l_loadingString))
            (if (not (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL) :jm_getLevel_0)))
            (do
            (vreset! l_layerPlacementInterfaceBasicArrayListFactoryInterface (JR/invoke (JR/fget this :gameLayerPlacementInterfaceBasicArrayListFactoryInterfaceFactory) :jm_getInstance_1 @l_level))
            (JR/invoke this :jm_initLevel_4 @l_layerPlacementInterfaceBasicArrayListFactoryInterface @l_imageCache @l_level @l_loadingString)))))))

    
(defn jm_initAll_2 [this p_imageCache p_loadingString]
  (let [ l_imageCache (volatile! p_imageCache) l_loadingString (volatile! p_loadingString) l_index (volatile! nil) l_portion (volatile! nil) l_onDemandResources (volatile! nil) l_onDemandIndex (volatile! nil)]
        (vreset! l_index 0)
        (vreset! l_portion 120)
        (vreset! l_onDemandResources nil)
        (do (vreset! l_onDemandIndex (JR/invoke (JR/fget this :onDemandResourcesFactory) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_onDemandIndex -1 :int false) 0) (do )
            (vreset! l_onDemandResources (JR/invoke (JR/fget this :onDemandResourcesFactory) :jm_remove_1 @l_onDemandIndex))
            (if (not (JR/eq @l_onDemandResources (JR/sget 'OnDemandResources "NULL_ON_DEMAND_RESOURCES")))
                (do
                (vreset! l_index (JR/invoke @l_onDemandResources :jm_initAt_5 @l_imageCache (JR/fget this :resourceAnimationInterfaceFactoryInterfaceFactory) @l_portion @l_loadingString @l_index))))))))

    
(defn jm_initLevel_4 [this p_layerPlacementInterfaceBasicArrayListFactoryInterface p_imageCache p_level p_loadingString]
  (let [ l_layerPlacementInterfaceBasicArrayListFactoryInterface (volatile! p_layerPlacementInterfaceBasicArrayListFactoryInterface) l_imageCache (volatile! p_imageCache) l_level (volatile! p_level) l_loadingString (volatile! p_loadingString) l_commonStrings (volatile! nil) l_portion (volatile! nil) l_index (volatile! nil) l_onDemandArray (volatile! nil) l_onDemandResources (volatile! nil) l_onDemandIndex (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_portion 120)
        (vreset! l_index 0)
        (vreset! l_onDemandArray (JR/invoke @l_layerPlacementInterfaceBasicArrayListFactoryInterface :jm_getOnDemandResources_0))
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget @l_commonStrings :START)) :jm_appendint_1 (JR/alen @l_onDemandArray))) this "initLevel")
        (vreset! l_onDemandResources nil)
        (do (vreset! l_onDemandIndex (JR/alen @l_onDemandArray))
            (JR/jfor false false (>= (JR/vinc l_onDemandIndex -1 :int false) 0) (do )
            (vreset! l_onDemandResources (JR/invoke (JR/fget this :onDemandResourcesFactory) :jm_remove_1 (JR/aget* @l_onDemandArray @l_onDemandIndex)))
            (if (not (JR/eq @l_onDemandResources (JR/sget 'OnDemandResources "NULL_ON_DEMAND_RESOURCES")))
                (do
                (vreset! l_index (JR/invoke @l_onDemandResources :jm_initAt_5 @l_imageCache (JR/fget this :resourceAnimationInterfaceFactoryInterfaceFactory) @l_portion @l_loadingString @l_index))))))))



