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

(ns AllBinaryNoVibration)

(JR/register 'AllBinaryNoVibration 'AllBinaryVibrationME '[])

(def jsv_NO_VIBRATION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_VIBRATION [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_VIBRATION)
(defn jstatic_set_NO_VIBRATION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_VIBRATION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_VIBRATION (AllBinaryNoVibration/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (AllBinaryVibrationME/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryNoVibration)] (jinit_0 o) o))

    
(defn jm_vibrate_3 [this p_duration p_type p_volume]
  (let [ l_duration (volatile! p_duration) l_type (volatile! p_type) l_volume (volatile! p_volume)]
        nil))



