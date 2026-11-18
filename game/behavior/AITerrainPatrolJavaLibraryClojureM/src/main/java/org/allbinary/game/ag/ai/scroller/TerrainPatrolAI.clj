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
;; package org.allbinary.game.ag.ai.scroller

(ns TerrainPatrolAI)

(JR/register 'TerrainPatrolAI 'PacePatrolAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :terrainEventListener nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :CLIFF nil)
    (JR/fset this :terrainEventListener (TerrainEventListener/jnew_0))
    (JR/fset this :DOWN (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :DOWN))
    (JR/fset this :CLIFF (BasicTerrainInfo/jnew_1 (JR/fget this :DOWN)))
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (PacePatrolAI/jinit_3 this @l_hashtable @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/invoke (JR/scall 'TerrainEventHandler :jm_getInstance_1 @l_ownerLayerInterface) :jm_addListener_1 (JR/fget this :terrainEventListener))
        (JR/invoke (JR/fget this :terrainEventListener) :jm_onTerrainEvent_1 (JR/invoke (JR/scall 'TerrainEventCircularStaticPool :jm_getInstance_0) :jm_getNext_1 (JR/fget this :CLIFF))))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'TerrainPatrolAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke-super 'PacePatrolAI this :jm_update_0)
        (JR/invoke this :jm_changeDirectionIfCliffReached_0)))

    
(defn jm_changeDirectionIfCliffReached_0 [this]
  (let [ l_list (volatile! nil) l_size (volatile! nil) l_terrainEvent (volatile! nil) l_basicTerrainInfo (volatile! nil) l_angle (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/invoke (JR/fget this :terrainEventListener) :jm_getList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_terrainEvent (JR/invoke @l_list :jm_removeAt_1 @l_index))
            (vreset! l_basicTerrainInfo (JR/invoke @l_terrainEvent :jm_getBasicTerrainInfo_0))
            (vreset! l_angle (JR/invoke @l_basicTerrainInfo :jm_getAngle_0))
            (if (JR/eq @l_angle (JR/fget this :DOWN))
                (do
                (JR/invoke this :jm_nextDirection_0)
                (if (not (JR/fget this :isFollowLimitedByTerrain))
                    (do
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Following Limited" this "onTerrainEvent")
                    (JR/fset this :isFollowLimitedByTerrain true)))))))))



