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
;; package org.allbinary.game.configuration.event

(ns BaseChangedGameFeatureListener)

(JR/register 'BaseChangedGameFeatureListener nil '[GameFeatureListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :gameFeatureUtil nil)
  (JR/fset this :list nil)
  (JR/fset this :changed false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :gameFeatureUtil (JR/scall 'GameFeatureUtil :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :changed true)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BaseChangedGameFeatureListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :NOT_IMPLEMENTED) this)))

    
(defn jm_onGameFeatureChange_1 [this p_gameFeatureEvent]
  (let [ l_gameFeatureEvent (volatile! p_gameFeatureEvent)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameFeatureUtil) :GAME_FEATURE_CHANGED)) :jm_append_1 (JR/invoke @l_gameFeatureEvent :jm_getWhatChanged_0))) this (JR/fget (JR/fget this :gameFeatureUtil) :ON_GAME_FEATURE_CHANGE))
        (JR/invoke (JR/fget this :list) :jm_add_1 (JR/invoke @l_gameFeatureEvent :jm_getGameOption_0))
        (JR/invoke this :jm_setChanged_1 true)))

    
(defn jm_add_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_gameFeature)))

    
(defn jm_remove_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke (JR/fget this :list) :jm_remove_1 @l_gameFeature)))

    
(defn jm_setChanged_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :changed @l_initialized)
        (if (not (JR/invoke this :jm_isChanged_0))
            (do
            (JR/invoke (JR/fget this :list) :jm_clear_0)))))

    
(defn jm_isChangedFeature_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature) l_isChanged (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_isChanged (JR/invoke (JR/fget this :list) :jm_contains_1 @l_gameFeature))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "GameFeature: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_gameFeature))
        (JR/invoke @l_stringBuffer :jm_append_1 " isFeature: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 @l_gameFeature))
        (JR/invoke @l_stringBuffer :jm_append_1 " isChanged: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 @l_isChanged)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "isChanged")
        @l_isChanged))

    
(defn jm_isChanged_0 [this]
  (let []
        (JR/fget this :changed)))



