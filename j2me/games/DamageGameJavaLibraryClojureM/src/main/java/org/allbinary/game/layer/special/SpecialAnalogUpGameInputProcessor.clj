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
;; package org.allbinary.game.layer.special

(ns SpecialAnalogUpGameInputProcessor)

(JR/register 'SpecialAnalogUpGameInputProcessor 'SpecialGameInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_collidableDestroyableDamageableLayer]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer)]
        (SpecialGameInputProcessor/jinit_1 this @l_collidableDestroyableDamageableLayer) (jinitfields this))
  this)

(defn jnew_1 [p_collidableDestroyableDamageableLayer ]
  (let [o (JR/alloc 'SpecialAnalogUpGameInputProcessor)] (jinit_1 o p_collidableDestroyableDamageableLayer) o))

    
(defn jm_processAnalog_3 [this p_allbinaryLayerManager p_gameKeyEvent p_yAnalogValue]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent) l_yAnalogValue (volatile! p_yAnalogValue)]
        (JR/invoke (JR/fget this :collidableDestroyableDamageableLayer) :jm_upAnalog_1 @l_yAnalogValue)))



