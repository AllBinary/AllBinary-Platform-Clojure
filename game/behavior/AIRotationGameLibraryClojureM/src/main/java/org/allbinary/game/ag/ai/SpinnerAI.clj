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

(ns SpinnerAI)

(JR/register 'SpinnerAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :isEven false)
  (JR/fset this :direction nil)
  this)

    
(defn jinit_3 [this p_direction p_ownerLayerInterface p_gameInput]
  (let [ l_direction (volatile! p_direction) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :direction @l_direction))
  this)

(defn jnew_3 [p_direction p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'SpinnerAI)] (jinit_3 o p_direction p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (if (JR/fget this :isEven)
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/aget* (JR/fget this :direction) 0))
            (JR/fset this :isEven false))
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1"))
            (JR/fset this :isEven true)))))



