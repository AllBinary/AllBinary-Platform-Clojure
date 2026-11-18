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
(ns ClientInformation)

(JR/register 'ClientInformation nil '[AbeClientInformationInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :operatingSystemInterface nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :name nil)
  (JR/fset this :shortName nil)
  (JR/fset this :version nil)
  (JR/fset this :specialName nil)
  (JR/fset this :hardSale false)
  (JR/fset this :licenseId nil)
  (JR/fset this :licenseServers nil)
    (JR/fset this :operatingSystemInterface (JR/sget 'NoOperatingSystem "NO_OPERATING_SYSTEM"))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :hardSale true)
    (JR/fset this :licenseId (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :licenseServers (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
  this)

    
(defn jinit_4 [this p_name p_version p_specialName p_shortName]
  (let [ l_name (volatile! p_name) l_version (volatile! p_version) l_specialName (volatile! p_specialName) l_shortName (volatile! p_shortName)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :version @l_version)
        (JR/fset this :specialName @l_specialName)
        (JR/fset this :shortName (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_shortName) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :UNDERSCORE)) :jm_append_1 @l_version)))
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_4 [p_name p_version p_specialName p_shortName ]
  (let [o (JR/alloc 'ClientInformation)] (jinit_4 o p_name p_version p_specialName p_shortName) o))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_getOperatingSystemInterface_0 [this]
  (let []
        (JR/fget this :operatingSystemInterface)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_getSpecialName_0 [this]
  (let []
        (JR/fget this :specialName)))

    
(defn jm_getVersion_0 [this]
  (let []
        (JR/fget this :version)))

    
(defn jm_getLicenseId_0 [this]
  (let []
        (JR/fget this :licenseId)))

    
(defn jm_getLicenseServers_0 [this]
  (let []
        (JR/fget this :licenseServers)))

    
(defn jm_getLicenseServer_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget (JR/fget this :licenseServers) :objectArray) @l_index)))

    
(defn jm_getNumberOfLicenseServers_0 [this]
  (let []
        (JR/invoke (JR/fget this :licenseServers) :jm_size_0)))

    
(defn jm_toHashtable_0 [this]
  (let [ l_abeClientInformationData (volatile! nil) l_genericOperatingSystem (volatile! nil) l_clientInfoHashtable (volatile! nil) l_hardwareInterface (volatile! nil) l_hardwareString (volatile! nil)]
        (vreset! l_abeClientInformationData (JR/scall 'AbeClientInformationData :jm_getInstance_0))
        (vreset! l_genericOperatingSystem (JR/invoke this :jm_getOperatingSystemInterface_0))
        (vreset! l_clientInfoHashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :NAME) (JR/fget this :name))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :VERSION) (JR/fget this :version))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :SPECIALNAME) (JR/fget this :specialName))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :LICENSEID) (JR/invoke this :jm_getLicenseId_0))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :OSNAME) (JR/invoke @l_genericOperatingSystem :jm_getName_0))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :OSARCH) (JR/invoke @l_genericOperatingSystem :jm_getArch_0))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :OSVERSION) (JR/invoke @l_genericOperatingSystem :jm_getVersion_0))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :OS) (JR/to-string-of @l_genericOperatingSystem))
        (vreset! l_hardwareInterface (JR/invoke (JR/scall 'SystemHardwareFactory :jm_getInstance_0) :jm_getInstance_1 @l_genericOperatingSystem))
        (vreset! l_hardwareString (JR/to-string-of @l_hardwareInterface))
        (JR/invoke @l_clientInfoHashtable :jm_put_2 (JR/fget @l_abeClientInformationData :HARDWARE) @l_hardwareString)
        @l_clientInfoHashtable))

    
(defn jm_isSameId_1 [this p_alicenseId]
  (let [ l_alicenseId (volatile! p_alicenseId)]
        (if (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 (JR/invoke this :jm_getLicenseId_0) @l_alicenseId) 0)
            (do
            true)
            (do
            false))))

    
(defn jm_isLargerOrDifferentServerList_1 [this p_list]
  (let [ l_list (volatile! p_list) l_size (volatile! nil) l_currentSize (volatile! nil) l_newServerName (volatile! nil) l_nextOldServerName (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_size (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 1)))
        (vreset! l_currentSize (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :licenseServers) :jm_size_0) 1)))
        (if (> @l_size @l_currentSize)
            (do
            (JR/jreturn true)))
        (do (vreset! l_index @l_size)
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_newServerName (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (do (vreset! l_index2 @l_currentSize)
                (JR/jfor false false (>= @l_index2 0) (do (JR/vinc l_index2 -1 :int false))
                (vreset! l_nextOldServerName (JR/aget* (JR/fget (JR/fget this :licenseServers) :objectArray) @l_index))
                (if (not (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_newServerName @l_nextOldServerName) 0))
                    (do
                    (JR/jreturn true)))))))
        false)))

    
(defn jm_setHardSale_1 [this p_hardSale]
  (let [ l_hardSale (volatile! p_hardSale)]
        (JR/fset this :hardSale @l_hardSale)))

    
(defn jm_isHardSale_0 [this]
  (let []
        (JR/fget this :hardSale)))

    
(defn jm_setOperatingSystemInterface_1 [this p_operatingSystemInterface]
  (let [ l_operatingSystemInterface (volatile! p_operatingSystemInterface)]
        (JR/fset this :operatingSystemInterface @l_operatingSystemInterface)))

    
(defn jm_setLicenseId_1 [this p_licenseId]
  (let [ l_licenseId (volatile! p_licenseId)]
        (JR/fset this :licenseId @l_licenseId)))

    
(defn jm_setLicenseServers_1 [this p_licenseServers]
  (let [ l_licenseServers (volatile! p_licenseServers)]
        (JR/fset this :licenseServers @l_licenseServers)))

    
(defn jm_toShortString_0 [this]
  (let []
        (JR/fget this :shortName)))



