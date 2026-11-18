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

(ns DropLayerProcessor)

(JR/register 'DropLayerProcessor 'BasicLayerProcessor '[])

(def jsv_LAYER_PROCESSOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_LAYER_PROCESSOR [] (JR/ensure-init jclinit-state jclinit) @jsv_LAYER_PROCESSOR)
(defn jstatic_set_LAYER_PROCESSOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_LAYER_PROCESSOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_LAYER_PROCESSOR (DropLayerProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicLayerProcessor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DropLayerProcessor)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DropLayerProcessor/jstatic_LAYER_PROCESSOR)))

    
(defn jm_process_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_list (volatile! nil) l_size (volatile! nil) l_layerInterface (volatile! nil) l_dropLayerInterface (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/invoke this :jm_getList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_layerInterface nil)
        (vreset! l_dropLayerInterface nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerInterface (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (vreset! l_dropLayerInterface @l_layerInterface)
            (vreset! l_layerInterface (JR/invoke @l_dropLayerInterface :jm_getDroppedLayer_0))
            (JR/invoke @l_allBinaryLayerManager :jm_append_1 @l_layerInterface)))
        (JR/invoke @l_list :jm_clear_0)))



