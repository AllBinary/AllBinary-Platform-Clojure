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
;; package org.allbinary.game.layer.pickup

(ns CountedPickedUpLayerInterfaceFactoryPool)

(JR/register 'CountedPickedUpLayerInterfaceFactoryPool nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (CountedPickedUpLayerInterfaceFactoryPool/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :list (BasicArrayListD/jnew_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CountedPickedUpLayerInterfaceFactoryPool)] (jinit_0 o) o))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CountedPickedUpLayerInterfaceFactoryPool/jstatic_SINGLETON)))

    
(defn jm_init_0 []
  (let [this nil]
        (CountedPickedUpLayerInterfaceFactoryPool/jstatic_set_SINGLETON (CountedPickedUpLayerInterfaceFactoryPool/jnew_0))))



