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
;; package org.allbinary.media

(ns AllBinaryVibration)

(JR/register 'AllBinaryVibration 'AllBinaryVibrationME '[])

(def jsv_VIBRATION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_VIBRATION [] (JR/ensure-init jclinit-state jclinit) @jsv_VIBRATION)
(defn jstatic_set_VIBRATION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_VIBRATION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_VIBRATION (JR/sget 'AllBinaryNoVibration "NO_VIBRATION"))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (AllBinaryVibrationME/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryVibration)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AllBinaryVibration/jstatic_VIBRATION)))

    
(defn jm_init_0 []
  (let [this nil]
        (if (JR/eq (JR/invoke (JR/invoke (JR/fget (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :VIBRATION) :jm_getValue_0) :jm_intValue_0) 0)
            (do
            (AllBinaryVibration/jstatic_set_VIBRATION (JR/sget 'AllBinaryNoVibration "NO_VIBRATION")))
            (do
            (AllBinaryVibration/jstatic_set_VIBRATION (AllBinaryVibration/jnew_0))))))

    
(defn jm_vibrate_3 [this p_duration p_type p_volume]
  (let [ l_duration (volatile! p_duration) l_type (volatile! p_type) l_volume (volatile! p_volume)]
        nil))



