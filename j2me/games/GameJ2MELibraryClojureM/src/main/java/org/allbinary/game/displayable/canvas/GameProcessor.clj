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
;; package org.allbinary.game.displayable.canvas

(ns GameProcessor)

(JR/register 'GameProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gameCanvas nil)
  this)

    
(defn jinit_1 [this p_gameCanvas]
  (let [ l_gameCanvas (volatile! p_gameCanvas)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :gameCanvas @l_gameCanvas))
  this)

(defn jnew_1 [p_gameCanvas ]
  (let [o (JR/alloc 'GameProcessor)] (jinit_1 o p_gameCanvas) o))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameCanvas) :jm_processPlayingGame_0)))



