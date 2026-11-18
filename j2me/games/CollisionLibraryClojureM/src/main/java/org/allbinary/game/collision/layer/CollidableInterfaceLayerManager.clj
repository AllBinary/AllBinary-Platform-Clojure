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
;; package org.allbinary.game.collision.layer

(ns CollidableInterfaceLayerManager)

(JR/register 'CollidableInterfaceLayerManager 'LayerManager '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (LayerManager/jinit_1 this (JR/scall 'LayerManagerNoDebug :jm_getInstance_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CollidableInterfaceLayerManager)] (jinit_0 o) o))



