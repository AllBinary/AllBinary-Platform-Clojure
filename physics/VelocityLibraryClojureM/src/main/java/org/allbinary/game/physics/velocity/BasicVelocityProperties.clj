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
;; package org.allbinary.game.physics.velocity

(ns BasicVelocityProperties)

(JR/register 'BasicVelocityProperties nil '[BasicVelocityInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :velocityXBasicDecimal nil)
  (JR/fset this :velocityYBasicDecimal nil)
  (JR/fset this :velocityZBasicDecimal nil)
  (JR/fset this :axisMathVectorUtil nil)
  (JR/fset this :directionUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :axisMathVectorUtil (JR/scall 'AxisMathVectorUtil :jm_getInstance_0))
    (JR/fset this :directionUtil (JR/scall 'DirectionUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :velocityXBasicDecimal (BasicDecimal/jnew_1 0))
        (JR/fset this :velocityYBasicDecimal (BasicDecimal/jnew_1 0))
        (JR/fset this :velocityZBasicDecimal (BasicDecimal/jnew_1 0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicVelocityProperties)] (jinit_0 o) o))

    
(defn jm_zero_0 [this]
  (let []
        (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_setint_1 0)
        (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_setint_1 0)
        (JR/invoke (JR/fget this :velocityZBasicDecimal) :jm_setint_1 0)))

    
(defn jm_getVelocityXBasicDecimalP_0 [this]
  (let []
        (JR/fget this :velocityXBasicDecimal)))

    
(defn jm_getVelocityYBasicDecimalP_0 [this]
  (let []
        (JR/fget this :velocityYBasicDecimal)))

    
(defn jm_getVelocityZBasicDecimalP_0 [this]
  (let []
        (JR/fget this :velocityZBasicDecimal)))

    
(defn jm_setVelocityWithBigDecimalAndDirection_3 [this p_magnitudeBasicDecimal p_direction p_otherDirection]
  (let [ l_magnitudeBasicDecimal (volatile! p_magnitudeBasicDecimal) l_direction (volatile! p_direction) l_otherDirection (volatile! p_otherDirection) l_angle (volatile! nil) l_otherAngle (volatile! nil)]
        (vreset! l_angle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_direction))
        (vreset! l_otherAngle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_otherDirection))
        (JR/invoke this :jm_setVelocityWithBigDecimal_3 @l_magnitudeBasicDecimal @l_angle @l_otherAngle)))

    
(defn jm_setVelocityWithDirection_3 [this p_magnitude p_direction p_otherDirection]
  (let [ l_magnitude (volatile! p_magnitude) l_direction (volatile! p_direction) l_otherDirection (volatile! p_otherDirection) l_angle (volatile! nil) l_otherAngle (volatile! nil)]
        (vreset! l_angle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_direction))
        (vreset! l_otherAngle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_otherDirection))
        (JR/invoke this :jm_setVelocity_3 @l_magnitude @l_angle @l_otherAngle)))

    
(defn jm_addVelocityWithBigDecimalAndDirection_3 [this p_magnitudeBasicDecimal p_direction p_otherDirection]
  (let [ l_magnitudeBasicDecimal (volatile! p_magnitudeBasicDecimal) l_direction (volatile! p_direction) l_otherDirection (volatile! p_otherDirection) l_angle (volatile! nil) l_otherAngle (volatile! nil)]
        (vreset! l_angle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_direction))
        (vreset! l_otherAngle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_otherDirection))
        (JR/invoke this :jm_addVelocityWithBigDecimal_3 @l_magnitudeBasicDecimal @l_angle @l_otherAngle)))

    
(defn jm_addVelocityWithDirection_3 [this p_magnitude p_direction p_otherDirection]
  (let [ l_magnitude (volatile! p_magnitude) l_direction (volatile! p_direction) l_otherDirection (volatile! p_otherDirection) l_angle (volatile! nil) l_otherAngle (volatile! nil)]
        (vreset! l_angle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_direction))
        (vreset! l_otherAngle (JR/invoke (JR/fget this :directionUtil) :jm_getAngle_1 @l_otherDirection))
        (JR/invoke this :jm_addVelocity_3 @l_magnitude @l_angle @l_otherAngle)))

    
