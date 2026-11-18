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

(ns LurchRotationAI)

(JR/register 'LurchRotationAI 'LurchAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :rotationAnimationInterface nil)
  this)

    
(defn jinit_2 [this p_ownerLayerInterface p_gameInput]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_rotationAnimationInterfaceCompositeInterface (volatile! nil)]
        (LurchAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/fset this :rotationAnimationInterface (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_getRotationAnimationInterface_0))
        (JR/invoke this :jm_update_0))
  this)

(defn jnew_2 [p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'LurchRotationAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_reverse_0 [this]
  (let []
        (JR/invoke-super 'LurchAI this :jm_reverse_0)
        (JR/invoke this :jm_update_0)))

    
(defn jm_update_0 [this]
  (let [ l_rotationAnimationInterface (volatile! nil) l_angleIncrementInfo (volatile! nil) l_rotationAnimationInterfaceCompositeInterface (volatile! nil)]
        (if (JR/eq (JR/fget this :currentRelativeAngle) 0)
            (do
            (vreset! l_rotationAnimationInterface (JR/fget this :rotationAnimationInterface))
            (vreset! l_angleIncrementInfo (JR/invoke (JR/invoke @l_rotationAnimationInterface :jm_getAngleInfoP_0) :jm_getAngleIncrementInfo_0))
            (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
            (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_setFrame_1 (JR/invoke (JR/fget @l_angleIncrementInfo :RIGHT_FRAME) :jm_intValue_0)))
            (if (JR/eq (JR/fget this :currentRelativeAngle) 180)
            (do
            (vreset! l_rotationAnimationInterface (JR/fget this :rotationAnimationInterface))
            (vreset! l_angleIncrementInfo (JR/invoke (JR/invoke @l_rotationAnimationInterface :jm_getAngleInfoP_0) :jm_getAngleIncrementInfo_0))
            (vreset! l_rotationAnimationInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
            (JR/invoke @l_rotationAnimationInterfaceCompositeInterface :jm_setFrame_1 (JR/invoke (JR/fget @l_angleIncrementInfo :LEFT_FRAME) :jm_intValue_0)))))))



