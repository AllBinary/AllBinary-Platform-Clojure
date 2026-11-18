;; Generated Code Do Not Modify
;; package org.allbinary.game.input.analog

(ns AnalogLocationInput)

(JR/register 'AnalogLocationInput nil '[])

(def jsv_NULL_ANALOG_LOCATION_INPUT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ANALOG_LOCATION_INPUT [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ANALOG_LOCATION_INPUT)
(defn jstatic_set_NULL_ANALOG_LOCATION_INPUT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ANALOG_LOCATION_INPUT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ANALOG_LOCATION_INPUT (AnalogLocationInput/jnew_1 (unchecked-int (unchecked-negate (JR/c2i 1)))))
    nil))

(defn jinitfields [this]
  (JR/fset this :playerId 0)
  (JR/fset this :customGPoint nil)
  (JR/fset this :rz 0)
  (JR/fset this :rightTrigger 0)
  (JR/fset this :leftTrigger 0)
  this)

    
(defn jinit_1 [this p_playerId]
  (let [ l_playerId (volatile! p_playerId)]
    nil (jinitfields this)
        (JR/fset this :playerId @l_playerId)
        (JR/fset this :customGPoint (CustomGPoint/jnew_3 0 0 0)))
  this)

(defn jnew_1 [p_playerId ]
  (let [o (JR/alloc 'AnalogLocationInput)] (jinit_1 o p_playerId) o))

    
(defn jm_getPlayerId_0 [this]
  (let []
        (JR/fget this :playerId)))

    
(defn jm_getCustomGPoint_0 [this]
  (let []
        (JR/fget this :customGPoint)))

    
(defn jm_getRz_0 [this]
  (let []
        (JR/fget this :rz)))

    
(defn jm_setRz_1 [this p_rz]
  (let [ l_rz (volatile! p_rz)]
        (JR/fset this :rz @l_rz)))

    
(defn jm_getRightTrigger_0 [this]
  (let []
        (JR/fget this :rightTrigger)))

    
(defn jm_setRightTrigger_1 [this p_rightTrigger]
  (let [ l_rightTrigger (volatile! p_rightTrigger)]
        (JR/fset this :rightTrigger @l_rightTrigger)))

    
(defn jm_getLeftTrigger_0 [this]
  (let []
        (JR/fget this :leftTrigger)))

    
(defn jm_setLeftTrigger_1 [this p_leftTrigger]
  (let [ l_leftTrigger (volatile! p_leftTrigger)]
        (JR/fset this :leftTrigger @l_leftTrigger)))



