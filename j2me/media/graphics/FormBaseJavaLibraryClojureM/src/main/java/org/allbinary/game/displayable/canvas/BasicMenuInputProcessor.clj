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

(ns BasicMenuInputProcessor)

(JR/register 'BasicMenuInputProcessor 'PlayerGameInput '[BaseMotionGestureEventListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :motionGestureEventList nil)
  (JR/fset this :canvas nil)
    (JR/fset this :motionGestureEventList (BasicArrayListD/jnew_0))
    (JR/fset this :canvas (JR/sget 'NullCanvas "NULL_CANVAS"))
  this)

    
(defn jinit_3 [this p_gameKeyEventList p_playerInputId p_gameCanvas]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_playerInputId (volatile! p_playerInputId) l_gameCanvas (volatile! p_gameCanvas)]
        (PlayerGameInput/jinit_3 this @l_gameKeyEventList (BasicArrayListD/jnew_0) @l_playerInputId) (jinitfields this)
        (JR/fset this :canvas @l_gameCanvas))
  this)

(defn jnew_3 [p_gameKeyEventList p_playerInputId p_gameCanvas ]
  (let [o (JR/alloc 'BasicMenuInputProcessor)] (jinit_3 o p_gameKeyEventList p_playerInputId p_gameCanvas) o))

    
(defn jm_onMotionGestureEvent_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent)]
        (JR/invoke (JR/fget this :motionGestureEventList) :jm_add_1 @l_motionGestureEvent)))

    
(defn jm_onScrolledMotionGestureEvent_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent)]
        nil))

    
(defn jm_setCanvas_1 [this p_canvas]
  (let [ l_canvas (volatile! p_canvas)]
        (JR/fset this :canvas @l_canvas)))

    
(defn jm_getCanvas_0 [this]
  (let []
        (JR/fget this :canvas)))

    
(defn jm_processInputList_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))



