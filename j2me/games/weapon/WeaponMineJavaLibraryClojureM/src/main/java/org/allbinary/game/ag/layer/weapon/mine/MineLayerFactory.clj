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
;; package org.allbinary.game.ag.layer.weapon.mine

(ns MineLayerFactory)

(JR/register 'MineLayerFactory nil '[AllBinaryLayerFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :viewPositionFactoryInterface nil)
  this)

    
(defn jinit_1 [this p_viewPositionFactoryInterface]
  (let [ l_viewPositionFactoryInterface (volatile! p_viewPositionFactoryInterface)]
    nil (jinitfields this)
        (JR/fset this :viewPositionFactoryInterface @l_viewPositionFactoryInterface))
  this)

(defn jnew_1 [p_viewPositionFactoryInterface ]
  (let [o (JR/alloc 'MineLayerFactory)] (jinit_1 o p_viewPositionFactoryInterface) o))

    
(defn jm_getInstance_0 [this]
  (let []
        (MineLayer/jnew_1 (JR/invoke (JR/fget this :viewPositionFactoryInterface) :jm_getInstance_0))))



