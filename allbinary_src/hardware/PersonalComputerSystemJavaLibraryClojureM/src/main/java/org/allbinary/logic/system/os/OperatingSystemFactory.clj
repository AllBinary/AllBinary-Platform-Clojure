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

(ns OperatingSystemFactory)

(JR/register 'OperatingSystemFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OperatingSystemFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :genericOperatingSystem nil)
  (JR/fset this :hasDetected false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :genericOperatingSystem (JR/sget 'NoOperatingSystem "NO_OPERATING_SYSTEM"))
    (JR/fset this :hasDetected false)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OperatingSystemFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OperatingSystemFactory)] (jinit_0 o) o))

    
(defn jm_getOperatingSystemInstance_0 [this]
  (let [ l_operatingSystems (volatile! nil) l_systemProperties (volatile! nil) l_osName (volatile! nil) l_osArch (volatile! nil) l_osVersion (volatile! nil) l_log (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_operatingSystems (JR/scall 'OperatingSystems :jm_getInstance_0))
            (vreset! l_systemProperties (JR/scall 'SystemProperties :jm_getInstance_0))
            (vreset! l_osName (JR/invoke @l_systemProperties :jm_getName_0))
            (vreset! l_osArch (JR/invoke @l_systemProperties :jm_getArch_0))
            (vreset! l_osVersion (JR/invoke @l_systemProperties :jm_getVersion_0))
            (if (not (JR/fget this :hasDetected))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s "osName: ") (JR/s @l_osName)) this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE))
                (JR/fset this :hasDetected true)
                (if (>= (JR/invoke @l_osName :jm_indexOf_1 (JR/fget @l_operatingSystems :LINUX)) 0)
                    (do
                    (if (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_contains_1 (JR/fget (JR/scall 'LogConfigTypeFactory :jm_getInstance_0) :FACTORYERROR))
                        (do
                        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Found a Linux OS" this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE))))
                    (JR/fset this :genericOperatingSystem (JR/invoke (JR/scall 'LinuxOperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0)))
                    (if (>= (JR/invoke @l_osName :jm_indexOf_1 (JR/fget @l_operatingSystems :WINDOWS)) 0)
                    (do
                    (if (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_contains_1 (JR/fget (JR/scall 'LogConfigTypeFactory :jm_getInstance_0) :FACTORYERROR))
                        (do
                        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Found a Windows OS" this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE))))
                    (JR/fset this :genericOperatingSystem (JR/invoke (JR/scall 'WindowsOperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0)))
                    (if (>= (JR/invoke @l_osName :jm_indexOf_1 (JR/fget @l_operatingSystems :SOLARIS)) 0)
                    (do
                    (if (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_contains_1 (JR/fget (JR/scall 'LogConfigTypeFactory :jm_getInstance_0) :FACTORYERROR))
                        (do
                        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Found a Solaris OS" this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE))))
                    (JR/fset this :genericOperatingSystem (JR/invoke (JR/scall 'SolarisOperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0)))
                    (do
                    (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "OS Not Supported: ") :jm_append_1 @l_osName))))))))
                (vreset! l_log (JR/scall 'LogFactory :jm_getInstanceF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "OperatingSystem Info: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :genericOperatingSystem)))) this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE)))
                (JR/println* (JR/to-string-of @l_log))
                (JR/invoke (JR/fget this :logUtil) :jm_putL_1 @l_log)))
            (JR/jreturn (JR/fget this :genericOperatingSystem)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (if (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_contains_1 (JR/fget (JR/scall 'LogConfigTypeFactory :jm_getInstance_0) :FACTORYERROR))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :GET_INSTANCE) @l_e)))
            (JR/jreturn (JR/sget 'NoOperatingSystem "NO_OPERATING_SYSTEM"))) :else (throw jt))))))))



