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
;; package org.allbinary.game.combat.destroy.event

(ns DestroyEventFactory)

(JR/register 'DestroyEventFactory nil '[AllBinaryEventObjectFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :combatGameCanvas nil)
  this)

    
(defn jinit_1 [this p_combatGameCanvas]
  (let [ l_combatGameCanvas (volatile! p_combatGameCanvas)]
    nil (jinitfields this)
        (JR/fset this :combatGameCanvas @l_combatGameCanvas))
  this)

(defn jnew_1 [p_combatGameCanvas ]
  (let [o (JR/alloc 'DestroyEventFactory)] (jinit_1 o p_combatGameCanvas) o))

    
(defn jm_getInstance_0 [this]
  (let []
        (DestroyedEvent/jnew_1 (JR/fget this :combatGameCanvas))))



