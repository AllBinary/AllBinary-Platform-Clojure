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

(ns GameInitializationUtil)

(JR/register 'GameInitializationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameInitializationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EVENT nil)
    (JR/fset this :EVENT (GameInitializedEvent/jnew_1 this))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameInitializationUtil)] (jinit_0 o) o))

    
(defn jm_initDemo_3 [this p_abeClientInformation p_canvas p_gameInitializationInterfaceFactoryInterface]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_canvas (volatile! p_canvas) l_gameInitializationInterfaceFactoryInterface (volatile! p_gameInitializationInterfaceFactoryInterface) l_mainFeatureFactory (volatile! nil) l_gameInitializationInterface (volatile! nil) l_features (volatile! nil) l_resourceLoadingLevelFactory (volatile! nil)]
        (vreset! l_mainFeatureFactory (JR/scall 'MainFeatureFactory :jm_getInstance_0))
        (if (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_isChangedFeature_1 (JR/fget @l_mainFeatureFactory :STATIC))
            (do
            (vreset! l_gameInitializationInterface (JR/invoke @l_gameInitializationInterfaceFactoryInterface :jm_getInstance_0))
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_mainFeatureFactory :LOAD_ALL))
                (do
                (JR/invoke this :jm_initGame_3 @l_abeClientInformation @l_canvas @l_gameInitializationInterfaceFactoryInterface))
                (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_mainFeatureFactory :LOAD_ONDEMAND))
                (do
                (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
                (JR/invoke @l_gameInitializationInterface :jm_init_3 @l_abeClientInformation (JR/invoke @l_canvas :jm_getCustomCommandListener_0) (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_EARLY) :jm_getLevel_0))
                (JR/invoke (JR/fget this :EVENT) :jm_setResourceLoadingLevel_1 (JR/fget @l_resourceLoadingLevelFactory :LOAD_EARLY)))
                (do
                (JR/jthrow (new java.lang.Exception "No Loading Feature Available")))))
            (JR/invoke (JR/scall 'GameInitializedEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :EVENT))))))

    
(defn jm_initGame_3 [this p_abeClientInformation p_canvas p_gameInitializationInterfaceFactoryInterface]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_canvas (volatile! p_canvas) l_gameInitializationInterfaceFactoryInterface (volatile! p_gameInitializationInterfaceFactoryInterface) l_gameInitializationInterface (volatile! nil) l_resourceLoadingLevelFactory (volatile! nil)]
        (if (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_isChangedFeature_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :STATIC))
            (do
            (vreset! l_gameInitializationInterface (JR/invoke @l_gameInitializationInterfaceFactoryInterface :jm_getInstance_0))
            (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
            (JR/invoke @l_gameInitializationInterface :jm_init_3 @l_abeClientInformation (JR/invoke @l_canvas :jm_getCustomCommandListener_0) (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL) :jm_getLevel_0))
            (JR/invoke (JR/fget this :EVENT) :jm_setResourceLoadingLevel_1 (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL))
            (JR/invoke (JR/scall 'GameInitializedEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :EVENT))
            (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_remove_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :STATIC))))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameInitializationUtil/jstatic_instance)))



