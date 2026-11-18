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

(ns HorizontaRotationManeuverAI)

(JR/register 'HorizontaRotationManeuverAI 'BasicAI '[ArtificialIntelligenceTransitionInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :currentSpeedDivisor 0)
  (JR/fset this :rotationAnimationInterface nil)
  (JR/fset this :baseVelocityInterface nil)
  (JR/fset this :velocityInterface nil)
    (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstanceAt_2 10 java.lang.Integer/MAX_VALUE))
    (JR/fset this :currentSpeedDivisor 5)
  this)

    
(defn jinit_2 [this p_ownerLayerInterface p_gameInput]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_rotationAnimationInterfaceCompositeInterface (volatile! nil) l_velocityInterfaceCompositeInterface (volatile! nil) l_rotationAnimationInterface (volatile! nil) l_angleIncrementInfo (volatile! nil)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/fset this :rotationAnimationInterface (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_getRotationAnimationInterface_0))
        (vreset! l_velocityInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/fset this :baseVelocityInterface (JR/invoke @l_velocityInterfaceCompositeInterface :jm_getVelocityProperties_0))
        (JR/fset this :velocityInterface (JR/fget this :baseVelocityInterface))
        (vreset! l_rotationAnimationInterface (JR/fget this :rotationAnimationInterface))
        (vreset! l_angleIncrementInfo (JR/invoke (JR/invoke @l_rotationAnimationInterface :jm_getAngleInfoP_0) :jm_getAngleIncrementInfo_0))
        (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_setFrame_1 (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0)))
  this)

(defn jnew_2 [p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'HorizontaRotationManeuverAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_transition_0 [this]
  (let [ l_rotationAnimationInterface (volatile! nil) l_angleIncrementInfo (volatile! nil) l_rotationAnimationInterfaceCompositeInterface (volatile! nil) l_allbinaryLayer (volatile! nil)]
        (vreset! l_rotationAnimationInterface (JR/fget this :rotationAnimationInterface))
        (vreset! l_angleIncrementInfo (JR/invoke (JR/invoke @l_rotationAnimationInterface :jm_getAngleInfoP_0) :jm_getAngleIncrementInfo_0))
        (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_setFrame_1 (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0))
        (vreset! l_allbinaryLayer (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/invoke @l_allbinaryLayer :jm_setPosition_3 (JR/invoke @l_allbinaryLayer :jm_getXP_0) 1 (JR/invoke @l_allbinaryLayer :jm_getZP_0))))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_rotationAnimationInterface (volatile! nil) l_angleIncrementInfo (volatile! nil) l_frame (volatile! nil) l_ownerLayerInterface (volatile! nil) l_displayInfo (volatile! nil) l_index (volatile! nil)]
        (vreset! l_rotationAnimationInterface (JR/fget this :rotationAnimationInterface))
        (vreset! l_angleIncrementInfo (JR/invoke (JR/invoke @l_rotationAnimationInterface :jm_getAngleInfoP_0) :jm_getAngleIncrementInfo_0))
        (vreset! l_frame (JR/invoke (JR/fget this :rotationAnimationInterface) :jm_getFrame_0))
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (if (and (<= (unchecked-int (unchecked-subtract (JR/invoke @l_ownerLayerInterface :jm_getXP_0) (JR/invoke @l_ownerLayerInterface :jm_getWidth_0))) 0) (== @l_frame (JR/invoke (JR/fget @l_angleIncrementInfo :LEFT_FRAME) :jm_intValue_0)))
            (do
            (JR/invoke this :jm_reverse_0)
            (JR/invoke this :jm_drop_0)))
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (if (and (> (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getX2_0) (JR/invoke @l_ownerLayerInterface :jm_getWidth_0))) (JR/invoke @l_displayInfo :jm_getLastWidth_0)) (== @l_frame (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0)))
            (do
            (JR/invoke this :jm_reverse_0)
            (JR/invoke this :jm_accelerate_0)
            (JR/invoke this :jm_drop_0)))
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (if (and (== (rem @l_index (JR/fget this :currentSpeedDivisor)) 0) (== (rem @l_index 2) 0))
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "UP"))
            (JR/invoke (JR/fget this :velocityInterface) :jm_limitMaxXYVelocity_1 (JR/idiv (JR/invoke (JR/fget this :velocityInterface) :jm_getMaxForwardVelocity_0) (JR/fget this :currentSpeedDivisor)))))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)
        (if (== @l_frame (JR/invoke (JR/fget @l_angleIncrementInfo :LEFT_FRAME) :jm_intValue_0))
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM0")))
            (if (== @l_frame (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0))
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_POUND")))))))

    
(defn jm_reverse_0 [this]
  (let [ l_rotationAnimationInterface (volatile! nil) l_angleIncrementInfo (volatile! nil) l_frame (volatile! nil) l_rotationAnimationInterfaceCompositeInterface (volatile! nil)]
        (vreset! l_rotationAnimationInterface (JR/fget this :rotationAnimationInterface))
        (vreset! l_angleIncrementInfo (JR/invoke (JR/invoke @l_rotationAnimationInterface :jm_getAngleInfoP_0) :jm_getAngleIncrementInfo_0))
        (vreset! l_frame (JR/invoke (JR/fget this :rotationAnimationInterface) :jm_getFrame_0))
        (if (== @l_frame (JR/invoke (JR/fget @l_angleIncrementInfo :LEFT_FRAME) :jm_intValue_0))
            (do
            (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
            (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_setFrame_1 (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0))
            (JR/invoke (JR/fget this :baseVelocityInterface) :jm_zero_0))
            (if (== @l_frame (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0))
            (do
            (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
            (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_setFrame_1 (JR/invoke (JR/fget @l_angleIncrementInfo :LEFT_FRAME) :jm_intValue_0))
            (JR/invoke (JR/fget this :baseVelocityInterface) :jm_zero_0))))))

    
(defn jm_accelerate_0 [this]
  (let []
        (if (> (JR/fget this :currentSpeedDivisor) 1)
            (do
            (JR/finc this :currentSpeedDivisor -1 :int false)))))

    
(defn jm_drop_0 [this]
  (let [ l_displayInfo (volatile! nil) l_ownerLayerInterface (volatile! nil) l_y (volatile! nil)]
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_y (JR/invoke @l_ownerLayerInterface :jm_getYP_0))
        (if (> (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getY2_0) (JR/invoke @l_ownerLayerInterface :jm_getHeight_0))) (JR/invoke @l_displayInfo :jm_getLastHeight_0))
            (do
            (vreset! l_y 0))
            (do
            (vreset! l_y (unchecked-int (unchecked-add @l_y (unchecked-int (unchecked-add (JR/invoke @l_ownerLayerInterface :jm_getHeight_0) 1)))))))
        (JR/invoke @l_ownerLayerInterface :jm_setPosition_3 (JR/invoke @l_ownerLayerInterface :jm_getXP_0) @l_y (JR/invoke @l_ownerLayerInterface :jm_getZP_0))))

    
(defn jm_getId_0 [this]
  (let []
        (JR/sget 'ArtificialIntelligence "AI_ID")))



