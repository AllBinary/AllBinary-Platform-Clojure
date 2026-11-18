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

(ns StartIntermissionProcessor)

(JR/register 'StartIntermissionProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :gameCanvas nil)
  (JR/fset this :WAIT 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :WAIT 5000)
  this)

    
(defn jinit_1 [this p_gameCanvas]
  (let [ l_gameCanvas (volatile! p_gameCanvas)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :gameCanvas @l_gameCanvas))
  this)

(defn jnew_1 [p_gameCanvas ]
  (let [o (JR/alloc 'StartIntermissionProcessor)] (jinit_1 o p_gameCanvas) o))

    
(defn jm_process_0 [this]
  (let []
        (if (JR/invoke (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getStartIntermissionInterface_0) :jm_getTimeDelayHelper_0) :jm_isElapsedTNT_1 (JR/fget this :WAIT))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Intermission End" this (JR/fget (JR/fget this :commonStrings) :PROCESS))
            (JR/invoke (JR/invoke (JR/fget this :gameCanvas) :jm_getStartIntermissionInterface_0) :jm_setEnabled_1 false)))))



