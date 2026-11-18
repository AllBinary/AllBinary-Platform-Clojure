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

(ns UpDownVectorAI)

(JR/register 'UpDownVectorAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :velocityInterface nil)
  (JR/fset this :index 0)
    (JR/fset this :index 0)
  this)

    
(defn jinit_2 [this p_ownerLayerInterface p_gameInput]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_velocityInterfaceCompositeInterface (volatile! nil)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (vreset! l_velocityInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/fset this :velocityInterface (JR/invoke @l_velocityInterfaceCompositeInterface :jm_getVelocityProperties_0))
        (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0) :jm_setint_1 0))
  this)

(defn jnew_2 [p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'UpDownVectorAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_y (volatile! nil) l_basicDecimal (volatile! nil)]
        (vreset! l_y (unchecked-int (unchecked-multiply (JR/invoke (JR/invoke this :jm_getOwnerLayerInterface_0) :jm_getHeight_0) 270)))
        (if (< (JR/fget this :index) 5)
            (do
            (vreset! l_basicDecimal (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0))
            (JR/invoke @l_basicDecimal :jm_setint_1 0)
            (JR/invoke @l_basicDecimal :jm_addint_1 @l_y)
            (JR/finc this :index 1 :int false))
            (if (< (JR/fget this :index) 10)
            (do
            (vreset! l_basicDecimal (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0))
            (JR/invoke @l_basicDecimal :jm_setint_1 0)
            (JR/invoke @l_basicDecimal :jm_subtractint_1 @l_y)
            (JR/finc this :index 1 :int false))
            (do
            (JR/fset this :index 0)
            (JR/invoke this :jm_processAI_1 @l_allBinaryLayerManager))))))



