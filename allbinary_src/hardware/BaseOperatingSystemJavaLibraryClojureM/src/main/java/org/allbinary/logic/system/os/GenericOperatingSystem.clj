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
;; package org.allbinary.logic.system.os

(ns GenericOperatingSystem)

(JR/register 'GenericOperatingSystem nil '[OperatingSystemInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :osName nil)
  (JR/fset this :osArch nil)
  (JR/fset this :osVersion nil)
  (JR/fset this :characterSet nil)
  (JR/fset this :scalable false)
    (JR/fset this :characterSet (CharacterSet/jnew_0))
    (JR/fset this :scalable false)
  this)

    
(defn jinit_0 [this]
  (let [ l_systemProperties (volatile! nil) l_stringValidationUtil (volatile! nil) l_EMPTY_STRING (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_systemProperties (JR/scall 'SystemProperties :jm_getInstance_0))
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (vreset! l_EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 (JR/invoke @l_systemProperties :jm_getName_0))
            (do
            (JR/fset this :osName @l_EMPTY_STRING))
            (do
            (JR/fset this :osName (JR/invoke @l_systemProperties :jm_getName_0))))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 (JR/invoke @l_systemProperties :jm_getArch_0))
            (do
            (JR/fset this :osArch @l_EMPTY_STRING))
            (do
            (JR/fset this :osArch (JR/invoke @l_systemProperties :jm_getArch_0))))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 (JR/invoke @l_systemProperties :jm_getVersion_0))
            (do
            (JR/fset this :osVersion @l_EMPTY_STRING))
            (do
            (JR/fset this :osVersion (JR/invoke @l_systemProperties :jm_getVersion_0)))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GenericOperatingSystem)] (jinit_0 o) o))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :osName)))

    
(defn jm_getVersion_0 [this]
  (let []
        (JR/fget this :osVersion)))

    
(defn jm_getArch_0 [this]
  (let []
        (JR/fget this :osArch)))

    
(defn jm_getCharacterSet_0 [this]
  (let []
        (JR/fget this :characterSet)))

    
(defn jm_isOverScan_0 [this]
  (let []
        false))

    
(defn jm_getOverScanXPercent_0 [this]
  (let []
        100))

    
(defn jm_getOverScanYPercent_0 [this]
  (let []
        100))

    
(defn jm_isScalable_0 [this]
  (let []
        (JR/fget this :scalable)))

    
(defn jm_isAutoHide_0 [this]
  (let []
        false))

    
(defn jm_toString_0 [this]
  (let [ l_NEW_LINE (volatile! nil) l_osBuffer (volatile! nil)]
        (vreset! l_NEW_LINE (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))
        (vreset! l_osBuffer (StringMaker/jnew_0))
        (JR/invoke @l_osBuffer :jm_append_1 "Operating System Info: \n")
        (JR/invoke @l_osBuffer :jm_append_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_osBuffer :jm_append_1 @l_NEW_LINE)
        (JR/invoke @l_osBuffer :jm_append_1 (JR/invoke this :jm_getArch_0))
        (JR/invoke @l_osBuffer :jm_append_1 @l_NEW_LINE)
        (JR/invoke @l_osBuffer :jm_append_1 (JR/invoke this :jm_getVersion_0))
        (JR/invoke @l_osBuffer :jm_append_1 @l_NEW_LINE)
        (JR/invoke @l_osBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke this :jm_getCharacterSet_0)))
        (JR/invoke @l_osBuffer :jm_append_1 @l_NEW_LINE)
        (JR/to-string-of @l_osBuffer)))



