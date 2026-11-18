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
;; package org.allbinary.logic.io

(ns AbDataOutputStream)

(JR/register 'AbDataOutputStream 'java.io.DataOutputStream '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_out]
  (let [ l_out (volatile! p_out)]
        (JR/jsuper-init this 'java.io.DataOutputStream [@l_out]) (jinitfields this))
  this)

(defn jnew_1 [p_out ]
  (let [o (JR/alloc 'AbDataOutputStream)] (jinit_1 o p_out) o))



