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
;; package org.allbinary.android.input.motion

(ns AnalogControllerHelper)

(JR/register 'AnalogControllerHelper nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :reduceTimeFactor 0)
  (JR/fset this :SCALE_VALUE 0)
  (JR/fset this :rightTimeElapsedHelper nil)
  (JR/fset this :leftTimeElapsedHelper nil)
  (JR/fset this :downTimeElapsedHelper nil)
  (JR/fset this :upTimeElapsedHelper nil)
    (JR/fset this :SCALE_VALUE (JR/fget (JR/scall 'AnalogControllerConfigurationFactory :jm_getInstance_0) :SCALE_VALUE))
    (JR/fset this :rightTimeElapsedHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :leftTimeElapsedHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :downTimeElapsedHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :upTimeElapsedHelper (TimeDelayHelper/jnew_1 0))
  this)

    
(defn jinit_1 [this p_reduceTimeFactor]
  (let [ l_reduceTimeFactor (volatile! p_reduceTimeFactor)]
    nil (jinitfields this)
        (JR/fset this :reduceTimeFactor @l_reduceTimeFactor))
  this)

(defn jnew_1 [p_reduceTimeFactor ]
  (let [o (JR/alloc 'AnalogControllerHelper)] (jinit_1 o p_reduceTimeFactor) o))

    
(defn jm_right_2 [this p_collidableDestroyableDamageableLayer p_xAnalogValue]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer) l_xAnalogValue (volatile! p_xAnalogValue)]
        (JR/fset (JR/fget this :rightTimeElapsedHelper) :delay (JR/ishr (unchecked-int (unchecked-subtract (JR/fget this :SCALE_VALUE) @l_xAnalogValue)) (JR/fget this :reduceTimeFactor)))
        (if (JR/invoke (JR/fget this :rightTimeElapsedHelper) :jm_isTimeTNT_0)
            (do
            (JR/invoke @l_collidableDestroyableDamageableLayer :jm_right_0)))))

    
(defn jm_left_2 [this p_collidableDestroyableDamageableLayer p_xAnalogValue]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer) l_xAnalogValue (volatile! p_xAnalogValue)]
        (JR/fset (JR/fget this :leftTimeElapsedHelper) :delay (JR/ishr (unchecked-int (unchecked-add (JR/fget this :SCALE_VALUE) @l_xAnalogValue)) (JR/fget this :reduceTimeFactor)))
        (if (JR/invoke (JR/fget this :leftTimeElapsedHelper) :jm_isTimeTNT_0)
            (do
            (JR/invoke @l_collidableDestroyableDamageableLayer :jm_left_0)))))

    
(defn jm_up_2 [this p_collidableDestroyableDamageableLayer p_xAnalogValue]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer) l_xAnalogValue (volatile! p_xAnalogValue)]
        (JR/fset (JR/fget this :upTimeElapsedHelper) :delay (JR/ishr (unchecked-int (unchecked-subtract (JR/fget this :SCALE_VALUE) @l_xAnalogValue)) (JR/fget this :reduceTimeFactor)))
        (if (JR/invoke (JR/fget this :upTimeElapsedHelper) :jm_isTimeTNT_0)
            (do
            (JR/invoke @l_collidableDestroyableDamageableLayer :jm_up_0)))))

    
(defn jm_down_2 [this p_collidableDestroyableDamageableLayer p_xAnalogValue]
  (let [ l_collidableDestroyableDamageableLayer (volatile! p_collidableDestroyableDamageableLayer) l_xAnalogValue (volatile! p_xAnalogValue)]
        (JR/fset (JR/fget this :downTimeElapsedHelper) :delay (JR/ishr (unchecked-int (unchecked-add (JR/fget this :SCALE_VALUE) @l_xAnalogValue)) (JR/fget this :reduceTimeFactor)))
        (if (JR/invoke (JR/fget this :downTimeElapsedHelper) :jm_isTimeTNT_0)
            (do
            (JR/invoke @l_collidableDestroyableDamageableLayer :jm_down_0)))))



