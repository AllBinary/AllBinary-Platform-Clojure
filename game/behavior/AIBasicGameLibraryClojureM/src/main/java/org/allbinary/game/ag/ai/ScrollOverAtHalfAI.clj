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

(ns ScrollOverAtHalfAI)

(JR/register 'ScrollOverAtHalfAI 'BasicAI '[])

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
  (let [o (JR/alloc 'ScrollOverAtHalfAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_ownerLayerInterface (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_halfWidth (volatile! nil) l_halfHeight (volatile! nil) l_displayInfo (volatile! nil)]
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_x (JR/invoke @l_ownerLayerInterface :jm_getXP_0))
        (vreset! l_y (JR/invoke @l_ownerLayerInterface :jm_getYP_0))
        (vreset! l_halfWidth (JR/invoke @l_ownerLayerInterface :jm_getHalfWidth_0))
        (vreset! l_halfHeight (JR/invoke @l_ownerLayerInterface :jm_getHalfHeight_0))
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (if (> @l_x (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastWidth_0) @l_halfWidth)))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 (unchecked-int (unchecked-add @l_halfWidth 1)) @l_y (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))
        (if (> @l_y (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHeight_0) @l_halfHeight)))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 @l_x (unchecked-int (unchecked-add @l_halfHeight 1)) (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))
        (if (< @l_x (unchecked-int (unchecked-negate (JR/c2i @l_halfWidth))))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastWidth_0) @l_halfWidth)) @l_y (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))
        (if (< @l_y (unchecked-int (unchecked-negate (JR/c2i @l_halfHeight))))
            (do
            (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 @l_x (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHeight_0) @l_halfHeight)) (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))))



