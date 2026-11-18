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
;; package org.allbinary.game.layer.pickup

(ns PickedUpLayerInterfaceFactory)

(JR/register 'PickedUpLayerInterfaceFactory 'PickedUpLayerInterfaceFactoryBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :pickedUpLayerType nil)
  (JR/fset this :iconLayer nil)
  (JR/fset this :animationInterface nil)
  this)

    
(defn jinit_3 [this p_pickeUpLayerType p_iconLayer p_animationInterface]
  (let [ l_pickeUpLayerType (volatile! p_pickeUpLayerType) l_iconLayer (volatile! p_iconLayer) l_animationInterface (volatile! p_animationInterface)]
    (PickedUpLayerInterfaceFactoryBase/jinit_0 this) (jinitfields this)
        (JR/fset this :pickedUpLayerType @l_pickeUpLayerType)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :iconLayer @l_iconLayer))
  this)

(defn jnew_3 [p_pickeUpLayerType p_iconLayer p_animationInterface ]
  (let [o (JR/alloc 'PickedUpLayerInterfaceFactory)] (jinit_3 o p_pickeUpLayerType p_iconLayer p_animationInterface) o))

    
(defn jm_getIconLayer_0 [this]
  (let []
        (JR/fget this :iconLayer)))

    
(defn jm_getAnimationInterface_0 [this]
  (let []
        (JR/fget this :animationInterface)))

    
(defn jm_getPickedUpLayerType_0 [this]
  (let []
        (JR/fget this :pickedUpLayerType)))



