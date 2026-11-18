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

(ns AngleInfo)

(JR/register 'AngleInfo nil '[])

(def jsv_ANGLE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_ANGLE [] (JR/ensure-init jclinit-state jclinit) @jsv_ANGLE)
(defn jstatic_set_ANGLE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ANGLE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_ANGLE "Angle: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :angleIncrementInfo nil)
  (JR/fset this :angle 0)
  (JR/fset this :frameUtil nil)
    (JR/fset this :angle 0)
    (JR/fset this :frameUtil (JR/scall 'FrameUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_1 [p_angleIncrement]
  (let [this nil l_angleIncrement (volatile! p_angleIncrement)]
        (AngleInfo/jnew_1 (JR/invoke (JR/scall 'AngleIncrementInfoFactory :jm_getInstance_0) :jm_getAt_1 @l_angleIncrement))))

    
(defn jinit_1 [this p_angleIncrementInfo]
  (let [ l_angleIncrementInfo (volatile! p_angleIncrementInfo)]
    nil (jinitfields this)
        (JR/fset this :angleIncrementInfo @l_angleIncrementInfo))
  this)

(defn jnew_1 [p_angleIncrementInfo ]
  (let [o (JR/alloc 'AngleInfo)] (jinit_1 o p_angleIncrementInfo) o))

    
(defn jm_adjustAngle_1 [this p_frame]
  (let [ l_frame (volatile! p_frame) l_newAngle (volatile! nil)]
        (vreset! l_newAngle (unchecked-int (unchecked-subtract (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :angleIncrementInfo) :jm_getAngleIncrement_0) @l_frame)) 90)))
        (JR/invoke this :jm_setAngle_1 (JR/i16 (JR/invoke (JR/fget this :frameUtil) :jm_adjustAngleToFrameAngle_1 @l_newAngle)))))

    
(defn jm_getAngle_0 [this]
  (let []
        (JR/fget this :angle)))

    
(defn jm_setAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/fset this :angle @l_angle)))

    
(defn jm_getAngleIncrementInfo_0 [this]
  (let []
        (JR/fget this :angleIncrementInfo)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (AngleInfo/jstatic_ANGLE))
        (JR/invoke @l_stringBuffer :jm_appendshort_1 (JR/fget this :angle))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke this :jm_getAngleIncrementInfo_0)))
        (JR/to-string-of @l_stringBuffer)))



