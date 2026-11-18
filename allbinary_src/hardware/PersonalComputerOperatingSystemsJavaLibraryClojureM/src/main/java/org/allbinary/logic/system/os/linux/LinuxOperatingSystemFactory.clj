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
;; package org.allbinary.logic.system.os.linux

(ns LinuxOperatingSystemFactory)

(JR/register 'LinuxOperatingSystemFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LinuxOperatingSystemFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LinuxOperatingSystemFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LinuxOperatingSystemFactory)] (jinit_0 o) o))

    
(defn jm_getOperatingSystemInstance_0 [this]
  (let [ l_operatingSystems (volatile! nil) l_osName (volatile! nil) l_operatingSystemInterface (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_operatingSystems (JR/scall 'OperatingSystems :jm_getInstance_0))
            (vreset! l_osName (JR/invoke (JR/scall 'SystemProperties :jm_getInstance_0) :jm_getName_0))
            (vreset! l_operatingSystemInterface nil)
            (if (JR/eq (JR/invoke @l_osName :jm_compareTo_1 (JR/fget @l_operatingSystems :LINUX)) 0)
                (do
                (vreset! l_operatingSystemInterface (LinuxOS/jnew_0)))
                (do
                (if (JR/invoke @l_operatingSystems :jm_isUnknownSpecificOSAllowed_0)
                    (do
                    (vreset! l_operatingSystemInterface (LinuxOS/jnew_0)))
                    (do
                    (JR/jthrow (new java.lang.Exception (str (JR/s "Specific Linux OS Not Supported: ") (JR/s @l_osName))))))))
            (JR/jreturn @l_operatingSystemInterface))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (if (JR/invoke (JR/sget 'LogConfigTypes "LOGGING") :jm_contains_1 (JR/fget (JR/scall 'LogConfigTypeFactory :jm_getInstance_0) :FACTORYERROR))
                (do
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)))
            (JR/jreturn (JR/sget 'NoOperatingSystem "NO_OPERATING_SYSTEM"))) :else (throw jt))))))))



