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
;; package org.allbinary.game.layer.drop

(ns DropLayerFactory)

(JR/register 'DropLayerFactory nil '[])

(def jsv_DROP_LAYER_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_DROP_LAYER_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_DROP_LAYER_FACTORY)
(defn jstatic_set_DROP_LAYER_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DROP_LAYER_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_DROP_LAYER_FACTORY (DropLayerFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
  (JR/fset this :basicArrayListUtil nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :basicArrayListUtil (JR/scall 'BasicArrayListUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DropLayerFactory)] (jinit_0 o) o))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DropLayerFactory/jstatic_DROP_LAYER_FACTORY)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_size_0)))

    
(defn jm_getRandomInstance_0 [this]
  (let []
        (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getRandom_1 (JR/fget this :list))))

    
(defn jm_add_1 [this p_layerInterfaceFactoryInterface]
  (let [ l_layerInterfaceFactoryInterface (volatile! p_layerInterfaceFactoryInterface)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerInterfaceFactoryInterface)))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



