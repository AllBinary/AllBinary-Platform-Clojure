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
;; package org.allbinary.layer.relationship

(ns MiddleRelativeLayerRelationship)

(JR/register 'MiddleRelativeLayerRelationship 'RelativeLayerRelationship '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        (RelativeLayerRelationship/jinit_3 this @l_layer (JR/invoke (JR/scall 'PointFactory :jm_getInstance_0) :jm_createXY_2 (JR/invoke @l_layer :jm_getHalfWidth_0) (JR/invoke @l_layer :jm_getHalfHeight_0)) (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0)) (jinitfields this))
  this)

(defn jnew_1 [p_layer ]
  (let [o (JR/alloc 'MiddleRelativeLayerRelationship)] (jinit_1 o p_layer) o))



