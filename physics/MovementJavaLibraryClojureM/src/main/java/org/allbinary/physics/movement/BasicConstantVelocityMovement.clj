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
;; package org.allbinary.physics.movement

(ns BasicConstantVelocityMovement)

(JR/register 'BasicConstantVelocityMovement 'Movement '[VelocityInterfaceCompositeInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :velocityProperties nil)
  (JR/fset this :speedBasicDecimal nil)
  (JR/fset this :axisMathVectorUtil nil)
    (JR/fset this :speedBasicDecimal (JR/sget 'BasicDecimal "ZERO_BIGDECIMAL"))
    (JR/fset this :axisMathVectorUtil (JR/scall 'AxisMathVectorUtil :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_basicDecimal p_velocityProperties]
  (let [ l_basicDecimal (volatile! p_basicDecimal) l_velocityProperties (volatile! p_velocityProperties)]
    (Movement/jinit_0 this) (jinitfields this)
        (JR/invoke this :jm_setSpeedBasicDecimal_1 @l_basicDecimal)
        (JR/fset this :velocityProperties @l_velocityProperties))
  this)

(defn jnew_2 [p_basicDecimal p_velocityProperties ]
  (let [o (JR/alloc 'BasicConstantVelocityMovement)] (jinit_2 o p_basicDecimal p_velocityProperties) o))

    
(defn jm_init_3 [this p_speedBasicDecimal p_angle p_otherAngle]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_angleFactory (volatile! nil)]
        (JR/fset this :speedBasicDecimal @l_speedBasicDecimal)
        (vreset! l_angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
        (JR/invoke (JR/fget this :velocityProperties) :jm_setVelocityWithBigDecimal_3 @l_speedBasicDecimal (JR/invoke @l_angleFactory :jm_getAt_1 @l_angle) (JR/invoke @l_angleFactory :jm_getAt_1 @l_otherAngle))))

    
(defn jm_moveOutsideRadius_4 [this p_layer p_radius p_angle p_otherAngle]
  (let [ l_layer (volatile! p_layer) l_radius (volatile! p_radius) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_scaleFactorValue (volatile! nil) l_xVector (volatile! nil) l_yVector (volatile! nil) l_zVector (volatile! nil)]
        (vreset! l_scaleFactorValue (JR/invoke (JR/fget this :speedBasicDecimal) :jm_getScaledFactorValue_0))
        (vreset! l_xVector (JR/i32 (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateX_2 @l_radius @l_angle) @l_scaleFactorValue)))
        (vreset! l_yVector (JR/i32 (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateY_2 @l_radius @l_angle) @l_scaleFactorValue)))
        (vreset! l_zVector (JR/i32 (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateZ_2 @l_radius @l_otherAngle) @l_scaleFactorValue)))
        (JR/invoke @l_layer :jm_moveDXYZ_3 @l_xVector @l_yVector @l_zVector)))

    
(defn jm_process_1 [this p_layer]
  (let [ l_layer (volatile! p_layer)]
        (JR/invoke @l_layer :jm_moveDXYZ_3 (JR/invoke (JR/invoke (JR/fget this :velocityProperties) :jm_getVelocityXBasicDecimalP_0) :jm_getScaled_0) (JR/invoke (JR/invoke (JR/fget this :velocityProperties) :jm_getVelocityYBasicDecimalP_0) :jm_getScaled_0) (JR/invoke (JR/invoke (JR/fget this :velocityProperties) :jm_getVelocityZBasicDecimalP_0) :jm_getScaled_0))))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/fget this :velocityProperties))))

    
(defn jm_stop_0 [this]
  (let []
        (JR/invoke (JR/fget this :velocityProperties) :jm_zero_0)))

    
(defn jm_getVelocityProperties_0 [this]
  (let []
        (JR/fget this :velocityProperties)))

    
(defn jm_setVelocityProperties_1 [this p_velocityProperties]
  (let [ l_velocityProperties (volatile! p_velocityProperties)]
        (JR/fset this :velocityProperties @l_velocityProperties)))

    
(defn jm_setSpeedBasicDecimal_1 [this p_speedBasicDecimal]
  (let [ l_speedBasicDecimal (volatile! p_speedBasicDecimal)]
        (JR/fset this :speedBasicDecimal @l_speedBasicDecimal)))

    
(defn jm_getSpeedBasicDecimal_0 [this]
  (let []
        (JR/fget this :speedBasicDecimal)))



