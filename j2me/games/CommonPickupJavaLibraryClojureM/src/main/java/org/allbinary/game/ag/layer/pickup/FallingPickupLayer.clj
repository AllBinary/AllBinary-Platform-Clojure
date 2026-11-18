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
;; package org.allbinary.game.ag.layer.pickup

(ns FallingPickupLayer)

(JR/register 'FallingPickupLayer 'PickupLayer '[TickableInterface])

(def jsv_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NAME "FallingPickupLayer")
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_remoteInfo]
  (let [ l_remoteInfo (volatile! p_remoteInfo)]
        (PickupLayer/jinit_7 this (FallingPickupLayer/jstatic_NAME) @l_remoteInfo 0 (JR/sget 'CountedPickedUpLayerInterfaceFactory "NULL_COUNTED_PICKUP_LAYER_FACTORY") (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0) (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) 0 0) (JR/scall 'ViewPosition :jm_getInstanceD_0)) (jinitfields this))
  this)

(defn jnew_1 [p_remoteInfo ]
  (let [o (JR/alloc 'FallingPickupLayer)] (jinit_1 o p_remoteInfo) o))

    
(defn jm_processTick_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/invoke this :jm_setPosition_3 (JR/fget this :x) (+ (JR/fget this :y) 1) (JR/fget this :z))))

    
(defn jm_implmentsTickableInterface_0 [this]
  (let []
        true))



