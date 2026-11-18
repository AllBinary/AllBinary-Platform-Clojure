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

(ns VelocityProperties)

(JR/register 'VelocityProperties 'BasicVelocityProperties '[VelocityInterface])

(def jsv_NULL_VELOCITY_PROPERTIES (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_VELOCITY_PROPERTIES [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_VELOCITY_PROPERTIES)
(defn jstatic_set_NULL_VELOCITY_PROPERTIES [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_VELOCITY_PROPERTIES v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_VELOCITY_PROPERTIES (VelocityProperties/jnew_2 0 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :maxForwardVelocity 0)
  (JR/fset this :maxReverseVelocity 0)
  this)

    
(defn jinit_2 [this p_maxForwardVelocity p_maxReverseVelocity]
  (let [ l_maxForwardVelocity (volatile! p_maxForwardVelocity) l_maxReverseVelocity (volatile! p_maxReverseVelocity)]
    (BasicVelocityProperties/jinit_0 this) (jinitfields this)
        (JR/invoke this :jm_setMaxForwardVelocity_1 @l_maxForwardVelocity)
        (JR/invoke this :jm_setMaxReverseVelocity_1 @l_maxReverseVelocity))
  this)

(defn jnew_2 [p_maxForwardVelocity p_maxReverseVelocity ]
  (let [o (JR/alloc 'VelocityProperties)] (jinit_2 o p_maxForwardVelocity p_maxReverseVelocity) o))

    
(defn jm_getMaxForwardVelocity_0 [this]
  (let []
        (JR/fget this :maxForwardVelocity)))

    
(defn jm_setMaxForwardVelocity_1 [this p_maxForwardVelocity]
  (let [ l_maxForwardVelocity (volatile! p_maxForwardVelocity)]
        (JR/fset this :maxForwardVelocity @l_maxForwardVelocity)))

    
(defn jm_getMaxReverseVelocity_0 [this]
  (let []
        (JR/fget this :maxReverseVelocity)))

    
(defn jm_setMaxReverseVelocity_1 [this p_maxReverseVelocity]
  (let [ l_maxReverseVelocity (volatile! p_maxReverseVelocity)]
        (JR/fset this :maxReverseVelocity @l_maxReverseVelocity)))

    
(defn jm_limitMaxXYForwardVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxXYVelocity_1 (JR/invoke this :jm_getMaxForwardVelocity_0))))

    
(defn jm_limitMaxXYReverseVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxXYVelocity_1 (JR/invoke this :jm_getMaxReverseVelocity_0))))

    
(defn jm_limitMaxYForwardVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxYVelocity_1 (JR/invoke this :jm_getMaxForwardVelocity_0))))

    
(defn jm_limitMaxYReverseVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxYVelocity_1 (JR/invoke this :jm_getMaxReverseVelocity_0))))

    
(defn jm_limitMaxXForwardVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxXVelocity_1 (JR/invoke this :jm_getMaxForwardVelocity_0))))

    
(defn jm_limitMaxXReverseVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxXVelocity_1 (JR/invoke this :jm_getMaxReverseVelocity_0))))

    
(defn jm_isOverXYMaxForwardVelocity_0 [this]
  (let []
        (JR/invoke this :jm_isOverXYMaxVelocity_1 (JR/invoke this :jm_getMaxForwardVelocity_0))))

    
(defn jm_isOverXYMaxReverseVelocity_0 [this]
  (let []
        (JR/invoke this :jm_isOverXYMaxVelocity_1 (JR/invoke this :jm_getMaxReverseVelocity_0))))

    
(defn jm_limitXYToForwardAndReverseMaxVelocity_0 [this]
  (let []
        (JR/invoke this :jm_limitMaxXYForwardVelocity_0)
        (JR/invoke this :jm_limitMaxXYReverseVelocity_0)))

    
(defn jm_limitMaxXYVelocity_1 [this p_maxVelocity]
  (let [ l_maxVelocity (volatile! p_maxVelocity)]
        (JR/invoke this :jm_limitMaxXVelocity_1 @l_maxVelocity)
        (JR/invoke this :jm_limitMaxYVelocity_1 @l_maxVelocity)))

    
(defn jm_limitMaxPositiveYVelocity_1 [this p_maxVelocity]
  (let [ l_maxVelocity (volatile! p_maxVelocity)]
        (if (> (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_getUnscaled_0) @l_maxVelocity)
            (do
            (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_setint_1 @l_maxVelocity)))))

    
(defn jm_limitMaxNegativeYVelocity_1 [this p_maxVelocity]
  (let [ l_maxVelocity (volatile! p_maxVelocity)]
        (if (< (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_getUnscaled_0) (unchecked-int (unchecked-negate (JR/c2i @l_maxVelocity))))
            (do
            (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_setint_1 (unchecked-int (unchecked-negate (JR/c2i @l_maxVelocity))))))))

    
(defn jm_limitMaxYVelocity_1 [this p_maxVelocity]
  (let [ l_maxVelocity (volatile! p_maxVelocity)]
        (JR/invoke this :jm_limitMaxPositiveYVelocity_1 @l_maxVelocity)
        (JR/invoke this :jm_limitMaxNegativeYVelocity_1 @l_maxVelocity)))

    
(defn jm_limitMaxXVelocity_1 [this p_maxVelocity]
  (let [ l_maxVelocity (volatile! p_maxVelocity)]
        (if (> (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_getUnscaled_0) @l_maxVelocity)
            (do
            (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_setint_1 @l_maxVelocity)))
        (if (< (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_getUnscaled_0) (unchecked-int (unchecked-negate (JR/c2i @l_maxVelocity))))
            (do
            (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_setint_1 (unchecked-int (unchecked-negate (JR/c2i @l_maxVelocity))))))))

    
(defn jm_isOverXYMaxVelocity_1 [this p_maxVelocity]
  (let [ l_maxVelocity (volatile! p_maxVelocity)](JR/method
        (if (> (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_getUnscaled_0) @l_maxVelocity)
            (do
            (JR/jreturn true)))
        (if (< (JR/invoke (JR/fget this :velocityXBasicDecimal) :jm_getUnscaled_0) (unchecked-int (unchecked-negate (JR/c2i @l_maxVelocity))))
            (do
            (JR/jreturn true)))
        (if (> (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_getUnscaled_0) @l_maxVelocity)
            (do
            (JR/jreturn true)))
        (if (< (JR/invoke (JR/fget this :velocityYBasicDecimal) :jm_getUnscaled_0) (unchecked-int (unchecked-negate (JR/c2i @l_maxVelocity))))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_setVelocityi_3 [this p_magnitude p_angle p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        (JR/invoke-super 'BasicVelocityProperties this :jm_setVelocityi_3 @l_magnitude @l_angle @l_otherAngle)
        (JR/invoke this :jm_limitXYToForwardAndReverseMaxVelocity_0)))

    
(defn jm_addVelocityi_3 [this p_magnitude p_angle p_otherAngle]
  (let [ l_magnitude (volatile! p_magnitude) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        (JR/invoke-super 'BasicVelocityProperties this :jm_addVelocityi_3 @l_magnitude @l_angle @l_otherAngle)
        (JR/invoke this :jm_limitXYToForwardAndReverseMaxVelocity_0)))



