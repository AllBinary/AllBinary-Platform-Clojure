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
;; package org.allbinary.game.ag.ai.tactical

(ns LurchAI)

(JR/register 'LurchAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :currentRelativeAngle 0)
  (JR/fset this :currentSpeed 0)
    (JR/fset this :currentRelativeAngle 0)
  this)

    
(defn jinit_2 [this p_ownerLayerInterface p_gameInput]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this))
  this)

(defn jnew_2 [p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'LurchAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_ownerLayerInterface (volatile! nil) l_x (volatile! nil)]
        (if (== (JR/fget this :currentSpeed) (unchecked-int (unchecked-negate (JR/c2i 1))))
            (do
            (JR/fset this :currentSpeed 5))
            (do
            (JR/fset this :currentSpeed (unchecked-int (unchecked-negate (JR/c2i 1))))))
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_x (JR/invoke @l_ownerLayerInterface :jm_getXP_0))
        (if (<= (unchecked-int (unchecked-subtract (JR/invoke @l_ownerLayerInterface :jm_getXP_0) (JR/fget this :currentSpeed))) 0)
            (do
            (JR/invoke this :jm_reverse_0)
            (JR/invoke this :jm_drop_0)))
        (if (> (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getX2_0) (JR/fget this :currentSpeed))) (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_getLastWidth_0))
            (do
            (JR/invoke this :jm_reverse_0)
            (JR/invoke this :jm_accelerate_0)
            (JR/invoke this :jm_drop_0)))
        (if (== (JR/fget this :currentRelativeAngle) 0)
            (do
            (vreset! l_x (unchecked-int (unchecked-add @l_x (JR/fget this :currentSpeed)))))
            (if (== (JR/fget this :currentRelativeAngle) 180)
            (do
            (vreset! l_x (unchecked-int (unchecked-subtract @l_x (JR/fget this :currentSpeed)))))))
        (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 @l_x (JR/invoke @l_ownerLayerInterface :jm_getYP_0) (JR/invoke @l_ownerLayerInterface :jm_getZP_0))
        (if (== (JR/fget this :currentRelativeAngle) 0)
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM0")))
            (if (== (JR/fget this :currentRelativeAngle) 180)
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_POUND")))))))

    
(defn jm_reverse_0 [this]
  (let []
        (if (== (JR/fget this :currentRelativeAngle) 180)
            (do
            (JR/fset this :currentRelativeAngle 0))
            (if (== (JR/fget this :currentRelativeAngle) 0)
            (do
            (JR/fset this :currentRelativeAngle 180))))))

    
(defn jm_accelerate_0 [this]
  (let []
        (if (< (JR/fget this :currentSpeed) 20)
            (do
            (JR/finc this :currentSpeed 1 :int false)))))

    
(defn jm_drop_0 [this]
  (let [ l_ownerLayerInterface (volatile! nil) l_y (volatile! nil)]
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_y (JR/invoke @l_ownerLayerInterface :jm_getYP_0))
        (if (> (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getY2_0) (JR/invoke @l_ownerLayerInterface :jm_getHeight_0))) (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_getLastHeight_0))
            (do
            (vreset! l_y 0))
            (do
            (vreset! l_y (unchecked-int (unchecked-add @l_y (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getHeight_0) 1)))))))
        (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 (JR/invoke @l_ownerLayerInterface :jm_getXP_0) @l_y (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))



