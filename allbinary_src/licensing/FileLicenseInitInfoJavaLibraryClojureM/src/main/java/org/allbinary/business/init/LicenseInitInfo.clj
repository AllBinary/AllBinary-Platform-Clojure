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

(ns LicenseInitInfo)

(JR/register 'LicenseInitInfo nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :id nil)
  (JR/fset this :serverVector nil)
    (JR/fset this :id (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :serverVector (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseInitInfo)] (jinit_0 o) o))

    
(defn jm_getLicenseId_0 [this]
  (let []
        (JR/fget this :id)))

    
(defn jm_getServer_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget (JR/fget this :serverVector) :objectArray) @l_index)))

    
(defn jm_getNumberOfServers_0 [this]
  (let []
        (JR/invoke (JR/fget this :serverVector) :jm_size_0)))

    
(defn jm_setLicenseId_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :id @l_value)))

    
(defn jm_clearServers_0 [this]
  (let []
        (JR/fset this :serverVector (BasicArrayListD/jnew_0))))

    
(defn jm_setServer_2 [this p_value p_index]
  (let [ l_value (volatile! p_value) l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :serverVector) :jm_addAt_2 @l_index @l_value)))

    
(defn jm_addServer_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/invoke (JR/fget this :serverVector) :jm_add_1 @l_value)))

    
(defn jm_getServerList_0 [this]
  (let []
        (JR/fget this :serverVector)))

    
(defn jm_setServerList_1 [this p_servers]
  (let [ l_servers (volatile! p_servers)]
        (if (JR/eq (JR/scall 'DebugFactory :jm_getInstance_0) (JR/scall 'NoDebug :jm_getInstance_0))
            (do
            (JR/fset this :serverVector @l_servers)))))



