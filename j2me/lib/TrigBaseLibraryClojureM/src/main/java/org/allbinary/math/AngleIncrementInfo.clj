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
;; package org.allbinary.math

(ns AngleIncrementInfo)

(JR/register 'AngleIncrementInfo nil '[])

(def jsv_INCREMENT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_INCREMENT [] (JR/ensure-init jclinit-state jclinit) @jsv_INCREMENT)
(defn jstatic_set_INCREMENT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INCREMENT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_INCREMENT "Inc: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :angleIncrement 0)
  (JR/fset this :DOWN_FRAME nil)
  (JR/fset this :UP_FRAME nil)
  (JR/fset this :LEFT_FRAME nil)
  (JR/fset this :RIGHT_FRAME nil)
  (JR/fset this :frameUtil nil)
    (JR/fset this :frameUtil (JR/scall 'FrameUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_angleIncrement]
  (let [ l_angleIncrement (volatile! p_angleIncrement) l_angleFactory (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil)]
    nil (jinitfields this)
        (JR/fset this :angleIncrement @l_angleIncrement)
        (vreset! l_angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (JR/fset this :DOWN_FRAME (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (JR/idiv (JR/invoke (JR/fget @l_angleFactory :DOWN) :jm_getValue_0) (JR/fget this :angleIncrement))))
        (JR/fset this :UP_FRAME (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (JR/invoke (JR/fget @l_angleFactory :UP) :jm_getValue_0)))
        (JR/fset this :LEFT_FRAME (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (JR/idiv (JR/invoke (JR/fget @l_angleFactory :LEFT) :jm_getValue_0) (JR/fget this :angleIncrement))))
        (JR/fset this :RIGHT_FRAME (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (JR/idiv (JR/invoke (JR/fget @l_angleFactory :RIGHT) :jm_getValue_0) (JR/fget this :angleIncrement)))))
  this)

(defn jnew_1 [p_angleIncrement ]
  (let [o (JR/alloc 'AngleIncrementInfo)] (jinit_1 o p_angleIncrement) o))

    
(defn jm_getFrameAngle_1 [this p_frame]
  (let [ l_frame (volatile! p_frame)]
        (JR/invoke (JR/fget this :frameUtil) :jm_getFrameAngle_2 @l_frame (JR/fget this :angleIncrement))))

    
(defn jm_getAngleIncrement_0 [this]
  (let []
        (JR/fget this :angleIncrement)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (AngleIncrementInfo/jstatic_INCREMENT)) :jm_appendshort_1 (JR/fget this :angleIncrement)))))

    
(defn jm_getClosestGeneralDirection_1 [this p_angle]
  (let [ l_angle (volatile! p_angle) l_closestDirection (volatile! nil)]
        (vreset! l_closestDirection (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 360))
        (if (< (- (JR/invoke (JR/fget this :UP_FRAME) :jm_intValue_0) @l_angle) (- (JR/invoke @l_closestDirection :jm_intValue_0) @l_angle))
            (do
            (vreset! l_closestDirection (JR/fget this :UP_FRAME))))
        (if (< (- (JR/invoke (JR/fget this :DOWN_FRAME) :jm_intValue_0) @l_angle) (- (JR/invoke @l_closestDirection :jm_intValue_0) @l_angle))
            (do
            (vreset! l_closestDirection (JR/fget this :DOWN_FRAME))))
        (if (< (- (JR/invoke (JR/fget this :LEFT_FRAME) :jm_intValue_0) @l_angle) (- (JR/invoke @l_closestDirection :jm_intValue_0) @l_angle))
            (do
            (vreset! l_closestDirection (JR/fget this :LEFT_FRAME))))
        (if (< (- (JR/invoke (JR/fget this :RIGHT_FRAME) :jm_intValue_0) @l_angle) (- (JR/invoke @l_closestDirection :jm_intValue_0) @l_angle))
            (do
            (vreset! l_closestDirection (JR/fget this :RIGHT_FRAME))))
        (JR/invoke @l_closestDirection :jm_intValue_0)))



