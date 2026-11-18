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
;; package org.allbinary.game.ag.ai

(ns NumberInSameGroupSequence)

(JR/register 'NumberInSameGroupSequence nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_ZERO nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_ONE nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_TWO nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_THREE nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_FOUR nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_FIVE nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_SIX nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_SEVEN nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_EIGHT nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_NINE nil)
  (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NumberInSameGroupSequence/jnew_0)))

    
(defn jinit_0 [this]
  (let [ l_smallIntegerSingletonFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_ZERO (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 100))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_ONE (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 101))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_TWO (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 102))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_THREE (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 103))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_FOUR (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 104))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_FIVE (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 105))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_SIX (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 106))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_SEVEN (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 107))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_EIGHT (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 108))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE_NINE (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 109))
        (JR/fset this :NUMBER_ON_SAME_TEAM_SEQUENCE (JR/afrom "Object" 1 [(JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_ZERO) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_ONE) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_THREE) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_FOUR) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_FIVE) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_SIX) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_SEVEN) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_EIGHT) (JR/fget this :NUMBER_ON_SAME_TEAM_SEQUENCE_NINE)])))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NumberInSameGroupSequence)] (jinit_0 o) o))



