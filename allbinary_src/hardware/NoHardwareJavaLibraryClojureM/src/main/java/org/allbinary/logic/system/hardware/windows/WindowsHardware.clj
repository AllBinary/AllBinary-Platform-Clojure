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
;; package org.allbinary.logic.system.hardware.windows

(ns WindowsHardware)

(JR/register 'WindowsHardware nil '[HardwareInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'WindowsHardware)] (jinit_0 o) o))

    
(defn jm_getMultimedia_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getBridge_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getCpu_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getEthernet_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getFireWire_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getHardDriveController_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getHardDrive_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getMachineAccessControlAddress_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getMonitor_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getUsb_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getVideo_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getComponent_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_compareTo_1 [this p_hardwareInterface]
  (let [ l_hardwareInterface (volatile! p_hardwareInterface)]
        true))

    
(defn jm_difference_1 [this p_hardwareInterface]
  (let [ l_hardwareInterface (volatile! p_hardwareInterface)]
        (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE)))



