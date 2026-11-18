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

(ns AnalogInputBuilder)

(JR/register 'AnalogInputBuilder nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AnalogInputBuilder/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AnalogInputBuilder)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnalogInputBuilder/jstatic_instance)))

    
(defn jm_disable_2 [this p_inputProcessorArray p_collidableDestroyableDamageableLayer]
  (let [ l_inputProcessorArray (volatile! p_inputProcessorArray) l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer)]
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "UP") (SpecialUpGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "DOWN") (SpecialDownGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "RIGHT") (SpecialRightGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "LEFT") (SpecialLeftGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "KEY_NUM0") (Special1GameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "KEY_NUM5") (Special3GameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))))

    
(defn jm_enable_2 [this p_inputProcessorArray p_collidableDestroyableDamageableLayer]
  (let [ l_inputProcessorArray (volatile! p_inputProcessorArray) l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer)]
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "UP") (SpecialAnalogUpGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "DOWN") (SpecialAnalogDownGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "RIGHT") (SpecialAnalogRightGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "LEFT") (SpecialAnalogLeftGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "KEY_NUM0") (SpecialAnalogLeftTriggerGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))
        (JR/aset* @l_inputProcessorArray (JR/sget 'Canvas "KEY_NUM5") (SpecialAnalogRightTriggerGameInputProcessor/jnew_1 @l_collidableDestroyableDamageableLayer))))



