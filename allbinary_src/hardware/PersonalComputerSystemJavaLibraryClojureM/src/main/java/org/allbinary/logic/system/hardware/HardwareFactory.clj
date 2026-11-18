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

    
(defn jm_getInstance_1 [p_os]
  (let [this nil l_os (volatile! p_os) l_operatingSystems (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_operatingSystems (JR/scall 'OperatingSystems :jm_getInstance_0))
            (if (= (JR/invoke (JR/invoke @l_os :jm_getName_0) :jm_compareTo_1 (JR/fget @l_operatingSystems :LINUX)) 0)
                (do
                (JR/jreturn (LinuxHardware/jnew_0)))
                (if (>= (JR/invoke (JR/invoke @l_os :jm_getName_0) :jm_indexOf_1 (JR/fget @l_operatingSystems :WINDOWS)) 0)
                (do
                (JR/jreturn (WindowsHardware/jnew_0)))))
            (JR/jthrow (new java.lang.Exception (str (JR/s "No Hardware Imp for: ") (JR/s (JR/invoke @l_os :jm_getName_0))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))))))



