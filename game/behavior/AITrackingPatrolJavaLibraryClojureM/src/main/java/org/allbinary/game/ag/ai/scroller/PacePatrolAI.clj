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

(ns PacePatrolAI)

(JR/register 'PacePatrolAI 'BasePatrolAI '[TrackingEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :trackingList nil)
  (JR/fset this :firingDistance 0)
  (JR/fset this :isFollowLimitedByTerrain false)
    (JR/fset this :isFollowLimitedByTerrain false)
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasePatrolAI/jinit_3 this @l_hashtable @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/invoke (JR/scall 'TrackingEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this)
        (JR/fset this :trackingList (BasicArrayListD/jnew_0)))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'PacePatrolAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_direction (volatile! nil) l_directionFactory (volatile! nil)]
        (JR/invoke this :jm_update_0)
        (vreset! l_direction (JR/invoke this :jm_setFiringDirectionForTargetIfInRange_0))
        (vreset! l_directionFactory (JR/scall 'DirectionFactory :jm_getInstance_0))
        (if (JR/eq @l_direction (JR/fget @l_directionFactory :LEFT))
            (do
            (if (or (not (JR/eq (JR/fget this :lastKeyDirection) (JR/fget this :keyDirection))) (not (JR/fget this :isFollowLimitedByTerrain)))
                (do
                (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/sget 'Canvas "LEFT"))))
            (JR/fset this :keyDirection (JR/sget 'Canvas "LEFT"))
            (JR/fset this :lastKeyDirection (JR/fget this :keyDirection))
            (JR/fset this :xTotalDistance 0)
            (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1")))
            (if (JR/eq @l_direction (JR/fget @l_directionFactory :RIGHT))
            (do
            (if (or (not (JR/eq (JR/fget this :lastKeyDirection) (JR/fget this :keyDirection))) (not (JR/fget this :isFollowLimitedByTerrain)))
                (do
                (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/sget 'Canvas "RIGHT"))))
            (JR/fset this :keyDirection (JR/sget 'Canvas "RIGHT"))
            (JR/fset this :lastKeyDirection (JR/fget this :keyDirection))
            (JR/fset this :xTotalDistance 0)
            (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1")))
            (do
            (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/fget this :keyDirection)))))))

    
(defn jm_setFiringDirectionForTargetIfInRange_0 [this]
  (let [ l_directionFactory (volatile! nil) l_ownerLayerInterface (volatile! nil) l_direction (volatile! nil) l_lastTrackingEvent (volatile! nil) l_lastTrackingLayerInterface (volatile! nil) l_directionCompositeInterface (volatile! nil) l_size (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_yDistance (volatile! nil) l_xDistance (volatile! nil) l_absXDistance (volatile! nil) l_absYDistance (volatile! nil) l_index (volatile! nil)]
        (vreset! l_directionFactory (JR/scall 'DirectionFactory :jm_getInstance_0))
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_direction (JR/fget @l_directionFactory :NOT_BORDERED_WITH))
        (vreset! l_lastTrackingEvent nil)
        (vreset! l_lastTrackingLayerInterface nil)
        (vreset! l_directionCompositeInterface nil)
        (vreset! l_size (JR/invoke (JR/fget this :trackingList) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_lastTrackingEvent (JR/invoke (JR/fget this :trackingList) :jm_get_1 0))
            (vreset! l_lastTrackingLayerInterface (JR/invoke @l_lastTrackingEvent :jm_getLayerInterface_0))
            (vreset! l_x (JR/invoke @l_lastTrackingLayerInterface :jm_getXP_0))
            (vreset! l_y (JR/invoke @l_lastTrackingLayerInterface :jm_getYP_0))
            (vreset! l_yDistance (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/invoke @l_ownerLayerInterface :jm_getYP_0) @l_y)) (JR/invoke @l_ownerLayerInterface :jm_getHeight_0))))
            (vreset! l_xDistance (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/invoke @l_ownerLayerInterface :jm_getXP_0) @l_x)) (JR/invoke @l_ownerLayerInterface :jm_getWidth_0))))
            (vreset! l_absXDistance (abs @l_xDistance))
            (vreset! l_absYDistance (abs @l_yDistance))
            (if (<= @l_absYDistance 100)
                (do
                (if (< @l_absXDistance (JR/idiv (JR/invoke this :jm_getFiringDistance_0) 2))
                    (do
                    (vreset! l_directionCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
                    (if (and (< @l_xDistance 0) (JR/eq (JR/invoke @l_directionCompositeInterface :jm_getDirection_0) (JR/fget @l_directionFactory :RIGHT)))
                        (do
                        (vreset! l_direction (JR/fget @l_directionFactory :RIGHT)))
                        (if (and (> @l_xDistance 0) (JR/eq (JR/invoke @l_directionCompositeInterface :jm_getDirection_0) (JR/fget @l_directionFactory :LEFT)))
                        (do
                        (vreset! l_direction (JR/fget @l_directionFactory :LEFT)))))))))))
        @l_direction))

    
(defn jm_disable_0 [this]
  (let []
        nil))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onMovement_1 [this p_trackingEvent]
  (let [ l_trackingEvent (volatile! p_trackingEvent)]
        (JR/invoke (JR/fget this :trackingList) :jm_clear_0)
        (JR/invoke (JR/fget this :trackingList) :jm_add_1 @l_trackingEvent)))

    
(defn jm_getFiringDistance_0 [this]
  (let []
        (JR/fget this :firingDistance)))

    
(defn jm_setFiringDistance_1 [this p_firingDistance]
  (let [ l_firingDistance (volatile! p_firingDistance)]
        (JR/fset this :firingDistance @l_firingDistance)))



