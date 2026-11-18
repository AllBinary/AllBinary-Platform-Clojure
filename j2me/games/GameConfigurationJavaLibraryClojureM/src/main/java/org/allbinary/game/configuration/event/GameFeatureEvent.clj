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
;; package org.allbinary.game.configuration.event

(ns GameFeatureEvent)

(JR/register 'GameFeatureEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :whatChanged nil)
  this)

    
(defn jinit_2 [this p_anyType p_whatChanged]
  (let [ l_anyType (volatile! p_anyType) l_whatChanged (volatile! p_whatChanged)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this)
        (JR/fset this :whatChanged @l_whatChanged))
  this)

(defn jnew_2 [p_anyType p_whatChanged ]
  (let [o (JR/alloc 'GameFeatureEvent)] (jinit_2 o p_anyType p_whatChanged) o))

    
(defn jm_getWhatChanged_0 [this]
  (let []
        (JR/fget this :whatChanged)))

    
(defn jm_getGameOption_0 [this]
  (let []
        (JR/invoke this :jm_getSource_0)))