(defn jm_setVelocityWithBigDecimal_3 [this p_magnitudeBasicDecimal p_angle p_otherAngle]
  (let [ l_magnitudeBasicDecimal (volatile! p_magnitudeBasicDecimal) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_magnitude (volatile! nil)]
        (vreset! l_magnitude (JR/invoke @l_magnitudeBasicDecimal :jm_getUnscaled_0))
        (JR/invoke this :jm_setVelocity_3 @l_magnitude @l_angle @l_otherAngle)))

    
(defn jm_addVelocityWithBigDecimal_3 [this p_magnitudeBasicDecimal p_angle p_otherAngle]
  (let [ l_magnitudeBasicDecimal (volatile! p_magnitudeBasicDecimal) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_magnitude (volatile! nil)]
        (vreset! l_magnitude (JR/invoke @l_magnitudeBasicDecimal :jm_getUnscaled_0))
        (JR/invoke this :jm_addVelocity_3 @l_magnitude @l_angle @l_otherAngle)))

    
(defn jm_setVelocity_3 [this p_magnitude p_angle p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        (JR/invoke this :jm_setVelocityi_3 @l_magnitude (JR/invoke @l_angle :jm_getValue_0) (JR/invoke @l_otherAngle :jm_getValue_0))))

    
(defn jm_addVelocity_3 [this p_magnitude p_angle p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        (JR/invoke this :jm_addVelocityi_3 @l_magnitude (JR/invoke @l_angle :jm_getValue_0) (JR/invoke @l_otherAngle :jm_getValue_0))))

    
(defn jm_setVelocityi_3 [this p_magnitude p_angle p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_xVector (volatile! nil) l_yVector (volatile! nil) l_zVector (volatile! nil)]
        (vreset! l_xVector (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateX_2 @l_magnitude @l_angle) (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_getScaledFactorValue_0)))
        (vreset! l_yVector (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateY_2 @l_magnitude @l_angle) (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_getScaledFactorValue_0)))
        (vreset! l_zVector (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateZ_2 @l_magnitude @l_otherAngle) (JR/invoke (JR/fget this :velocityZBasicDecimal) :jm_getScaledFactorValue_0)))
        (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_setlong_1 @l_xVector)
        (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_setlong_1 @l_yVector)
        (JR/invoke (JR/fget this :velocityZBasicDecimal) :jm_setlong_1 @l_zVector)))

    
(defn jm_addVelocityi_3 [this p_magnitude p_angle p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_xVector (volatile! nil) l_yVector (volatile! nil) l_zVector (volatile! nil)]
        (vreset! l_xVector (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateX_2 @l_magnitude @l_angle) (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_getScaledFactorValue_0)))
        (vreset! l_yVector (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateY_2 @l_magnitude @l_angle) (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_getScaledFactorValue_0)))
        (vreset! l_zVector (JR/ldiv (JR/invoke (JR/fget this :axisMathVectorUtil) :jm_calculateZ_2 @l_magnitude @l_otherAngle) (JR/invoke (JR/fget this :velocityZBasicDecimal) :jm_getScaledFactorValue_0)))
        (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_addlong_1 @l_xVector)
        (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_addlong_1 @l_yVector)
        (JR/invoke (JR/fget this :velocityZBasicDecimal) :jm_addlong_1 @l_zVector)))

    
(defn jm_toString_0 [this]
  (let [ l_commonSeps (volatile! nil) l_positionStrings (volatile! nil) l_stringBuffer (volatile! nil) l_stringUtil (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_positionStrings (JR/scall 'PositionStrings :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Velocity ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :X_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :velocityXBasicDecimal)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Y_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :velocityYBasicDecimal)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Z_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :velocityZBasicDecimal)))
        (JR/to-string-of @l_stringBuffer)))



