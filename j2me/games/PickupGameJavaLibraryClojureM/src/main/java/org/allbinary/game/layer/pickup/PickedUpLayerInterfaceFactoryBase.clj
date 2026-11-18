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
;; package org.allbinary.game.layer.pickup

(ns PickedUpLayerInterfaceFactoryBase)

(JR/register 'PickedUpLayerInterfaceFactoryBase nil '[PickedUpLayerInterfaceFactoryInterface])

(def jsv_NULL_PICKED_UP_LAYER_FACTORY_BASE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_PICKED_UP_LAYER_FACTORY_BASE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_PICKED_UP_LAYER_FACTORY_BASE)
(defn jstatic_set_NULL_PICKED_UP_LAYER_FACTORY_BASE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_PICKED_UP_LAYER_FACTORY_BASE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_PICKED_UP_LAYER_FACTORY_BASE (PickedUpLayerInterfaceFactoryBase/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PickedUpLayerInterfaceFactoryBase)] (jinit_0 o) o))

    
(defn jm_getIconLayer_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getAnimationInterface_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getPickedUpLayerType_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))



