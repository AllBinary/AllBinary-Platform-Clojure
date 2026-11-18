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
;; package org.allbinary.layer

(ns BasicLayerProcessor)

(JR/register 'BasicLayerProcessor nil '[])

(def jsv_NULL_LAYER_PROCESSOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_LAYER_PROCESSOR [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_LAYER_PROCESSOR)
(defn jstatic_set_NULL_LAYER_PROCESSOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_LAYER_PROCESSOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_LAYER_PROCESSOR (BasicLayerProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :list nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicLayerProcessor)] (jinit_0 o) o))

    
(defn jm_add_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (if (not (JR/invoke (JR/fget this :list) :jm_contains_1 @l_layerInterface))
            (do
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerInterface)))))

    
(defn jm_process_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :NOT_IMPLEMENTED)))))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



