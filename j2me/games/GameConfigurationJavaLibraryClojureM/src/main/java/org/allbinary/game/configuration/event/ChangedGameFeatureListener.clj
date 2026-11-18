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

(ns ChangedGameFeatureListener)

(JR/register 'ChangedGameFeatureListener 'BaseChangedGameFeatureListener '[])

(def jsv_gameFeatureListener (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_gameFeatureListener [] (JR/ensure-init jclinit-state jclinit) @jsv_gameFeatureListener)
(defn jstatic_set_gameFeatureListener [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_gameFeatureListener v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_gameFeatureListener (ChangedGameFeatureListener/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (BaseChangedGameFeatureListener/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ChangedGameFeatureListener)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ChangedGameFeatureListener/jstatic_gameFeatureListener)))

    
(defn jm_isChangedGameConfiguration_1 [this p_gameConfiguration]
  (let [ l_gameConfiguration (volatile! p_gameConfiguration)]
        (JR/invoke (JR/fget this :list) :jm_contains_1 @l_gameConfiguration)))



