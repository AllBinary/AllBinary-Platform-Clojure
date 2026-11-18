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

(ns Component)

(JR/register 'Component nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  this)

    
(defn jinit_1 [this p_componentName]
  (let [ l_componentName (volatile! p_componentName)]
    nil (jinitfields this)
        (JR/fset this :name @l_componentName))
  this)

(defn jnew_1 [p_componentName ]
  (let [o (JR/alloc 'Component)] (jinit_1 o p_componentName) o))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :name)))



