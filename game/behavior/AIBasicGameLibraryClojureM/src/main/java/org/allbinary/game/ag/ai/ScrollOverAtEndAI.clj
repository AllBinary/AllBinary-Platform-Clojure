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
;; package org.allbinary.game.ag.ai

(ns ScrollOverAtEndAI)

(JR/register 'ScrollOverAtEndAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_ownerLayerInterface p_gameInput]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this))
  this)

(defn jnew_2 [p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'ScrollOverAtEndAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_ownerLayerInterface (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_displayInfo (volatile! nil)]
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_x (JR/invoke @l_ownerLayerInterface :jm_getXP_0))
        (vreset! l_y (JR/invoke @l_ownerLayerInterface :jm_getYP_0))
        (vreset! l_width (JR/invoke @l_ownerLayerInterface :jm_getWidth_0))
        (vreset! l_height (JR/invoke @l_ownerLayerInterface :jm_getHeight_0))
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (if (> @l_x (JR/invoke @l_displayInfo :jm_getLastWidth_0))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 0 @l_y (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))
        (if (> @l_y (JR/invoke @l_displayInfo :jm_getLastHeight_0))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 @l_x 0 (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))
        (if (< @l_x (unchecked-int (unchecked-negate (JR/c2i @l_width))))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastWidth_0) @l_width)) @l_y (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))
        (if (< @l_y (unchecked-int (unchecked-negate (JR/c2i @l_height))))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 @l_x (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHeight_0) @l_height)) (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))))



