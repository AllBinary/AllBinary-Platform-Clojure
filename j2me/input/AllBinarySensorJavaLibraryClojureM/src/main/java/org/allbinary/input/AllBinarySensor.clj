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
;; package org.allbinary.input

(ns AllBinarySensor)

(JR/register 'AllBinarySensor nil '[AllBinarySensorListener])

(def jsv_NULL_ALLBINARY_SENSOR (atom nil))
(def jsv_max (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ALLBINARY_SENSOR [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ALLBINARY_SENSOR)
(defn jstatic_set_NULL_ALLBINARY_SENSOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ALLBINARY_SENSOR v))
(defn jstatic_max [] (JR/ensure-init jclinit-state jclinit) @jsv_max)
(defn jstatic_set_max [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_max v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ALLBINARY_SENSOR (AllBinarySensor/jnew_0))
    (reset! jsv_max 100)
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinarySensor)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_update_0 [this]
  (let []
        nil))

    
(defn jm_setMax_1 [p_max]
  (let [this nil l_max (volatile! p_max)]
        (AllBinarySensor/jstatic_set_max @l_max)))

    
(defn jm_getMax_0 []
  (let [this nil]
        (AllBinarySensor/jstatic_max)))

    
(defn jm_getId_0 [this]
  (let []
        (AllBinarySensor/jm_getMax_0)))

    
(defn jm_shutdown_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "shutdown")))

    
(defn jm_onSensorChange_0 [this]
  (let []
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)))



