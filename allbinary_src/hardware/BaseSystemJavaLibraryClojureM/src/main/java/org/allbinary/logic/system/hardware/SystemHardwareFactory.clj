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
;; package org.allbinary.logic.system.hardware

(ns SystemHardwareFactory)

(JR/register 'SystemHardwareFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SystemHardwareFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :hardwareInterface nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :hardwareInterface (JR/scall 'NoHardware :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SystemHardwareFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SystemHardwareFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_operatingSystemInterface]
  (let [ l_operatingSystemInterface (volatile! p_operatingSystemInterface) l_e (volatile! nil)]
        (try (do
            (if (JR/eq (JR/fget this :hardwareInterface) (JR/scall 'NoHardware :jm_getInstance_0))
                (do
                (JR/fset this :hardwareInterface (JR/invoke (JR/scall 'HardwareFactory :jm_getInstance_0) :jm_getInstance_1 @l_operatingSystemInterface))))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Found Hardware" this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) @l_e)) :else (throw jt)))))
        (JR/fget this :hardwareInterface)))

    
(defn jm_static_toString_0 []
  (let [this nil l_systemHardwareFactory (volatile! nil) l_osBuffer (volatile! nil)]
        (vreset! l_systemHardwareFactory (SystemHardwareFactory/jm_getInstance_0))
        (vreset! l_osBuffer (StringMaker/jnew_0))
        (JR/invoke @l_osBuffer :jm_append_1 "Hardware Info: \n")
        (if (some? (JR/fget @l_systemHardwareFactory :hardwareInterface))
            (do
            (JR/invoke @l_osBuffer :jm_append_1 (JR/to-string-of (JR/fget @l_systemHardwareFactory :hardwareInterface))))
            (do
            (JR/invoke @l_osBuffer :jm_append_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING))))
        (JR/to-string-of @l_osBuffer)))



