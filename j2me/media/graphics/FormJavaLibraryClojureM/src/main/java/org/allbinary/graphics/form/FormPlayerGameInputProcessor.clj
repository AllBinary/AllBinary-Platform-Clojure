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
;; package org.allbinary.graphics.form

(ns FormPlayerGameInputProcessor)

(JR/register 'FormPlayerGameInputProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :playerGameInputCompositeInterface nil)
  this)

    
(defn jinit_1 [this p_playerGameInputCompositeInterface]
  (let [ l_playerGameInputCompositeInterface (volatile! p_playerGameInputCompositeInterface)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :playerGameInputCompositeInterface @l_playerGameInputCompositeInterface))
  this)

(defn jnew_1 [p_playerGameInputCompositeInterface ]
  (let [o (JR/alloc 'FormPlayerGameInputProcessor)] (jinit_1 o p_playerGameInputCompositeInterface) o))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/invoke (JR/fget this :playerGameInputCompositeInterface) :jm_getPlayerGameInput_0) :jm_update_0)))



