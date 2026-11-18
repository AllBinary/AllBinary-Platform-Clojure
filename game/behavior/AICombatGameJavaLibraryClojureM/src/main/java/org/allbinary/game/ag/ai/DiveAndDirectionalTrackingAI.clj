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

(ns DiveAndDirectionalTrackingAI)

(JR/register 'DiveAndDirectionalTrackingAI 'BasicAI '[TrackingEventListenerInterface DestroyedEventListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :mathUtil nil)
  (JR/fset this :directionFactory nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :list nil)
  (JR/fset this :directionalInterface nil)
  (JR/fset this :velocityInterface nil)
  (JR/fset this :directionToKeyMap nil)
  (JR/fset this :initialDropped false)
  (JR/fset this :diveP false)
  (JR/fset this :directionOfTarget nil)
  (JR/fset this :MIN_DISTANCE 0)
  (JR/fset this :lastTrackingLayerInterface nil)
  (JR/fset this :artificialIntelligenceInterface nil)
  (JR/fset this :aiVistor nil)
  (JR/fset this :lastDirection nil)
    (JR/fset this :mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
    (JR/fset this :directionFactory (JR/scall 'DirectionFactory :jm_getInstance_0))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 500))
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :directionToKeyMap (JR/afrom "INT" 1 [(JR/sget 'Canvas "LEFT") (JR/sget 'Canvas "DOWN") (JR/sget 'Canvas "UP") (JR/sget 'Canvas "RIGHT")]))
    (JR/fset this :directionOfTarget (JR/scall 'Direction :jm_getInstance_1 0))
    (JR/fset this :MIN_DISTANCE 40)
    (JR/fset this :lastTrackingLayerInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
    (JR/fset this :lastDirection (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :NO_DIRECTION))
  this)

    
(defn jinit_4 [this p_ownerLayerInterface p_artificialIntelligenceInterface p_gameInput p_visitor]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_artificialIntelligenceInterface (volatile! p_artificialIntelligenceInterface) l_gameInput (volatile! p_gameInput) l_visitor (volatile! p_visitor) l_directionalCompositeInterface (volatile! nil) l_velocityInterfaceCompositeInterface (volatile! nil)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :aiVistor @l_visitor)
        (JR/fset this :artificialIntelligenceInterface @l_artificialIntelligenceInterface)
        (vreset! l_directionalCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/fset this :directionalInterface (JR/invoke @l_directionalCompositeInterface :jm_getDirectionalInterface_0))
        (vreset! l_velocityInterfaceCompositeInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (JR/fset this :velocityInterface (JR/invoke @l_velocityInterfaceCompositeInterface :jm_getVelocityProperties_0))
        (JR/invoke (JR/scall 'DestroyedEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this)
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_4 [p_ownerLayerInterface p_artificialIntelligenceInterface p_gameInput p_visitor ]
  (let [o (JR/alloc 'DiveAndDirectionalTrackingAI)] (jinit_4 o p_ownerLayerInterface p_artificialIntelligenceInterface p_gameInput p_visitor) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (if (JR/invoke this :jm_isBeyondTarget_0)
            (do
            (JR/invoke this :jm_init_0)
            (JR/invoke (JR/fget this :velocityInterface) :jm_zero_0)))
        (if (not (JR/fget this :diveP))
            (do
            (JR/invoke this :jm_target_1 @l_allBinaryLayerManager))
            (do
            (JR/invoke this :jm_dive_0)
            (JR/invoke this :jm_attack_0)))
        (JR/invoke (JR/fget this :list) :jm_clear_0)))

    
(defn jm_init_0 [this]
  (let []
        (JR/fset this :diveP false)
        (JR/fset this :directionOfTarget (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :NOT_BORDERED_WITH))
        (JR/invoke (JR/scall 'TrackingEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this)))

    
(defn jm_target_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_lastTrackingEvent (volatile! nil) l_layerInterface (volatile! nil) l_ownerLayerInterface (volatile! nil) l_groupArray (volatile! nil) l_ownerGroupArray (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_yDistance (volatile! nil) l_xDistance (volatile! nil) l_directionFactory (volatile! nil)](JR/method
        (if (== (JR/invoke (JR/fget this :list) :jm_size_0) 0)
            (do
            (JR/jreturn)))
        (vreset! l_lastTrackingEvent (JR/invoke (JR/fget this :list) :jm_removeAt_1 0))
        (JR/fset this :lastTrackingLayerInterface (JR/invoke @l_lastTrackingEvent :jm_getLayerInterface_0))
        (vreset! l_layerInterface (JR/fget this :lastTrackingLayerInterface))
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_groupArray (JR/invoke @l_layerInterface :jm_getGroupInterface_0))
        (vreset! l_ownerGroupArray (JR/invoke @l_ownerLayerInterface :jm_getGroupInterface_0))
        (if (JR/eq @l_groupArray @l_ownerGroupArray)
            (do
            (JR/jreturn)))
        (vreset! l_x (JR/invoke (JR/fget this :lastTrackingLayerInterface) :jm_getXP_0))
        (vreset! l_y (JR/invoke (JR/fget this :lastTrackingLayerInterface) :jm_getYP_0))
        (vreset! l_yDistance (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/invoke @l_ownerLayerInterface :jm_getYP_0) @l_y)) (JR/invoke @l_ownerLayerInterface :jm_getHeight_0))))
        (vreset! l_xDistance (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/invoke @l_ownerLayerInterface :jm_getXP_0) @l_x)) (JR/invoke @l_ownerLayerInterface :jm_getWidth_0))))
        (vreset! l_directionFactory (JR/scall 'DirectionFactory :jm_getInstance_0))
        (if (> (JR/invoke (JR/fget this :mathUtil) :jm_abs_1 @l_yDistance) (JR/invoke (JR/fget this :mathUtil) :jm_abs_1 @l_xDistance))
            (do
            (if (> @l_yDistance (JR/fget this :MIN_DISTANCE))
                (do
                (JR/fset this :directionOfTarget (JR/fget @l_directionFactory :UP)))
                (if (< @l_yDistance (unchecked-int (unchecked-negate (JR/c2i (JR/fget this :MIN_DISTANCE)))))
                (do
                (JR/fset this :directionOfTarget (JR/fget @l_directionFactory :DOWN))))))
            (do
            (if (> @l_xDistance (JR/fget this :MIN_DISTANCE))
                (do
                (JR/fset this :directionOfTarget (JR/fget @l_directionFactory :LEFT)))
                (if (< @l_xDistance (unchecked-int (unchecked-negate (JR/c2i (JR/fget this :MIN_DISTANCE)))))
                (do
                (JR/fset this :directionOfTarget (JR/fget @l_directionFactory :RIGHT)))))))
        (if (and (not (JR/fget this :initialDropped)) (not (JR/eq (JR/fget this :directionOfTarget) (JR/fget @l_directionFactory :NOT_BORDERED_WITH))))
            (do
            (JR/invoke this :jm_drop_0)))
        (if (JR/fget this :initialDropped)
            (do
            (if (or (JR/eq (JR/fget this :directionOfTarget) (JR/fget @l_directionFactory :UP)) (JR/eq (JR/fget this :directionOfTarget) (JR/fget @l_directionFactory :DOWN)))
                (do
                (JR/invoke this :jm_verticalTargeting_1 @l_x))
                (if (or (JR/eq (JR/fget this :directionOfTarget) (JR/fget @l_directionFactory :LEFT)) (JR/eq (JR/fget this :directionOfTarget) (JR/fget @l_directionFactory :RIGHT)))
                (do
                (JR/invoke this :jm_horizontalTargeting_1 @l_y))
                (do
                (JR/invoke (JR/fget this :artificialIntelligenceInterface) :jm_processAI_1 @l_allBinaryLayerManager)))))))))

    
(defn jm_verticalTargeting_1 [this p_x]
  (let [ l_x (volatile! p_x) l_ownerLayerInterface (volatile! nil)]
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (if (< (JR/invoke @l_ownerLayerInterface :jm_getXP_0) @l_x)
            (do
            (JR/invoke this :jm_moveRight_0)))
        (if (> (JR/invoke @l_ownerLayerInterface :jm_getXP_0) @l_x)
            (do
            (JR/invoke this :jm_moveLeft_0)))
        (if (and (> (JR/invoke @l_ownerLayerInterface :jm_getXP_0) (unchecked-int (unchecked-subtract @l_x 3))) (< (JR/invoke @l_ownerLayerInterface :jm_getXP_0) (unchecked-int (unchecked-add @l_x 3))))
            (do
            (JR/invoke this :jm_setDive_0)))))

    
(defn jm_horizontalTargeting_1 [this p_y]
  (let [ l_y (volatile! p_y) l_ownerLayerInterface (volatile! nil)]
        (vreset! l_ownerLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (if (< (JR/invoke @l_ownerLayerInterface :jm_getYP_0) @l_y)
            (do
            (JR/invoke this :jm_moveDown_0)))
        (if (> (JR/invoke @l_ownerLayerInterface :jm_getYP_0) @l_y)
            (do
            (JR/invoke this :jm_moveUp_0)))
        (if (and (> (JR/invoke @l_ownerLayerInterface :jm_getYP_0) (unchecked-int (unchecked-subtract @l_y 3))) (< (JR/invoke @l_ownerLayerInterface :jm_getYP_0) (unchecked-int (unchecked-add @l_y 3))))
            (do
            (JR/invoke this :jm_setDive_0)))))

    
(defn jm_setDive_0 [this]
  (let []
        (JR/fset this :diveP true)
        (JR/invoke (JR/fget this :velocityInterface) :jm_zero_0)
        (JR/invoke (JR/scall 'TrackingEventHandler :jm_getInstance_0) :jm_removeListener_1 this)))

    
(defn jm_moveRight_0 [this]
  (let []
        (JR/invoke this :jm_setLastDirection_1 (JR/fget (JR/fget this :directionFactory) :RIGHT))
        (JR/invoke (JR/fget this :directionalInterface) :jm_setFrameByDirection_1 (JR/fget this :lastDirection))
        (JR/invoke (JR/fget this :aiVistor) :jm_visit_1 this)))

    
(defn jm_moveLeft_0 [this]
  (let []
        (JR/invoke this :jm_setLastDirection_1 (JR/fget (JR/fget this :directionFactory) :LEFT))
        (JR/invoke (JR/fget this :directionalInterface) :jm_setFrameByDirection_1 (JR/fget this :lastDirection))
        (JR/invoke (JR/fget this :aiVistor) :jm_visit_1 this)))

    
(defn jm_moveDown_0 [this]
  (let []
        (JR/invoke this :jm_setLastDirection_1 (JR/fget (JR/fget this :directionFactory) :DOWN))
        (JR/invoke (JR/fget this :directionalInterface) :jm_setFrameByDirection_1 (JR/fget this :lastDirection))
        (JR/invoke (JR/fget this :aiVistor) :jm_visit_1 this)))

    
(defn jm_moveUp_0 [this]
  (let []
        (JR/invoke this :jm_setLastDirection_1 (JR/fget (JR/fget this :directionFactory) :UP))
        (JR/invoke (JR/fget this :directionalInterface) :jm_setFrameByDirection_1 (JR/fget this :lastDirection))
        (JR/invoke (JR/fget this :aiVistor) :jm_visit_1 this)))

    
(defn jm_dive_0 [this]
  (let []
        (JR/invoke (JR/fget this :directionalInterface) :jm_setFrameByDirection_1 (JR/fget this :directionOfTarget))
        (JR/invoke (JR/fget this :aiVistor) :jm_visit_1 this)))

    
(defn jm_attack_0 [this]
  (let []
        (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/sget 'Canvas "KEY_NUM1"))))

    
(defn jm_drop_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
            (do
            (JR/fset this :initialDropped true)
            (JR/invoke (JR/fget this :aiVistor) :jm_visit_1 this)))))

    
(defn jm_isBeyondTarget_0 [this]
  (let []
        (if (JR/eq (JR/fget this :directionOfTarget) (JR/fget (JR/fget this :directionFactory) :DOWN))
            (do
            (if (> (JR/invoke (JR/invoke this :jm_getOwnerLayerInterface_0) :jm_getYP_0) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :lastTrackingLayerInterface) :jm_getYP_0) (JR/fget this :MIN_DISTANCE))))
                (do
                true)
                (do
                false)))
            (if (JR/eq (JR/fget this :directionOfTarget) (JR/fget (JR/fget this :directionFactory) :UP))
            (do
            (if (< (JR/invoke (JR/invoke this :jm_getOwnerLayerInterface_0) :jm_getYP_0) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :lastTrackingLayerInterface) :jm_getYP_0) (JR/fget this :MIN_DISTANCE))))
                (do
                true)
                (do
                false)))
            (if (JR/eq (JR/fget this :directionOfTarget) (JR/fget (JR/fget this :directionFactory) :RIGHT))
            (do
            (if (> (JR/invoke (JR/invoke this :jm_getOwnerLayerInterface_0) :jm_getXP_0) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :lastTrackingLayerInterface) :jm_getXP_0) (JR/fget this :MIN_DISTANCE))))
                (do
                true)
                (do
                false)))
            (if (JR/eq (JR/fget this :directionOfTarget) (JR/fget (JR/fget this :directionFactory) :LEFT))
            (do
            (if (< (JR/invoke (JR/invoke this :jm_getOwnerLayerInterface_0) :jm_getXP_0) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :lastTrackingLayerInterface) :jm_getXP_0) (JR/fget this :MIN_DISTANCE))))
                (do
                true)
                (do
                false)))
            (do
            false)))))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onMovement_1 [this p_trackingEvent]
  (let [ l_trackingEvent (volatile! p_trackingEvent)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_trackingEvent)))

    
