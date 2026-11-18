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
;; package org.allbinary.logic.system.security.licensing

(ns LicenseUtil)

(JR/register 'LicenseUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LicenseUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LicenseUtil/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_isRunning_0 [this]
  (let []
        false))

    
(defn jm_setRunning_1 [this p_running]
  (let [ l_running (volatile! p_running)]
        nil))

    
(defn jm_shouldWait_1 [this p_commandListener]
  (let [ l_commandListener (volatile! p_commandListener)]
        (JR/invoke this :jm_isRunning_0)))



