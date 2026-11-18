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
;; package org.allbinary.logic.system.security.licensing.registration

(ns RegistrationConfiguration)

(JR/register 'RegistrationConfiguration nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (RegistrationConfiguration/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :registrationCode nil)
  (JR/fset this :NAME nil)
    (JR/fset this :registrationCode "No Registration Code")
    (JR/fset this :NAME "registrationid")
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'RegistrationConfiguration)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (RegistrationConfiguration/jstatic_SINGLETON)))

    
(defn jm_read_0 [this]
  (let []
        nil))

    
(defn jm_write_0 [this]
  (let []
        nil))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Registration Code: ") :jm_append_1 (JR/invoke this :jm_getRegistrationCode_0)))))

    
(defn jm_setRegistrationCode_1 [this p_registrationCode]
  (let [ l_registrationCode (volatile! p_registrationCode)]
        (JR/fset this :registrationCode @l_registrationCode)))

    
(defn jm_getRegistrationCode_0 [this]
  (let []
        (JR/fget this :registrationCode)))



