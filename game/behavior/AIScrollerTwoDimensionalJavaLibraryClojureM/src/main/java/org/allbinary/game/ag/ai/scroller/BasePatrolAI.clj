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

(ns BasePatrolAI)

(JR/register 'BasePatrolAI 'BasicAI '[])

(def jsv_MAX_DISTANCE (atom nil))
(def jsv_DIRECTION_ARRAY (atom nil))
(def jsv_FIRING_DISTANCE (atom nil))
(def jsv_SPEED (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_MAX_DISTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_MAX_DISTANCE)
(defn jstatic_set_MAX_DISTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_MAX_DISTANCE v))
(defn jstatic_DIRECTION_ARRAY [] (JR/ensure-init jclinit-state jclinit) @jsv_DIRECTION_ARRAY)
(defn jstatic_set_DIRECTION_ARRAY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DIRECTION_ARRAY v))
(defn jstatic_FIRING_DISTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_FIRING_DISTANCE)
(defn jstatic_set_FIRING_DISTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_FIRING_DISTANCE v))
(defn jstatic_SPEED [] (JR/ensure-init jclinit-state jclinit) @jsv_SPEED)
(defn jstatic_set_SPEED [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SPEED v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_MAX_DISTANCE (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 2))
    (reset! jsv_DIRECTION_ARRAY (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 3))
    (reset! jsv_FIRING_DISTANCE (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 4))
    (reset! jsv_SPEED (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 5))
    nil))

(defn jinitfields [this]
  (JR/fset this :maxDistance nil)
  (JR/fset this :currentDistance 0)
  (JR/fset this :xTotalDistance 0)
  (JR/fset this :lastKeyDirection 0)
  (JR/fset this :keyDirection 0)
    (JR/fset this :lastKeyDirection (JR/sget 'Canvas "RIGHT"))
    (JR/fset this :keyDirection (JR/sget 'Canvas "RIGHT"))
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :maxDistance (JR/invoke @l_hashtable :jm_get_1 (BasePatrolAI/jstatic_MAX_DISTANCE)))
        (JR/fset this :currentDistance (JR/invoke (JR/fget this :maxDistance) :jm_intValue_0)))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'BasePatrolAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke this :jm_updateTotalDistance_0)
        (JR/invoke this :jm_changeDirectionIfReachedPacingAreaMax_0)))

    
(defn jm_updateTotalDistance_0 [this]
  (let [ l_velocityInterfaceCompositeInterface (volatile! nil) l_velocityProperties (volatile! nil)]
        (vreset! l_velocityInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_velocityProperties (JR/invoke @l_velocityInterfaceCompositeInterface :jm_getVelocityProperties_0))
        (JR/fset this :xTotalDistance (unchecked-int (unchecked-add (JR/fget this :xTotalDistance) (JR/invoke (JR/invoke @l_velocityProperties :jm_getVelocityXBasicDecimalP_0) :jm_getScaled_0))))))

    
(defn jm_changeDirectionIfReachedPacingAreaMax_0 [this]
  (let [ l_mathUtil (volatile! nil) l_totalDistance (volatile! nil)]
        (vreset! l_mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
        (vreset! l_totalDistance (JR/invoke @l_mathUtil :jm_abs_1 (JR/fget this :xTotalDistance)))
        (if (> @l_totalDistance (JR/fget this :currentDistance))
            (do
            (JR/invoke this :jm_nextDirection_0)))))

    
(defn jm_nextDirection_0 [this]
  (let []
        (if (JR/eq (JR/fget this :lastKeyDirection) (JR/sget 'Canvas "LEFT"))
            (do
            (JR/fset this :keyDirection (JR/sget 'Canvas "RIGHT"))
            (JR/fset this :lastKeyDirection (JR/fget this :keyDirection))
            (JR/fset this :xTotalDistance 0))
            (if (JR/eq (JR/fget this :lastKeyDirection) (JR/sget 'Canvas "RIGHT"))
            (do
            (JR/fset this :keyDirection (JR/sget 'Canvas "LEFT"))
            (JR/fset this :lastKeyDirection (JR/fget this :keyDirection))
            (JR/fset this :xTotalDistance 0))))))

    
(defn jm_disable_0 [this]
  (let []
        nil))



