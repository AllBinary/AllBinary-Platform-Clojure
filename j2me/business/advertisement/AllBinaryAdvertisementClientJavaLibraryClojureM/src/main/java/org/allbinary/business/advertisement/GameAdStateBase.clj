;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.business.advertisement

(ns GameAdStateBase)

(JR/register 'GameAdStateBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :adConfigurationP nil)
  (JR/fset this :advertisementsP nil)
  (JR/fset this :okayToShowAdsP false)
    (JR/fset this :advertisementsP (Advertisements/jnew_0))
  this)

    
(defn jinit_1 [this p_adConfiguration]
  (let [ l_adConfiguration (volatile! p_adConfiguration)]
    nil (jinitfields this)
        (JR/fset this :adConfigurationP @l_adConfiguration))
  this)

(defn jnew_1 [p_adConfiguration ]
  (let [o (JR/alloc 'GameAdStateBase)] (jinit_1 o p_adConfiguration) o))

    
(defn jm_initViewArray_1 [this p_viewArray]
  (let [ l_viewArray (volatile! p_viewArray)]
        nil))

    
(defn jm_onStart_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke this :jm_init_0)))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_isShowingAtLocation_1 [this p_location]
  (let [ l_location (volatile! p_location)]
        false))

    
(defn jm_isShowingAt_0 [this]
  (let []
        false))

    
(defn jm_show_0 [this]
  (let []
        nil))

    
(defn jm_hide_0 [this]
  (let []
        nil))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_processAdState_2 [this p_gameState p_gameType]
  (let [ l_gameState (volatile! p_gameState) l_gameType (volatile! p_gameType)]
        nil))

    
(defn jm_processPageAdState_0 [this]
  (let []
        nil))

    
(defn jm_playingAdState_0 [this]
  (let []
        nil))

    
(defn jm_playingAdStateWH_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_notPlayingAdState_0 [this]
  (let []
        nil))

    
(defn jm_setGameIsReady_1 [this p_gameIsReady]
  (let [ l_gameIsReady (volatile! p_gameIsReady)]
        nil))

    
(defn jm_isGameIsReady_0 [this]
  (let []
        false))

    
(defn jm_getAdvertisements_0 [this]
  (let []
        (JR/fget this :advertisementsP)))

    
(defn jm_getAdConfiguration_0 [this]
  (let []
        (JR/fget this :adConfigurationP)))

    
(defn jm_isOkayToShowPageAd_0 [this]
  (let []
        false))

    
(defn jm_setOkayToShowAds_1 [this p_okayToShowAds]
  (let [ l_okayToShowAds (volatile! p_okayToShowAds)]
        (JR/fset this :okayToShowAdsP @l_okayToShowAds)))

    
(defn jm_isOkayToShowAds_0 [this]
  (let []
        (JR/fget this :okayToShowAdsP)))

    
(defn jm_isEnabled_0 [this]
  (let []
        false))



