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
;; package org.allbinary.game.configuration

(ns InGameFeatures)

(JR/register 'InGameFeatures 'Init '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (Init/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'InGameFeatures)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let [ l_LABEL (volatile! nil) l_orientationData (volatile! nil) l_exclusiveOrientationSensorVector (volatile! nil) l_inGameFeatureChoiceGroups (volatile! nil) l_inGameExclusiveOrientationSensorVectorCanBeNull (volatile! nil) l_inGameExclusiveOrientationSensorVector (volatile! nil) l_features (volatile! nil) l_exclusiveScreenButtonsVector (volatile! nil) l_touchFeatureFactory (volatile! nil)]
        (vreset! l_LABEL "Screen Buttons")
        (vreset! l_orientationData (JR/scall 'OrientationData :jm_getInstance_0))
        (vreset! l_exclusiveOrientationSensorVector (JR/invoke (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0) :jm_get_1 (JR/fget @l_orientationData :ORIENTATION_SENSOR_INPUT)))
        (vreset! l_inGameFeatureChoiceGroups (JR/scall 'InGameFeatureChoiceGroups :jm_getExclusiveInstance_0))
        (if (some? @l_exclusiveOrientationSensorVector)
            (do
            (vreset! l_inGameExclusiveOrientationSensorVectorCanBeNull (JR/invoke (JR/invoke @l_inGameFeatureChoiceGroups :jm_get_0) :jm_get_1 (JR/fget @l_orientationData :ORIENTATION_SENSOR_INPUT)))
            (if (nil? @l_inGameExclusiveOrientationSensorVectorCanBeNull)
                (do
                (JR/invoke this :jm_addToInGameMenu_0))
                (do
                (vreset! l_inGameExclusiveOrientationSensorVector @l_inGameExclusiveOrientationSensorVectorCanBeNull)
                (if (== (JR/invoke @l_inGameExclusiveOrientationSensorVector :jm_size_0) 0)
                    (do
                    (JR/invoke this :jm_addToInGameMenu_0)))))))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (or (or (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'TouchFeatureFactory :jm_getInstance_0) :SHOW_SCREEN_BUTTONS)) (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'TouchFeatureFactory :jm_getInstance_0) :AUTO_HIDE_SHOW_SCREEN_BUTTONS))) (JR/invoke @l_features :jm_isFeature_1 (JR/fget (JR/scall 'TouchFeatureFactory :jm_getInstance_0) :HIDE_SCREEN_BUTTONS)))
            (do
            (vreset! l_exclusiveScreenButtonsVector (BasicArrayListD/jnew_0))
            (vreset! l_touchFeatureFactory (JR/scall 'TouchFeatureFactory :jm_getInstance_0))
            (JR/invoke @l_exclusiveScreenButtonsVector :jm_add_1 (JR/fget @l_touchFeatureFactory :AUTO_HIDE_SHOW_SCREEN_BUTTONS))
            (JR/invoke @l_exclusiveScreenButtonsVector :jm_add_1 (JR/fget @l_touchFeatureFactory :SHOW_SCREEN_BUTTONS))
            (JR/invoke @l_exclusiveScreenButtonsVector :jm_add_1 (JR/fget @l_touchFeatureFactory :HIDE_SCREEN_BUTTONS))
            (JR/invoke @l_inGameFeatureChoiceGroups :jm_add_2 @l_LABEL @l_exclusiveScreenButtonsVector)))))

    
(defn jm_addToInGameMenu_0 [this]
  (let [ l_orientationData (volatile! nil) l_inGameExclusiveOrientationSensorVector (volatile! nil)]
        (vreset! l_orientationData (JR/scall 'OrientationData :jm_getInstance_0))
        (vreset! l_inGameExclusiveOrientationSensorVector (BasicArrayListD/jnew_0))
        (JR/invoke @l_inGameExclusiveOrientationSensorVector :jm_add_1 (JR/fget (JR/scall 'SensorFeatureFactory :jm_getInstance_0) :ORIENTATION_SENSORS))
        (JR/invoke @l_inGameExclusiveOrientationSensorVector :jm_add_1 (JR/fget (JR/scall 'SensorFeatureFactory :jm_getInstance_0) :NO_ORIENTATION))
        (JR/invoke (JR/scall 'InGameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_add_2 (JR/fget @l_orientationData :ORIENTATION_SENSOR_INPUT) @l_inGameExclusiveOrientationSensorVector)))

    
(defn jm_isAny_0 [this]
  (let [ l_features (volatile! nil) l_touchFeatureFactory (volatile! nil) l_exclusiveOrientationSensorVector (volatile! nil)](JR/method
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_touchFeatureFactory (JR/scall 'TouchFeatureFactory :jm_getInstance_0))
        (if (or (or (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_touchFeatureFactory :SHOW_SCREEN_BUTTONS)) (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_touchFeatureFactory :AUTO_HIDE_SHOW_SCREEN_BUTTONS))) (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_touchFeatureFactory :HIDE_SCREEN_BUTTONS)))
            (do
            (JR/jreturn true)))
        (vreset! l_exclusiveOrientationSensorVector (JR/invoke (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0) :jm_get_1 (JR/fget (JR/scall 'OrientationData :jm_getInstance_0) :ORIENTATION_SENSOR_INPUT)))
        (if (some? @l_exclusiveOrientationSensorVector)
            (do
            (JR/jreturn true)))
        false)))



