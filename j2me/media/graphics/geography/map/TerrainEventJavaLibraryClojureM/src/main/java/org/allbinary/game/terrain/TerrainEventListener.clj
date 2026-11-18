;; Generated Code Do Not Modify
;; package org.allbinary.game.terrain

(ns TerrainEventListener)

(JR/register 'TerrainEventListener nil '[TerrainEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TerrainEventListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onTerrainEvent_1 [this p_terrainEvent]
  (let [ l_terrainEvent (volatile! p_terrainEvent)]
        (JR/invoke (JR/fget this :list) :jm_clear_0)
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_terrainEvent)))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



