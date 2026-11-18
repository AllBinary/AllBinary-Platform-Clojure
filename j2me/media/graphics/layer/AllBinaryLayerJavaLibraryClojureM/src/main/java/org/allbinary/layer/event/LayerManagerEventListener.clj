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
;; package org.allbinary.layer.event

(ns LayerManagerEventListener)

(JR/register 'LayerManagerEventListener nil '[LayerManagerEventListenerInterface])

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
  (let [o (JR/alloc 'LayerManagerEventListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        nil))

    
(defn jm_onCreateLayerManagerEvent_1 [this p_layerManagerEvent]
  (let [ l_layerManagerEvent (volatile! p_layerManagerEvent)]
        nil))

    
(defn jm_onDeleteLayerManagerEvent_1 [this p_layerManagerEvent]
  (let [ l_layerManagerEvent (volatile! p_layerManagerEvent)]
        nil))



