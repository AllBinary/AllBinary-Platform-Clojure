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
;; package org.allbinary.game.midlet

(ns DemoGameMidletEvent)

(JR/register 'DemoGameMidletEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :demoGameMidletState nil)
  this)

    
(defn jinit_2 [this p_anyType p_demoGameMidletState]
  (let [ l_anyType (volatile! p_anyType) l_demoGameMidletState (volatile! p_demoGameMidletState)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this)
        (JR/fset this :demoGameMidletState @l_demoGameMidletState))
  this)

(defn jnew_2 [p_anyType p_demoGameMidletState ]
  (let [o (JR/alloc 'DemoGameMidletEvent)] (jinit_2 o p_anyType p_demoGameMidletState) o))

    
(defn jm_init_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke this :jm_setSource_1 @l_anyType)))

    
(defn jm_setDemoGameMidletState_1 [this p_demoGameMidletState]
  (let [ l_demoGameMidletState (volatile! p_demoGameMidletState)]
        (JR/fset this :demoGameMidletState @l_demoGameMidletState)))

    
(defn jm_getDemoGameMidletState_0 [this]
  (let []
        (JR/fget this :demoGameMidletState)))



