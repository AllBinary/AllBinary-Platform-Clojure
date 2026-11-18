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

;; This is the information sent to the license server
(ns AbeClientInformation)

(JR/register 'AbeClientInformation 'ClientInformation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_name p_version p_specialName p_shortName]
  (let [ l_name (volatile! p_name) l_version (volatile! p_version) l_specialName (volatile! p_specialName) l_shortName (volatile! p_shortName)]
        (ClientInformation/jinit_4 this @l_name @l_version @l_specialName @l_shortName) (jinitfields this))
  this)

(defn jnew_4 [p_name p_version p_specialName p_shortName ]
  (let [o (JR/alloc 'AbeClientInformation)] (jinit_4 o p_name p_version p_specialName p_shortName) o))

    
(defn jm_init_0 [this]
  (let [ l_licenseInitInfo (volatile! nil) l_stringValidationUtil (volatile! nil) l_NONE (volatile! nil) l_commonStrings (volatile! nil) l_logUtil (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke this :jm_setOperatingSystemInterface_1 (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0))
            (vreset! l_licenseInitInfo (JR/invoke (JR/scall 'LicenseInitInfoUtil :jm_getInstance_0) :jm_read_0))
            (JR/invoke this :jm_setLicenseId_1 (JR/invoke @l_licenseInitInfo :jm_getLicenseId_0))
            (JR/invoke this :jm_setLicenseServers_1 (JR/invoke @l_licenseInitInfo :jm_getServerList_0))
            (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
            (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 (JR/invoke this :jm_getLicenseId_0))
                (do
                (vreset! l_NONE "No License Id")
                (JR/invoke this :jm_setLicenseId_1 @l_NONE)))
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Special Name: ") :jm_append_1 (JR/invoke this :jm_getSpecialName_0))) this (JR/fget @l_commonStrings :CONSTRUCTOR)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)) :else (throw jt)))))))



