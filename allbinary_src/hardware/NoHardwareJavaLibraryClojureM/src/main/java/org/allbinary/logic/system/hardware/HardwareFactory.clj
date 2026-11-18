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

(ns HardwareFactory)

(JR/register 'HardwareFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (HardwareFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SINGLETON nil)
    (JR/fset this :SINGLETON (JR/scall 'NoHardware :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HardwareFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HardwareFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_os]
  (let [ l_os (volatile! p_os) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/fget this :SINGLETON)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))))))



