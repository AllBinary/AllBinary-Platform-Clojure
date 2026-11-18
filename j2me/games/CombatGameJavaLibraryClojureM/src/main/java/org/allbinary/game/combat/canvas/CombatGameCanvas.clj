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
;; package org.allbinary.game.combat.canvas

(ns CombatGameCanvas)

(JR/register 'CombatGameCanvas 'AllBinaryGameCanvas '[])

(def jsv_basicLayerProcessor (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_basicLayerProcessor [] (JR/ensure-init jclinit-state jclinit) @jsv_basicLayerProcessor)
(defn jstatic_set_basicLayerProcessor [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_basicLayerProcessor v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_basicLayerProcessor (JR/anew "Object" 1 0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_5 [this p_cmdListener p_gameLayerManager p_highScoresFactoryInterface p_gameInitializationInterfaceFactoryInterface p_buffered]
  (let [ l_cmdListener (volatile! p_cmdListener) l_gameLayerManager (volatile! p_gameLayerManager) l_highScoresFactoryInterface (volatile! p_highScoresFactoryInterface) l_gameInitializationInterfaceFactoryInterface (volatile! p_gameInitializationInterfaceFactoryInterface) l_buffered (volatile! p_buffered)]
        (AllBinaryGameCanvas/jinit_5 this @l_cmdListener @l_gameLayerManager @l_highScoresFactoryInterface @l_gameInitializationInterfaceFactoryInterface @l_buffered) (jinitfields this))
  this)

(defn jnew_5 [p_cmdListener p_gameLayerManager p_highScoresFactoryInterface p_gameInitializationInterfaceFactoryInterface p_buffered ]
  (let [o (JR/alloc 'CombatGameCanvas)] (jinit_5 o p_cmdListener p_gameLayerManager p_highScoresFactoryInterface p_gameInitializationInterfaceFactoryInterface p_buffered) o))

    
(defn jm_CombatGameCanvas_init_0 [this]
  (let []
        (JR/invoke (JR/scall 'DestroyEventCircularStaticPool :jm_getInstance_0) :jm_init_1 this)
        (JR/invoke (JR/scall 'ProgressCanvasFactory :jm_getInstance_0) :jm_addNormalPortion_2 50 "Destroy Events")))

    
(defn jm_initApp_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke this :jm_CombatGameCanvas_init_0)
        (JR/invoke-super 'AllBinaryGameCanvas this :jm_initApp_1 @l_abeClientInformation)))

    
(defn jm_initConfigurablePortion_1 [this p_portion]
  (let [ l_portion (volatile! p_portion) l_features (volatile! nil) l_gameFeatureFactory (volatile! nil)]
        (JR/scall 'DestroyedLayerProcessor :jm_init_0)
        (JR/invoke (JR/scall 'ProgressCanvasFactory :jm_getInstance_0) :jm_addNormalPortion_2 @l_portion "Basic Processors")
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_gameFeatureFactory (JR/scall 'GameFeatureFactory :jm_getInstance_0))
        (if (and (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_gameFeatureFactory :DROPPED_ITEMS)) (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_gameFeatureFactory :DROPPED_ITEMS_FROM_DEATH)))
            (do
            (CombatGameCanvas/jstatic_set_basicLayerProcessor (JR/anew "Object" 1 2))
            (JR/aset* (CombatGameCanvas/jstatic_basicLayerProcessor) 0 (JR/scall 'DestroyedLayerProcessor :jm_getInstance_0))
            (JR/aset* (CombatGameCanvas/jstatic_basicLayerProcessor) 1 (JR/scall 'DropLayerProcessor :jm_getInstance_0)))
            (do
            (CombatGameCanvas/jstatic_set_basicLayerProcessor (JR/anew "Object" 1 1))
            (JR/aset* (CombatGameCanvas/jstatic_basicLayerProcessor) 0 (JR/scall 'DestroyedLayerProcessor :jm_getInstance_0))))))

    
(defn jm_processPlayingGame_0 [this]
  (let [ l_index (volatile! nil)]
        (JR/invoke-super 'AllBinaryGameCanvas this :jm_processPlayingGame_0)
        (do (vreset! l_index (JR/alen (CombatGameCanvas/jstatic_basicLayerProcessor)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (CombatGameCanvas/jstatic_basicLayerProcessor) @l_index) :jm_process_1 (JR/fget this :gameLayerManager))))))

    
(defn jm_cleanupGame_0 [this]
  (let [ l_index (volatile! nil)]
        (JR/invoke-super 'AllBinaryGameCanvas this :jm_cleanupGame_0)
        (do (vreset! l_index (JR/alen (CombatGameCanvas/jstatic_basicLayerProcessor)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/invoke (JR/aget* (CombatGameCanvas/jstatic_basicLayerProcessor) @l_index) :jm_getList_0) :jm_clear_0)))
        (JR/invoke (JR/scall 'GroupLayerManagerListener :jm_getInstance_0) :jm_clear_0)
        (JR/invoke (JR/scall 'GroupLayerManagerListener :jm_getInstance_0) :jm_log_0)
        (JR/invoke (JR/scall 'DestroyedEventHandler :jm_getInstance_0) :jm_removeAllListeners_0)
        (JR/invoke this :jm_cleanupManager_0)))

    
(defn jm_cleanupManager_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameLayerManager) :jm_cleanup_0)))



