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

(ns AbeClientInformationData)

(JR/register 'AbeClientInformationData nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AbeClientInformationData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :KEY nil)
  (JR/fset this :NAME nil)
  (JR/fset this :VERSION nil)
  (JR/fset this :SPECIALNAME nil)
  (JR/fset this :LICENSEID nil)
  (JR/fset this :LICENSE_TYPE nil)
  (JR/fset this :PREVIOUSLICENSEID nil)
  (JR/fset this :OSNAME nil)
  (JR/fset this :OSARCH nil)
  (JR/fset this :OSVERSION nil)
  (JR/fset this :OS nil)
  (JR/fset this :HARDWARE nil)
  (JR/fset this :LICENSESERVERS nil)
  (JR/fset this :NEWLICENSE nil)
  (JR/fset this :ISNEW nil)
  (JR/fset this :SPECIAL nil)
    (JR/fset this :KEY "KEY")
    (JR/fset this :NAME "NAME")
    (JR/fset this :VERSION "VERSION")
    (JR/fset this :SPECIALNAME "SPECIALNAME")
    (JR/fset this :LICENSEID "LICENSEID")
    (JR/fset this :LICENSE_TYPE "LICENSETYPE")
    (JR/fset this :PREVIOUSLICENSEID "PREVIOUSLICENSEID")
    (JR/fset this :OSNAME "OSNAME")
    (JR/fset this :OSARCH "OSARCH")
    (JR/fset this :OSVERSION "OSVERSION")
    (JR/fset this :OS "OS")
    (JR/fset this :HARDWARE "HARDWARE")
    (JR/fset this :LICENSESERVERS "LICENSESERVERS")
    (JR/fset this :NEWLICENSE "NEWLICENSE")
    (JR/fset this :ISNEW "ISNEW")
    (JR/fset this :SPECIAL "SPECIAL")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AbeClientInformationData/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AbeClientInformationData)] (jinit_0 o) o))



