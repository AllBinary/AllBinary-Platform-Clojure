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

(ns BasicBuildGameInitializerFactory)

(JR/register 'BasicBuildGameInitializerFactory nil '[GameInitializationInterfaceFactoryInterface])

(def jsv_NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY)
(defn jstatic_set_NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY (BasicBuildGameInitializerFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicBuildGameInitializerFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 [this]
  (let []
        (JR/sget 'BaseGameInitialization "NULL_BASE_GAME_INITIALIZATION")))



