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

(ns HorizontalScreenPatrolAI)

(JR/register 'HorizontalScreenPatrolAI 'BasicAI '[])

(def jsv_SOUND (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SOUND [] (JR/ensure-init jclinit-state jclinit) @jsv_SOUND)
(defn jstatic_set_SOUND [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SOUND v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SOUND (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 433))
    nil))

(defn jinitfields [this]
  (JR/fset this :keyDirection 0)
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :firingX 0)
  (JR/fset this :firedIndex 0)
  (JR/fset this :MAX_FIRE 0)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :secondaryPlayerQueue nil)
  (JR/fset this :sound nil)
    (JR/fset this :keyDirection (JR/sget 'Canvas "LEFT"))
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :firingX (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0))
    (JR/fset this :firedIndex 0)
    (JR/fset this :MAX_FIRE 28)
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 240))
    (JR/fset this :secondaryPlayerQueue (JR/scall 'SecondaryPlayerQueueFactory :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :sound (JR/invoke @l_hashtable :jm_get_1 (HorizontalScreenPatrolAI/jstatic_SOUND)))
        (if (nil? (JR/fget this :sound))
            (do
            (JR/jthrow (new java.lang.Exception "No Sound Provided!!")))))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'HorizontalScreenPatrolAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_layerInterface (volatile! nil) l_currentOwnerLayerX (volatile! nil) l_y (volatile! nil) l_gameLayerManager (volatile! nil) l_FIRE (volatile! nil)]
        (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/fget this :keyDirection))
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTimeTNT_0)
            (do
            (vreset! l_layerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
            (vreset! l_currentOwnerLayerX (JR/invoke @l_layerInterface :jm_getXP_0))
            (if (< @l_currentOwnerLayerX (unchecked-int (unchecked-negate (JR/c2i (JR/invoke @l_layerInterface :jm_getWidth_0)))))
                (do
                (vreset! l_y (JR/invoke (JR/scall 'MyRandomFactory :jm_getInstance_0) :jm_getAbsoluteNextIntAllowZero_1 50))
                (JR/invoke @l_layerInterface :jm_setPosition_3 (unchecked-int (unchecked-add (unchecked-int (unchecked-add (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0) (JR/invoke @l_layerInterface :jm_getWidth_0))) 50)) @l_y (JR/invoke @l_layerInterface :jm_getZP_0))
                (JR/fset this :firedIndex 0)
                (JR/fset this :firingX (unchecked-int (unchecked-add (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0) (JR/invoke (JR/scall 'MyRandomFactory :jm_getInstance_0) :jm_getNextInt_1 (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0)))))
                (JR/invoke (JR/fget this :secondaryPlayerQueue) :jm_add_1 (JR/fget this :sound))))
            (if (and (< @l_currentOwnerLayerX (JR/fget this :firingX)) (> @l_currentOwnerLayerX (unchecked-int (unchecked-negate (JR/c2i (JR/invoke @l_layerInterface :jm_getWidth_0))))))
                (do
                (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1"))
                (vreset! l_gameLayerManager @l_allBinaryLayerManager)
                (vreset! l_FIRE (JR/ishr (unchecked-int (unchecked-add (JR/invoke (JR/invoke @l_gameLayerManager :jm_getGameInfo_0) :jm_getCurrentLevel_0) 12)) 2))
                (if (> @l_FIRE (JR/fget this :MAX_FIRE))
                    (do
                    (vreset! l_FIRE (JR/fget this :MAX_FIRE))))
                (if (> (JR/fget this :firedIndex) @l_FIRE)
                    (do
                    (JR/fset this :firedIndex 0)
                    (JR/fset this :firingX java.lang.Integer/MIN_VALUE)))
                (JR/finc this :firedIndex 1 :int false)))))))

    
(defn jm_nextDirection_0 [this]
  (let []
        nil))