(defn jm_onDestroyed_1 [this p_destroyedEvent]
  (let [ l_destroyedEvent (volatile! p_destroyedEvent)]
        (if (JR/eq (JR/invoke this :jm_getOwnerLayerInterface_0) (JR/invoke @l_destroyedEvent :jm_getLayerInterface_0))
            (do
            (JR/invoke (JR/scall 'TrackingEventHandler :jm_getInstance_0) :jm_removeListener_1 this)
            (JR/invoke (JR/scall 'DestroyedEventHandler :jm_getInstance_0) :jm_removeListener_1 this)))))

    
(defn jm_setLastDirection_1 [this p_lastDirection]
  (let [ l_lastDirection (volatile! p_lastDirection) l_value (volatile! nil)]
        (JR/fset this :lastDirection @l_lastDirection)
        (vreset! l_value (JR/invoke (JR/invoke this :jm_getLastDirection_0) :jm_getValue_0))
        (if (< @l_value 4)
            (do
            (JR/invoke-super 'BasicAI this :jm_setLastKey_1 (JR/aget* (JR/fget this :directionToKeyMap) @l_value))))))

    
(defn jm_setLastKey_1 [this p_lastKey]
  (let [ l_lastKey (volatile! p_lastKey)]
        (JR/invoke-super 'BasicAI this :jm_setLastKey_1 @l_lastKey)
        (if (JR/eq (JR/invoke this :jm_getLastKey_0) (JR/sget 'Canvas "LEFT"))
            (do
            (JR/fset this :lastDirection (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :LEFT)))
            (if (JR/eq (JR/invoke this :jm_getLastKey_0) (JR/sget 'Canvas "DOWN"))
            (do
            (JR/fset this :lastDirection (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :DOWN)))
            (if (JR/eq (JR/invoke this :jm_getLastKey_0) (JR/sget 'Canvas "UP"))
            (do
            (JR/fset this :lastDirection (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :UP)))
            (if (JR/eq (JR/invoke this :jm_getLastKey_0) (JR/sget 'Canvas "RIGHT"))
            (do
            (JR/fset this :lastDirection (JR/fget (JR/scall 'DirectionFactory :jm_getInstance_0) :RIGHT)))))))))

    
(defn jm_getLastDirection_0 [this]
  (let []
        (JR/fget this :lastDirection)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of this))
        (JR/invoke @l_stringBuffer :jm_append_1 " LastDirection: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke this :jm_getLastDirection_0)))
        (JR/to-string-of @l_stringBuffer)))



