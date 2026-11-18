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

(ns AllBinaryLayerManager)

(JR/register 'AllBinaryLayerManager 'LayerManager '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :layerManagerEventHandler nil)
  (JR/fset this :createLayerManagerEvent nil)
  (JR/fset this :deleteLayerManagerEvent nil)
  (JR/fset this :basicLayerProcessorArray nil)
    (JR/fset this :layerManagerEventHandler (JR/scall 'LayerManagerEventHandler :jm_getInstance_0))
    (JR/fset this :createLayerManagerEvent (LayerManagerEvent/jnew_2 this (JR/fget (JR/fget this :layerManagerEventHandler) :CREATE)))
    (JR/fset this :deleteLayerManagerEvent (LayerManagerEvent/jnew_2 this (JR/fget (JR/fget this :layerManagerEventHandler) :DELETE)))
    (JR/fset this :basicLayerProcessorArray (JR/anew "Object" 1 0))
  this)

    
(defn jinit_0 [this]
  (let []
        (LayerManager/jinit_1 this (JR/scall 'LayerManagerNoDebug :jm_getInstance_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryLayerManager)] (jinit_0 o) o))

    
(defn jm_getLayerProcessorArray_0 [this]
  (let []
        (JR/fget this :basicLayerProcessorArray)))

    
(defn jm_setLayerProcessorArray_1 [this p_layerProcessorArray]
  (let [ l_layerProcessorArray (volatile! p_layerProcessorArray)]
        (JR/fset this :basicLayerProcessorArray @l_layerProcessorArray)))

    
(defn jm_log_0 [this]
  (let [ l_size (volatile! nil) l_layerProcessorInterface (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen (JR/fget this :basicLayerProcessorArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerProcessorInterface (JR/aget* (JR/fget this :basicLayerProcessorArray) @l_index))))))

    
(defn jm_append_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (if (not (JR/invoke this :jm_contains_1 @l_layerInterface))
            (do
            (JR/invoke this :jm_appendProcessors_1 @l_layerInterface)
            (JR/invoke-super 'LayerManager this :jm_append_1 @l_layerInterface)))))

    
(defn jm_appendAt_2 [this p_layerInterface p_index]
  (let [ l_layerInterface (volatile! p_layerInterface) l_index (volatile! p_index)]
        (if (not (JR/invoke this :jm_contains_1 @l_layerInterface))
            (do
            (JR/invoke this :jm_appendProcessors_1 @l_layerInterface)
            (JR/invoke-super 'LayerManager this :jm_appendAt_2 @l_layerInterface @l_index)))))

    
(defn jm_appendProcessors_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_layerProcessorInterface (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :createLayerManagerEvent) :jm_setLayerInterface_1 @l_layerInterface)
        (JR/invoke (JR/fget this :layerManagerEventHandler) :jm_fireEvent_1 (JR/fget this :createLayerManagerEvent))
        (vreset! l_layerProcessorInterface nil)
        (do (vreset! l_index (JR/alen (JR/fget this :basicLayerProcessorArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_layerProcessorInterface (JR/aget* (JR/fget this :basicLayerProcessorArray) @l_index))
            (if (JR/invoke @l_layerProcessorInterface :jm_isProcessorLayer_1 @l_layerInterface)
                (do
                (JR/invoke (JR/invoke @l_layerProcessorInterface :jm_getLayerManager_0) :jm_append_1 @l_layerInterface)))))))

    
(defn jm_remove_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_layerProcessorInterface (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :deleteLayerManagerEvent) :jm_setLayerInterface_1 @l_layerInterface)
        (JR/invoke (JR/fget this :layerManagerEventHandler) :jm_fireDeleteEvent_1 (JR/fget this :deleteLayerManagerEvent))
        (vreset! l_layerProcessorInterface nil)
        (do (vreset! l_index (JR/alen (JR/fget this :basicLayerProcessorArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_layerProcessorInterface (JR/aget* (JR/fget this :basicLayerProcessorArray) @l_index))
            (JR/invoke (JR/invoke @l_layerProcessorInterface :jm_getLayerManager_0) :jm_remove_1 @l_layerInterface)))
        (JR/invoke-super 'LayerManager this :jm_remove_1 @l_layerInterface)))

    
(defn jm_process_0 [this]
  (let [ l_layerProcessorInterface (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_layerProcessorInterface nil)
        (vreset! l_size (JR/alen (JR/fget this :basicLayerProcessorArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerProcessorInterface (JR/aget* (JR/fget this :basicLayerProcessorArray) @l_index))
            (JR/invoke @l_layerProcessorInterface :jm_process_1 this)))))

    
(defn jm_cleanup_0 [this]
  (let [ l_layerProcessorInterface (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_layerProcessorInterface nil)
        (vreset! l_size (JR/alen (JR/fget this :basicLayerProcessorArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerProcessorInterface (JR/aget* (JR/fget this :basicLayerProcessorArray) @l_index))
            (JR/invoke (JR/invoke @l_layerProcessorInterface :jm_getLayerManager_0) :jm_cleanup_0)))
        (JR/invoke-super 'LayerManager this :jm_cleanup_0)))



