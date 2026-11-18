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
;; package org.allbinary.game.ag.layer.hud.basic

(ns SetAndRemoveProcessor)

(JR/register 'SetAndRemoveProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :updateMeasurementProcessor nil)
  this)

    
(defn jinit_1 [this p_updateMeasurementProcessor]
  (let [ l_updateMeasurementProcessor (volatile! p_updateMeasurementProcessor)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :updateMeasurementProcessor @l_updateMeasurementProcessor))
  this)

(defn jnew_1 [p_updateMeasurementProcessor ]
  (let [o (JR/alloc 'SetAndRemoveProcessor)] (jinit_1 o p_updateMeasurementProcessor) o))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/fget this :updateMeasurementProcessor) :jm_setAndRemoveProcess_0)))



