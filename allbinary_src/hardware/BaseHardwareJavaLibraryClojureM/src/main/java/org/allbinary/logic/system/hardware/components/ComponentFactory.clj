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
;; package org.allbinary.logic.system.hardware.components

(ns ComponentFactory)

(JR/register 'ComponentFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ComponentFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :VGA nil)
  (JR/fset this :IDE nil)
  (JR/fset this :SCSI nil)
  (JR/fset this :BRIDGE nil)
  (JR/fset this :ETHERNET nil)
  (JR/fset this :USB nil)
  (JR/fset this :MULTIMEDIA nil)
  (JR/fset this :PCI nil)
  (JR/fset this :RAID nil)
  (JR/fset this :SMBUS nil)
  (JR/fset this :PIC nil)
  (JR/fset this :Class nil)
  (JR/fset this :UNKNOWN nil)
    (JR/fset this :VGA (Component/jnew_1 "VGA"))
    (JR/fset this :IDE (Component/jnew_1 "IDE"))
    (JR/fset this :SCSI (Component/jnew_1 "SCSI"))
    (JR/fset this :BRIDGE (Component/jnew_1 "bridge"))
    (JR/fset this :ETHERNET (Component/jnew_1 "Ethernet"))
    (JR/fset this :USB (Component/jnew_1 "USB"))
    (JR/fset this :MULTIMEDIA (Component/jnew_1 "Multimedia"))
    (JR/fset this :PCI (Component/jnew_1 "PCI"))
    (JR/fset this :RAID (Component/jnew_1 "RAID"))
    (JR/fset this :SMBUS (Component/jnew_1 "SMBus"))
    (JR/fset this :PIC (Component/jnew_1 "PIC"))
    (JR/fset this :Class (Component/jnew_1 "Class"))
    (JR/fset this :UNKNOWN (Component/jnew_1 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :UNKNOWN)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ComponentFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ComponentFactory/jstatic_instance)))



