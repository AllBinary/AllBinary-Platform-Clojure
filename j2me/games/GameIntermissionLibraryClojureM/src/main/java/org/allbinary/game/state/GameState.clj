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
;; package org.allbinary.game.state

(ns GameState)

(JR/register 'GameState nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  this)

    
(defn jinit_2 [this p_name p_state]
  (let [ l_name (volatile! p_name) l_state (volatile! p_state)]
    nil (jinitfields this)
        (JR/fset this :name @l_name))
  this)

(defn jnew_2 [p_name p_state ]
  (let [o (JR/alloc 'GameState)] (jinit_2 o p_name p_state) o))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :name)))



