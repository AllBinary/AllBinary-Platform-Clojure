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

(ns RandomPatrolAI)

(JR/register 'RandomPatrolAI 'BasePatrolAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :changedDirection false)
    (JR/fset this :changedDirection true)
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasePatrolAI/jinit_3 this @l_hashtable @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/invoke this :jm_updateRandomDistance_0))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'RandomPatrolAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_updateRandomDistance_0 [this]
  (let []
        (JR/fset this :currentDistance (JR/invoke (JR/scall 'MyRandomFactory :jm_getInstance_0) :jm_getAbsoluteNextInt_1 (JR/invoke (JR/fget this :maxDistance) :jm_intValue_0)))))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/invoke-super 'BasePatrolAI this :jm_update_0)
        (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/fget this :keyDirection))
        (if (JR/fget this :changedDirection)
            (do
            (JR/invoke-super 'BasePatrolAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1"))
            (JR/invoke this :jm_updateRandomDistance_0)
            (JR/fset this :changedDirection false)))))

    
(defn jm_nextDirection_0 [this]
  (let []
        (JR/invoke-super 'BasePatrolAI this :jm_nextDirection_0)
        (JR/fset this :changedDirection true)))



