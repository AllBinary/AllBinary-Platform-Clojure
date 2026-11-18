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

(ns LayerManagerLoggingBase)

(JR/register 'LayerManagerLoggingBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LayerManagerLoggingBase)] (jinit_0 o) o))

    
(defn jm_append_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        nil))

    
(defn jm_appendAt_2 [this p_layerInterface p_index]
  (let [ l_layerInterface (volatile! p_layerInterface) l_index (volatile! p_index)]
        nil))

    
(defn jm_remove_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        nil))

    
(defn jm_removeResult_3 [this p_layerManager p_layerInterface p_result]
  (let [ l_layerManager (volatile! p_layerManager) l_layerInterface (volatile! p_layerInterface) l_result (volatile! p_result)]
        nil))

    
(defn jm_clear_0 [this]
  (let []
        nil))



