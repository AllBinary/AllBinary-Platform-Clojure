;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.game.midlet

(ns LicenseCheckRunnableFactory)

(JR/register 'LicenseCheckRunnableFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseCheckRunnableFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_specialDemoGameMidlet]
  (let [ l_specialDemoGameMidlet (volatile! p_specialDemoGameMidlet)]
        (JR/scall 'NullABRunnable :jm_getInstance_0)))



