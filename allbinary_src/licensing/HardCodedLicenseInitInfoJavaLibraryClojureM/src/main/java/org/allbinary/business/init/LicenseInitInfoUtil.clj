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
;; package org.allbinary.business.init

(ns LicenseInitInfoUtil)

(JR/register 'LicenseInitInfoUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LicenseInitInfoUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :INITFILENAME nil)
  (JR/fset this :ABOUT nil)
  (JR/fset this :PRIVACY_POLICY nil)
  (JR/fset this :OFFICIAL_ALLBINARY_SERVICES_SERVER nil)
    (JR/fset this :INITFILENAME "licenseinitdata.dat")
    (JR/fset this :ABOUT "about")
    (JR/fset this :PRIVACY_POLICY "privacy_policy")
    (JR/fset this :OFFICIAL_ALLBINARY_SERVICES_SERVER "https://services.allbinary.com/LicServ/serverssl.php")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LicenseInitInfoUtil/jstatic_instance)))

    
(defn jm_setFilePath_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath)]
        nil))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseInitInfoUtil)] (jinit_0 o) o))

    
(defn jm_write_1 [this p_initData]
  (let [ l_initData (volatile! p_initData)]
        nil))

    
(defn jm_read_0 [this]
  (let []
        (JR/invoke this :jm_readAgain_1 0)))

    
(defn jm_readAgain_1 [this p_initializeCounter]
  (let [ l_initializeCounter (volatile! p_initializeCounter) l_licenseInitInfo (volatile! nil)]
        (vreset! l_licenseInitInfo (LicenseInitInfo/jnew_0))
        (JR/invoke @l_licenseInitInfo :jm_clearServers_0)
        (JR/invoke @l_licenseInitInfo :jm_addServer_1 (JR/fget this :OFFICIAL_ALLBINARY_SERVICES_SERVER))
        @l_licenseInitInfo))



