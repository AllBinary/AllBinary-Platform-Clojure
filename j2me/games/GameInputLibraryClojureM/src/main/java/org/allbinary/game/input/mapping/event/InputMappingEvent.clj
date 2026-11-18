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
;; package org.allbinary.game.input.mapping.event

(ns InputMappingEvent)

(JR/register 'InputMappingEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :inputToGameKeyMapping nil)
    (JR/fset this :inputToGameKeyMapping (JR/scall 'InputToGameKeyMapping :jm_getNullInstance_0))
  this)

    
(defn jinit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this))
  this)

(defn jnew_1 [p_anyType ]
  (let [o (JR/alloc 'InputMappingEvent)] (jinit_1 o p_anyType) o))

    
(defn jm_setInputToGameKeyMapping_1 [this p_inputToGameKeyMapping]
  (let [ l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping)]
        (JR/fset this :inputToGameKeyMapping @l_inputToGameKeyMapping)))

    
(defn jm_getInputToGameKeyMapping_0 [this]
  (let []
        (JR/fget this :inputToGameKeyMapping)))



