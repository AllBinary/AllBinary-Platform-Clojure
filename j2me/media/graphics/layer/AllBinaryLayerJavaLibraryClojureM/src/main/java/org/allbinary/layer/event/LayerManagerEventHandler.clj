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

(ns LayerManagerEventHandler)

(JR/register 'LayerManagerEventHandler 'BasicEventHandler '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LayerManagerEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
  (JR/fset this :CREATE nil)
  (JR/fset this :DELETE nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :CREATE "Create")
    (JR/fset this :DELETE "Delete")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LayerManagerEventHandler/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LayerManagerEventHandler)] (jinit_0 o) o))

    
(defn jm_addListener_1 [this p_layerManagerEventListener]
  (let [ l_layerManagerEventListener (volatile! p_layerManagerEventListener)]
        (if (not (JR/invoke (JR/fget this :list) :jm_contains_1 @l_layerManagerEventListener))
            (do
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerManagerEventListener)))))

    
(defn jm_removeAllListeners_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)
        (JR/invoke-super 'BasicEventHandler this :jm_removeAllListeners_0)))

    
(defn jm_removeListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :list) :jm_remove_1 @l_eventListenerInterface)
        (JR/invoke-super 'BasicEventHandler this :jm_removeListener_1 @l_eventListenerInterface)))

    
(defn jm_fireEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject) l_layerManagerEventListener (volatile! nil) l_e (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :list) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (try (do
                (vreset! l_layerManagerEventListener (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
                (JR/invoke @l_layerManagerEventListener :jm_onCreateLayerManagerEvent_1 @l_eventObject))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))))
        (JR/invoke-super 'BasicEventHandler this :jm_fireEvent_1 @l_eventObject)))

    
(defn jm_fireDeleteEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject) l_layerManagerEventListener (volatile! nil) l_e (volatile! nil) l_index (volatile! nil) l_eventListenerInterfaceList (volatile! nil) l_eventListenerInterface (volatile! nil) l_layerManagerEventListenerInterface (volatile! nil) l_listenerIndex (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :list) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (try (do
                (vreset! l_layerManagerEventListener (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
                (JR/invoke @l_layerManagerEventListener :jm_onDeleteLayerManagerEvent_1 @l_eventObject))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))))
        (vreset! l_eventListenerInterfaceList (JR/fget this :eventListenerInterfaceList))
        (vreset! l_eventListenerInterface nil)
        (vreset! l_layerManagerEventListenerInterface nil)
        (vreset! l_listenerIndex 0)
        (JR/jwhile false false (< @l_listenerIndex (JR/invoke @l_eventListenerInterfaceList :jm_size_0))
            (try (do
                (vreset! l_eventListenerInterface (JR/aget* (JR/fget @l_eventListenerInterfaceList :objectArray) @l_listenerIndex))
                (vreset! l_layerManagerEventListenerInterface @l_eventListenerInterface)
                (JR/invoke @l_layerManagerEventListenerInterface :jm_onDeleteLayerManagerEvent_1 @l_eventObject))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))
            (JR/vinc l_listenerIndex 1 :int false))))

    
(defn jm_process_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface) l_layerManagerEventListenerInterface (volatile! nil)]
        (vreset! l_layerManagerEventListenerInterface @l_eventListenerInterface)
        (JR/invoke @l_layerManagerEventListenerInterface :jm_onCreateLayerManagerEvent_1 @l_eventObject)))



