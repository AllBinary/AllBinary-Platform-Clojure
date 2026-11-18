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

(ns FrameUtil)

(JR/register 'FrameUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (FrameUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FrameUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FrameUtil)] (jinit_0 o) o))

    
(defn jm_getFrameForAngle_2 [this p_angle p_angleIncrement]
  (let [ l_angle (volatile! p_angle) l_angleIncrement (volatile! p_angleIncrement)]
        (JR/idiv (JR/invoke this :jm_adjustAngleToFrameAngle_1 @l_angle) @l_angleIncrement)))

    
(defn jm_getFrameAngle_2 [this p_frame p_angleIncrement]
  (let [ l_frame (volatile! p_frame) l_angleIncrement (volatile! p_angleIncrement) l_frameAngle (volatile! nil)]
        (vreset! l_frameAngle (unchecked-int (unchecked-subtract (unchecked-int (unchecked-multiply @l_angleIncrement @l_frame)) 90)))
        (JR/invoke this :jm_adjustAngleToFrameAngle_1 @l_frameAngle)))

    
(defn jm_adjustAngleToFrameAngle_1 [this p_currentAngle]
  (let [ l_currentAngle (volatile! p_currentAngle) l_angleFactory (volatile! nil)]
        (vreset! l_angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
        (if (> @l_currentAngle 359)
            (do
            (vreset! l_currentAngle (unchecked-int (unchecked-subtract @l_currentAngle (JR/fget @l_angleFactory :TOTAL_ANGLE))))
            (JR/jwhile false false (> @l_currentAngle 359)
                (vreset! l_currentAngle (unchecked-int (unchecked-subtract @l_currentAngle (JR/fget @l_angleFactory :TOTAL_ANGLE)))))))
        (if (< @l_currentAngle 0)
            (do
            (vreset! l_currentAngle (unchecked-int (unchecked-add @l_currentAngle (JR/fget @l_angleFactory :TOTAL_ANGLE))))
            (JR/jwhile false false (< @l_currentAngle 0)
                (vreset! l_currentAngle (unchecked-int (unchecked-add @l_currentAngle (JR/fget @l_angleFactory :TOTAL_ANGLE)))))))
        @l_currentAngle))



