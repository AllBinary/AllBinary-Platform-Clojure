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
;; package org.allbinary.game.configuration.feature

(ns GameFeatureItemStateListener)

(JR/register 'GameFeatureItemStateListener nil '[ItemStateListener])

(def jsv_toggleList (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_toggleList [] (JR/ensure-init jclinit-state jclinit) @jsv_toggleList)
(defn jstatic_set_toggleList [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_toggleList v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_toggleList (BasicArrayListD/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :gameOptionsForm nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_gameOptionsForm]
  (let [ l_gameOptionsForm (volatile! p_gameOptionsForm) l_gameFeatureFactory (volatile! nil)]
    nil (jinitfields this)
        (JR/fset this :gameOptionsForm @l_gameOptionsForm)
        (vreset! l_gameFeatureFactory (JR/scall 'GameFeatureFactory :jm_getInstance_0))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :ARTIFICIAL_INTELLEGENCE_PROCESSOR))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :COLLIDABLE_INTERFACE_LAYER_PROCESSOR))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :DAMAGE_FLOATERS))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :DROPPED_ITEMS))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :GAME_INPUT_LAYER_PROCESSOR))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :HEALTH_BARS))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :SOUND))
        (GameFeatureItemStateListener/jm_add_1 (JR/fget @l_gameFeatureFactory :TICKABLE_LAYER_PROCESSOR)))
  this)

(defn jnew_1 [p_gameOptionsForm ]
  (let [o (JR/alloc 'GameFeatureItemStateListener)] (jinit_1 o p_gameOptionsForm) o))

    
(defn jm_add_1 [p_gameFeature]
  (let [this nil l_gameFeature (volatile! p_gameFeature)]
        (if (not (JR/invoke (GameFeatureItemStateListener/jstatic_toggleList) :jm_contains_1 @l_gameFeature))
            (do
            (JR/invoke (GameFeatureItemStateListener/jstatic_toggleList) :jm_add_1 @l_gameFeature)))))

    
(defn jm_itemStateChanged_1 [this p_item]
  (let [ l_item (volatile! p_item) l_itemLabel (volatile! nil) l_gameFeatureUtil (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_itemLabel (JR/invoke @l_item :jm_getLabel_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :ITEM_LABEL)) :jm_append_1 @l_itemLabel)) this "itemStateChanged")
            (if (JR/instance-of @l_item 'GameConfigurationGauge)
                (do
                (JR/invoke (JR/scall 'GameConfigurationUtil :jm_getInstance_0) :jm_change_2 (JR/fget this :gameOptionsForm) @l_item))
                (if (JR/instance-of @l_item 'ChoiceGroup)
                (do
                (vreset! l_gameFeatureUtil (JR/scall 'GameFeatureUtil :jm_getInstance_0))
                (if (JR/invoke @l_gameFeatureUtil :jm_isExclusive_1 @l_itemLabel)
                    (do
                    (JR/invoke @l_gameFeatureUtil :jm_updateExclusiveForChoiceGroup_1 @l_item))
                    (do
                    (JR/invoke @l_gameFeatureUtil :jm_updateMultiple_1 @l_item)))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "itemStateChanged" @l_e)) :else (throw jt)))))))



