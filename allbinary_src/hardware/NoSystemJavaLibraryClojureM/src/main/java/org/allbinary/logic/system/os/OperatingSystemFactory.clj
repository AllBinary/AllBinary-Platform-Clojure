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
  (JR/fset this :genericOperatingSystem nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :genericOperatingSystem (JR/sget 'NoOperatingSystem "NO_OPERATING_SYSTEM"))
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
  (let [ l_commonStrings (volatile! nil) l_osString (volatile! nil) l_e (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (try (do
            (vreset! l_osString (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "OperatingSystem Info: ") :jm_append_1 (JR/to-string-of (JR/fget this :genericOperatingSystem)))))
            (JR/println* @l_osString)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 @l_osString this (JR/fget @l_commonStrings :GET_INSTANCE)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)) :else (throw jt)))))
        (JR/fget this :genericOperatingSystem)))



