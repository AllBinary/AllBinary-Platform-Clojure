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
;; package org.allbinary.game.input

(ns GameInputProcessor)

(JR/register 'GameInputProcessor nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameInputProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameInputProcessor/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameInputProcessor)] (jinit_0 o) o))

    
(defn jm_processEvent_2 [this p_allbinaryLayerManager p_gameKeyEvent]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_processReleasedEvent_2 [this p_allbinaryLayerManager p_gameKeyEvent]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_processAnalog_3 [this p_allbinaryLayerManager p_gameKeyEvent p_analogValue]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent) l_analogValue (volatile! p_analogValue)]
        nil))

    
(defn jm_process_2 [this p_allbinaryLayerManager p_keyAsInteger]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_keyAsInteger (volatile! p_keyAsInteger)]
        nil))

    
(defn jm_processReleased_2 [this p_allbinaryLayerManager p_keyAsInteger]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_keyAsInteger (volatile! p_keyAsInteger)]
        nil))



