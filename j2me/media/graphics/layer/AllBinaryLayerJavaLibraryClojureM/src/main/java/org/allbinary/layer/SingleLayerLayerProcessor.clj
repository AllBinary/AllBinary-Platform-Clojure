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

(ns SingleLayerLayerProcessor)

(JR/register 'SingleLayerLayerProcessor 'LayerProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (LayerProcessor/jinit_1 this (SingleLayerLayerManager/jnew_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SingleLayerLayerProcessor)] (jinit_0 o) o))

    
(defn jm_process_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerManager (volatile! nil)]
        (vreset! l_layerManager (JR/invoke this :jm_getLayerManager_0))
        (JR/invoke this :jm_processAt_3 @l_allBinaryLayerManager (JR/invoke @l_layerManager :jm_getLayerAt_1 0) 0)))



