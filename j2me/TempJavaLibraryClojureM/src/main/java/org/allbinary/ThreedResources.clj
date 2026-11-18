;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary

(ns ThreedResources)

(JR/register 'ThreedResources nil '[])

(def jsv_threedResources (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_threedResources [] (JR/ensure-init jclinit-state jclinit) @jsv_threedResources)
(defn jstatic_set_threedResources [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_threedResources v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_threedResources (ThreedResources/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThreedResources)] (jinit_0 o) o))

    
(defn jm_getThreedResources_0 []
  (let [this nil]
        (ThreedResources/jstatic_threedResources)))

    
(defn jm_add_0 [this]
  (let []
        nil))



