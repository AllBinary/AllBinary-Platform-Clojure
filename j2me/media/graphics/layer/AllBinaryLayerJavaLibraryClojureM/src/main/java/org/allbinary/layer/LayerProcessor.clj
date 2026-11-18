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

(ns LayerProcessor)

(JR/register 'LayerProcessor nil '[LayerProcessorInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :layerManager nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_layerManager]
  (let [ l_layerManager (volatile! p_layerManager)]
    nil (jinitfields this)
        (JR/fset this :layerManager @l_layerManager))
  this)

(defn jnew_1 [p_layerManager ]
  (let [o (JR/alloc 'LayerProcessor)] (jinit_1 o p_layerManager) o))

    
(defn jm_processAt_3 [this p_allBinaryLayerManager p_layerInterface p_index]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerInterface (volatile! p_layerInterface) l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_isProcessorLayer_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_getLayerManager_0 [this]
  (let []
        (JR/fget this :layerManager)))

    
(defn jm_process_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerManager (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_layerManager (JR/invoke this :jm_getLayerManager_0))
        (vreset! l_size (JR/invoke @l_layerManager :jm_getSize_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke this :jm_processAt_3 @l_allBinaryLayerManager (JR/invoke @l_layerManager :jm_getLayerAt_1 @l_index) @l_index)))))



