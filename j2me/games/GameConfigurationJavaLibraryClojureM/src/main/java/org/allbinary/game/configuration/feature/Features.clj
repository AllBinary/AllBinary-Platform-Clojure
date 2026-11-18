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

(ns Features)

(JR/register 'Features nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :list nil)
  (JR/fset this :defaultList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (Features/jstatic_SINGLETON) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (Features/jstatic_set_SINGLETON (Features/jnew_0))))
        (Features/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :list (BasicArrayListD/jnew_0))
        (JR/fset this :defaultList (BasicArrayListD/jnew_0))
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'Features)] (jinit_0 o) o))

    
(defn jm_addDefault_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke this :jm_add_1 @l_gameFeature)
        (if (not (JR/invoke (JR/fget this :defaultList) :jm_contains_1 @l_gameFeature))
            (do
            (JR/invoke (JR/fget this :defaultList) :jm_add_1 @l_gameFeature)))))

    
(defn jm_add_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (if (not (JR/invoke (JR/fget this :list) :jm_contains_1 @l_gameFeature))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/to-string-of @l_gameFeature))) this (JR/fget (JR/fget this :commonStrings) :ADD))
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_gameFeature)
            (JR/invoke (JR/scall 'GameFeatureEventHandler :jm_getInstance_0) :jm_fireEvent_1 (GameFeatureEvent/jnew_2 @l_gameFeature (JR/to-string-of @l_gameFeature)))))))

    
(defn jm_removeDefault_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/to-string-of @l_gameFeature))) this "removeDefault")
        (JR/invoke this :jm_remove_1 @l_gameFeature)
        (JR/invoke (JR/fget this :defaultList) :jm_remove_1 @l_gameFeature)))

    
(defn jm_remove_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (if (JR/invoke (JR/fget this :list) :jm_contains_1 @l_gameFeature)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :REMOVE))
            (JR/invoke (JR/fget this :list) :jm_remove_1 @l_gameFeature)
            (JR/invoke (JR/scall 'GameFeatureEventHandler :jm_getInstance_0) :jm_fireEvent_1 (GameFeatureEvent/jnew_2 @l_gameFeature (JR/to-string-of @l_gameFeature)))))))

    
(defn jm_init_0 [this]
  (let [ l_gameFeatureFactory (volatile! nil) l_inputFeatureFactory (volatile! nil) l_sensorFeatureFactory (volatile! nil) l_touchFeatureFactory (volatile! nil) l_operatingSystemInterface (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameFeatureFactory (JR/scall 'GameFeatureFactory :jm_getInstance_0))
            (vreset! l_inputFeatureFactory (JR/scall 'InputFeatureFactory :jm_getInstance_0))
            (vreset! l_sensorFeatureFactory (JR/scall 'SensorFeatureFactory :jm_getInstance_0))
            (vreset! l_touchFeatureFactory (JR/scall 'TouchFeatureFactory :jm_getInstance_0))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_gameFeatureFactory :ARTIFICIAL_INTELLEGENCE_PROCESSOR))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_gameFeatureFactory :COLLIDABLE_INTERFACE_LAYER_PROCESSOR))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_gameFeatureFactory :GAME_INPUT_LAYER_PROCESSOR))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_gameFeatureFactory :TICKABLE_LAYER_PROCESSOR))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_inputFeatureFactory :MULTI_KEY_PRESS))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_inputFeatureFactory :REMOVE_DUPLICATE_KEY_PRESSES))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_gameFeatureFactory :SCREEN_SHAKE))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_gameFeatureFactory :POST_IMAGE_LOADING_MODIFICATION))
            (vreset! l_operatingSystemInterface (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0))
            (if (JR/invoke @l_operatingSystemInterface :jm_isOverScan_0)
                (do
                (JR/invoke this :jm_addDefault_1 (JR/fget @l_sensorFeatureFactory :NO_ORIENTATION))
                (JR/invoke this :jm_addDefault_1 (JR/fget @l_touchFeatureFactory :HIDE_SCREEN_BUTTONS)))
                (do
                (JR/invoke this :jm_addDefault_1 (JR/fget @l_sensorFeatureFactory :ORIENTATION_SENSORS))
                (JR/invoke this :jm_addDefault_1 (JR/fget @l_touchFeatureFactory :AUTO_HIDE_SHOW_SCREEN_BUTTONS))))
            (JR/invoke this :jm_addDefault_1 (JR/fget @l_touchFeatureFactory :TOUCH_ENABLED))
            (JR/invoke this :jm_addDefault_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :FULL_SCREEN))
            (JR/invoke this :jm_addDefault_1 (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :LOAD_ONDEMAND)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :INIT) @l_e)) :else (throw jt)))))))

    
(defn jm_isDefault_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke (JR/fget this :defaultList) :jm_contains_1 @l_gameFeature)))

    
(defn jm_isFeature_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke (JR/fget this :list) :jm_contains_1 @l_gameFeature)))

    
(defn jm_toggle_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature)]
        (if (JR/invoke this :jm_isFeature_1 @l_gameFeature)
            (do
            (JR/invoke this :jm_remove_1 @l_gameFeature))
            (do
            (JR/invoke this :jm_add_1 @l_gameFeature)))))



