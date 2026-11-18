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

(ns GameFeatureFactory)

(JR/register 'GameFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SOUND nil)
  (JR/fset this :MUSIC nil)
  (JR/fset this :SCREEN_SHAKE nil)
  (JR/fset this :POST_IMAGE_LOADING_MODIFICATION nil)
  (JR/fset this :HEALTH_BARS nil)
  (JR/fset this :DAMAGE_FLOATERS nil)
  (JR/fset this :GAME_INPUT_LAYER_PROCESSOR nil)
  (JR/fset this :ARTIFICIAL_INTELLEGENCE_PROCESSOR nil)
  (JR/fset this :COLLIDABLE_INTERFACE_LAYER_PROCESSOR nil)
  (JR/fset this :TICKABLE_LAYER_PROCESSOR nil)
  (JR/fset this :CHEATING nil)
  (JR/fset this :DROPPED_ITEMS nil)
  (JR/fset this :DROPPED_ITEMS_FROM_DEATH nil)
  (JR/fset this :TEST_DESTROYED_LAYER_PROCESSOR nil)
  (JR/fset this :COLLISIONS_WITH_SOURCE nil)
  (JR/fset this :COLLISIONS_FORCED_TWO_DIMENSIONAL nil)
    (JR/fset this :SOUND (GameFeature/jnew_1 "Sound"))
    (JR/fset this :MUSIC (GameFeature/jnew_1 "Music"))
    (JR/fset this :SCREEN_SHAKE (Feature/jnew_1 "Screen Shake"))
    (JR/fset this :POST_IMAGE_LOADING_MODIFICATION (Feature/jnew_1 "Post Image Loading Modification (Scaling, Rotation, or Other)"))
    (JR/fset this :HEALTH_BARS (GameFeature/jnew_1 "Health Bars"))
    (JR/fset this :DAMAGE_FLOATERS (GameFeature/jnew_1 "Damage Floaters"))
    (JR/fset this :GAME_INPUT_LAYER_PROCESSOR (GameFeature/jnew_1 "Game Input Layer Processor"))
    (JR/fset this :ARTIFICIAL_INTELLEGENCE_PROCESSOR (GameFeature/jnew_1 "Artificial Intelligence Layer Processor"))
    (JR/fset this :COLLIDABLE_INTERFACE_LAYER_PROCESSOR (GameFeature/jnew_1 "Collidable Interface Layer Processor"))
    (JR/fset this :TICKABLE_LAYER_PROCESSOR (GameFeature/jnew_1 "Tickable Layer Processor"))
    (JR/fset this :CHEATING (GameFeature/jnew_1 "Cheating"))
    (JR/fset this :DROPPED_ITEMS (GameFeature/jnew_1 "Drops"))
    (JR/fset this :DROPPED_ITEMS_FROM_DEATH (GameFeature/jnew_1 "Drops from Dead"))
    (JR/fset this :TEST_DESTROYED_LAYER_PROCESSOR (GameFeature/jnew_1 "Destroyed Layer Processor"))
    (JR/fset this :COLLISIONS_WITH_SOURCE (GameFeature/jnew_1 "Allow Collisions With Source"))
    (JR/fset this :COLLISIONS_FORCED_TWO_DIMENSIONAL (GameFeature/jnew_1 "Collisions Forced Two Dimensional"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameFeatureFactory)] (jinit_0 o) o))



