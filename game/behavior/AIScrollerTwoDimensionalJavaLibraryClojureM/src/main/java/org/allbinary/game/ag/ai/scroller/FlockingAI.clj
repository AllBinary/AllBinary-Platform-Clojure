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

(ns FlockingAI)

(JR/register 'FlockingAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :allowedDistance 0)
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_allowedDistance (volatile! nil)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (vreset! l_allowedDistance (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'BasePatrolAI "MAX_DISTANCE")))
        (JR/fset this :allowedDistance (JR/invoke @l_allowedDistance :jm_intValue_0)))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'FlockingAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_maxDistance (volatile! nil) l_farAllbinaryLayer (volatile! nil) l_groupLayerManagerListener (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_allBinaryLayer (volatile! nil) l_ownerLayerInterface (volatile! nil) l_distance (volatile! nil) l_index (volatile! nil)]
        (vreset! l_maxDistance 0)
        (vreset! l_farAllbinaryLayer (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
        (vreset! l_groupLayerManagerListener (JR/scall 'GroupLayerManagerListener :jm_getInstance_0))
        (vreset! l_list (JR/invoke @l_groupLayerManagerListener :jm_getList_1 (JR/fget (JR/scall 'BasicGroupFactory :jm_getInstance_0) :ENEMY)))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_allBinaryLayer nil)
        (vreset! l_ownerLayerInterface nil)
        (do (vreset! l_index 0)
            (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_allBinaryLayer (JR/invoke @l_list :jm_get_1 @l_index))
            (if (not (== (JR/invoke @l_allBinaryLayer :jm_getType_0) (JR/scall 'WeaponLayer :jm_getStaticType_0)))
                (do
                (vreset! l_distance (JR/invoke this :jm_getXYDistance_1 @l_allBinaryLayer))
                (if (> @l_distance @l_maxDistance)
                    (do
                    (vreset! l_maxDistance @l_distance)
                    (vreset! l_farAllbinaryLayer @l_allBinaryLayer)
                    (if (> @l_distance (JR/fget this :allowedDistance))
                        (do
                        (JR/jbreak)))))))))
        (if (> @l_maxDistance (JR/fget this :allowedDistance))
            (do
            (if (not (JR/eq @l_farAllbinaryLayer (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER")))
                (do
                (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
                (if (< (JR/invoke @l_farAllbinaryLayer :jm_getXP_0) (JR/invoke @l_ownerLayerInterface :jm_getXP_0))
                    (do
                    (JR/invoke this :jm_processKeyAI_1 (JR/sget 'Canvas "LEFT")))
                    (if (> (JR/invoke @l_farAllbinaryLayer :jm_getXP_0) (JR/invoke @l_ownerLayerInterface :jm_getXP_0))
                    (do
                    (JR/invoke this :jm_processKeyAI_1 (JR/sget 'Canvas "RIGHT")))
                    (if (> (JR/invoke @l_farAllbinaryLayer :jm_getYP_0) (JR/invoke @l_ownerLayerInterface :jm_getYP_0))
                    (do
                    (JR/invoke this :jm_processKeyAI_1 (JR/sget 'Canvas "UP")))
                    (if (< (JR/invoke @l_farAllbinaryLayer :jm_getYP_0) (JR/invoke @l_ownerLayerInterface :jm_getYP_0))
                    (do
                    (JR/invoke this :jm_processKeyAI_1 (JR/sget 'Canvas "DOWN")))))))))))))

    
(defn jm_getXYDistance_1 [this p_allBinaryLayer]
  (let [ l_allBinaryLayer (volatile! p_allBinaryLayer) l_ownerLayerInterface (volatile! nil) l_xTotalDistance (volatile! nil) l_yTotalDistance (volatile! nil) l_mathUtil (volatile! nil) l_totalDistance (volatile! nil)]
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_xTotalDistance (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_allBinaryLayer :jm_getXP_0) (JR/invoke @l_allBinaryLayer :jm_getHalfWidth_0))) (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getXP_0) (JR/invoke @l_ownerLayerInterface :jm_getHalfWidth_0))))))
        (vreset! l_yTotalDistance (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_allBinaryLayer :jm_getYP_0) (JR/invoke @l_allBinaryLayer :jm_getHalfHeight_0))) (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getYP_0) (JR/invoke @l_ownerLayerInterface :jm_getHalfHeight_0))))))
        (vreset! l_mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
        (vreset! l_totalDistance (unchecked-int (unchecked-add (JR/invoke @l_mathUtil :jm_abs_1 @l_xTotalDistance) (JR/invoke @l_mathUtil :jm_abs_1 @l_yTotalDistance))))
        @l_totalDistance))



