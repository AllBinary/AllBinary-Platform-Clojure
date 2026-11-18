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
;; package org.allbinary.game.combat.destroy

(ns DestroyedLayerProcessor)

(JR/register 'DestroyedLayerProcessor 'BasicLayerProcessor '[])

(def jsv_DESTROYED_LAYER_PROCESSOR (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_DESTROYED_LAYER_PROCESSOR [] (JR/ensure-init jclinit-state jclinit) @jsv_DESTROYED_LAYER_PROCESSOR)
(defn jstatic_set_DESTROYED_LAYER_PROCESSOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DESTROYED_LAYER_PROCESSOR v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_DESTROYED_LAYER_PROCESSOR (JR/sget 'BasicLayerProcessor "NULL_LAYER_PROCESSOR"))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicLayerProcessor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DestroyedLayerProcessor)] (jinit_0 o) o))

    
(defn jm_init_0 []
  (let [this nil]
        (DestroyedLayerProcessor/jstatic_set_DESTROYED_LAYER_PROCESSOR (DestroyedLayerProcessor/jnew_0))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DestroyedLayerProcessor/jstatic_DESTROYED_LAYER_PROCESSOR)))

    
(defn jm_process_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_list (volatile! nil) l_size (volatile! nil) l_destroyedEventHandler (volatile! nil) l_destroyEventCircularStaticPool (volatile! nil) l_destroyedEvent (volatile! nil) l_layerInterface (volatile! nil) l_layerInterfaceCanBeNull (volatile! nil) l_commonStrings (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/invoke this :jm_getList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_destroyedEventHandler (JR/scall 'DestroyedEventHandler :jm_getInstance_0))
        (vreset! l_destroyEventCircularStaticPool (JR/scall 'DestroyEventCircularStaticPool :jm_getInstance_0))
        (vreset! l_destroyedEvent nil)
        (vreset! l_layerInterface nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerInterfaceCanBeNull (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (if (some? @l_layerInterfaceCanBeNull)
                (do
                (vreset! l_layerInterface @l_layerInterfaceCanBeNull)
                (JR/invoke @l_allBinaryLayerManager :jm_remove_1 @l_layerInterface)
                (vreset! l_destroyedEvent (JR/invoke @l_destroyEventCircularStaticPool :jm_getInstanceForLayer_1 @l_layerInterface))
                (JR/invoke @l_destroyedEventHandler :jm_fireEvent_1 @l_destroyedEvent))
                (do
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))))))
        (JR/invoke @l_list :jm_clear_0)))



