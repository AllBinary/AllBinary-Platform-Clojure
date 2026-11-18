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

(ns NoOperatingSystem)

(JR/register 'NoOperatingSystem 'GenericOperatingSystem '[])

(def jsv_NO_OPERATING_SYSTEM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_OPERATING_SYSTEM [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_OPERATING_SYSTEM)
(defn jstatic_set_NO_OPERATING_SYSTEM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_OPERATING_SYSTEM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_OPERATING_SYSTEM (GenericOperatingSystem/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (GenericOperatingSystem/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoOperatingSystem)] (jinit_0 o) o))



