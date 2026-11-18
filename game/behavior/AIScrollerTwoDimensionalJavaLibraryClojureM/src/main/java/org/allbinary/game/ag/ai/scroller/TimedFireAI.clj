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
;; package org.allbinary.game.ag.ai.scroller

(ns TimedFireAI)

(JR/register 'TimedFireAI 'BasicAI '[])

(def jsv_TIME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_TIME [] (JR/ensure-init jclinit-state jclinit) @jsv_TIME)
(defn jstatic_set_TIME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TIME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_TIME (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 1))
    nil))

(defn jinitfields [this]
  (JR/fset this :maxFireDelayTimeHelper nil)
  (JR/fset this :delay 0)
    (JR/fset this :maxFireDelayTimeHelper (TimeDelayHelper/jnew_1 0))
  this)

    
(defn jinit_3 [this p_delay p_ownerLayerInterface p_gameInput]
  (let [ l_delay (volatile! p_delay) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :delay @l_delay))
  this)

(defn jnew_3 [p_delay p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'TimedFireAI)] (jinit_3 o p_delay p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_timeFiredInterface (volatile! nil)]
        (vreset! l_timeFiredInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (if (and (JR/invoke (JR/fget this :maxFireDelayTimeHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime)) (< (unchecked-add (JR/invoke @l_timeFiredInterface :jm_getLastFireTime_0) (JR/fget (JR/fget this :maxFireDelayTimeHelper) :delay)) (JR/invoke (JR/fget this :maxFireDelayTimeHelper) :jm_getStartTime_0)))
            (do
            (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1"))
            (JR/fset (JR/fget this :maxFireDelayTimeHelper) :delay (JR/fget this :delay))))))



