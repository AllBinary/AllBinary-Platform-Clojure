;; Generated Code Do Not Modify
;; package org.allbinary.game.layer.drop

(ns PlacedLayerFactory)

(JR/register 'PlacedLayerFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PlacedLayerFactory/jnew_0))
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
  (let [o (JR/alloc 'PlacedLayerFactory)] (jinit_0 o) o))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PlacedLayerFactory/jstatic_instance)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_size_0)))

    
(defn jm_getRandomInstance_0 [this]
  (let []
        (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getRandom_1 (JR/fget this :list))))

    
(defn jm_add_1 [this p_layerInterfaceFactoryInterface]
  (let [ l_layerInterfaceFactoryInterface (volatile! p_layerInterfaceFactoryInterface)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerInterfaceFactoryInterface)))



